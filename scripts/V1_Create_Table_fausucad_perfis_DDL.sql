-------------------------------------------------------------
-- Criar Tabela fausucad_perfis - Inicio
-------------------------------------------------------------
CREATE OR REPLACE PROCEDURE check_estrutura
AUTHID CURRENT_USER
IS
   status   NUMBER (5);
BEGIN
   SELECT COUNT (*)
     INTO status
     FROM user_tables
    WHERE UPPER(table_name) = 'fausucad_perfis';

   IF status = 0
   THEN
      -- Criacao de tabelas
      EXECUTE IMMEDIATE    'CREATE TABLE fausucad_perfis  ('
                        || 'matricula VARCHAR2(20) NOT NULL,'
                        || 'cod_grupo VARCHAR2(20) NOT NULL)';
                        
   END IF;
END;
/

EXECUTE CHECK_ESTRUTURA;
DROP PROCEDURE check_estrutura;

-- Define permissoes para tabela
GRANT SELECT,INSERT,UPDATE,DELETE,REFERENCES ON fausucad_perfis TO wpd;
----------------------------------------------------------------
-- Criar Tabela fausucad_perfis - Final
-----------------------------------------------------------------