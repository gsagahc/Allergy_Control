
-------------------------------------------------------------
-- Inserir matricula para usuário MEDICO na Tabela fausucad_perfis - Inicio
-------------------------------------------------------------
CREATE OR REPLACE PROCEDURE check_estrutura
AUTHID CURRENT_USER
IS
   status   NUMBER (5);
BEGIN
   SELECT COUNT (*)
     INTO status
     FROM fausucad_perfis
    WHERE USUARIO_MATRICULA = '10370'
      AND PERFIS_MATRICULA = '10370';

   IF status = 0
   THEN
      -- Criacao de tabelas
      EXECUTE IMMEDIATE    'INSERT INTO fausucad_perfis (USUARIO_MATRICULA,PERFIS_MATRICULA)'||
                           'VALUES'||
	                       ' (''10370'','||
	                       '''10370'')';
   COMMIT;                     
   END IF;
END;
/

EXECUTE CHECK_ESTRUTURA;
DROP PROCEDURE check_estrutura;
----------------------------------------------------------------
-- Inserir matricula para usuário MEDICO na Tabela fausucad_perfis - Final
----------------------------------------------------------------

	