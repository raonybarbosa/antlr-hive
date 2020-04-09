// Generated from Hplsql.g4 by ANTLR 4.8
package br.com.antlr.hplsql.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HplsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T_ACTION=6, T_ADD2=7, T_ALL=8, 
		T_ALLOCATE=9, T_ALTER=10, T_AND=11, T_ANSI_NULLS=12, T_ANSI_PADDING=13, 
		T_AS=14, T_ASC=15, T_ASSOCIATE=16, T_AT=17, T_AUTO_INCREMENT=18, T_AVG=19, 
		T_BATCHSIZE=20, T_BEGIN=21, T_BETWEEN=22, T_BIGINT=23, T_BINARY_DOUBLE=24, 
		T_BINARY_FLOAT=25, T_BINARY_INTEGER=26, T_BIT=27, T_BODY=28, T_BREAK=29, 
		T_BY=30, T_BYTE=31, T_CALL=32, T_CALLER=33, T_CASCADE=34, T_CASE=35, T_CASESPECIFIC=36, 
		T_CAST=37, T_CHAR=38, T_CHARACTER=39, T_CHARSET=40, T_CLIENT=41, T_CLOSE=42, 
		T_CLUSTERED=43, T_CMP=44, T_COLLECT=45, T_COLLECTION=46, T_COLUMN=47, 
		T_COLUMNS=48, T_COMMENT=49, T_CONSTANT=50, T_COMMIT=51, T_COMPRESS=52, 
		T_CONCAT=53, T_CONDITION=54, T_CONSTRAINT=55, T_CONTINUE=56, T_COPY=57, 
		T_COUNT=58, T_COUNT_BIG=59, T_CREATE=60, T_CREATION=61, T_CREATOR=62, 
		T_CS=63, T_CURRENT=64, T_CURRENT_SCHEMA=65, T_CURSOR=66, T_DATABASE=67, 
		T_DATA=68, T_DATE=69, T_DATETIME=70, T_DAY=71, T_DAYS=72, T_DEC=73, T_DECIMAL=74, 
		T_DECLARE=75, T_DEFAULT=76, T_DEFERRED=77, T_DEFINED=78, T_DEFINER=79, 
		T_DEFINITION=80, T_DELETE=81, T_DELIMITED=82, T_DELIMITER=83, T_DESC=84, 
		T_DESCRIBE=85, T_DIAGNOSTICS=86, T_DIR=87, T_DIRECTORY=88, T_DISTINCT=89, 
		T_DISTRIBUTE=90, T_DO=91, T_DOUBLE=92, T_DROP=93, T_DYNAMIC=94, T_ELSE=95, 
		T_ELSEIF=96, T_ELSIF=97, T_ENABLE=98, T_END=99, T_ENGINE=100, T_ESCAPED=101, 
		T_EXCEPT=102, T_EXEC=103, T_EXECUTE=104, T_EXCEPTION=105, T_EXCLUSIVE=106, 
		T_EXISTS=107, T_EXIT=108, T_FALLBACK=109, T_FALSE=110, T_FETCH=111, T_FIELDS=112, 
		T_FILE=113, T_FILES=114, T_FLOAT=115, T_FOR=116, T_FOREIGN=117, T_FORMAT=118, 
		T_FOUND=119, T_FROM=120, T_FULL=121, T_FUNCTION=122, T_GET=123, T_GLOBAL=124, 
		T_GO=125, T_GRANT=126, T_GROUP=127, T_HANDLER=128, T_HASH=129, T_HAVING=130, 
		T_HDFS=131, T_HIVE=132, T_HOST=133, T_IDENTITY=134, T_IF=135, T_IGNORE=136, 
		T_IMMEDIATE=137, T_IN=138, T_INCLUDE=139, T_INDEX=140, T_INITRANS=141, 
		T_INNER=142, T_INOUT=143, T_INSERT=144, T_INT=145, T_INT2=146, T_INT4=147, 
		T_INT8=148, T_INTEGER=149, T_INTERSECT=150, T_INTERVAL=151, T_INTO=152, 
		T_INVOKER=153, T_IS=154, T_ISOPEN=155, T_ITEMS=156, T_JOIN=157, T_KEEP=158, 
		T_KEY=159, T_KEYS=160, T_LANGUAGE=161, T_LEAVE=162, T_LEFT=163, T_LIKE=164, 
		T_LIMIT=165, T_LINES=166, T_LOCAL=167, T_LOCATION=168, T_LOCATOR=169, 
		T_LOCATORS=170, T_LOCKS=171, T_LOG=172, T_LOGGED=173, T_LOGGING=174, T_LOOP=175, 
		T_MAP=176, T_MATCHED=177, T_MAX=178, T_MAXTRANS=179, T_MERGE=180, T_MESSAGE_TEXT=181, 
		T_MICROSECOND=182, T_MICROSECONDS=183, T_MIN=184, T_MONEY=185, T_MULTISET=186, 
		T_NCHAR=187, T_NEW=188, T_NVARCHAR=189, T_NO=190, T_NOCOUNT=191, T_NOCOMPRESS=192, 
		T_NOLOGGING=193, T_NONE=194, T_NOT=195, T_NOTFOUND=196, T_NULL=197, T_NUMERIC=198, 
		T_NUMBER=199, T_OBJECT=200, T_OFF=201, T_ON=202, T_ONLY=203, T_OPEN=204, 
		T_OR=205, T_ORDER=206, T_OUT=207, T_OUTER=208, T_OVER=209, T_OVERWRITE=210, 
		T_OWNER=211, T_PACKAGE=212, T_PARTITION=213, T_EXTERNAL=214, T_PCTFREE=215, 
		T_PCTUSED=216, T_PLS_INTEGER=217, T_PRECISION=218, T_PARTITIONED=219, 
		T_PRESERVE=220, T_PRIMARY=221, T_PRINT=222, T_PROC=223, T_PROCEDURE=224, 
		T_QUALIFY=225, T_QUERY_BAND=226, T_QUIT=227, T_QUOTED_IDENTIFIER=228, 
		T_RAISE=229, T_REAL=230, T_REFERENCES=231, T_REGEXP=232, T_REPLACE=233, 
		T_RESIGNAL=234, T_RESTRICT=235, T_RESULT=236, T_RESULT_SET_LOCATOR=237, 
		T_RETURN=238, T_RETURNS=239, T_REVERSE=240, T_RIGHT=241, T_RLIKE=242, 
		T_ROLE=243, T_ROLLBACK=244, T_ROW=245, T_ROWS=246, T_ROWTYPE=247, T_ROW_COUNT=248, 
		T_RR=249, T_RS=250, T_PWD=251, T_TRIM=252, T_SCHEMA=253, T_SECOND=254, 
		T_SECONDS=255, T_SECURITY=256, T_SEGMENT=257, T_SEL=258, T_SELECT=259, 
		T_SET=260, T_SESSION=261, T_SESSIONS=262, T_SETS=263, T_SHARE=264, T_SIGNAL=265, 
		T_SIMPLE_DOUBLE=266, T_SIMPLE_FLOAT=267, T_SIMPLE_INTEGER=268, T_SMALLDATETIME=269, 
		T_SMALLINT=270, T_SQL=271, T_SQLEXCEPTION=272, T_SQLINSERT=273, T_SQLSTATE=274, 
		T_SQLWARNING=275, T_STATS=276, T_STATISTICS=277, T_STEP=278, T_STORAGE=279, 
		T_STORED=280, T_STRING=281, T_SUBDIR=282, T_SUBSTRING=283, T_SUM=284, 
		T_SUMMARY=285, T_SYS_REFCURSOR=286, T_TABLE=287, T_TABLESPACE=288, T_TEMPORARY=289, 
		T_TERMINATED=290, T_TEXTIMAGE_ON=291, T_THEN=292, T_TIMESTAMP=293, T_TINYINT=294, 
		T_TITLE=295, T_TO=296, T_TOP=297, T_TRANSACTION=298, T_TRUE=299, T_TRUNCATE=300, 
		T_TYPE=301, T_UNION=302, T_UNIQUE=303, T_UPDATE=304, T_UR=305, T_USE=306, 
		T_USING=307, T_VALUE=308, T_VALUES=309, T_VAR=310, T_VARCHAR=311, T_VARCHAR2=312, 
		T_VARYING=313, T_VOLATILE=314, T_WHEN=315, T_WHERE=316, T_WHILE=317, T_WITH=318, 
		T_WITHOUT=319, T_WORK=320, T_XACT_ABORT=321, T_XML=322, T_YES=323, T_ACTIVITY_COUNT=324, 
		T_CUME_DIST=325, T_CURRENT_DATE=326, T_CURRENT_TIMESTAMP=327, T_CURRENT_USER=328, 
		T_DENSE_RANK=329, T_FIRST_VALUE=330, T_LAG=331, T_LAST_VALUE=332, T_LEAD=333, 
		T_MAX_PART_STRING=334, T_MIN_PART_STRING=335, T_MAX_PART_INT=336, T_MIN_PART_INT=337, 
		T_MAX_PART_DATE=338, T_MIN_PART_DATE=339, T_PART_COUNT=340, T_PART_LOC=341, 
		T_RANK=342, T_ROW_NUMBER=343, T_STDEV=344, T_SYSDATE=345, T_VARIANCE=346, 
		T_USER=347, T_ADD=348, T_COLON=349, T_COMMA=350, T_PIPE=351, T_DIV=352, 
		T_DOT2=353, T_EQUAL=354, T_EQUAL2=355, T_NOTEQUAL=356, T_NOTEQUAL2=357, 
		T_GREATER=358, T_GREATEREQUAL=359, T_LESS=360, T_LESSEQUAL=361, T_MUL=362, 
		T_OPEN_B=363, T_OPEN_P=364, T_OPEN_SB=365, T_CLOSE_B=366, T_CLOSE_P=367, 
		T_CLOSE_SB=368, T_SEMICOLON=369, T_SUB=370, L_ID=371, L_S_STRING=372, 
		L_D_STRING=373, L_INT=374, L_DEC=375, L_WS=376, L_M_COMMENT=377, L_S_COMMENT=378, 
		L_FILE=379, L_LABEL=380;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_semicolon_stmt = 7, 
		RULE_exception_block = 8, RULE_exception_block_item = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_allocate_cursor_stmt = 17, 
		RULE_associate_locator_stmt = 18, RULE_begin_transaction_stmt = 19, RULE_break_stmt = 20, 
		RULE_call_stmt = 21, RULE_declare_stmt = 22, RULE_declare_block = 23, 
		RULE_declare_block_inplace = 24, RULE_declare_stmt_item = 25, RULE_declare_var_item = 26, 
		RULE_declare_condition_item = 27, RULE_declare_cursor_item = 28, RULE_cursor_with_return = 29, 
		RULE_cursor_without_return = 30, RULE_declare_handler_item = 31, RULE_declare_temporary_table_item = 32, 
		RULE_create_table_stmt = 33, RULE_create_local_temp_table_stmt = 34, RULE_external = 35, 
		RULE_create_table_definition = 36, RULE_create_table_columns = 37, RULE_create_table_columns_item = 38, 
		RULE_column_name = 39, RULE_create_table_column_inline_cons = 40, RULE_create_table_column_cons = 41, 
		RULE_create_table_fk_action = 42, RULE_create_table_preoptions = 43, RULE_create_table_preoptions_item = 44, 
		RULE_create_table_preoptions_td_item = 45, RULE_create_table_options = 46, 
		RULE_create_table_options_item = 47, RULE_create_table_options_ora_item = 48, 
		RULE_create_table_options_db2_item = 49, RULE_create_table_options_td_item = 50, 
		RULE_create_table_options_hive_item = 51, RULE_partitioned = 52, RULE_expr_partitioned = 53, 
		RULE_column_name_type_comment = 54, RULE_comment = 55, RULE_stored_s = 56, 
		RULE_ident_expr = 57, RULE_location = 58, RULE_create_table_hive_row_format = 59, 
		RULE_create_table_hive_row_format_fields = 60, RULE_create_table_options_mssql_item = 61, 
		RULE_create_table_options_mysql_item = 62, RULE_alter_table_stmt = 63, 
		RULE_alter_table_item = 64, RULE_alter_table_add = 65, RULE_alter_table_add_columns = 66, 
		RULE_alter_table_add_columns_item = 67, RULE_alter_table_columns = 68, 
		RULE_alter_table_columns_item = 69, RULE_dtype_alter = 70, RULE_alter_table_add_constraint = 71, 
		RULE_alter_table_add_constraint_item = 72, RULE_dtype = 73, RULE_dtype_len = 74, 
		RULE_dtype_attr = 75, RULE_dtype_default = 76, RULE_create_database_stmt = 77, 
		RULE_create_database_option = 78, RULE_create_function_stmt = 79, RULE_create_function_return = 80, 
		RULE_create_package_stmt = 81, RULE_package_spec = 82, RULE_package_spec_item = 83, 
		RULE_create_package_body_stmt = 84, RULE_package_body = 85, RULE_package_body_item = 86, 
		RULE_create_procedure_stmt = 87, RULE_create_routine_params = 88, RULE_create_routine_param_item = 89, 
		RULE_create_routine_options = 90, RULE_create_routine_option = 91, RULE_drop_stmt = 92, 
		RULE_end_transaction_stmt = 93, RULE_exec_stmt = 94, RULE_if_stmt = 95, 
		RULE_if_plsql_stmt = 96, RULE_if_tsql_stmt = 97, RULE_if_bteq_stmt = 98, 
		RULE_elseif_block = 99, RULE_else_block = 100, RULE_include_stmt = 101, 
		RULE_insert_stmt = 102, RULE_insert_stmt_cols = 103, RULE_insert_stmt_rows = 104, 
		RULE_insert_stmt_row = 105, RULE_insert_directory_stmt = 106, RULE_exit_stmt = 107, 
		RULE_get_diag_stmt = 108, RULE_get_diag_stmt_item = 109, RULE_get_diag_stmt_exception_item = 110, 
		RULE_get_diag_stmt_rowcount_item = 111, RULE_grant_stmt = 112, RULE_grant_stmt_item = 113, 
		RULE_leave_stmt = 114, RULE_map_object_stmt = 115, RULE_open_stmt = 116, 
		RULE_fetch_stmt = 117, RULE_collect_stats_stmt = 118, RULE_collect_stats_clause = 119, 
		RULE_close_stmt = 120, RULE_cmp_stmt = 121, RULE_cmp_source = 122, RULE_copy_from_local_stmt = 123, 
		RULE_copy_stmt = 124, RULE_copy_source = 125, RULE_copy_target = 126, 
		RULE_copy_option = 127, RULE_copy_file_option = 128, RULE_commit_stmt = 129, 
		RULE_create_index_stmt = 130, RULE_create_index_col = 131, RULE_index_storage_clause = 132, 
		RULE_index_mssql_storage_clause = 133, RULE_print_stmt = 134, RULE_quit_stmt = 135, 
		RULE_raise_stmt = 136, RULE_resignal_stmt = 137, RULE_return_stmt = 138, 
		RULE_rollback_stmt = 139, RULE_set_session_option = 140, RULE_set_current_schema_option = 141, 
		RULE_set_mssql_session_option = 142, RULE_set_teradata_session_option = 143, 
		RULE_signal_stmt = 144, RULE_summary_stmt = 145, RULE_truncate_stmt = 146, 
		RULE_use_stmt = 147, RULE_values_into_stmt = 148, RULE_while_stmt = 149, 
		RULE_for_cursor_stmt = 150, RULE_for_range_stmt = 151, RULE_label = 152, 
		RULE_using_clause = 153, RULE_select_stmt = 154, RULE_cte_select_stmt = 155, 
		RULE_cte_select_stmt_item = 156, RULE_cte_select_cols = 157, RULE_fullselect_stmt = 158, 
		RULE_fullselect_stmt_item = 159, RULE_fullselect_set_clause = 160, RULE_subselect_stmt = 161, 
		RULE_select_list = 162, RULE_select_list_set = 163, RULE_select_list_limit = 164, 
		RULE_select_list_item = 165, RULE_select_list_alias = 166, RULE_select_list_asterisk = 167, 
		RULE_into_clause = 168, RULE_from_clause = 169, RULE_from_table_clause = 170, 
		RULE_from_table_name_clause = 171, RULE_from_subselect_clause = 172, RULE_from_join_clause = 173, 
		RULE_from_join_type_clause = 174, RULE_from_table_values_clause = 175, 
		RULE_from_table_values_row = 176, RULE_from_alias_clause = 177, RULE_table_name = 178, 
		RULE_where_clause = 179, RULE_group_by_clause = 180, RULE_having_clause = 181, 
		RULE_qualify_clause = 182, RULE_order_by_clause = 183, RULE_select_options = 184, 
		RULE_select_options_item = 185, RULE_update_stmt = 186, RULE_update_assignment = 187, 
		RULE_update_table = 188, RULE_update_upsert = 189, RULE_merge_stmt = 190, 
		RULE_merge_table = 191, RULE_merge_condition = 192, RULE_merge_action = 193, 
		RULE_delete_stmt = 194, RULE_delete_alias = 195, RULE_describe_stmt = 196, 
		RULE_bool_expr = 197, RULE_bool_expr_atom = 198, RULE_bool_expr_unary = 199, 
		RULE_bool_expr_single_in = 200, RULE_bool_expr_multi_in = 201, RULE_bool_expr_binary = 202, 
		RULE_bool_expr_logical_operator = 203, RULE_bool_expr_binary_operator = 204, 
		RULE_expr = 205, RULE_expr_atom = 206, RULE_expr_interval = 207, RULE_interval_item = 208, 
		RULE_expr_concat = 209, RULE_expr_concat_item = 210, RULE_expr_case = 211, 
		RULE_expr_case_simple = 212, RULE_expr_case_searched = 213, RULE_expr_cursor_attribute = 214, 
		RULE_expr_agg_window_func = 215, RULE_expr_func_all_distinct = 216, RULE_expr_func_over_clause = 217, 
		RULE_expr_func_partition_by_clause = 218, RULE_expr_spec_func = 219, RULE_expr_func = 220, 
		RULE_expr_func_params = 221, RULE_func_param = 222, RULE_expr_select = 223, 
		RULE_expr_file = 224, RULE_hive = 225, RULE_hive_item = 226, RULE_host = 227, 
		RULE_host_cmd = 228, RULE_host_stmt = 229, RULE_file_name = 230, RULE_date_literal = 231, 
		RULE_timestamp_literal = 232, RULE_ident = 233, RULE_string = 234, RULE_int_number = 235, 
		RULE_dec_number = 236, RULE_bool_literal = 237, RULE_null_const = 238, 
		RULE_non_reserved_words = 239;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
			"proc_block", "stmt", "semicolon_stmt", "exception_block", "exception_block_item", 
			"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", 
			"assignment_stmt_single_item", "assignment_stmt_multiple_item", "assignment_stmt_select_item", 
			"allocate_cursor_stmt", "associate_locator_stmt", "begin_transaction_stmt", 
			"break_stmt", "call_stmt", "declare_stmt", "declare_block", "declare_block_inplace", 
			"declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_cursor_item", 
			"cursor_with_return", "cursor_without_return", "declare_handler_item", 
			"declare_temporary_table_item", "create_table_stmt", "create_local_temp_table_stmt", 
			"external", "create_table_definition", "create_table_columns", "create_table_columns_item", 
			"column_name", "create_table_column_inline_cons", "create_table_column_cons", 
			"create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item", 
			"create_table_preoptions_td_item", "create_table_options", "create_table_options_item", 
			"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
			"create_table_options_hive_item", "partitioned", "expr_partitioned", 
			"column_name_type_comment", "comment", "stored_s", "ident_expr", "location", 
			"create_table_hive_row_format", "create_table_hive_row_format_fields", 
			"create_table_options_mssql_item", "create_table_options_mysql_item", 
			"alter_table_stmt", "alter_table_item", "alter_table_add", "alter_table_add_columns", 
			"alter_table_add_columns_item", "alter_table_columns", "alter_table_columns_item", 
			"dtype_alter", "alter_table_add_constraint", "alter_table_add_constraint_item", 
			"dtype", "dtype_len", "dtype_attr", "dtype_default", "create_database_stmt", 
			"create_database_option", "create_function_stmt", "create_function_return", 
			"create_package_stmt", "package_spec", "package_spec_item", "create_package_body_stmt", 
			"package_body", "package_body_item", "create_procedure_stmt", "create_routine_params", 
			"create_routine_param_item", "create_routine_options", "create_routine_option", 
			"drop_stmt", "end_transaction_stmt", "exec_stmt", "if_stmt", "if_plsql_stmt", 
			"if_tsql_stmt", "if_bteq_stmt", "elseif_block", "else_block", "include_stmt", 
			"insert_stmt", "insert_stmt_cols", "insert_stmt_rows", "insert_stmt_row", 
			"insert_directory_stmt", "exit_stmt", "get_diag_stmt", "get_diag_stmt_item", 
			"get_diag_stmt_exception_item", "get_diag_stmt_rowcount_item", "grant_stmt", 
			"grant_stmt_item", "leave_stmt", "map_object_stmt", "open_stmt", "fetch_stmt", 
			"collect_stats_stmt", "collect_stats_clause", "close_stmt", "cmp_stmt", 
			"cmp_source", "copy_from_local_stmt", "copy_stmt", "copy_source", "copy_target", 
			"copy_option", "copy_file_option", "commit_stmt", "create_index_stmt", 
			"create_index_col", "index_storage_clause", "index_mssql_storage_clause", 
			"print_stmt", "quit_stmt", "raise_stmt", "resignal_stmt", "return_stmt", 
			"rollback_stmt", "set_session_option", "set_current_schema_option", "set_mssql_session_option", 
			"set_teradata_session_option", "signal_stmt", "summary_stmt", "truncate_stmt", 
			"use_stmt", "values_into_stmt", "while_stmt", "for_cursor_stmt", "for_range_stmt", 
			"label", "using_clause", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", 
			"cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
			"subselect_stmt", "select_list", "select_list_set", "select_list_limit", 
			"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
			"from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", 
			"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
			"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
			"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
			"select_options", "select_options_item", "update_stmt", "update_assignment", 
			"update_table", "update_upsert", "merge_stmt", "merge_table", "merge_condition", 
			"merge_action", "delete_stmt", "delete_alias", "describe_stmt", "bool_expr", 
			"bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", 
			"bool_expr_binary", "bool_expr_logical_operator", "bool_expr_binary_operator", 
			"expr", "expr_atom", "expr_interval", "interval_item", "expr_concat", 
			"expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
			"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", 
			"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
			"expr_func", "expr_func_params", "func_param", "expr_select", "expr_file", 
			"hive", "hive_item", "host", "host_cmd", "host_stmt", "file_name", "date_literal", 
			"timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", 
			"null_const", "non_reserved_words"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'#'", "'%'", "'.'", "'!'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'+'", "':'", "','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", 
			"')'", "']'", "';'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", 
			"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", 
			"T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", 
			"T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", 
			"T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", 
			"T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", 
			"T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", 
			"T_COLLECTION", "T_COLUMN", "T_COLUMNS", "T_COMMENT", "T_CONSTANT", "T_COMMIT", 
			"T_COMPRESS", "T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", 
			"T_COPY", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", 
			"T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", 
			"T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", 
			"T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", 
			"T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
			"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
			"T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", 
			"T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", 
			"T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE", "T_FETCH", 
			"T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", 
			"T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", 
			"T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", 
			"T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", 
			"T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", 
			"T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
			"T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", 
			"T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", 
			"T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", 
			"T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", 
			"T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", 
			"T_MONEY", "T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", 
			"T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", 
			"T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", 
			"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", 
			"T_PACKAGE", "T_PARTITION", "T_EXTERNAL", "T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", 
			"T_PRECISION", "T_PARTITIONED", "T_PRESERVE", "T_PRIMARY", "T_PRINT", 
			"T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", 
			"T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", 
			"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
			"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", 
			"T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", 
			"T_SECOND", "T_SECONDS", "T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", 
			"T_SET", "T_SESSION", "T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", 
			"T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", 
			"T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", 
			"T_SQLWARNING", "T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", "T_STORED", 
			"T_STRING", "T_SUBDIR", "T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", 
			"T_TABLE", "T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", 
			"T_THEN", "T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", 
			"T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", 
			"T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", 
			"T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", 
			"T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_ACTIVITY_COUNT", 
			"T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", 
			"T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
			"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
			"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
			"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
			"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
			"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
			"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
			"T_SUB", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", 
			"L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hplsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HplsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HplsqlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			block();
			setState(481);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(HplsqlParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(HplsqlParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(483);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(484);
						stmt();
						}
						break;
					}
					setState(488);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(487);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(492); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBegin_end_block(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(494);
				declare_block();
				}
			}

			setState(497);
			match(T_BEGIN);
			setState(498);
			block();
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(499);
				exception_block();
				}
				break;
			}
			setState(502);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_block_stmt(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(T_BEGIN);
				setState(505);
				block();
				setState(507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(506);
					exception_block();
					}
					break;
				}
				setState(509);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				stmt();
				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(512);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock_end(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(518);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProc_block(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(521);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(524); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(526);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Allocate_cursor_stmtContext allocate_cursor_stmt() {
			return getRuleContext(Allocate_cursor_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Associate_locator_stmtContext associate_locator_stmt() {
			return getRuleContext(Associate_locator_stmtContext.class,0);
		}
		public Begin_transaction_stmtContext begin_transaction_stmt() {
			return getRuleContext(Begin_transaction_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Collect_stats_stmtContext collect_stats_stmt() {
			return getRuleContext(Collect_stats_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cmp_stmtContext cmp_stmt() {
			return getRuleContext(Cmp_stmtContext.class,0);
		}
		public Copy_from_local_stmtContext copy_from_local_stmt() {
			return getRuleContext(Copy_from_local_stmtContext.class,0);
		}
		public Copy_stmtContext copy_stmt() {
			return getRuleContext(Copy_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Describe_stmtContext describe_stmt() {
			return getRuleContext(Describe_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public End_transaction_stmtContext end_transaction_stmt() {
			return getRuleContext(End_transaction_stmtContext.class,0);
		}
		public Exec_stmtContext exec_stmt() {
			return getRuleContext(Exec_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Include_stmtContext include_stmt() {
			return getRuleContext(Include_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Insert_directory_stmtContext insert_directory_stmt() {
			return getRuleContext(Insert_directory_stmtContext.class,0);
		}
		public Get_diag_stmtContext get_diag_stmt() {
			return getRuleContext(Get_diag_stmtContext.class,0);
		}
		public Grant_stmtContext grant_stmt() {
			return getRuleContext(Grant_stmtContext.class,0);
		}
		public Leave_stmtContext leave_stmt() {
			return getRuleContext(Leave_stmtContext.class,0);
		}
		public Map_object_stmtContext map_object_stmt() {
			return getRuleContext(Map_object_stmtContext.class,0);
		}
		public Merge_stmtContext merge_stmt() {
			return getRuleContext(Merge_stmtContext.class,0);
		}
		public Open_stmtContext open_stmt() {
			return getRuleContext(Open_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Quit_stmtContext quit_stmt() {
			return getRuleContext(Quit_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Resignal_stmtContext resignal_stmt() {
			return getRuleContext(Resignal_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Signal_stmtContext signal_stmt() {
			return getRuleContext(Signal_stmtContext.class,0);
		}
		public Summary_stmtContext summary_stmt() {
			return getRuleContext(Summary_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Use_stmtContext use_stmt() {
			return getRuleContext(Use_stmtContext.class,0);
		}
		public Truncate_stmtContext truncate_stmt() {
			return getRuleContext(Truncate_stmtContext.class,0);
		}
		public Values_into_stmtContext values_into_stmt() {
			return getRuleContext(Values_into_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public HiveContext hive() {
			return getRuleContext(HiveContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				allocate_cursor_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				alter_table_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				associate_locator_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				begin_transaction_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(536);
				break_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(537);
				call_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(538);
				collect_stats_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(539);
				close_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(540);
				cmp_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(541);
				copy_from_local_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(542);
				copy_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(543);
				commit_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(544);
				create_database_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(545);
				create_function_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(546);
				create_index_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(547);
				create_local_temp_table_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(548);
				create_package_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(549);
				create_package_body_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(550);
				create_procedure_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(551);
				create_table_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(552);
				declare_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(553);
				delete_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(554);
				describe_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(555);
				drop_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(556);
				end_transaction_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(557);
				exec_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(558);
				exit_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(559);
				fetch_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(560);
				for_cursor_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(561);
				for_range_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(562);
				if_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(563);
				include_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(564);
				insert_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(565);
				insert_directory_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(566);
				get_diag_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(567);
				grant_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(568);
				leave_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(569);
				map_object_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(570);
				merge_stmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(571);
				open_stmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(572);
				print_stmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(573);
				quit_stmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(574);
				raise_stmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(575);
				resignal_stmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(576);
				return_stmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(577);
				rollback_stmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(578);
				select_stmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(579);
				signal_stmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(580);
				summary_stmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(581);
				update_stmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(582);
				use_stmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(583);
				truncate_stmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(584);
				values_into_stmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(585);
				while_stmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(586);
				label();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(587);
				hive();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(588);
				host();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(589);
				null_stmt();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(590);
				semicolon_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSemicolon_stmt(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitException_block(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T_EXCEPTION);
			setState(597); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(596);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(599); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitException_block_item(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(T_WHEN);
			setState(602);
			match(L_ID);
			setState(603);
			match(T_THEN);
			setState(604);
			block();
			setState(605);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNull_stmt(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(610);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(T_SET);
				setState(613);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(614);
					match(T_SET);
					}
					break;
				}
				setState(617);
				assignment_stmt_item();
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(618);
						match(T_COMMA);
						setState(619);
						assignment_stmt_item();
						}
						} 
					}
					setState(624);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_item(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				assignment_stmt_select_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_single_item(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				ident();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(633);
					match(T_COLON);
					}
				}

				setState(636);
				match(T_EQUAL);
				setState(637);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(T_OPEN_P);
				setState(640);
				ident();
				setState(641);
				match(T_CLOSE_P);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(642);
					match(T_COLON);
					}
				}

				setState(645);
				match(T_EQUAL);
				setState(646);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_multiple_item(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T_OPEN_P);
			setState(651);
			ident();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(652);
				match(T_COMMA);
				setState(653);
				ident();
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659);
			match(T_CLOSE_P);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(660);
				match(T_COLON);
				}
			}

			setState(663);
			match(T_EQUAL);
			setState(664);
			match(T_OPEN_P);
			setState(665);
			expr(0);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(666);
				match(T_COMMA);
				setState(667);
				expr(0);
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_select_item(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(675);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(676);
				match(T_OPEN_P);
				setState(677);
				ident();
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(678);
					match(T_COMMA);
					setState(679);
					ident();
					}
					}
					setState(684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(685);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(689);
				match(T_COLON);
				}
			}

			setState(692);
			match(T_EQUAL);
			setState(693);
			match(T_OPEN_P);
			setState(694);
			select_stmt();
			setState(695);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Allocate_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALLOCATE() { return getToken(HplsqlParser.T_ALLOCATE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public Allocate_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocate_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAllocate_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAllocate_cursor_stmt(this);
		}
	}

	public final Allocate_cursor_stmtContext allocate_cursor_stmt() throws RecognitionException {
		Allocate_cursor_stmtContext _localctx = new Allocate_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_allocate_cursor_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(T_ALLOCATE);
			setState(698);
			ident();
			setState(699);
			match(T_CURSOR);
			setState(700);
			match(T_FOR);
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_RESULT:
				{
				{
				setState(701);
				match(T_RESULT);
				setState(702);
				match(T_SET);
				}
				}
				break;
			case T_PROCEDURE:
				{
				setState(703);
				match(T_PROCEDURE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(706);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associate_locator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssociate_locator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssociate_locator_stmt(this);
		}
	}

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T_ASSOCIATE);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(709);
				match(T_RESULT);
				setState(710);
				match(T_SET);
				}
			}

			setState(713);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(714);
			match(T_OPEN_P);
			setState(715);
			ident();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(716);
				match(T_COMMA);
				setState(717);
				ident();
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			match(T_CLOSE_P);
			setState(724);
			match(T_WITH);
			setState(725);
			match(T_PROCEDURE);
			setState(726);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public Begin_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBegin_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBegin_transaction_stmt(this);
		}
	}

	public final Begin_transaction_stmtContext begin_transaction_stmt() throws RecognitionException {
		Begin_transaction_stmtContext _localctx = new Begin_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_begin_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(T_BEGIN);
			setState(729);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBreak_stmt(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(T_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCall_stmt(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(T_CALL);
			setState(734);
			ident();
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(735);
				match(T_OPEN_P);
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(736);
					expr_func_params();
					}
					break;
				}
				setState(739);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(740);
				expr_func_params();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_stmt(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(T_DECLARE);
			setState(744);
			declare_stmt_item();
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(745);
					match(T_COMMA);
					setState(746);
					declare_stmt_item();
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_block(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(T_DECLARE);
			setState(753);
			declare_stmt_item();
			setState(754);
			match(T_SEMICOLON);
			setState(760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755);
					declare_stmt_item();
					setState(756);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_block_inplace(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			declare_stmt_item();
			setState(764);
			match(T_SEMICOLON);
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(765);
					declare_stmt_item();
					setState(766);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_stmt_item(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_stmt_item);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(776);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(777);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_var_item(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				ident();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(781);
					match(T_COMMA);
					setState(782);
					ident();
					}
					}
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(788);
					match(T_AS);
					}
					break;
				}
				setState(791);
				dtype();
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(792);
					dtype_len();
					}
					break;
				}
				setState(798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(795);
						dtype_attr();
						}
						} 
					}
					setState(800);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(801);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				ident();
				setState(805);
				match(T_CONSTANT);
				setState(807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(806);
					match(T_AS);
					}
					break;
				}
				setState(809);
				dtype();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(810);
					dtype_len();
					}
				}

				setState(813);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_condition_item(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			ident();
			setState(818);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_cursor_item(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(820);
				match(T_CURSOR);
				setState(821);
				ident();
				}
				break;
			case 2:
				{
				setState(822);
				ident();
				setState(823);
				match(T_CURSOR);
				}
				break;
			}
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(827);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(828);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(831);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(832);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(833);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_with_return(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(T_WITH);
			setState(837);
			match(T_RETURN);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(838);
				match(T_ONLY);
				}
			}

			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(841);
				match(T_TO);
				setState(842);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_without_return(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(T_WITHOUT);
			setState(846);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_handler_item(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(849);
			match(T_HANDLER);
			setState(850);
			match(T_FOR);
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(851);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(852);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(853);
				match(T_NOT);
				setState(854);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(855);
				ident();
				}
				break;
			}
			setState(858);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_temporary_table_item(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(860);
				match(T_GLOBAL);
				}
			}

			setState(863);
			match(T_TEMPORARY);
			setState(864);
			match(T_TABLE);
			setState(865);
			ident();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (T_PARTITIONED - 219)) | (1L << (T_ROW - 219)) | (1L << (T_STORED - 219)))) != 0) || _la==T_COMMA) {
				{
				setState(866);
				create_table_preoptions();
				}
			}

			setState(869);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public ExternalContext external() {
			return getRuleContext(ExternalContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_stmt(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(T_CREATE);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EXTERNAL) {
				{
				setState(872);
				external();
				}
			}

			setState(875);
			match(T_TABLE);
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(876);
				match(T_IF);
				setState(877);
				match(T_NOT);
				setState(878);
				match(T_EXISTS);
				}
				break;
			}
			setState(881);
			table_name();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (T_PARTITIONED - 219)) | (1L << (T_ROW - 219)) | (1L << (T_STORED - 219)))) != 0) || _la==T_COMMA) {
				{
				setState(882);
				create_table_preoptions();
				}
			}

			setState(885);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_local_temp_table_stmt(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(T_CREATE);
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(888);
				match(T_LOCAL);
				setState(889);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(890);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(893);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(896);
			match(T_TABLE);
			setState(897);
			ident();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (T_PARTITIONED - 219)) | (1L << (T_ROW - 219)) | (1L << (T_STORED - 219)))) != 0) || _la==T_COMMA) {
				{
				setState(898);
				create_table_preoptions();
				}
			}

			setState(901);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalContext extends ParserRuleContext {
		public TerminalNode T_EXTERNAL() { return getToken(HplsqlParser.T_EXTERNAL, 0); }
		public ExternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExternal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExternal(this);
		}
	}

	public final ExternalContext external() throws RecognitionException {
		ExternalContext _localctx = new ExternalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_external);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(T_EXTERNAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_definition(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(905);
					match(T_AS);
					}
				}

				setState(908);
				match(T_OPEN_P);
				setState(909);
				select_stmt();
				setState(910);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(912);
					match(T_AS);
					}
				}

				setState(915);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(916);
				match(T_OPEN_P);
				setState(917);
				create_table_columns();
				setState(918);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(920);
				match(T_LIKE);
				setState(921);
				table_name();
				}
				break;
			}
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(924);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			create_table_columns_item();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(928);
				match(T_COMMA);
				setState(929);
				create_table_columns_item();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns_item(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				column_name();
				setState(936);
				dtype();
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(937);
					dtype_len();
					}
				}

				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						dtype_attr();
						}
						} 
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T_DEFAULT - 76)) | (1L << (T_ENABLE - 76)) | (1L << (T_IDENTITY - 76)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (T_NOT - 195)) | (1L << (T_NULL - 195)) | (1L << (T_PRIMARY - 195)) | (1L << (T_REFERENCES - 195)))) != 0) || ((((_la - 303)) & ~0x3f) == 0 && ((1L << (_la - 303)) & ((1L << (T_UNIQUE - 303)) | (1L << (T_WITH - 303)) | (1L << (T_COLON - 303)) | (1L << (T_EQUAL - 303)))) != 0)) {
					{
					{
					setState(946);
					create_table_column_inline_cons();
					}
					}
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(952);
					match(T_CONSTRAINT);
					setState(953);
					ident();
					}
				}

				setState(956);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_inline_cons(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(993);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(961);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(962);
					match(T_NOT);
					}
				}

				setState(965);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(T_PRIMARY);
				setState(967);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(968);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(969);
				match(T_REFERENCES);
				setState(970);
				table_name();
				setState(971);
				match(T_OPEN_P);
				setState(972);
				ident();
				setState(973);
				match(T_CLOSE_P);
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(974);
					create_table_fk_action();
					}
					}
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(980);
				match(T_IDENTITY);
				setState(981);
				match(T_OPEN_P);
				setState(982);
				match(L_INT);
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(983);
					match(T_COMMA);
					setState(984);
					match(L_INT);
					}
					}
					setState(989);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(990);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(991);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(992);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_cons(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				match(T_PRIMARY);
				setState(996);
				match(T_KEY);
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(997);
					match(T_CLUSTERED);
					}
				}

				setState(1000);
				match(T_OPEN_P);
				setState(1001);
				ident();
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1002);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1005);
					match(T_COMMA);
					setState(1006);
					ident();
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1007);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1015);
				match(T_CLOSE_P);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(1016);
					match(T_ENABLE);
					}
				}

				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1019);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(T_FOREIGN);
				setState(1023);
				match(T_KEY);
				setState(1024);
				match(T_OPEN_P);
				setState(1025);
				ident();
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1026);
					match(T_COMMA);
					setState(1027);
					ident();
					}
					}
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1033);
				match(T_CLOSE_P);
				setState(1034);
				match(T_REFERENCES);
				setState(1035);
				table_name();
				setState(1036);
				match(T_OPEN_P);
				setState(1037);
				ident();
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1038);
					match(T_COMMA);
					setState(1039);
					ident();
					}
					}
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045);
				match(T_CLOSE_P);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1046);
					create_table_fk_action();
					}
					}
					setState(1051);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_fk_action(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(T_ON);
			setState(1055);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1056);
				match(T_NO);
				setState(1057);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1058);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1059);
				match(T_SET);
				setState(1060);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1061);
				match(T_SET);
				setState(1062);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1063);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1066);
				create_table_preoptions_item();
				}
				}
				setState(1069); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (T_PARTITIONED - 219)) | (1L << (T_ROW - 219)) | (1L << (T_STORED - 219)))) != 0) || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_item(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_preoptions_item);
		try {
			setState(1074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				match(T_COMMA);
				setState(1072);
				create_table_preoptions_td_item();
				}
				break;
			case T_PARTITIONED:
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_td_item(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1076);
				match(T_NO);
				}
			}

			setState(1079);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1082); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1081);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1084); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_item(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_options_item);
		int _la;
		try {
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				match(T_ON);
				setState(1087);
				match(T_COMMIT);
				setState(1088);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1089);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1091);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1092);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1093);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1094);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1095);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_ora_item(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				match(T_SEGMENT);
				setState(1099);
				match(T_CREATION);
				setState(1100);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1102);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1104);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1105);
				match(T_STORAGE);
				setState(1106);
				match(T_OPEN_P);
				setState(1109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1109);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COLUMNS:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MONEY:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_EXTERNAL:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PARTITIONED:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case T_SUB:
					case L_ID:
						{
						setState(1107);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1108);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COLUMNS) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MONEY - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_EXTERNAL - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PARTITIONED - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SECURITY - 256)) | (1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_WORK - 320)) | (1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (T_SUB - 320)) | (1L << (L_ID - 320)) | (1L << (L_INT - 320)))) != 0) );
				setState(1113);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1114);
				match(T_TABLESPACE);
				setState(1115);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_db2_item(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1118);
					match(T_INDEX);
					}
				}

				setState(1121);
				match(T_IN);
				setState(1122);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(T_WITH);
				setState(1124);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1125);
				match(T_DISTRIBUTE);
				setState(1126);
				match(T_BY);
				setState(1127);
				match(T_HASH);
				setState(1128);
				match(T_OPEN_P);
				setState(1129);
				ident();
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1130);
					match(T_COMMA);
					setState(1131);
					ident();
					}
					}
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1137);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1139);
					match(T_NOT);
					}
				}

				setState(1142);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1143);
				match(T_COMPRESS);
				setState(1144);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1145);
				match(T_DEFINITION);
				setState(1146);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1147);
				match(T_WITH);
				setState(1148);
				match(T_RESTRICT);
				setState(1149);
				match(T_ON);
				setState(1150);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_td_item(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1153);
					match(T_UNIQUE);
					}
				}

				setState(1156);
				match(T_PRIMARY);
				setState(1157);
				match(T_INDEX);
				setState(1158);
				match(T_OPEN_P);
				setState(1159);
				ident();
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1160);
					match(T_COMMA);
					setState(1161);
					ident();
					}
					}
					setState(1166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1167);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				match(T_WITH);
				setState(1170);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public Stored_sContext stored_s() {
			return getRuleContext(Stored_sContext.class,0);
		}
		public PartitionedContext partitioned() {
			return getRuleContext(PartitionedContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_hive_item(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_options_hive_item);
		int _la;
		try {
			setState(1182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PARTITIONED:
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PARTITIONED) {
					{
					setState(1173);
					partitioned();
					}
				}

				setState(1176);
				create_table_hive_row_format();
				setState(1177);
				stored_s();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(T_STORED);
				setState(1180);
				match(T_AS);
				setState(1181);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionedContext extends ParserRuleContext {
		public TerminalNode T_PARTITIONED() { return getToken(HplsqlParser.T_PARTITIONED, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public Expr_partitionedContext expr_partitioned() {
			return getRuleContext(Expr_partitionedContext.class,0);
		}
		public PartitionedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitioned; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPartitioned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPartitioned(this);
		}
	}

	public final PartitionedContext partitioned() throws RecognitionException {
		PartitionedContext _localctx = new PartitionedContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_partitioned);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(T_PARTITIONED);
			setState(1185);
			match(T_BY);
			setState(1186);
			expr_partitioned();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_partitionedContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Column_name_type_commentContext> column_name_type_comment() {
			return getRuleContexts(Column_name_type_commentContext.class);
		}
		public Column_name_type_commentContext column_name_type_comment(int i) {
			return getRuleContext(Column_name_type_commentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_partitionedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_partitioned; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_partitioned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_partitioned(this);
		}
	}

	public final Expr_partitionedContext expr_partitioned() throws RecognitionException {
		Expr_partitionedContext _localctx = new Expr_partitionedContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expr_partitioned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(T_OPEN_P);
			setState(1189);
			column_name_type_comment();
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1190);
				match(T_COMMA);
				setState(1191);
				column_name_type_comment();
				}
				}
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1197);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_type_commentContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Column_name_type_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_type_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterColumn_name_type_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitColumn_name_type_comment(this);
		}
	}

	public final Column_name_type_commentContext column_name_type_comment() throws RecognitionException {
		Column_name_type_commentContext _localctx = new Column_name_type_commentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_column_name_type_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			column_name();
			setState(1200);
			dtype();
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMENT) {
				{
				setState(1201);
				comment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(T_COMMENT);
			setState(1205);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stored_sContext extends ParserRuleContext {
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Ident_exprContext> ident_expr() {
			return getRuleContexts(Ident_exprContext.class);
		}
		public Ident_exprContext ident_expr(int i) {
			return getRuleContext(Ident_exprContext.class,i);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Stored_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stored_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterStored_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitStored_s(this);
		}
	}

	public final Stored_sContext stored_s() throws RecognitionException {
		Stored_sContext _localctx = new Stored_sContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_stored_s);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(T_STORED);
			setState(1208);
			match(T_AS);
			setState(1212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1209);
					ident_expr();
					}
					} 
				}
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1215);
				location();
				}
				break;
			}
			setState(1218);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ident_exprContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ident_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIdent_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIdent_expr(this);
		}
	}

	public final Ident_exprContext ident_expr() throws RecognitionException {
		Ident_exprContext _localctx = new Ident_exprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ident_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			ident();
			setState(1221);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(T_LOCATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(T_ROW);
			setState(1226);
			match(T_FORMAT);
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1227);
				match(T_DELIMITED);
				}
				break;
			}
			setState(1233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1230);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(1235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HplsqlParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HplsqlParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_table_hive_row_format_fields);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				match(T_FIELDS);
				setState(1237);
				match(T_TERMINATED);
				setState(1238);
				match(T_BY);
				setState(1239);
				expr(0);
				setState(1243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1240);
					match(T_ESCAPED);
					setState(1241);
					match(T_BY);
					setState(1242);
					expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1245);
				match(T_COLLECTION);
				setState(1246);
				match(T_ITEMS);
				setState(1247);
				match(T_TERMINATED);
				setState(1248);
				match(T_BY);
				setState(1249);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1250);
				match(T_MAP);
				setState(1251);
				match(T_KEYS);
				setState(1252);
				match(T_TERMINATED);
				setState(1253);
				match(T_BY);
				setState(1254);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1255);
				match(T_LINES);
				setState(1256);
				match(T_TERMINATED);
				setState(1257);
				match(T_BY);
				setState(1258);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1259);
				match(T_NULL);
				setState(1260);
				match(T_DEFINED);
				setState(1261);
				match(T_AS);
				setState(1262);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1263);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mssql_item(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_table_options_mssql_item);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				match(T_ON);
				setState(1267);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				match(T_TEXTIMAGE_ON);
				setState(1269);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mysql_item(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				match(T_AUTO_INCREMENT);
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1273);
					match(T_EQUAL);
					}
				}

				setState(1276);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				match(T_COMMENT);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1278);
					match(T_EQUAL);
					}
				}

				setState(1281);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1282);
					match(T_DEFAULT);
					}
				}

				setState(1288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1285);
					match(T_CHARACTER);
					setState(1286);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1287);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1290);
					match(T_EQUAL);
					}
				}

				setState(1293);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1294);
				match(T_ENGINE);
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1295);
					match(T_EQUAL);
					}
				}

				setState(1298);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_table_itemContext alter_table_item() {
			return getRuleContext(Alter_table_itemContext.class,0);
		}
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_stmt(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(T_ALTER);
			setState(1302);
			match(T_TABLE);
			setState(1303);
			table_name();
			setState(1304);
			alter_table_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_itemContext extends ParserRuleContext {
		public TerminalNode T_ADD2() { return getToken(HplsqlParser.T_ADD2, 0); }
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_item(this);
		}
	}

	public final Alter_table_itemContext alter_table_item() throws RecognitionException {
		Alter_table_itemContext _localctx = new Alter_table_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_alter_table_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(T_ADD2);
			setState(1307);
			alter_table_add();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public Alter_table_add_columnsContext alter_table_add_columns() {
			return getRuleContext(Alter_table_add_columnsContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_add(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_alter_table_add);
		try {
			setState(1311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CONSTRAINT:
			case T_DEFAULT:
			case T_FOREIGN:
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				alter_table_add_constraint();
				}
				break;
			case T_COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				alter_table_add_columns();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_columnsContext extends ParserRuleContext {
		public TerminalNode T_COLUMNS() { return getToken(HplsqlParser.T_COLUMNS, 0); }
		public Alter_table_add_columns_itemContext alter_table_add_columns_item() {
			return getRuleContext(Alter_table_add_columns_itemContext.class,0);
		}
		public Alter_table_add_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_add_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_add_columns(this);
		}
	}

	public final Alter_table_add_columnsContext alter_table_add_columns() throws RecognitionException {
		Alter_table_add_columnsContext _localctx = new Alter_table_add_columnsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_alter_table_add_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(T_COLUMNS);
			setState(1314);
			alter_table_add_columns_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_columns_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Alter_table_columnsContext alter_table_columns() {
			return getRuleContext(Alter_table_columnsContext.class,0);
		}
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Alter_table_add_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_add_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_add_columns_item(this);
		}
	}

	public final Alter_table_add_columns_itemContext alter_table_add_columns_item() throws RecognitionException {
		Alter_table_add_columns_itemContext _localctx = new Alter_table_add_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_alter_table_add_columns_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1316);
					match(T_AS);
					}
				}

				setState(1319);
				match(T_OPEN_P);
				setState(1320);
				select_stmt();
				setState(1321);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1323);
					match(T_AS);
					}
				}

				setState(1326);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1327);
				match(T_OPEN_P);
				setState(1328);
				alter_table_columns();
				setState(1329);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(1331);
				match(T_LIKE);
				setState(1332);
				table_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_columnsContext extends ParserRuleContext {
		public List<Alter_table_columns_itemContext> alter_table_columns_item() {
			return getRuleContexts(Alter_table_columns_itemContext.class);
		}
		public Alter_table_columns_itemContext alter_table_columns_item(int i) {
			return getRuleContext(Alter_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Alter_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_columns(this);
		}
	}

	public final Alter_table_columnsContext alter_table_columns() throws RecognitionException {
		Alter_table_columnsContext _localctx = new Alter_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alter_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			alter_table_columns_item();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1336);
				match(T_COMMA);
				setState(1337);
				alter_table_columns_item();
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Dtype_alterContext dtype_alter() {
			return getRuleContext(Dtype_alterContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Alter_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_columns_item(this);
		}
	}

	public final Alter_table_columns_itemContext alter_table_columns_item() throws RecognitionException {
		Alter_table_columns_itemContext _localctx = new Alter_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_alter_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(1365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				column_name();
				setState(1344);
				dtype_alter();
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1345);
					dtype_len();
					}
				}

				setState(1351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1348);
						dtype_attr();
						}
						} 
					}
					setState(1353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T_DEFAULT - 76)) | (1L << (T_ENABLE - 76)) | (1L << (T_IDENTITY - 76)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (T_NOT - 195)) | (1L << (T_NULL - 195)) | (1L << (T_PRIMARY - 195)) | (1L << (T_REFERENCES - 195)))) != 0) || ((((_la - 303)) & ~0x3f) == 0 && ((1L << (_la - 303)) & ((1L << (T_UNIQUE - 303)) | (1L << (T_WITH - 303)) | (1L << (T_COLON - 303)) | (1L << (T_EQUAL - 303)))) != 0)) {
					{
					{
					setState(1354);
					create_table_column_inline_cons();
					}
					}
					setState(1359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(1360);
					match(T_CONSTRAINT);
					setState(1361);
					ident();
					}
				}

				setState(1364);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_alterContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HplsqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_MONEY() { return getToken(HplsqlParser.T_MONEY, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HplsqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HplsqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HplsqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HplsqlParser.T_ROWTYPE, 0); }
		public Dtype_alterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_alter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_alter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_alter(this);
		}
	}

	public final Dtype_alterContext dtype_alter() throws RecognitionException {
		Dtype_alterContext _localctx = new Dtype_alterContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dtype_alter);
		int _la;
		try {
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				match(T_CHARACTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				match(T_BIGINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1370);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1371);
				match(T_BINARY_FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1372);
				match(T_BINARY_INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1373);
				match(T_BIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1374);
				match(T_DATE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1375);
				match(T_DATETIME);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1376);
				match(T_DEC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1377);
				match(T_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1378);
				match(T_DOUBLE);
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(1379);
					match(T_PRECISION);
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1382);
				match(T_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1383);
				match(T_INT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1384);
				match(T_INT2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1385);
				match(T_INT4);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1386);
				match(T_INT8);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1387);
				match(T_INTEGER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1388);
				match(T_MONEY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1389);
				match(T_NCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1390);
				match(T_NVARCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1391);
				match(T_NUMBER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1392);
				match(T_NUMERIC);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1393);
				match(T_PLS_INTEGER);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1394);
				match(T_REAL);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1395);
				match(T_RESULT_SET_LOCATOR);
				setState(1396);
				match(T_VARYING);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1397);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1398);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1399);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1400);
				match(T_SMALLINT);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1401);
				match(T_SMALLDATETIME);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1402);
				match(T_STRING);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1403);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1404);
				match(T_TIMESTAMP);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1405);
				match(T_TINYINT);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1406);
				match(T_VARCHAR);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1407);
				match(T_VARCHAR2);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1408);
				match(T_XML);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1409);
				ident();
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1410);
					match(T__2);
					setState(1411);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public Alter_table_add_constraint_itemContext alter_table_add_constraint_item() {
			return getRuleContext(Alter_table_add_constraint_itemContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_add_constraint(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_alter_table_add_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CONSTRAINT) {
				{
				setState(1416);
				match(T_CONSTRAINT);
				setState(1417);
				ident();
				}
			}

			setState(1420);
			alter_table_add_constraint_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraint_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Alter_table_add_constraint_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAlter_table_add_constraint_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAlter_table_add_constraint_item(this);
		}
	}

	public final Alter_table_add_constraint_itemContext alter_table_add_constraint_item() throws RecognitionException {
		Alter_table_add_constraint_itemContext _localctx = new Alter_table_add_constraint_itemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alter_table_add_constraint_item);
		int _la;
		try {
			int _alt;
			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				match(T_PRIMARY);
				setState(1423);
				match(T_KEY);
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1424);
					match(T_CLUSTERED);
					}
				}

				setState(1427);
				match(T_OPEN_P);
				setState(1428);
				ident();
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1429);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1432);
					match(T_COMMA);
					setState(1433);
					ident();
					setState(1435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1434);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1442);
				match(T_CLOSE_P);
				setState(1444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1443);
					match(T_ENABLE);
					}
					break;
				}
				setState(1447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1446);
					index_storage_clause();
					}
					break;
				}
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				match(T_FOREIGN);
				setState(1450);
				match(T_KEY);
				setState(1451);
				match(T_OPEN_P);
				setState(1452);
				ident();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1453);
					match(T_COMMA);
					setState(1454);
					ident();
					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1460);
				match(T_CLOSE_P);
				setState(1461);
				match(T_REFERENCES);
				setState(1462);
				table_name();
				setState(1463);
				match(T_OPEN_P);
				setState(1464);
				ident();
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1465);
					match(T_COMMA);
					setState(1466);
					ident();
					}
					}
					setState(1471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1472);
				match(T_CLOSE_P);
				setState(1476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1473);
						create_table_fk_action();
						}
						} 
					}
					setState(1478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1479);
				match(T_DEFAULT);
				setState(1480);
				expr(0);
				setState(1481);
				match(T_FOR);
				setState(1482);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HplsqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_MONEY() { return getToken(HplsqlParser.T_MONEY, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HplsqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HplsqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HplsqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HplsqlParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dtype);
		int _la;
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				match(T_CHARACTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1488);
				match(T_BIGINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1489);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1490);
				match(T_BINARY_FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1491);
				match(T_BINARY_INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1492);
				match(T_BIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1493);
				match(T_DATE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1494);
				match(T_DATETIME);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1495);
				match(T_DEC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1496);
				match(T_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1497);
				match(T_DOUBLE);
				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1498);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1501);
				match(T_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1502);
				match(T_INT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1503);
				match(T_INT2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1504);
				match(T_INT4);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1505);
				match(T_INT8);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1506);
				match(T_INTEGER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1507);
				match(T_MONEY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1508);
				match(T_NCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1509);
				match(T_NVARCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1510);
				match(T_NUMBER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1511);
				match(T_NUMERIC);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1512);
				match(T_PLS_INTEGER);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1513);
				match(T_REAL);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1514);
				match(T_RESULT_SET_LOCATOR);
				setState(1515);
				match(T_VARYING);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1516);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1517);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1518);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1519);
				match(T_SMALLINT);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1520);
				match(T_SMALLDATETIME);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1521);
				match(T_STRING);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1522);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1523);
				match(T_TIMESTAMP);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1524);
				match(T_TINYINT);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1525);
				match(T_VARCHAR);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1526);
				match(T_VARCHAR2);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1527);
				match(T_XML);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1528);
				ident();
				setState(1531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1529);
					match(T__2);
					setState(1530);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_len(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(T_OPEN_P);
			setState(1536);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1537);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1540);
				match(T_COMMA);
				setState(1541);
				match(L_INT);
				}
			}

			setState(1544);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_attr(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_dtype_attr);
		int _la;
		try {
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1546);
					match(T_NOT);
					}
				}

				setState(1549);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
				match(T_CHARACTER);
				setState(1551);
				match(T_SET);
				setState(1552);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1553);
					match(T_NOT);
					}
				}

				setState(1556);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_default(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dtype_default);
		int _la;
		try {
			setState(1571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1559);
					match(T_COLON);
					}
				}

				setState(1562);
				match(T_EQUAL);
				setState(1563);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1564);
					match(T_WITH);
					}
				}

				setState(1567);
				match(T_DEFAULT);
				setState(1569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1568);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_database_stmt(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(T_CREATE);
			setState(1574);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1575);
				match(T_IF);
				setState(1576);
				match(T_NOT);
				setState(1577);
				match(T_EXISTS);
				}
				break;
			}
			setState(1580);
			expr(0);
			setState(1584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1581);
					create_database_option();
					}
					} 
				}
				setState(1586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_database_option(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_database_option);
		try {
			setState(1591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				match(T_COMMENT);
				setState(1588);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				match(T_LOCATION);
				setState(1590);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_stmt(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1593);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1594);
				match(T_CREATE);
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1595);
					match(T_OR);
					setState(1596);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1599);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1602);
			match(T_FUNCTION);
			setState(1603);
			ident();
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1604);
				create_routine_params();
				}
				break;
			}
			setState(1607);
			create_function_return();
			setState(1609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1608);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1611);
				declare_block_inplace();
				}
				break;
			}
			setState(1614);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_return(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1617);
			dtype();
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1618);
				dtype_len();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_stmt(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1621);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1622);
				match(T_CREATE);
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1623);
					match(T_OR);
					setState(1624);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1627);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1630);
			match(T_PACKAGE);
			setState(1631);
			ident();
			setState(1632);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1633);
			package_spec();
			setState(1634);
			match(T_END);
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1635);
				ident();
				setState(1636);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			package_spec_item();
			setState(1641);
			match(T_SEMICOLON);
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COLUMNS) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MONEY - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_EXTERNAL - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PARTITIONED - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SECURITY - 256)) | (1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_WORK - 320)) | (1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (T_SUB - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1642);
				package_spec_item();
				setState(1643);
				match(T_SEMICOLON);
				}
				}
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec_item(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_package_spec_item);
		int _la;
		try {
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1650);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1651);
				match(T_FUNCTION);
				setState(1652);
				ident();
				setState(1654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1653);
					create_routine_params();
					}
					break;
				}
				setState(1656);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1658);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1659);
				ident();
				setState(1661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1660);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_body_stmt(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1665);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1666);
				match(T_CREATE);
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1667);
					match(T_OR);
					setState(1668);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1671);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1674);
			match(T_PACKAGE);
			setState(1675);
			match(T_BODY);
			setState(1676);
			ident();
			setState(1677);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1678);
			package_body();
			setState(1679);
			match(T_END);
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1680);
				ident();
				setState(1681);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			package_body_item();
			setState(1686);
			match(T_SEMICOLON);
			setState(1692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COLUMNS) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MONEY - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_EXTERNAL - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PARTITIONED - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SECURITY - 256)) | (1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_WORK - 320)) | (1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (T_SUB - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1687);
				package_body_item();
				setState(1688);
				match(T_SEMICOLON);
				}
				}
				setState(1694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body_item(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_package_body_item);
		try {
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1697);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_procedure_stmt(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1700);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1701);
				match(T_CREATE);
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1702);
					match(T_OR);
					setState(1703);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1706);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1709);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1710);
			ident();
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1711);
				create_routine_params();
				}
				break;
			}
			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1714);
				create_routine_options();
				}
				break;
			}
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1717);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1720);
				declare_block_inplace();
				}
				break;
			}
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1723);
				label();
				}
				break;
			}
			setState(1726);
			proc_block();
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1727);
				ident();
				setState(1728);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_params(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_routine_params);
		int _la;
		try {
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				match(T_OPEN_P);
				setState(1733);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1734);
				match(T_OPEN_P);
				setState(1735);
				create_routine_param_item();
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1736);
					match(T_COMMA);
					setState(1737);
					create_routine_param_item();
					}
					}
					setState(1742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1743);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1745);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1746);
				create_routine_param_item();
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1747);
					match(T_COMMA);
					setState(1748);
					create_routine_param_item();
					}
					}
					setState(1753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_param_item(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1756);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1757);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1758);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1759);
					match(T_IN);
					setState(1760);
					match(T_OUT);
					}
					break;
				}
				setState(1763);
				ident();
				setState(1764);
				dtype();
				setState(1766);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1765);
					dtype_len();
					}
					break;
				}
				setState(1771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1768);
						dtype_attr();
						}
						} 
					}
					setState(1773);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1774);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				ident();
				setState(1783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1778);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1779);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1780);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1781);
					match(T_IN);
					setState(1782);
					match(T_OUT);
					}
					break;
				}
				setState(1785);
				dtype();
				setState(1787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1786);
					dtype_len();
					}
					break;
				}
				setState(1792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1789);
						dtype_attr();
						}
						} 
					}
					setState(1794);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				setState(1796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1795);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_options(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1801); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1800);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1803); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_option(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_create_routine_option);
		int _la;
		try {
			setState(1816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				match(T_LANGUAGE);
				setState(1806);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				match(T_SQL);
				setState(1808);
				match(T_SECURITY);
				setState(1809);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1810);
					match(T_DYNAMIC);
					}
				}

				setState(1813);
				match(T_RESULT);
				setState(1814);
				match(T_SETS);
				setState(1815);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDrop_stmt(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_drop_stmt);
		int _la;
		try {
			setState(1832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1818);
				match(T_DROP);
				setState(1819);
				match(T_TABLE);
				setState(1822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1820);
					match(T_IF);
					setState(1821);
					match(T_EXISTS);
					}
					break;
				}
				setState(1824);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
				match(T_DROP);
				setState(1826);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1827);
					match(T_IF);
					setState(1828);
					match(T_EXISTS);
					}
					break;
				}
				setState(1831);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public End_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterEnd_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitEnd_transaction_stmt(this);
		}
	}

	public final End_transaction_stmtContext end_transaction_stmt() throws RecognitionException {
		End_transaction_stmtContext _localctx = new End_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_end_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			match(T_END);
			setState(1835);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exec_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EXEC() { return getToken(HplsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExec_stmt(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1838);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1841);
			expr(0);
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1842);
				match(T_OPEN_P);
				setState(1843);
				expr_func_params();
				setState(1844);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1846);
				expr_func_params();
				}
				break;
			}
			setState(1858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1849);
				match(T_INTO);
				setState(1850);
				match(L_ID);
				setState(1855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1851);
						match(T_COMMA);
						setState(1852);
						match(L_ID);
						}
						} 
					}
					setState(1857);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				}
				}
				break;
			}
			setState(1861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1860);
				using_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_if_stmt);
		try {
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1864);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1865);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(HplsqlParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(HplsqlParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_plsql_stmt(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			match(T_IF);
			setState(1869);
			bool_expr(0);
			setState(1870);
			match(T_THEN);
			setState(1871);
			block();
			setState(1875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1872);
				elseif_block();
				}
				}
				setState(1877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1878);
				else_block();
				}
			}

			setState(1881);
			match(T_END);
			setState(1882);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_tsql_stmt(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(T_IF);
			setState(1885);
			bool_expr(0);
			setState(1886);
			single_block_stmt();
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1887);
				match(T_ELSE);
				setState(1888);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_bteq_stmt(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(T__3);
			setState(1892);
			match(T_IF);
			setState(1893);
			bool_expr(0);
			setState(1894);
			match(T_THEN);
			setState(1895);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HplsqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HplsqlParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElseif_block(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1898);
			bool_expr(0);
			setState(1899);
			match(T_THEN);
			setState(1900);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			match(T_ELSE);
			setState(1903);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Include_stmtContext extends ParserRuleContext {
		public TerminalNode T_INCLUDE() { return getToken(HplsqlParser.T_INCLUDE, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInclude_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInclude_stmt(this);
		}
	}

	public final Include_stmtContext include_stmt() throws RecognitionException {
		Include_stmtContext _localctx = new Include_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_include_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			match(T_INCLUDE);
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1906);
				file_name();
				}
				break;
			case 2:
				{
				setState(1907);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmt_rowsContext insert_stmt_rows() {
			return getRuleContext(Insert_stmt_rowsContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInsert_stmt(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			match(T_INSERT);
			setState(1917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OVERWRITE:
				{
				setState(1911);
				match(T_OVERWRITE);
				setState(1912);
				match(T_TABLE);
				}
				break;
			case T_INTO:
				{
				setState(1913);
				match(T_INTO);
				setState(1915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1914);
					match(T_TABLE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1919);
			table_name();
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1920);
				insert_stmt_cols();
				}
				break;
			}
			setState(1925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1923);
				select_stmt();
				}
				break;
			case T_VALUES:
				{
				setState(1924);
				insert_stmt_rows();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Insert_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInsert_stmt_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInsert_stmt_cols(this);
		}
	}

	public final Insert_stmt_colsContext insert_stmt_cols() throws RecognitionException {
		Insert_stmt_colsContext _localctx = new Insert_stmt_colsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insert_stmt_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			match(T_OPEN_P);
			setState(1928);
			ident();
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1929);
				match(T_COMMA);
				setState(1930);
				ident();
				}
				}
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1936);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowsContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<Insert_stmt_rowContext> insert_stmt_row() {
			return getRuleContexts(Insert_stmt_rowContext.class);
		}
		public Insert_stmt_rowContext insert_stmt_row(int i) {
			return getRuleContext(Insert_stmt_rowContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInsert_stmt_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInsert_stmt_rows(this);
		}
	}

	public final Insert_stmt_rowsContext insert_stmt_rows() throws RecognitionException {
		Insert_stmt_rowsContext _localctx = new Insert_stmt_rowsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_insert_stmt_rows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			match(T_VALUES);
			setState(1939);
			insert_stmt_row();
			setState(1944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1940);
					match(T_COMMA);
					setState(1941);
					insert_stmt_row();
					}
					} 
				}
				setState(1946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInsert_stmt_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInsert_stmt_row(this);
		}
	}

	public final Insert_stmt_rowContext insert_stmt_row() throws RecognitionException {
		Insert_stmt_rowContext _localctx = new Insert_stmt_rowContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_insert_stmt_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(T_OPEN_P);
			setState(1948);
			expr(0);
			setState(1953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1949);
				match(T_COMMA);
				setState(1950);
				expr(0);
				}
				}
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1956);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_directory_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HplsqlParser.T_DIRECTORY, 0); }
		public Expr_fileContext expr_file() {
			return getRuleContext(Expr_fileContext.class,0);
		}
		public Expr_selectContext expr_select() {
			return getRuleContext(Expr_selectContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public Insert_directory_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_directory_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInsert_directory_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInsert_directory_stmt(this);
		}
	}

	public final Insert_directory_stmtContext insert_directory_stmt() throws RecognitionException {
		Insert_directory_stmtContext _localctx = new Insert_directory_stmtContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_insert_directory_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			match(T_INSERT);
			setState(1959);
			match(T_OVERWRITE);
			setState(1961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCAL) {
				{
				setState(1960);
				match(T_LOCAL);
				}
			}

			setState(1963);
			match(T_DIRECTORY);
			setState(1964);
			expr_file();
			setState(1965);
			expr_select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_WHEN() { return getToken(HplsqlParser.T_WHEN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExit_stmt(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(T_EXIT);
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1968);
				match(L_ID);
				}
				break;
			}
			setState(1973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1971);
				match(T_WHEN);
				setState(1972);
				bool_expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmtContext extends ParserRuleContext {
		public TerminalNode T_GET() { return getToken(HplsqlParser.T_GET, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HplsqlParser.T_DIAGNOSTICS, 0); }
		public Get_diag_stmt_itemContext get_diag_stmt_item() {
			return getRuleContext(Get_diag_stmt_itemContext.class,0);
		}
		public Get_diag_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGet_diag_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGet_diag_stmt(this);
		}
	}

	public final Get_diag_stmtContext get_diag_stmt() throws RecognitionException {
		Get_diag_stmtContext _localctx = new Get_diag_stmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_get_diag_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			match(T_GET);
			setState(1976);
			match(T_DIAGNOSTICS);
			setState(1977);
			get_diag_stmt_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_itemContext extends ParserRuleContext {
		public Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() {
			return getRuleContext(Get_diag_stmt_exception_itemContext.class,0);
		}
		public Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() {
			return getRuleContext(Get_diag_stmt_rowcount_itemContext.class,0);
		}
		public Get_diag_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGet_diag_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGet_diag_stmt_item(this);
		}
	}

	public final Get_diag_stmt_itemContext get_diag_stmt_item() throws RecognitionException {
		Get_diag_stmt_itemContext _localctx = new Get_diag_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_get_diag_stmt_item);
		try {
			setState(1981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979);
				get_diag_stmt_exception_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1980);
				get_diag_stmt_rowcount_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_exception_itemContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public Get_diag_stmt_exception_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_exception_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGet_diag_stmt_exception_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGet_diag_stmt_exception_item(this);
		}
	}

	public final Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() throws RecognitionException {
		Get_diag_stmt_exception_itemContext _localctx = new Get_diag_stmt_exception_itemContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_get_diag_stmt_exception_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			match(T_EXCEPTION);
			setState(1984);
			match(L_INT);
			setState(1985);
			ident();
			setState(1986);
			match(T_EQUAL);
			setState(1987);
			match(T_MESSAGE_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_rowcount_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public Get_diag_stmt_rowcount_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_rowcount_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGet_diag_stmt_rowcount_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGet_diag_stmt_rowcount_item(this);
		}
	}

	public final Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() throws RecognitionException {
		Get_diag_stmt_rowcount_itemContext _localctx = new Get_diag_stmt_rowcount_itemContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_get_diag_stmt_rowcount_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			ident();
			setState(1990);
			match(T_EQUAL);
			setState(1991);
			match(T_ROW_COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmtContext extends ParserRuleContext {
		public TerminalNode T_GRANT() { return getToken(HplsqlParser.T_GRANT, 0); }
		public List<Grant_stmt_itemContext> grant_stmt_item() {
			return getRuleContexts(Grant_stmt_itemContext.class);
		}
		public Grant_stmt_itemContext grant_stmt_item(int i) {
			return getRuleContext(Grant_stmt_itemContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_ROLE() { return getToken(HplsqlParser.T_ROLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Grant_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGrant_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGrant_stmt(this);
		}
	}

	public final Grant_stmtContext grant_stmt() throws RecognitionException {
		Grant_stmtContext _localctx = new Grant_stmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_grant_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(T_GRANT);
			setState(1994);
			grant_stmt_item();
			setState(1999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1995);
				match(T_COMMA);
				setState(1996);
				grant_stmt_item();
				}
				}
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2002);
			match(T_TO);
			setState(2003);
			match(T_ROLE);
			setState(2004);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmt_itemContext extends ParserRuleContext {
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Grant_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGrant_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGrant_stmt_item(this);
		}
	}

	public final Grant_stmt_itemContext grant_stmt_item() throws RecognitionException {
		Grant_stmt_itemContext _localctx = new Grant_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_grant_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			match(T_EXECUTE);
			setState(2007);
			match(T_ON);
			setState(2008);
			match(T_PROCEDURE);
			setState(2009);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Leave_stmtContext extends ParserRuleContext {
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLeave_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLeave_stmt(this);
		}
	}

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(T_LEAVE);
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(2012);
				match(L_ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_object_stmtContext extends ParserRuleContext {
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_OBJECT() { return getToken(HplsqlParser.T_OBJECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public Map_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_object_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterMap_object_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitMap_object_stmt(this);
		}
	}

	public final Map_object_stmtContext map_object_stmt() throws RecognitionException {
		Map_object_stmtContext _localctx = new Map_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_map_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			match(T_MAP);
			setState(2016);
			match(T_OBJECT);
			setState(2017);
			expr(0);
			setState(2020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(2018);
				match(T_TO);
				setState(2019);
				expr(0);
				}
				break;
			}
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(2022);
				match(T_AT);
				setState(2023);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_stmtContext extends ParserRuleContext {
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Open_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterOpen_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitOpen_stmt(this);
		}
	}

	public final Open_stmtContext open_stmt() throws RecognitionException {
		Open_stmtContext _localctx = new Open_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_open_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			match(T_OPEN);
			setState(2027);
			match(L_ID);
			setState(2033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(2028);
				match(T_FOR);
				setState(2031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(2029);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(2030);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_stmtContext extends ParserRuleContext {
		public TerminalNode T_FETCH() { return getToken(HplsqlParser.T_FETCH, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFetch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFetch_stmt(this);
		}
	}

	public final Fetch_stmtContext fetch_stmt() throws RecognitionException {
		Fetch_stmtContext _localctx = new Fetch_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_fetch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			match(T_FETCH);
			setState(2037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(2036);
				match(T_FROM);
				}
			}

			setState(2039);
			match(L_ID);
			setState(2040);
			match(T_INTO);
			setState(2041);
			match(L_ID);
			setState(2046);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2042);
					match(T_COMMA);
					setState(2043);
					match(L_ID);
					}
					} 
				}
				setState(2048);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_stmtContext extends ParserRuleContext {
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_STATISTICS() { return getToken(HplsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STATS() { return getToken(HplsqlParser.T_STATS, 0); }
		public Collect_stats_clauseContext collect_stats_clause() {
			return getRuleContext(Collect_stats_clauseContext.class,0);
		}
		public Collect_stats_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCollect_stats_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCollect_stats_stmt(this);
		}
	}

	public final Collect_stats_stmtContext collect_stats_stmt() throws RecognitionException {
		Collect_stats_stmtContext _localctx = new Collect_stats_stmtContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_collect_stats_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(T_COLLECT);
			setState(2050);
			_la = _input.LA(1);
			if ( !(_la==T_STATS || _la==T_STATISTICS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2051);
			match(T_ON);
			setState(2052);
			table_name();
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(2053);
				collect_stats_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_clauseContext extends ParserRuleContext {
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Collect_stats_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCollect_stats_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCollect_stats_clause(this);
		}
	}

	public final Collect_stats_clauseContext collect_stats_clause() throws RecognitionException {
		Collect_stats_clauseContext _localctx = new Collect_stats_clauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			match(T_COLUMN);
			setState(2057);
			match(T_OPEN_P);
			setState(2058);
			ident();
			setState(2063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2059);
				match(T_COMMA);
				setState(2060);
				ident();
				}
				}
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2066);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterClose_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitClose_stmt(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			match(T_CLOSE);
			setState(2069);
			match(L_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public List<Cmp_sourceContext> cmp_source() {
			return getRuleContexts(Cmp_sourceContext.class);
		}
		public Cmp_sourceContext cmp_source(int i) {
			return getRuleContext(Cmp_sourceContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCmp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCmp_stmt(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(T_CMP);
			setState(2072);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2073);
			cmp_source();
			setState(2074);
			match(T_COMMA);
			setState(2075);
			cmp_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCmp_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCmp_source(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(2077);
				table_name();
				setState(2079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(2078);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2081);
				match(T_OPEN_P);
				setState(2082);
				select_stmt();
				setState(2083);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(2087);
				match(T_AT);
				setState(2088);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_from_local_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public List<Copy_sourceContext> copy_source() {
			return getRuleContexts(Copy_sourceContext.class);
		}
		public Copy_sourceContext copy_source(int i) {
			return getRuleContext(Copy_sourceContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Copy_file_optionContext> copy_file_option() {
			return getRuleContexts(Copy_file_optionContext.class);
		}
		public Copy_file_optionContext copy_file_option(int i) {
			return getRuleContext(Copy_file_optionContext.class,i);
		}
		public Copy_from_local_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_from_local_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_from_local_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_from_local_stmt(this);
		}
	}

	public final Copy_from_local_stmtContext copy_from_local_stmt() throws RecognitionException {
		Copy_from_local_stmtContext _localctx = new Copy_from_local_stmtContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_copy_from_local_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			match(T_COPY);
			setState(2092);
			match(T_FROM);
			setState(2093);
			match(T_LOCAL);
			setState(2094);
			copy_source();
			setState(2099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2095);
				match(T_COMMA);
				setState(2096);
				copy_source();
				}
				}
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2102);
			match(T_TO);
			setState(2103);
			copy_target();
			setState(2107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2104);
					copy_file_option();
					}
					} 
				}
				setState(2109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_HDFS() { return getToken(HplsqlParser.T_HDFS, 0); }
		public List<Copy_optionContext> copy_option() {
			return getRuleContexts(Copy_optionContext.class);
		}
		public Copy_optionContext copy_option(int i) {
			return getRuleContext(Copy_optionContext.class,i);
		}
		public Copy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_stmt(this);
		}
	}

	public final Copy_stmtContext copy_stmt() throws RecognitionException {
		Copy_stmtContext _localctx = new Copy_stmtContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_copy_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(T_COPY);
			setState(2116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(2111);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				setState(2112);
				match(T_OPEN_P);
				setState(2113);
				select_stmt();
				setState(2114);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2118);
			match(T_TO);
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2119);
				match(T_HDFS);
				}
				break;
			}
			setState(2122);
			copy_target();
			setState(2126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2123);
					copy_option();
					}
					} 
				}
				setState(2128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_source(this);
		}
	}

	public final Copy_sourceContext copy_source() throws RecognitionException {
		Copy_sourceContext _localctx = new Copy_sourceContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(2129);
				file_name();
				}
				break;
			case 2:
				{
				setState(2130);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_targetContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_target(this);
		}
	}

	public final Copy_targetContext copy_target() throws RecognitionException {
		Copy_targetContext _localctx = new Copy_targetContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(2133);
				file_name();
				}
				break;
			case 2:
				{
				setState(2134);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_optionContext extends ParserRuleContext {
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_BATCHSIZE() { return getToken(HplsqlParser.T_BATCHSIZE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public Copy_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_option(this);
		}
	}

	public final Copy_optionContext copy_option() throws RecognitionException {
		Copy_optionContext _localctx = new Copy_optionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_copy_option);
		try {
			setState(2145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2137);
				match(T_AT);
				setState(2138);
				ident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2139);
				match(T_BATCHSIZE);
				setState(2140);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2141);
				match(T_DELIMITER);
				setState(2142);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2143);
				match(T_SQLINSERT);
				setState(2144);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_file_optionContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public Copy_file_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_file_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_file_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_file_option(this);
		}
	}

	public final Copy_file_optionContext copy_file_option() throws RecognitionException {
		Copy_file_optionContext _localctx = new Copy_file_optionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_IGNORE || _la==T_OVERWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCommit_stmt(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
			match(T_COMMIT);
			setState(2151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2150);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_stmt(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			match(T_CREATE);
			setState(2155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(2154);
				match(T_UNIQUE);
				}
			}

			setState(2157);
			match(T_INDEX);
			setState(2158);
			ident();
			setState(2159);
			match(T_ON);
			setState(2160);
			table_name();
			setState(2161);
			match(T_OPEN_P);
			setState(2162);
			create_index_col();
			setState(2167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2163);
				match(T_COMMA);
				setState(2164);
				create_index_col();
				}
				}
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2170);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_col(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172);
			ident();
			setState(2174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(2173);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_storage_clause(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_mssql_storage_clause(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_index_mssql_storage_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			match(T_WITH);
			setState(2179);
			match(T_OPEN_P);
			setState(2180);
			ident();
			setState(2181);
			match(T_EQUAL);
			setState(2182);
			ident();
			setState(2190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2183);
				match(T_COMMA);
				setState(2184);
				ident();
				setState(2185);
				match(T_EQUAL);
				setState(2186);
				ident();
				}
				}
				setState(2192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2193);
			match(T_CLOSE_P);
			setState(2197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2194);
					create_table_options_mssql_item();
					}
					} 
				}
				setState(2199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode T_PRINT() { return getToken(HplsqlParser.T_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPrint_stmt(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_print_stmt);
		try {
			setState(2207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2200);
				match(T_PRINT);
				setState(2201);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2202);
				match(T_PRINT);
				setState(2203);
				match(T_OPEN_P);
				setState(2204);
				expr(0);
				setState(2205);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quit_stmtContext extends ParserRuleContext {
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterQuit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitQuit_stmt(this);
		}
	}

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2209);
				match(T__3);
				}
			}

			setState(2212);
			match(T_QUIT);
			setState(2214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2213);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode T_RAISE() { return getToken(HplsqlParser.T_RAISE, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitRaise_stmt(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_raise_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2216);
			match(T_RAISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resignal_stmtContext extends ParserRuleContext {
		public TerminalNode T_RESIGNAL() { return getToken(HplsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HplsqlParser.T_SQLSTATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_VALUE() { return getToken(HplsqlParser.T_VALUE, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Resignal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resignal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterResignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitResignal_stmt(this);
		}
	}

	public final Resignal_stmtContext resignal_stmt() throws RecognitionException {
		Resignal_stmtContext _localctx = new Resignal_stmtContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_resignal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(T_RESIGNAL);
			setState(2230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2219);
				match(T_SQLSTATE);
				setState(2221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2220);
					match(T_VALUE);
					}
					break;
				}
				setState(2223);
				expr(0);
				setState(2228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2224);
					match(T_SET);
					setState(2225);
					match(T_MESSAGE_TEXT);
					setState(2226);
					match(T_EQUAL);
					setState(2227);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			match(T_RETURN);
			setState(2234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2233);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode T_ROLLBACK() { return getToken(HplsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitRollback_stmt(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_rollback_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			match(T_ROLLBACK);
			setState(2238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2237);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_session_option(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_set_session_option);
		try {
			setState(2243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2240);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2241);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(2242);
				set_teradata_session_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_current_schema_option(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(2246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(2245);
					match(T_CURRENT);
					}
				}

				setState(2248);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(2249);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(2252);
				match(T_EQUAL);
				}
			}

			setState(2255);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_mssql_session_option(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2258);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_teradata_session_option(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			match(T_QUERY_BAND);
			setState(2261);
			match(T_EQUAL);
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2262);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2263);
				match(T_NONE);
				}
				break;
			}
			setState(2267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(2266);
				match(T_UPDATE);
				}
			}

			setState(2269);
			match(T_FOR);
			setState(2270);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_stmtContext extends ParserRuleContext {
		public TerminalNode T_SIGNAL() { return getToken(HplsqlParser.T_SIGNAL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Signal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSignal_stmt(this);
		}
	}

	public final Signal_stmtContext signal_stmt() throws RecognitionException {
		Signal_stmtContext _localctx = new Signal_stmtContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_signal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			match(T_SIGNAL);
			setState(2273);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Summary_stmtContext extends ParserRuleContext {
		public TerminalNode T_SUMMARY() { return getToken(HplsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public Summary_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSummary_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSummary_stmt(this);
		}
	}

	public final Summary_stmtContext summary_stmt() throws RecognitionException {
		Summary_stmtContext _localctx = new Summary_stmtContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_summary_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2275);
			match(T_SUMMARY);
			setState(2278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(2276);
				match(T_TOP);
				setState(2277);
				expr(0);
				}
			}

			setState(2280);
			match(T_FOR);
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2281);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(2282);
				table_name();
				setState(2284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2283);
					where_clause();
					}
					break;
				}
				setState(2288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2286);
					match(T_LIMIT);
					setState(2287);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_stmtContext extends ParserRuleContext {
		public TerminalNode T_TRUNCATE() { return getToken(HplsqlParser.T_TRUNCATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Truncate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTruncate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTruncate_stmt(this);
		}
	}

	public final Truncate_stmtContext truncate_stmt() throws RecognitionException {
		Truncate_stmtContext _localctx = new Truncate_stmtContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_truncate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			match(T_TRUNCATE);
			setState(2294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2293);
				match(T_TABLE);
				}
				break;
			}
			setState(2296);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUse_stmt(this);
		}
	}

	public final Use_stmtContext use_stmt() throws RecognitionException {
		Use_stmtContext _localctx = new Use_stmtContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			match(T_USE);
			setState(2299);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_into_stmtContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public Values_into_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_into_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterValues_into_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitValues_into_stmt(this);
		}
	}

	public final Values_into_stmtContext values_into_stmt() throws RecognitionException {
		Values_into_stmtContext _localctx = new Values_into_stmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_values_into_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			match(T_VALUES);
			setState(2303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2302);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2305);
			expr(0);
			setState(2310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2306);
				match(T_COMMA);
				setState(2307);
				expr(0);
				}
				}
				setState(2312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2313);
				match(T_CLOSE_P);
				}
			}

			setState(2316);
			match(T_INTO);
			setState(2318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2317);
				match(T_OPEN_P);
				}
			}

			setState(2320);
			ident();
			setState(2325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2321);
					match(T_COMMA);
					setState(2322);
					ident();
					}
					} 
				}
				setState(2327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			}
			setState(2329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2328);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(HplsqlParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(HplsqlParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			match(T_WHILE);
			setState(2332);
			bool_expr(0);
			setState(2333);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2334);
			block();
			setState(2335);
			match(T_END);
			setState(2337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2336);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_cursor_stmt(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			match(T_FOR);
			setState(2340);
			match(L_ID);
			setState(2341);
			match(T_IN);
			setState(2343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2342);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2345);
			select_stmt();
			setState(2347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2346);
				match(T_CLOSE_P);
				}
			}

			setState(2349);
			match(T_LOOP);
			setState(2350);
			block();
			setState(2351);
			match(T_END);
			setState(2352);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(HplsqlParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_range_stmt(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			match(T_FOR);
			setState(2355);
			match(L_ID);
			setState(2356);
			match(T_IN);
			setState(2358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2357);
				match(T_REVERSE);
				}
				break;
			}
			setState(2360);
			expr(0);
			setState(2361);
			match(T_DOT2);
			setState(2362);
			expr(0);
			setState(2365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(2363);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2364);
				expr(0);
				}
			}

			setState(2367);
			match(T_LOOP);
			setState(2368);
			block();
			setState(2369);
			match(T_END);
			setState(2370);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(HplsqlParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(HplsqlParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(HplsqlParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(HplsqlParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(HplsqlParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_label);
		try {
			setState(2378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2372);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2373);
				match(T_LESS);
				setState(2374);
				match(T_LESS);
				setState(2375);
				match(L_ID);
				setState(2376);
				match(T_GREATER);
				setState(2377);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUsing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUsing_clause(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			match(T_USING);
			setState(2381);
			expr(0);
			setState(2386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2382);
					match(T_COMMA);
					setState(2383);
					expr(0);
					}
					} 
				}
				setState(2388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(2389);
				cte_select_stmt();
				}
			}

			setState(2392);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			match(T_WITH);
			setState(2395);
			cte_select_stmt_item();
			setState(2400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2396);
				match(T_COMMA);
				setState(2397);
				cte_select_stmt_item();
				}
				}
				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt_item(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			ident();
			setState(2405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2404);
				cte_select_cols();
				}
			}

			setState(2407);
			match(T_AS);
			setState(2408);
			match(T_OPEN_P);
			setState(2409);
			fullselect_stmt();
			setState(2410);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_cols(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			match(T_OPEN_P);
			setState(2413);
			ident();
			setState(2418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2414);
				match(T_COMMA);
				setState(2415);
				ident();
				}
				}
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2421);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			fullselect_stmt_item();
			setState(2429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2424);
					fullselect_set_clause();
					setState(2425);
					fullselect_stmt_item();
					}
					} 
				}
				setState(2431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt_item(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_fullselect_stmt_item);
		try {
			setState(2437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2432);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2433);
				match(T_OPEN_P);
				setState(2434);
				fullselect_stmt();
				setState(2435);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(HplsqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_set_clause(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(2451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2439);
				match(T_UNION);
				setState(2441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2440);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2443);
				match(T_EXCEPT);
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2444);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2447);
				match(T_INTERSECT);
				setState(2449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2448);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSubselect_stmt(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2454);
			select_list();
			setState(2456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2455);
				into_clause();
				}
				break;
			}
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2458);
				from_clause();
				}
				break;
			}
			setState(2462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2461);
				where_clause();
				}
				break;
			}
			setState(2465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2464);
				group_by_clause();
				}
				break;
			}
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2467);
				having_clause();
				}
				break;
			case 2:
				{
				setState(2468);
				qualify_clause();
				}
				break;
			}
			setState(2472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2471);
				order_by_clause();
				}
				break;
			}
			setState(2475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2474);
				select_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2477);
				select_list_set();
				}
				break;
			}
			setState(2481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(2480);
				select_list_limit();
				}
				break;
			}
			setState(2483);
			select_list_item();
			setState(2488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2484);
					match(T_COMMA);
					setState(2485);
					select_list_item();
					}
					} 
				}
				setState(2490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_set(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_limit(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			match(T_TOP);
			setState(2494);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_item(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(2499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2496);
					ident();
					setState(2497);
					match(T_EQUAL);
					}
					break;
				}
				setState(2501);
				expr(0);
				setState(2503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2502);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2505);
				select_list_asterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_alias(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_select_list_alias);
		try {
			setState(2517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2508);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2509);
					match(T_AS);
					}
					break;
				}
				setState(2512);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2513);
				match(T_OPEN_P);
				setState(2514);
				match(T_TITLE);
				setState(2515);
				match(L_S_STRING);
				setState(2516);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_asterisk(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2519);
				match(L_ID);
				setState(2520);
				match(T__3);
				}
			}

			setState(2523);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInto_clause(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
			match(T_INTO);
			setState(2526);
			ident();
			setState(2531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2527);
					match(T_COMMA);
					setState(2528);
					ident();
					}
					} 
				}
				setState(2533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
			match(T_FROM);
			setState(2535);
			from_table_clause();
			setState(2539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2536);
					from_join_clause();
					}
					} 
				}
				setState(2541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_clause(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_from_table_clause);
		try {
			setState(2545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2542);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2543);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2544);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_name_clause(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2547);
			table_name();
			setState(2549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2548);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_subselect_clause(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2551);
			match(T_OPEN_P);
			setState(2552);
			select_stmt();
			setState(2553);
			match(T_CLOSE_P);
			setState(2555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2554);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_clause(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_from_join_clause);
		try {
			setState(2564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				match(T_COMMA);
				setState(2558);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2559);
				from_join_type_clause();
				setState(2560);
				from_table_clause();
				setState(2561);
				match(T_ON);
				setState(2562);
				bool_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_type_clause(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2566);
					match(T_INNER);
					}
				}

				setState(2569);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2570);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2571);
					match(T_OUTER);
					}
				}

				setState(2574);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_clause(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
			match(T_TABLE);
			setState(2578);
			match(T_OPEN_P);
			setState(2579);
			match(T_VALUES);
			setState(2580);
			from_table_values_row();
			setState(2585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2581);
				match(T_COMMA);
				setState(2582);
				from_table_values_row();
				}
				}
				setState(2587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2588);
			match(T_CLOSE_P);
			setState(2590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2589);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_row(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_from_table_values_row);
		int _la;
		try {
			setState(2604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2592);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2593);
				match(T_OPEN_P);
				setState(2594);
				expr(0);
				setState(2599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2595);
					match(T_COMMA);
					setState(2596);
					expr(0);
					}
					}
					setState(2601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2602);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_alias_clause(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2606);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") && 
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") && \r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2607);
				match(T_AS);
				}
				break;
			}
			setState(2610);
			ident();
			setState(2621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2611);
				match(T_OPEN_P);
				setState(2612);
				match(L_ID);
				setState(2617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2613);
					match(T_COMMA);
					setState(2614);
					match(L_ID);
					}
					}
					setState(2619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2620);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			match(T_WHERE);
			setState(2626);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGroup_by_clause(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			match(T_GROUP);
			setState(2629);
			match(T_BY);
			setState(2630);
			expr(0);
			setState(2635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2631);
					match(T_COMMA);
					setState(2632);
					expr(0);
					}
					} 
				}
				setState(2637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(T_HAVING);
			setState(2639);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitQualify_clause(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2641);
			match(T_QUALIFY);
			setState(2642);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2644);
			match(T_ORDER);
			setState(2645);
			match(T_BY);
			setState(2646);
			expr(0);
			setState(2648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				{
				setState(2647);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2650);
					match(T_COMMA);
					setState(2651);
					expr(0);
					setState(2653);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
					case 1:
						{
						setState(2652);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2661); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2660);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2663); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options_item(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_select_options_item);
		int _la;
		try {
			setState(2676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2665);
				match(T_LIMIT);
				setState(2666);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2667);
				match(T_WITH);
				setState(2668);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (T_RR - 249)) | (1L << (T_RS - 249)) | (1L << (T_UR - 249)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(2669);
					match(T_USE);
					setState(2670);
					match(T_AND);
					setState(2671);
					match(T_KEEP);
					setState(2672);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2673);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public Update_tableContext update_table() {
			return getRuleContext(Update_tableContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public Update_assignmentContext update_assignment() {
			return getRuleContext(Update_assignmentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_upsertContext update_upsert() {
			return getRuleContext(Update_upsertContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUpdate_stmt(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2678);
			match(T_UPDATE);
			setState(2679);
			update_table();
			setState(2680);
			match(T_SET);
			setState(2681);
			update_assignment();
			setState(2683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2682);
				where_clause();
				}
				break;
			}
			setState(2686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2685);
				update_upsert();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_assignmentContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUpdate_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUpdate_assignment(this);
		}
	}

	public final Update_assignmentContext update_assignment() throws RecognitionException {
		Update_assignmentContext _localctx = new Update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_update_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2688);
			assignment_stmt_item();
			setState(2693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2689);
					match(T_COMMA);
					setState(2690);
					assignment_stmt_item();
					}
					} 
				}
				setState(2695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Update_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUpdate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUpdate_table(this);
		}
	}

	public final Update_tableContext update_table() throws RecognitionException {
		Update_tableContext _localctx = new Update_tableContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_update_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(2696);
				table_name();
				setState(2698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2697);
					from_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2700);
				match(T_OPEN_P);
				setState(2701);
				select_stmt();
				setState(2702);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2706);
					match(T_AS);
					}
					break;
				}
				setState(2709);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_upsertContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_upsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_upsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUpdate_upsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUpdate_upsert(this);
		}
	}

	public final Update_upsertContext update_upsert() throws RecognitionException {
		Update_upsertContext _localctx = new Update_upsertContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_update_upsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2712);
			match(T_ELSE);
			setState(2713);
			insert_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_stmtContext extends ParserRuleContext {
		public TerminalNode T_MERGE() { return getToken(HplsqlParser.T_MERGE, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<Merge_tableContext> merge_table() {
			return getRuleContexts(Merge_tableContext.class);
		}
		public Merge_tableContext merge_table(int i) {
			return getRuleContext(Merge_tableContext.class,i);
		}
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Merge_conditionContext> merge_condition() {
			return getRuleContexts(Merge_conditionContext.class);
		}
		public Merge_conditionContext merge_condition(int i) {
			return getRuleContext(Merge_conditionContext.class,i);
		}
		public Merge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterMerge_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitMerge_stmt(this);
		}
	}

	public final Merge_stmtContext merge_stmt() throws RecognitionException {
		Merge_stmtContext _localctx = new Merge_stmtContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_merge_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2715);
			match(T_MERGE);
			setState(2716);
			match(T_INTO);
			setState(2717);
			merge_table();
			setState(2718);
			match(T_USING);
			setState(2719);
			merge_table();
			setState(2720);
			match(T_ON);
			setState(2721);
			bool_expr(0);
			setState(2723); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2722);
					merge_condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2725); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Merge_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterMerge_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitMerge_table(this);
		}
	}

	public final Merge_tableContext merge_table() throws RecognitionException {
		Merge_tableContext _localctx = new Merge_tableContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_merge_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(2727);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(2728);
				match(T_OPEN_P);
				setState(2729);
				select_stmt();
				setState(2730);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2734);
					match(T_AS);
					}
					break;
				}
				setState(2737);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_conditionContext extends ParserRuleContext {
		public TerminalNode T_WHEN() { return getToken(HplsqlParser.T_WHEN, 0); }
		public TerminalNode T_MATCHED() { return getToken(HplsqlParser.T_MATCHED, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public Merge_actionContext merge_action() {
			return getRuleContext(Merge_actionContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public Merge_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterMerge_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitMerge_condition(this);
		}
	}

	public final Merge_conditionContext merge_condition() throws RecognitionException {
		Merge_conditionContext _localctx = new Merge_conditionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_merge_condition);
		int _la;
		try {
			setState(2753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2740);
				match(T_WHEN);
				setState(2742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2741);
					match(T_NOT);
					}
				}

				setState(2744);
				match(T_MATCHED);
				setState(2747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AND) {
					{
					setState(2745);
					match(T_AND);
					setState(2746);
					bool_expr(0);
					}
				}

				setState(2749);
				match(T_THEN);
				setState(2750);
				merge_action();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2751);
				match(T_ELSE);
				setState(2752);
				match(T_IGNORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_actionContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public Insert_stmt_rowContext insert_stmt_row() {
			return getRuleContext(Insert_stmt_rowContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public Merge_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterMerge_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitMerge_action(this);
		}
	}

	public final Merge_actionContext merge_action() throws RecognitionException {
		Merge_actionContext _localctx = new Merge_actionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_merge_action);
		int _la;
		try {
			int _alt;
			setState(2775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2755);
				match(T_INSERT);
				setState(2757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2756);
					insert_stmt_cols();
					}
				}

				setState(2759);
				match(T_VALUES);
				setState(2760);
				insert_stmt_row();
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2761);
				match(T_UPDATE);
				setState(2762);
				match(T_SET);
				setState(2763);
				assignment_stmt_item();
				setState(2768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2764);
						match(T_COMMA);
						setState(2765);
						assignment_stmt_item();
						}
						} 
					}
					setState(2770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
				}
				setState(2772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2771);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2774);
				match(T_DELETE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public Delete_aliasContext delete_alias() {
			return getRuleContext(Delete_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDelete_stmt(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
			match(T_DELETE);
			setState(2779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2778);
				match(T_FROM);
				}
				break;
			}
			setState(2781);
			table_name();
			setState(2783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				{
				setState(2782);
				delete_alias();
				}
				break;
			}
			setState(2787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2785);
				where_clause();
				}
				break;
			case 2:
				{
				setState(2786);
				match(T_ALL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Delete_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDelete_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDelete_alias(this);
		}
	}

	public final Delete_aliasContext delete_alias() throws RecognitionException {
		Delete_aliasContext _localctx = new Delete_aliasContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_delete_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2789);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("ALL"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"ALL\")");
			setState(2791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2790);
				match(T_AS);
				}
				break;
			}
			setState(2793);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Describe_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DESCRIBE() { return getToken(HplsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDescribe_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDescribe_stmt(this);
		}
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_describe_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				setState(2796);
				match(T_TABLE);
				}
				break;
			}
			setState(2799);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 394;
		enterRecursionRule(_localctx, 394, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				{
				setState(2803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2802);
					match(T_NOT);
					}
				}

				setState(2805);
				match(T_OPEN_P);
				setState(2806);
				bool_expr(0);
				setState(2807);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2809);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2812);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2813);
					bool_expr_logical_operator();
					setState(2814);
					bool_expr(3);
					}
					} 
				}
				setState(2820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_atom(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_bool_expr_atom);
		try {
			setState(2824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2821);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2822);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2823);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_unary(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2826);
				expr(0);
				setState(2827);
				match(T_IS);
				setState(2829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2828);
					match(T_NOT);
					}
				}

				setState(2831);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2833);
				expr(0);
				setState(2834);
				match(T_BETWEEN);
				setState(2835);
				expr(0);
				setState(2836);
				match(T_AND);
				setState(2837);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2839);
					match(T_NOT);
					}
				}

				setState(2842);
				match(T_EXISTS);
				setState(2843);
				match(T_OPEN_P);
				setState(2844);
				select_stmt();
				setState(2845);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2847);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2848);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_single_in(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2851);
			expr(0);
			setState(2853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2852);
				match(T_NOT);
				}
			}

			setState(2855);
			match(T_IN);
			setState(2856);
			match(T_OPEN_P);
			setState(2866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				{
				setState(2857);
				expr(0);
				setState(2862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2858);
					match(T_COMMA);
					setState(2859);
					expr(0);
					}
					}
					setState(2864);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2865);
				select_stmt();
				}
				break;
			}
			setState(2868);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_multi_in(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2870);
			match(T_OPEN_P);
			setState(2871);
			expr(0);
			setState(2876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2872);
				match(T_COMMA);
				setState(2873);
				expr(0);
				}
				}
				setState(2878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2879);
			match(T_CLOSE_P);
			setState(2881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2880);
				match(T_NOT);
				}
			}

			setState(2883);
			match(T_IN);
			setState(2884);
			match(T_OPEN_P);
			setState(2885);
			select_stmt();
			setState(2886);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
			expr(0);
			setState(2889);
			bool_expr_binary_operator();
			setState(2890);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_logical_operator(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2892);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HplsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HplsqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HplsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary_operator(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2894);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2895);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2896);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2897);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2898);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2899);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2900);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2901);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2902);
					match(T_NOT);
					}
				}

				setState(2905);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 410;
		enterRecursionRule(_localctx, 410, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2909);
				match(T_OPEN_P);
				setState(2910);
				select_stmt();
				setState(2911);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2913);
				match(T_OPEN_P);
				setState(2914);
				expr(0);
				setState(2915);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2917);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2918);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2919);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2920);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2921);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2922);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2923);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2924);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2941);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2927);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2928);
						match(T_MUL);
						setState(2929);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2930);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2931);
						match(T_DIV);
						setState(2932);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2933);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2934);
						match(T_ADD);
						setState(2935);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2936);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2937);
						match(T_SUB);
						setState(2938);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2939);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2940);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_atom(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_expr_atom);
		try {
			setState(2954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2946);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2947);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2948);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2949);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2950);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2951);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2952);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2953);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_interval(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2956);
			match(T_INTERVAL);
			setState(2957);
			expr(0);
			setState(2958);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInterval_item(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2960);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HplsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HplsqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(HplsqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(HplsqlParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2962);
			expr_concat_item();
			setState(2963);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2964);
			expr_concat_item();
			setState(2969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2965);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2966);
					expr_concat_item();
					}
					} 
				}
				setState(2971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat_item(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_expr_concat_item);
		try {
			setState(2981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2972);
				match(T_OPEN_P);
				setState(2973);
				expr(0);
				setState(2974);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2976);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2977);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2978);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2979);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2980);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_expr_case);
		try {
			setState(2985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2983);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2984);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_simple(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2987);
			match(T_CASE);
			setState(2988);
			expr(0);
			setState(2994); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2989);
				match(T_WHEN);
				setState(2990);
				expr(0);
				setState(2991);
				match(T_THEN);
				setState(2992);
				expr(0);
				}
				}
				setState(2996); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(3000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2998);
				match(T_ELSE);
				setState(2999);
				expr(0);
				}
			}

			setState(3002);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_searched(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3004);
			match(T_CASE);
			setState(3010); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3005);
				match(T_WHEN);
				setState(3006);
				bool_expr(0);
				setState(3007);
				match(T_THEN);
				setState(3008);
				expr(0);
				}
				}
				setState(3012); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(3016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(3014);
				match(T_ELSE);
				setState(3015);
				expr(0);
				}
			}

			setState(3018);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_cursor_attribute(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3020);
			ident();
			setState(3021);
			match(T__2);
			setState(3022);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_agg_window_func(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(3176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(3024);
				match(T_AVG);
				setState(3025);
				match(T_OPEN_P);
				setState(3027);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(3026);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3029);
				expr(0);
				setState(3030);
				match(T_CLOSE_P);
				setState(3032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
				case 1:
					{
					setState(3031);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3034);
				match(T_COUNT);
				setState(3035);
				match(T_OPEN_P);
				setState(3041);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COLUMNS:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MONEY:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_EXTERNAL:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PARTITIONED:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(3037);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
					case 1:
						{
						setState(3036);
						expr_func_all_distinct();
						}
						break;
					}
					setState(3039);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(3040);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3043);
				match(T_CLOSE_P);
				setState(3045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
				case 1:
					{
					setState(3044);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(3047);
				match(T_COUNT_BIG);
				setState(3048);
				match(T_OPEN_P);
				setState(3054);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COLUMNS:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MONEY:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_EXTERNAL:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PARTITIONED:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(3050);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
					case 1:
						{
						setState(3049);
						expr_func_all_distinct();
						}
						break;
					}
					setState(3052);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(3053);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3056);
				match(T_CLOSE_P);
				setState(3058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
				case 1:
					{
					setState(3057);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(3060);
				match(T_CUME_DIST);
				setState(3061);
				match(T_OPEN_P);
				setState(3062);
				match(T_CLOSE_P);
				setState(3063);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(3064);
				match(T_DENSE_RANK);
				setState(3065);
				match(T_OPEN_P);
				setState(3066);
				match(T_CLOSE_P);
				setState(3067);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(3068);
				match(T_FIRST_VALUE);
				setState(3069);
				match(T_OPEN_P);
				setState(3070);
				expr(0);
				setState(3071);
				match(T_CLOSE_P);
				setState(3072);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(3074);
				match(T_LAG);
				setState(3075);
				match(T_OPEN_P);
				setState(3076);
				expr(0);
				setState(3083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3077);
					match(T_COMMA);
					setState(3078);
					expr(0);
					setState(3081);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(3079);
						match(T_COMMA);
						setState(3080);
						expr(0);
						}
					}

					}
				}

				setState(3085);
				match(T_CLOSE_P);
				setState(3086);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(3088);
				match(T_LAST_VALUE);
				setState(3089);
				match(T_OPEN_P);
				setState(3090);
				expr(0);
				setState(3091);
				match(T_CLOSE_P);
				setState(3092);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(3094);
				match(T_LEAD);
				setState(3095);
				match(T_OPEN_P);
				setState(3096);
				expr(0);
				setState(3103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3097);
					match(T_COMMA);
					setState(3098);
					expr(0);
					setState(3101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(3099);
						match(T_COMMA);
						setState(3100);
						expr(0);
						}
					}

					}
				}

				setState(3105);
				match(T_CLOSE_P);
				setState(3106);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(3108);
				match(T_MAX);
				setState(3109);
				match(T_OPEN_P);
				setState(3111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
				case 1:
					{
					setState(3110);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3113);
				expr(0);
				setState(3114);
				match(T_CLOSE_P);
				setState(3116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
				case 1:
					{
					setState(3115);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3118);
				match(T_MIN);
				setState(3119);
				match(T_OPEN_P);
				setState(3121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
				case 1:
					{
					setState(3120);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3123);
				expr(0);
				setState(3124);
				match(T_CLOSE_P);
				setState(3126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
				case 1:
					{
					setState(3125);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(3128);
				match(T_RANK);
				setState(3129);
				match(T_OPEN_P);
				setState(3130);
				match(T_CLOSE_P);
				setState(3131);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(3132);
				match(T_ROW_NUMBER);
				setState(3133);
				match(T_OPEN_P);
				setState(3134);
				match(T_CLOSE_P);
				setState(3135);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(3136);
				match(T_STDEV);
				setState(3137);
				match(T_OPEN_P);
				setState(3139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
				case 1:
					{
					setState(3138);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3141);
				expr(0);
				setState(3142);
				match(T_CLOSE_P);
				setState(3144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
				case 1:
					{
					setState(3143);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(3146);
				match(T_SUM);
				setState(3147);
				match(T_OPEN_P);
				setState(3149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
				case 1:
					{
					setState(3148);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3151);
				expr(0);
				setState(3152);
				match(T_CLOSE_P);
				setState(3154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
				case 1:
					{
					setState(3153);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(3156);
				match(T_VAR);
				setState(3157);
				match(T_OPEN_P);
				setState(3159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					{
					setState(3158);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3161);
				expr(0);
				setState(3162);
				match(T_CLOSE_P);
				setState(3164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
				case 1:
					{
					setState(3163);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(3166);
				match(T_VARIANCE);
				setState(3167);
				match(T_OPEN_P);
				setState(3169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
				case 1:
					{
					setState(3168);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3171);
				expr(0);
				setState(3172);
				match(T_CLOSE_P);
				setState(3174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
				case 1:
					{
					setState(3173);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_all_distinct(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3178);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_over_clause(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3180);
			match(T_OVER);
			setState(3181);
			match(T_OPEN_P);
			setState(3183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(3182);
				expr_func_partition_by_clause();
				}
			}

			setState(3186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(3185);
				order_by_clause();
				}
			}

			setState(3188);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_partition_by_clause(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3190);
			match(T_PARTITION);
			setState(3191);
			match(T_BY);
			setState(3192);
			expr(0);
			setState(3197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(3193);
				match(T_COMMA);
				setState(3194);
				expr(0);
				}
				}
				setState(3199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(HplsqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(HplsqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(HplsqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(HplsqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(HplsqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(HplsqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_spec_func(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(3400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3200);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3201);
				match(T_CAST);
				setState(3202);
				match(T_OPEN_P);
				setState(3203);
				expr(0);
				setState(3204);
				match(T_AS);
				setState(3205);
				dtype();
				setState(3207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(3206);
					dtype_len();
					}
				}

				setState(3209);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3211);
				match(T_COUNT);
				setState(3212);
				match(T_OPEN_P);
				setState(3215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COLUMNS:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MONEY:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_EXTERNAL:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PARTITIONED:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(3213);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(3214);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3217);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3218);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3219);
				match(T_CURRENT);
				setState(3220);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(3221);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(3222);
					match(T_CURRENT);
					setState(3223);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
				case 1:
					{
					setState(3226);
					match(T_OPEN_P);
					setState(3227);
					expr(0);
					setState(3228);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3232);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3233);
				match(T_CURRENT);
				setState(3234);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3235);
				match(T_MAX_PART_STRING);
				setState(3236);
				match(T_OPEN_P);
				setState(3237);
				expr(0);
				setState(3250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3238);
					match(T_COMMA);
					setState(3239);
					expr(0);
					setState(3247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3240);
						match(T_COMMA);
						setState(3241);
						expr(0);
						setState(3242);
						match(T_EQUAL);
						setState(3243);
						expr(0);
						}
						}
						setState(3249);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3252);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3254);
				match(T_MIN_PART_STRING);
				setState(3255);
				match(T_OPEN_P);
				setState(3256);
				expr(0);
				setState(3269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3257);
					match(T_COMMA);
					setState(3258);
					expr(0);
					setState(3266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3259);
						match(T_COMMA);
						setState(3260);
						expr(0);
						setState(3261);
						match(T_EQUAL);
						setState(3262);
						expr(0);
						}
						}
						setState(3268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3271);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3273);
				match(T_MAX_PART_INT);
				setState(3274);
				match(T_OPEN_P);
				setState(3275);
				expr(0);
				setState(3288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3276);
					match(T_COMMA);
					setState(3277);
					expr(0);
					setState(3285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3278);
						match(T_COMMA);
						setState(3279);
						expr(0);
						setState(3280);
						match(T_EQUAL);
						setState(3281);
						expr(0);
						}
						}
						setState(3287);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3290);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3292);
				match(T_MIN_PART_INT);
				setState(3293);
				match(T_OPEN_P);
				setState(3294);
				expr(0);
				setState(3307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3295);
					match(T_COMMA);
					setState(3296);
					expr(0);
					setState(3304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3297);
						match(T_COMMA);
						setState(3298);
						expr(0);
						setState(3299);
						match(T_EQUAL);
						setState(3300);
						expr(0);
						}
						}
						setState(3306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3309);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3311);
				match(T_MAX_PART_DATE);
				setState(3312);
				match(T_OPEN_P);
				setState(3313);
				expr(0);
				setState(3326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3314);
					match(T_COMMA);
					setState(3315);
					expr(0);
					setState(3323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3316);
						match(T_COMMA);
						setState(3317);
						expr(0);
						setState(3318);
						match(T_EQUAL);
						setState(3319);
						expr(0);
						}
						}
						setState(3325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3328);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3330);
				match(T_MIN_PART_DATE);
				setState(3331);
				match(T_OPEN_P);
				setState(3332);
				expr(0);
				setState(3345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3333);
					match(T_COMMA);
					setState(3334);
					expr(0);
					setState(3342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3335);
						match(T_COMMA);
						setState(3336);
						expr(0);
						setState(3337);
						match(T_EQUAL);
						setState(3338);
						expr(0);
						}
						}
						setState(3344);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3347);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3349);
				match(T_PART_COUNT);
				setState(3350);
				match(T_OPEN_P);
				setState(3351);
				expr(0);
				setState(3359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(3352);
					match(T_COMMA);
					setState(3353);
					expr(0);
					setState(3354);
					match(T_EQUAL);
					setState(3355);
					expr(0);
					}
					}
					setState(3361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3362);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3364);
				match(T_PART_LOC);
				setState(3365);
				match(T_OPEN_P);
				setState(3366);
				expr(0);
				setState(3372); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3367);
						match(T_COMMA);
						setState(3368);
						expr(0);
						setState(3369);
						match(T_EQUAL);
						setState(3370);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3374); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3376);
					match(T_COMMA);
					setState(3377);
					expr(0);
					}
				}

				setState(3380);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3382);
				match(T_TRIM);
				setState(3383);
				match(T_OPEN_P);
				setState(3384);
				expr(0);
				setState(3385);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3387);
				match(T_SUBSTRING);
				setState(3388);
				match(T_OPEN_P);
				setState(3389);
				expr(0);
				setState(3390);
				match(T_FROM);
				setState(3391);
				expr(0);
				setState(3394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(3392);
					match(T_FOR);
					setState(3393);
					expr(0);
					}
				}

				setState(3396);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3398);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3399);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3402);
			ident();
			setState(3403);
			match(T_OPEN_P);
			setState(3405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				{
				setState(3404);
				expr_func_params();
				}
				break;
			}
			setState(3407);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_params(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3409);
			func_param();
			setState(3414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3410);
					match(T_COMMA);
					setState(3411);
					func_param();
					}
					} 
				}
				setState(3416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFunc_param(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3417);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(3423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
			case 1:
				{
				setState(3418);
				ident();
				setState(3419);
				match(T_EQUAL);
				setState(3421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(3420);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(3425);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_select(this);
		}
	}

	public final Expr_selectContext expr_select() throws RecognitionException {
		Expr_selectContext _localctx = new Expr_selectContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_expr_select);
		try {
			setState(3429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,428,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3427);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3428);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_fileContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_file(this);
		}
	}

	public final Expr_fileContext expr_file() throws RecognitionException {
		Expr_fileContext _localctx = new Expr_fileContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_expr_file);
		try {
			setState(3433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3431);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3432);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HiveContext extends ParserRuleContext {
		public TerminalNode T_HIVE() { return getToken(HplsqlParser.T_HIVE, 0); }
		public List<Hive_itemContext> hive_item() {
			return getRuleContexts(Hive_itemContext.class);
		}
		public Hive_itemContext hive_item(int i) {
			return getRuleContext(Hive_itemContext.class,i);
		}
		public HiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHive(this);
		}
	}

	public final HiveContext hive() throws RecognitionException {
		HiveContext _localctx = new HiveContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_hive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3435);
			match(T_HIVE);
			setState(3439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3436);
					hive_item();
					}
					} 
				}
				setState(3441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hive_itemContext extends ParserRuleContext {
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHive_item(this);
		}
	}

	public final Hive_itemContext hive_item() throws RecognitionException {
		Hive_itemContext _localctx = new Hive_itemContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_hive_item);
		try {
			setState(3454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3442);
				match(T_SUB);
				setState(3443);
				ident();
				setState(3444);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3446);
				match(T_SUB);
				setState(3447);
				ident();
				setState(3448);
				match(L_ID);
				setState(3449);
				match(T_EQUAL);
				setState(3450);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3452);
				match(T_SUB);
				setState(3453);
				ident();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostContext extends ParserRuleContext {
		public Host_cmdContext host_cmd() {
			return getRuleContext(Host_cmdContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Host_stmtContext host_stmt() {
			return getRuleContext(Host_stmtContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHost(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_host);
		try {
			setState(3461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(3456);
				match(T__4);
				setState(3457);
				host_cmd();
				setState(3458);
				match(T_SEMICOLON);
				}
				break;
			case T_HOST:
				enterOuterAlt(_localctx, 2);
				{
				setState(3460);
				host_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_cmdContext extends ParserRuleContext {
		public Host_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHost_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHost_cmd(this);
		}
	}

	public final Host_cmdContext host_cmd() throws RecognitionException {
		Host_cmdContext _localctx = new Host_cmdContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_host_cmd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(3463);
					matchWildcard();
					}
					} 
				}
				setState(3468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_stmtContext extends ParserRuleContext {
		public TerminalNode T_HOST() { return getToken(HplsqlParser.T_HOST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Host_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHost_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHost_stmt(this);
		}
	}

	public final Host_stmtContext host_stmt() throws RecognitionException {
		Host_stmtContext _localctx = new Host_stmtContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_host_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3469);
			match(T_HOST);
			setState(3470);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode L_FILE() { return getToken(HplsqlParser.L_FILE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_DIV() { return getTokens(HplsqlParser.T_DIV); }
		public TerminalNode T_DIV(int i) {
			return getToken(HplsqlParser.T_DIV, i);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFile_name(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_file_name);
		try {
			int _alt;
			setState(3486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3472);
				match(L_FILE);
				}
				break;
			case T__3:
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_DIV:
			case T_SUB:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3476);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(3473);
					match(T_DIV);
					}
					break;
				case T__3:
					{
					setState(3474);
					match(T__3);
					setState(3475);
					match(T_DIV);
					}
					break;
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COLUMNS:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MONEY:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_EXTERNAL:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PARTITIONED:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_SUB:
				case L_ID:
					break;
				default:
					break;
				}
				setState(3478);
				ident();
				setState(3483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,435,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3479);
						match(T_DIV);
						setState(3480);
						ident();
						}
						} 
					}
					setState(3485);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,435,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDate_literal(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3488);
			match(T_DATE);
			setState(3489);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTimestamp_literal(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3491);
			match(T_TIMESTAMP);
			setState(3492);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(3494);
				match(T_SUB);
				}
			}

			setState(3499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(3497);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COLUMNS:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MONEY:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_EXTERNAL:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PARTITIONED:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(3498);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,440,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3501);
					match(T__3);
					setState(3504);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(3502);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COLUMNS:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MONEY:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_EXTERNAL:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PARTITIONED:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(3503);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(3510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,440,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(HplsqlParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDouble_quotedString(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_quotedString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_string);
		try {
			setState(3513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3511);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3512);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInt_number(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3515);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3518);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDec_number(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3520);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3523);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3525);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNull_const(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3527);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(HplsqlParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(HplsqlParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(HplsqlParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_COLUMNS() { return getToken(HplsqlParser.T_COLUMNS, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HplsqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HplsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HplsqlParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(HplsqlParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HplsqlParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public TerminalNode T_PARTITIONED() { return getToken(HplsqlParser.T_PARTITIONED, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(HplsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HplsqlParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HplsqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HplsqlParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(HplsqlParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(HplsqlParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(HplsqlParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(HplsqlParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(HplsqlParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HplsqlParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HplsqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(HplsqlParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(HplsqlParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_MONEY() { return getToken(HplsqlParser.T_MONEY, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(HplsqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HplsqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(HplsqlParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HplsqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(HplsqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HplsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(HplsqlParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HplsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HplsqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HplsqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HplsqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HplsqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HplsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HplsqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HplsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_EXTERNAL() { return getToken(HplsqlParser.T_EXTERNAL, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HplsqlParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HplsqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HplsqlParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNon_reserved_words(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3529);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COLUMNS) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MONEY - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_EXTERNAL - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PARTITIONED - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SECURITY - 256)) | (1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_WORK - 320)) | (1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 88:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 166:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 177:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 195:
			return delete_alias_sempred((Delete_aliasContext)_localctx, predIndex);
		case 197:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 205:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 222:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") && 
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean delete_alias_sempred(Delete_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_input.LT(1).getText().equalsIgnoreCase("ALL");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017e\u0dce\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\3\2\3\2\3\2\3\3\3\3\5\3\u01e8\n\3\3\3\5\3\u01eb\n\3\6\3\u01ed"+
		"\n\3\r\3\16\3\u01ee\3\4\5\4\u01f2\n\4\3\4\3\4\3\4\5\4\u01f7\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\5\5\u01fe\n\5\3\5\3\5\3\5\3\5\5\5\u0204\n\5\5\5\u0206\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\6\7\u020d\n\7\r\7\16\7\u020e\3\7\5\7\u0212\n\7"+
		"\5\7\u0214\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0252\n\b\3\t\3\t\3\n"+
		"\3\n\6\n\u0258\n\n\r\n\16\n\u0259\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u026a\n\16\3\16\3\16\3\16\7\16\u026f"+
		"\n\16\f\16\16\16\u0272\13\16\5\16\u0274\n\16\3\17\3\17\3\17\5\17\u0279"+
		"\n\17\3\20\3\20\5\20\u027d\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0286\n\20\3\20\3\20\3\20\5\20\u028b\n\20\3\21\3\21\3\21\3\21\7\21\u0291"+
		"\n\21\f\21\16\21\u0294\13\21\3\21\3\21\5\21\u0298\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u029f\n\21\f\21\16\21\u02a2\13\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u02ab\n\22\f\22\16\22\u02ae\13\22\3\22\3\22\5\22"+
		"\u02b2\n\22\3\22\5\22\u02b5\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u02c3\n\23\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u02ca\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u02d1\n\24\f\24\16\24\u02d4"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u02e4\n\27\3\27\3\27\5\27\u02e8\n\27\3\30\3\30\3\30\3\30\7"+
		"\30\u02ee\n\30\f\30\16\30\u02f1\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7"+
		"\31\u02f9\n\31\f\31\16\31\u02fc\13\31\3\32\3\32\3\32\3\32\3\32\7\32\u0303"+
		"\n\32\f\32\16\32\u0306\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u030d\n\33"+
		"\3\34\3\34\3\34\7\34\u0312\n\34\f\34\16\34\u0315\13\34\3\34\5\34\u0318"+
		"\n\34\3\34\3\34\5\34\u031c\n\34\3\34\7\34\u031f\n\34\f\34\16\34\u0322"+
		"\13\34\3\34\5\34\u0325\n\34\3\34\3\34\3\34\5\34\u032a\n\34\3\34\3\34\5"+
		"\34\u032e\n\34\3\34\3\34\5\34\u0332\n\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u033c\n\36\3\36\3\36\5\36\u0340\n\36\3\36\3\36\3\36\5"+
		"\36\u0345\n\36\3\37\3\37\3\37\5\37\u034a\n\37\3\37\3\37\5\37\u034e\n\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u035b\n!\3!\3!\3\"\5\"\u0360\n\""+
		"\3\"\3\"\3\"\3\"\5\"\u0366\n\"\3\"\3\"\3#\3#\5#\u036c\n#\3#\3#\3#\3#\5"+
		"#\u0372\n#\3#\3#\5#\u0376\n#\3#\3#\3$\3$\3$\3$\5$\u037e\n$\3$\5$\u0381"+
		"\n$\3$\3$\3$\5$\u0386\n$\3$\3$\3%\3%\3&\5&\u038d\n&\3&\3&\3&\3&\3&\5&"+
		"\u0394\n&\3&\3&\3&\3&\3&\3&\3&\5&\u039d\n&\3&\5&\u03a0\n&\3\'\3\'\3\'"+
		"\7\'\u03a5\n\'\f\'\16\'\u03a8\13\'\3(\3(\3(\5(\u03ad\n(\3(\7(\u03b0\n"+
		"(\f(\16(\u03b3\13(\3(\7(\u03b6\n(\f(\16(\u03b9\13(\3(\3(\5(\u03bd\n(\3"+
		"(\5(\u03c0\n(\3)\3)\3*\3*\5*\u03c6\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7"+
		"*\u03d2\n*\f*\16*\u03d5\13*\3*\3*\3*\3*\3*\7*\u03dc\n*\f*\16*\u03df\13"+
		"*\3*\3*\3*\5*\u03e4\n*\3+\3+\3+\5+\u03e9\n+\3+\3+\3+\5+\u03ee\n+\3+\3"+
		"+\3+\5+\u03f3\n+\7+\u03f5\n+\f+\16+\u03f8\13+\3+\3+\5+\u03fc\n+\3+\5+"+
		"\u03ff\n+\3+\3+\3+\3+\3+\3+\7+\u0407\n+\f+\16+\u040a\13+\3+\3+\3+\3+\3"+
		"+\3+\3+\7+\u0413\n+\f+\16+\u0416\13+\3+\3+\7+\u041a\n+\f+\16+\u041d\13"+
		"+\5+\u041f\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u042b\n,\3-\6-\u042e\n"+
		"-\r-\16-\u042f\3.\3.\3.\5.\u0435\n.\3/\5/\u0438\n/\3/\3/\3\60\6\60\u043d"+
		"\n\60\r\60\16\60\u043e\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u044b\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\6\62\u0458\n\62\r\62\16\62\u0459\3\62\3\62\3\62\5\62\u045f\n\62"+
		"\3\63\5\63\u0462\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u046f\n\63\f\63\16\63\u0472\13\63\3\63\3\63\3\63\5\63\u0477"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0482\n\63\3\64"+
		"\5\64\u0485\n\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u048d\n\64\f\64\16"+
		"\64\u0490\13\64\3\64\3\64\3\64\3\64\5\64\u0496\n\64\3\65\5\65\u0499\n"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04a1\n\65\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\7\67\u04ab\n\67\f\67\16\67\u04ae\13\67\3\67\3\67"+
		"\38\38\38\58\u04b5\n8\39\39\39\3:\3:\3:\7:\u04bd\n:\f:\16:\u04c0\13:\3"+
		":\5:\u04c3\n:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\5=\u04cf\n=\3=\7=\u04d2\n"+
		"=\f=\16=\u04d5\13=\3>\3>\3>\3>\3>\3>\3>\5>\u04de\n>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04f3\n>\3?\3?\3?\3?\5?\u04f9"+
		"\n?\3@\3@\5@\u04fd\n@\3@\3@\3@\5@\u0502\n@\3@\3@\5@\u0506\n@\3@\3@\3@"+
		"\5@\u050b\n@\3@\5@\u050e\n@\3@\3@\3@\5@\u0513\n@\3@\5@\u0516\n@\3A\3A"+
		"\3A\3A\3A\3B\3B\3B\3C\3C\5C\u0522\nC\3D\3D\3D\3E\5E\u0528\nE\3E\3E\3E"+
		"\3E\3E\5E\u052f\nE\3E\3E\3E\3E\3E\3E\3E\5E\u0538\nE\3F\3F\3F\7F\u053d"+
		"\nF\fF\16F\u0540\13F\3G\3G\3G\5G\u0545\nG\3G\7G\u0548\nG\fG\16G\u054b"+
		"\13G\3G\7G\u054e\nG\fG\16G\u0551\13G\3G\3G\5G\u0555\nG\3G\5G\u0558\nG"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0567\nH\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u0587\nH\5H\u0589\nH\3I\3I\5I\u058d\nI\3I\3I\3J\3J\3J\5J\u0594"+
		"\nJ\3J\3J\3J\5J\u0599\nJ\3J\3J\3J\5J\u059e\nJ\7J\u05a0\nJ\fJ\16J\u05a3"+
		"\13J\3J\3J\5J\u05a7\nJ\3J\5J\u05aa\nJ\3J\3J\3J\3J\3J\3J\7J\u05b2\nJ\f"+
		"J\16J\u05b5\13J\3J\3J\3J\3J\3J\3J\3J\7J\u05be\nJ\fJ\16J\u05c1\13J\3J\3"+
		"J\7J\u05c5\nJ\fJ\16J\u05c8\13J\3J\3J\3J\3J\3J\5J\u05cf\nJ\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u05de\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u05fe"+
		"\nK\5K\u0600\nK\3L\3L\3L\5L\u0605\nL\3L\3L\5L\u0609\nL\3L\3L\3M\5M\u060e"+
		"\nM\3M\3M\3M\3M\3M\5M\u0615\nM\3M\5M\u0618\nM\3N\5N\u061b\nN\3N\3N\3N"+
		"\5N\u0620\nN\3N\3N\5N\u0624\nN\5N\u0626\nN\3O\3O\3O\3O\3O\5O\u062d\nO"+
		"\3O\3O\7O\u0631\nO\fO\16O\u0634\13O\3P\3P\3P\3P\5P\u063a\nP\3Q\3Q\3Q\3"+
		"Q\5Q\u0640\nQ\3Q\5Q\u0643\nQ\3Q\3Q\3Q\5Q\u0648\nQ\3Q\3Q\5Q\u064c\nQ\3"+
		"Q\5Q\u064f\nQ\3Q\3Q\3R\3R\3R\5R\u0656\nR\3S\3S\3S\3S\5S\u065c\nS\3S\5"+
		"S\u065f\nS\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0669\nS\3T\3T\3T\3T\3T\7T\u0670"+
		"\nT\fT\16T\u0673\13T\3U\3U\3U\3U\5U\u0679\nU\3U\3U\3U\3U\3U\5U\u0680\n"+
		"U\5U\u0682\nU\3V\3V\3V\3V\5V\u0688\nV\3V\5V\u068b\nV\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\5V\u0696\nV\3W\3W\3W\3W\3W\7W\u069d\nW\fW\16W\u06a0\13W\3X"+
		"\3X\3X\5X\u06a5\nX\3Y\3Y\3Y\3Y\5Y\u06ab\nY\3Y\5Y\u06ae\nY\3Y\3Y\3Y\5Y"+
		"\u06b3\nY\3Y\5Y\u06b6\nY\3Y\5Y\u06b9\nY\3Y\5Y\u06bc\nY\3Y\5Y\u06bf\nY"+
		"\3Y\3Y\3Y\3Y\5Y\u06c5\nY\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u06cd\nZ\fZ\16Z\u06d0\13"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u06d8\nZ\fZ\16Z\u06db\13Z\5Z\u06dd\nZ\3[\3[\3["+
		"\3[\3[\5[\u06e4\n[\3[\3[\3[\5[\u06e9\n[\3[\7[\u06ec\n[\f[\16[\u06ef\13"+
		"[\3[\5[\u06f2\n[\3[\3[\3[\3[\3[\3[\5[\u06fa\n[\3[\3[\5[\u06fe\n[\3[\7"+
		"[\u0701\n[\f[\16[\u0704\13[\3[\5[\u0707\n[\5[\u0709\n[\3\\\6\\\u070c\n"+
		"\\\r\\\16\\\u070d\3]\3]\3]\3]\3]\3]\5]\u0716\n]\3]\3]\3]\5]\u071b\n]\3"+
		"^\3^\3^\3^\5^\u0721\n^\3^\3^\3^\3^\3^\5^\u0728\n^\3^\5^\u072b\n^\3_\3"+
		"_\3_\3`\3`\5`\u0732\n`\3`\3`\3`\3`\3`\3`\5`\u073a\n`\3`\3`\3`\3`\7`\u0740"+
		"\n`\f`\16`\u0743\13`\5`\u0745\n`\3`\5`\u0748\n`\3a\3a\3a\5a\u074d\na\3"+
		"b\3b\3b\3b\3b\7b\u0754\nb\fb\16b\u0757\13b\3b\5b\u075a\nb\3b\3b\3b\3c"+
		"\3c\3c\3c\3c\5c\u0764\nc\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3f\3f\3f\3g"+
		"\3g\3g\5g\u0777\ng\3h\3h\3h\3h\3h\5h\u077e\nh\5h\u0780\nh\3h\3h\5h\u0784"+
		"\nh\3h\3h\5h\u0788\nh\3i\3i\3i\3i\7i\u078e\ni\fi\16i\u0791\13i\3i\3i\3"+
		"j\3j\3j\3j\7j\u0799\nj\fj\16j\u079c\13j\3k\3k\3k\3k\7k\u07a2\nk\fk\16"+
		"k\u07a5\13k\3k\3k\3l\3l\3l\5l\u07ac\nl\3l\3l\3l\3l\3m\3m\5m\u07b4\nm\3"+
		"m\3m\5m\u07b8\nm\3n\3n\3n\3n\3o\3o\5o\u07c0\no\3p\3p\3p\3p\3p\3p\3q\3"+
		"q\3q\3q\3r\3r\3r\3r\7r\u07d0\nr\fr\16r\u07d3\13r\3r\3r\3r\3r\3s\3s\3s"+
		"\3s\3s\3t\3t\5t\u07e0\nt\3u\3u\3u\3u\3u\5u\u07e7\nu\3u\3u\5u\u07eb\nu"+
		"\3v\3v\3v\3v\3v\5v\u07f2\nv\5v\u07f4\nv\3w\3w\5w\u07f8\nw\3w\3w\3w\3w"+
		"\3w\7w\u07ff\nw\fw\16w\u0802\13w\3x\3x\3x\3x\3x\5x\u0809\nx\3y\3y\3y\3"+
		"y\3y\7y\u0810\ny\fy\16y\u0813\13y\3y\3y\3z\3z\3z\3{\3{\3{\3{\3{\3{\3|"+
		"\3|\5|\u0822\n|\3|\3|\3|\3|\5|\u0828\n|\3|\3|\5|\u082c\n|\3}\3}\3}\3}"+
		"\3}\3}\7}\u0834\n}\f}\16}\u0837\13}\3}\3}\3}\7}\u083c\n}\f}\16}\u083f"+
		"\13}\3~\3~\3~\3~\3~\3~\5~\u0847\n~\3~\3~\5~\u084b\n~\3~\3~\7~\u084f\n"+
		"~\f~\16~\u0852\13~\3\177\3\177\5\177\u0856\n\177\3\u0080\3\u0080\5\u0080"+
		"\u085a\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u0864\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083"+
		"\u086a\n\u0083\3\u0084\3\u0084\5\u0084\u086e\n\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0878\n\u0084\f"+
		"\u0084\16\u0084\u087b\13\u0084\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085"+
		"\u0881\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u088f\n\u0087\f\u0087"+
		"\16\u0087\u0892\13\u0087\3\u0087\3\u0087\7\u0087\u0896\n\u0087\f\u0087"+
		"\16\u0087\u0899\13\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u08a2\n\u0088\3\u0089\5\u0089\u08a5\n\u0089\3\u0089\3"+
		"\u0089\5\u0089\u08a9\n\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\5"+
		"\u008b\u08b0\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u08b7"+
		"\n\u008b\5\u008b\u08b9\n\u008b\3\u008c\3\u008c\5\u008c\u08bd\n\u008c\3"+
		"\u008d\3\u008d\5\u008d\u08c1\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u08c6"+
		"\n\u008e\3\u008f\5\u008f\u08c9\n\u008f\3\u008f\3\u008f\5\u008f\u08cd\n"+
		"\u008f\3\u008f\5\u008f\u08d0\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3"+
		"\u0090\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08db\n\u0091\3\u0091\5"+
		"\u0091\u08de\n\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3"+
		"\u0093\3\u0093\3\u0093\5\u0093\u08e9\n\u0093\3\u0093\3\u0093\3\u0093\3"+
		"\u0093\5\u0093\u08ef\n\u0093\3\u0093\3\u0093\5\u0093\u08f3\n\u0093\5\u0093"+
		"\u08f5\n\u0093\3\u0094\3\u0094\5\u0094\u08f9\n\u0094\3\u0094\3\u0094\3"+
		"\u0095\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096\u0902\n\u0096\3\u0096\3"+
		"\u0096\3\u0096\7\u0096\u0907\n\u0096\f\u0096\16\u0096\u090a\13\u0096\3"+
		"\u0096\5\u0096\u090d\n\u0096\3\u0096\3\u0096\5\u0096\u0911\n\u0096\3\u0096"+
		"\3\u0096\3\u0096\7\u0096\u0916\n\u0096\f\u0096\16\u0096\u0919\13\u0096"+
		"\3\u0096\5\u0096\u091c\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u0924\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u092a\n\u0098\3\u0098\3\u0098\5\u0098\u092e\n\u0098\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0939\n"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0940\n\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u094d\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\7\u009b\u0953\n\u009b\f\u009b\16\u009b\u0956\13\u009b\3\u009c\5\u009c"+
		"\u0959\n\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d"+
		"\u0961\n\u009d\f\u009d\16\u009d\u0964\13\u009d\3\u009e\3\u009e\5\u009e"+
		"\u0968\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\7\u009f\u0973\n\u009f\f\u009f\16\u009f\u0976\13\u009f"+
		"\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u097e\n\u00a0"+
		"\f\u00a0\16\u00a0\u0981\13\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u0988\n\u00a1\3\u00a2\3\u00a2\5\u00a2\u098c\n\u00a2\3\u00a2\3"+
		"\u00a2\5\u00a2\u0990\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0994\n\u00a2\5\u00a2"+
		"\u0996\n\u00a2\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u099b\n\u00a3\3\u00a3\5"+
		"\u00a3\u099e\n\u00a3\3\u00a3\5\u00a3\u09a1\n\u00a3\3\u00a3\5\u00a3\u09a4"+
		"\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u09a8\n\u00a3\3\u00a3\5\u00a3\u09ab\n"+
		"\u00a3\3\u00a3\5\u00a3\u09ae\n\u00a3\3\u00a4\5\u00a4\u09b1\n\u00a4\3\u00a4"+
		"\5\u00a4\u09b4\n\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u09b9\n\u00a4\f"+
		"\u00a4\16\u00a4\u09bc\13\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09c6\n\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u09ca\n\u00a7\3\u00a7\5\u00a7\u09cd\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u09d1"+
		"\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u09d8\n\u00a8"+
		"\3\u00a9\3\u00a9\5\u00a9\u09dc\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\7\u00aa\u09e4\n\u00aa\f\u00aa\16\u00aa\u09e7\13\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u09ec\n\u00ab\f\u00ab\16\u00ab\u09ef"+
		"\13\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u09f4\n\u00ac\3\u00ad\3\u00ad"+
		"\5\u00ad\u09f8\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u09fe\n"+
		"\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af"+
		"\u0a07\n\u00af\3\u00b0\5\u00b0\u0a0a\n\u00b0\3\u00b0\3\u00b0\3\u00b0\5"+
		"\u00b0\u0a0f\n\u00b0\3\u00b0\5\u00b0\u0a12\n\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0a1a\n\u00b1\f\u00b1\16\u00b1\u0a1d"+
		"\13\u00b1\3\u00b1\3\u00b1\5\u00b1\u0a21\n\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u0a28\n\u00b2\f\u00b2\16\u00b2\u0a2b\13\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0a2f\n\u00b2\3\u00b3\3\u00b3\5\u00b3\u0a33\n"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0a3a\n\u00b3\f"+
		"\u00b3\16\u00b3\u0a3d\13\u00b3\3\u00b3\5\u00b3\u0a40\n\u00b3\3\u00b4\3"+
		"\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\7\u00b6\u0a4c\n\u00b6\f\u00b6\16\u00b6\u0a4f\13\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u0a5b\n\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0a60\n\u00b9\7\u00b9\u0a62"+
		"\n\u00b9\f\u00b9\16\u00b9\u0a65\13\u00b9\3\u00ba\6\u00ba\u0a68\n\u00ba"+
		"\r\u00ba\16\u00ba\u0a69\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0a75\n\u00bb\5\u00bb\u0a77\n\u00bb\3"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0a7e\n\u00bc\3\u00bc\5"+
		"\u00bc\u0a81\n\u00bc\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0a86\n\u00bd\f\u00bd"+
		"\16\u00bd\u0a89\13\u00bd\3\u00be\3\u00be\5\u00be\u0a8d\n\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0a93\n\u00be\3\u00be\5\u00be\u0a96\n"+
		"\u00be\3\u00be\5\u00be\u0a99\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\6\u00c0\u0aa6\n"+
		"\u00c0\r\u00c0\16\u00c0\u0aa7\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\5\u00c1\u0aaf\n\u00c1\3\u00c1\5\u00c1\u0ab2\n\u00c1\3\u00c1\5\u00c1\u0ab5"+
		"\n\u00c1\3\u00c2\3\u00c2\5\u00c2\u0ab9\n\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u0abe\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ac4\n"+
		"\u00c2\3\u00c3\3\u00c3\5\u00c3\u0ac8\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3"+
		"\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0ad1\n\u00c3\f\u00c3\16\u00c3"+
		"\u0ad4\13\u00c3\3\u00c3\5\u00c3\u0ad7\n\u00c3\3\u00c3\5\u00c3\u0ada\n"+
		"\u00c3\3\u00c4\3\u00c4\5\u00c4\u0ade\n\u00c4\3\u00c4\3\u00c4\5\u00c4\u0ae2"+
		"\n\u00c4\3\u00c4\3\u00c4\5\u00c4\u0ae6\n\u00c4\3\u00c5\3\u00c5\5\u00c5"+
		"\u0aea\n\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\5\u00c6\u0af0\n\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c7\3\u00c7\5\u00c7\u0af6\n\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\5\u00c7\u0afd\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\7\u00c7\u0b03\n\u00c7\f\u00c7\16\u00c7\u0b06\13\u00c7\3\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u0b0b\n\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0b10"+
		"\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u0b1b\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0b24\n\u00c9\3\u00ca\3\u00ca\5\u00ca\u0b28\n"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u0b2f\n\u00ca\f"+
		"\u00ca\16\u00ca\u0b32\13\u00ca\3\u00ca\5\u00ca\u0b35\n\u00ca\3\u00ca\3"+
		"\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u0b3d\n\u00cb\f\u00cb\16"+
		"\u00cb\u0b40\13\u00cb\3\u00cb\3\u00cb\5\u00cb\u0b44\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd"+
		"\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\5\u00ce\u0b5a\n\u00ce\3\u00ce\5\u00ce\u0b5d\n\u00ce\3\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0b70"+
		"\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u0b80\n\u00cf"+
		"\f\u00cf\16\u00cf\u0b83\13\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0b8d\n\u00d0\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3"+
		"\u0b9a\n\u00d3\f\u00d3\16\u00d3\u0b9d\13\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0ba8\n\u00d4"+
		"\3\u00d5\3\u00d5\5\u00d5\u0bac\n\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\6\u00d6\u0bb5\n\u00d6\r\u00d6\16\u00d6\u0bb6"+
		"\3\u00d6\3\u00d6\5\u00d6\u0bbb\n\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\6\u00d7\u0bc5\n\u00d7\r\u00d7\16\u00d7"+
		"\u0bc6\3\u00d7\3\u00d7\5\u00d7\u0bcb\n\u00d7\3\u00d7\3\u00d7\3\u00d8\3"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0bd6\n\u00d9\3"+
		"\u00d9\3\u00d9\3\u00d9\5\u00d9\u0bdb\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5"+
		"\u00d9\u0be0\n\u00d9\3\u00d9\3\u00d9\5\u00d9\u0be4\n\u00d9\3\u00d9\3\u00d9"+
		"\5\u00d9\u0be8\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0bed\n\u00d9\3"+
		"\u00d9\3\u00d9\5\u00d9\u0bf1\n\u00d9\3\u00d9\3\u00d9\5\u00d9\u0bf5\n\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c0c\n\u00d9\5\u00d9\u0c0e\n\u00d9\3"+
		"\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c20"+
		"\n\u00d9\5\u00d9\u0c22\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\5\u00d9\u0c2a\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c2f\n"+
		"\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c34\n\u00d9\3\u00d9\3\u00d9\3"+
		"\u00d9\5\u00d9\u0c39\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3"+
		"\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c46\n\u00d9\3"+
		"\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c4b\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5"+
		"\u00d9\u0c50\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c55\n\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\5\u00d9\u0c5a\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9"+
		"\u0c5f\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c64\n\u00d9\3\u00d9\3"+
		"\u00d9\3\u00d9\5\u00d9\u0c69\n\u00d9\5\u00d9\u0c6b\n\u00d9\3\u00da\3\u00da"+
		"\3\u00db\3\u00db\3\u00db\5\u00db\u0c72\n\u00db\3\u00db\5\u00db\u0c75\n"+
		"\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc"+
		"\u0c7e\n\u00dc\f\u00dc\16\u00dc\u0c81\13\u00dc\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0c8a\n\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0c92\n\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0c9b\n\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0ca1\n\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\7\u00dd\u0cb0\n\u00dd\f\u00dd\16\u00dd\u0cb3\13\u00dd\5\u00dd"+
		"\u0cb5\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0cc3\n\u00dd\f\u00dd"+
		"\16\u00dd\u0cc6\13\u00dd\5\u00dd\u0cc8\n\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\7\u00dd\u0cd6\n\u00dd\f\u00dd\16\u00dd\u0cd9\13\u00dd\5\u00dd\u0cdb\n"+
		"\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0ce9\n\u00dd\f\u00dd\16\u00dd"+
		"\u0cec\13\u00dd\5\u00dd\u0cee\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd"+
		"\u0cfc\n\u00dd\f\u00dd\16\u00dd\u0cff\13\u00dd\5\u00dd\u0d01\n\u00dd\3"+
		"\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0d0f\n\u00dd\f\u00dd\16\u00dd\u0d12"+
		"\13\u00dd\5\u00dd\u0d14\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0d20\n\u00dd\f\u00dd"+
		"\16\u00dd\u0d23\13\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\6\u00dd\u0d2f\n\u00dd\r\u00dd\16\u00dd"+
		"\u0d30\3\u00dd\3\u00dd\5\u00dd\u0d35\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3"+
		"\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\5\u00dd\u0d45\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u0d4b\n\u00dd\3\u00de\3\u00de\3\u00de\5\u00de\u0d50\n\u00de\3"+
		"\u00de\3\u00de\3\u00df\3\u00df\3\u00df\7\u00df\u0d57\n\u00df\f\u00df\16"+
		"\u00df\u0d5a\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0d60\n"+
		"\u00e0\5\u00e0\u0d62\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\5\u00e1\u0d68"+
		"\n\u00e1\3\u00e2\3\u00e2\5\u00e2\u0d6c\n\u00e2\3\u00e3\3\u00e3\7\u00e3"+
		"\u0d70\n\u00e3\f\u00e3\16\u00e3\u0d73\13\u00e3\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\5\u00e4\u0d81\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0d88\n\u00e5\3\u00e6\7\u00e6\u0d8b\n\u00e6\f\u00e6\16\u00e6\u0d8e\13"+
		"\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8"+
		"\u0d97\n\u00e8\3\u00e8\3\u00e8\3\u00e8\7\u00e8\u0d9c\n\u00e8\f\u00e8\16"+
		"\u00e8\u0d9f\13\u00e8\5\u00e8\u0da1\n\u00e8\3\u00e9\3\u00e9\3\u00e9\3"+
		"\u00ea\3\u00ea\3\u00ea\3\u00eb\5\u00eb\u0daa\n\u00eb\3\u00eb\3\u00eb\5"+
		"\u00eb\u0dae\n\u00eb\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u0db3\n\u00eb\7\u00eb"+
		"\u0db5\n\u00eb\f\u00eb\16\u00eb\u0db8\13\u00eb\3\u00ec\3\u00ec\5\u00ec"+
		"\u0dbc\n\u00ec\3\u00ed\5\u00ed\u0dbf\n\u00ed\3\u00ed\3\u00ed\3\u00ee\5"+
		"\u00ee\u0dc4\n\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3"+
		"\u00f1\3\u00f1\3\u00f1\3\u0d8c\4\u018c\u019c\u00f2\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
		"\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\2\63\5\2"+
		"\3\4\u0162\u0162\u0173\u0173\4\2ee\u013d\u013d\3\2\u00ab\u00ac\5\2\20"+
		"\20vv\u009c\u009c\4\2##++\4\2::nn\4\2\u00bc\u00bc\u0106\u0106\4\2\21\21"+
		"VV\4\2SS\u0132\u0132\4\2oo\u00ae\u00ae\4\2SS\u00de\u00de\4\2OO\u008b\u008b"+
		"\5\2\u008f\u008f\u00b5\u00b5\u00d9\u00da\4\2\u00b0\u00b0\u00c3\u00c3\4"+
		"\2\u00c0\u00c0\u0145\u0145\4\2\u00f9\u00f9\u012f\u012f\4\2\u00b4\u00b4"+
		"\u0178\u0178\4\2!!((\4\2&&AA\4\2EE\u00ff\u00ff\4\2\20\20\u009c\u009c\3"+
		"\2\u00f0\u00f1\3\2\u00e1\u00e2\6\2@@QQ\u009b\u009b\u00d5\u00d5\3\2ij\3"+
		"\2bc\3\2\u0116\u0117\4\2\u00fa\u00fa\u011e\u011e\5\2SS\u008a\u008a\u00d4"+
		"\u00d4\6\2\16\17\u00c1\u00c1\u00e6\u00e6\u0143\u0143\3\2\u00cb\u00cc\4"+
		"\2\u0107\u0107\u012c\u012c\6\2\27\27]]\u00b1\u00b1\u0126\u0126\4\2\u00b1"+
		"\u00b1\u013f\u013f\4\2  \u0118\u0118\3\2\u0104\u0105\4\2\n\n[[\5\2{{\u00a5"+
		"\u00a5\u00f3\u00f3\5\2AA\u00fb\u00fc\u0133\u0133\5\2ll\u010a\u010a\u0132"+
		"\u0132\3\2VW\4\2\r\r\u00cf\u00cf\5\2\u00a6\u00a6\u00ea\u00ea\u00f4\u00f4"+
		"\5\2IJ\u00b8\u00b9\u0100\u0101\4\2\67\67\u0161\u0161\5\2yy\u009d\u009d"+
		"\u00c6\u00c6\4\2\u015e\u015e\u0174\u0174\4\2pp\u012d\u012d\16\2\b\33\35"+
		"`ddf\u00c6\u00c8\u00da\u00dc\u00f8\u00fa\u010d\u010f\u0127\u0129\u012e"+
		"\u0131\u013c\u013f\u014f\u0156\u015d\2\u0fa7\2\u01e2\3\2\2\2\4\u01ec\3"+
		"\2\2\2\6\u01f1\3\2\2\2\b\u0205\3\2\2\2\n\u0207\3\2\2\2\f\u0213\3\2\2\2"+
		"\16\u0251\3\2\2\2\20\u0253\3\2\2\2\22\u0255\3\2\2\2\24\u025b\3\2\2\2\26"+
		"\u0261\3\2\2\2\30\u0263\3\2\2\2\32\u0273\3\2\2\2\34\u0278\3\2\2\2\36\u028a"+
		"\3\2\2\2 \u028c\3\2\2\2\"\u02b1\3\2\2\2$\u02bb\3\2\2\2&\u02c6\3\2\2\2"+
		"(\u02da\3\2\2\2*\u02dd\3\2\2\2,\u02df\3\2\2\2.\u02e9\3\2\2\2\60\u02f2"+
		"\3\2\2\2\62\u02fd\3\2\2\2\64\u030c\3\2\2\2\66\u0331\3\2\2\28\u0333\3\2"+
		"\2\2:\u033b\3\2\2\2<\u0346\3\2\2\2>\u034f\3\2\2\2@\u0352\3\2\2\2B\u035f"+
		"\3\2\2\2D\u0369\3\2\2\2F\u0379\3\2\2\2H\u0389\3\2\2\2J\u039c\3\2\2\2L"+
		"\u03a1\3\2\2\2N\u03bf\3\2\2\2P\u03c1\3\2\2\2R\u03e3\3\2\2\2T\u041e\3\2"+
		"\2\2V\u0420\3\2\2\2X\u042d\3\2\2\2Z\u0434\3\2\2\2\\\u0437\3\2\2\2^\u043c"+
		"\3\2\2\2`\u044a\3\2\2\2b\u045e\3\2\2\2d\u0481\3\2\2\2f\u0495\3\2\2\2h"+
		"\u04a0\3\2\2\2j\u04a2\3\2\2\2l\u04a6\3\2\2\2n\u04b1\3\2\2\2p\u04b6\3\2"+
		"\2\2r\u04b9\3\2\2\2t\u04c6\3\2\2\2v\u04c9\3\2\2\2x\u04cb\3\2\2\2z\u04f2"+
		"\3\2\2\2|\u04f8\3\2\2\2~\u0515\3\2\2\2\u0080\u0517\3\2\2\2\u0082\u051c"+
		"\3\2\2\2\u0084\u0521\3\2\2\2\u0086\u0523\3\2\2\2\u0088\u0537\3\2\2\2\u008a"+
		"\u0539\3\2\2\2\u008c\u0557\3\2\2\2\u008e\u0588\3\2\2\2\u0090\u058c\3\2"+
		"\2\2\u0092\u05ce\3\2\2\2\u0094\u05ff\3\2\2\2\u0096\u0601\3\2\2\2\u0098"+
		"\u0617\3\2\2\2\u009a\u0625\3\2\2\2\u009c\u0627\3\2\2\2\u009e\u0639\3\2"+
		"\2\2\u00a0\u0642\3\2\2\2\u00a2\u0652\3\2\2\2\u00a4\u065e\3\2\2\2\u00a6"+
		"\u066a\3\2\2\2\u00a8\u0681\3\2\2\2\u00aa\u068a\3\2\2\2\u00ac\u0697\3\2"+
		"\2\2\u00ae\u06a4\3\2\2\2\u00b0\u06ad\3\2\2\2\u00b2\u06dc\3\2\2\2\u00b4"+
		"\u0708\3\2\2\2\u00b6\u070b\3\2\2\2\u00b8\u071a\3\2\2\2\u00ba\u072a\3\2"+
		"\2\2\u00bc\u072c\3\2\2\2\u00be\u072f\3\2\2\2\u00c0\u074c\3\2\2\2\u00c2"+
		"\u074e\3\2\2\2\u00c4\u075e\3\2\2\2\u00c6\u0765\3\2\2\2\u00c8\u076b\3\2"+
		"\2\2\u00ca\u0770\3\2\2\2\u00cc\u0773\3\2\2\2\u00ce\u0778\3\2\2\2\u00d0"+
		"\u0789\3\2\2\2\u00d2\u0794\3\2\2\2\u00d4\u079d\3\2\2\2\u00d6\u07a8\3\2"+
		"\2\2\u00d8\u07b1\3\2\2\2\u00da\u07b9\3\2\2\2\u00dc\u07bf\3\2\2\2\u00de"+
		"\u07c1\3\2\2\2\u00e0\u07c7\3\2\2\2\u00e2\u07cb\3\2\2\2\u00e4\u07d8\3\2"+
		"\2\2\u00e6\u07dd\3\2\2\2\u00e8\u07e1\3\2\2\2\u00ea\u07ec\3\2\2\2\u00ec"+
		"\u07f5\3\2\2\2\u00ee\u0803\3\2\2\2\u00f0\u080a\3\2\2\2\u00f2\u0816\3\2"+
		"\2\2\u00f4\u0819\3\2\2\2\u00f6\u0827\3\2\2\2\u00f8\u082d\3\2\2\2\u00fa"+
		"\u0840\3\2\2\2\u00fc\u0855\3\2\2\2\u00fe\u0859\3\2\2\2\u0100\u0863\3\2"+
		"\2\2\u0102\u0865\3\2\2\2\u0104\u0867\3\2\2\2\u0106\u086b\3\2\2\2\u0108"+
		"\u087e\3\2\2\2\u010a\u0882\3\2\2\2\u010c\u0884\3\2\2\2\u010e\u08a1\3\2"+
		"\2\2\u0110\u08a4\3\2\2\2\u0112\u08aa\3\2\2\2\u0114\u08ac\3\2\2\2\u0116"+
		"\u08ba\3\2\2\2\u0118\u08be\3\2\2\2\u011a\u08c5\3\2\2\2\u011c\u08cc\3\2"+
		"\2\2\u011e\u08d3\3\2\2\2\u0120\u08d6\3\2\2\2\u0122\u08e2\3\2\2\2\u0124"+
		"\u08e5\3\2\2\2\u0126\u08f6\3\2\2\2\u0128\u08fc\3\2\2\2\u012a\u08ff\3\2"+
		"\2\2\u012c\u091d\3\2\2\2\u012e\u0925\3\2\2\2\u0130\u0934\3\2\2\2\u0132"+
		"\u094c\3\2\2\2\u0134\u094e\3\2\2\2\u0136\u0958\3\2\2\2\u0138\u095c\3\2"+
		"\2\2\u013a\u0965\3\2\2\2\u013c\u096e\3\2\2\2\u013e\u0979\3\2\2\2\u0140"+
		"\u0987\3\2\2\2\u0142\u0995\3\2\2\2\u0144\u0997\3\2\2\2\u0146\u09b0\3\2"+
		"\2\2\u0148\u09bd\3\2\2\2\u014a\u09bf\3\2\2\2\u014c\u09cc\3\2\2\2\u014e"+
		"\u09d7\3\2\2\2\u0150\u09db\3\2\2\2\u0152\u09df\3\2\2\2\u0154\u09e8\3\2"+
		"\2\2\u0156\u09f3\3\2\2\2\u0158\u09f5\3\2\2\2\u015a\u09f9\3\2\2\2\u015c"+
		"\u0a06\3\2\2\2\u015e\u0a11\3\2\2\2\u0160\u0a13\3\2\2\2\u0162\u0a2e\3\2"+
		"\2\2\u0164\u0a30\3\2\2\2\u0166\u0a41\3\2\2\2\u0168\u0a43\3\2\2\2\u016a"+
		"\u0a46\3\2\2\2\u016c\u0a50\3\2\2\2\u016e\u0a53\3\2\2\2\u0170\u0a56\3\2"+
		"\2\2\u0172\u0a67\3\2\2\2\u0174\u0a76\3\2\2\2\u0176\u0a78\3\2\2\2\u0178"+
		"\u0a82\3\2\2\2\u017a\u0a92\3\2\2\2\u017c\u0a9a\3\2\2\2\u017e\u0a9d\3\2"+
		"\2\2\u0180\u0aae\3\2\2\2\u0182\u0ac3\3\2\2\2\u0184\u0ad9\3\2\2\2\u0186"+
		"\u0adb\3\2\2\2\u0188\u0ae7\3\2\2\2\u018a\u0aed\3\2\2\2\u018c\u0afc\3\2"+
		"\2\2\u018e\u0b0a\3\2\2\2\u0190\u0b23\3\2\2\2\u0192\u0b25\3\2\2\2\u0194"+
		"\u0b38\3\2\2\2\u0196\u0b4a\3\2\2\2\u0198\u0b4e\3\2\2\2\u019a\u0b5c\3\2"+
		"\2\2\u019c\u0b6f\3\2\2\2\u019e\u0b8c\3\2\2\2\u01a0\u0b8e\3\2\2\2\u01a2"+
		"\u0b92\3\2\2\2\u01a4\u0b94\3\2\2\2\u01a6\u0ba7\3\2\2\2\u01a8\u0bab\3\2"+
		"\2\2\u01aa\u0bad\3\2\2\2\u01ac\u0bbe\3\2\2\2\u01ae\u0bce\3\2\2\2\u01b0"+
		"\u0c6a\3\2\2\2\u01b2\u0c6c\3\2\2\2\u01b4\u0c6e\3\2\2\2\u01b6\u0c78\3\2"+
		"\2\2\u01b8\u0d4a\3\2\2\2\u01ba\u0d4c\3\2\2\2\u01bc\u0d53\3\2\2\2\u01be"+
		"\u0d5b\3\2\2\2\u01c0\u0d67\3\2\2\2\u01c2\u0d6b\3\2\2\2\u01c4\u0d6d\3\2"+
		"\2\2\u01c6\u0d80\3\2\2\2\u01c8\u0d87\3\2\2\2\u01ca\u0d8c\3\2\2\2\u01cc"+
		"\u0d8f\3\2\2\2\u01ce\u0da0\3\2\2\2\u01d0\u0da2\3\2\2\2\u01d2\u0da5\3\2"+
		"\2\2\u01d4\u0da9\3\2\2\2\u01d6\u0dbb\3\2\2\2\u01d8\u0dbe\3\2\2\2\u01da"+
		"\u0dc3\3\2\2\2\u01dc\u0dc7\3\2\2\2\u01de\u0dc9\3\2\2\2\u01e0\u0dcb\3\2"+
		"\2\2\u01e2\u01e3\5\4\3\2\u01e3\u01e4\7\2\2\3\u01e4\3\3\2\2\2\u01e5\u01e8"+
		"\5\6\4\2\u01e6\u01e8\5\16\b\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2"+
		"\u01e8\u01ea\3\2\2\2\u01e9\u01eb\7\177\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\5\3\2\2\2\u01f0\u01f2\5\60\31"+
		"\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\7\27\2\2\u01f4\u01f6\5\4\3\2\u01f5\u01f7\5\22\n\2\u01f6\u01f5\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\5\n\6\2\u01f9\7\3"+
		"\2\2\2\u01fa\u01fb\7\27\2\2\u01fb\u01fd\5\4\3\2\u01fc\u01fe\5\22\n\2\u01fd"+
		"\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5\n"+
		"\6\2\u0200\u0206\3\2\2\2\u0201\u0203\5\16\b\2\u0202\u0204\7\u0173\2\2"+
		"\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u01fa"+
		"\3\2\2\2\u0205\u0201\3\2\2\2\u0206\t\3\2\2\2\u0207\u0208\6\6\2\2\u0208"+
		"\u0209\7e\2\2\u0209\13\3\2\2\2\u020a\u0214\5\6\4\2\u020b\u020d\5\16\b"+
		"\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u0212\7\177\2\2\u0211\u0210\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u020a\3\2\2\2\u0213\u020c"+
		"\3\2\2\2\u0214\r\3\2\2\2\u0215\u0252\5\32\16\2\u0216\u0252\5$\23\2\u0217"+
		"\u0252\5\u0080A\2\u0218\u0252\5&\24\2\u0219\u0252\5(\25\2\u021a\u0252"+
		"\5*\26\2\u021b\u0252\5,\27\2\u021c\u0252\5\u00eex\2\u021d\u0252\5\u00f2"+
		"z\2\u021e\u0252\5\u00f4{\2\u021f\u0252\5\u00f8}\2\u0220\u0252\5\u00fa"+
		"~\2\u0221\u0252\5\u0104\u0083\2\u0222\u0252\5\u009cO\2\u0223\u0252\5\u00a0"+
		"Q\2\u0224\u0252\5\u0106\u0084\2\u0225\u0252\5F$\2\u0226\u0252\5\u00a4"+
		"S\2\u0227\u0252\5\u00aaV\2\u0228\u0252\5\u00b0Y\2\u0229\u0252\5D#\2\u022a"+
		"\u0252\5.\30\2\u022b\u0252\5\u0186\u00c4\2\u022c\u0252\5\u018a\u00c6\2"+
		"\u022d\u0252\5\u00ba^\2\u022e\u0252\5\u00bc_\2\u022f\u0252\5\u00be`\2"+
		"\u0230\u0252\5\u00d8m\2\u0231\u0252\5\u00ecw\2\u0232\u0252\5\u012e\u0098"+
		"\2\u0233\u0252\5\u0130\u0099\2\u0234\u0252\5\u00c0a\2\u0235\u0252\5\u00cc"+
		"g\2\u0236\u0252\5\u00ceh\2\u0237\u0252\5\u00d6l\2\u0238\u0252\5\u00da"+
		"n\2\u0239\u0252\5\u00e2r\2\u023a\u0252\5\u00e6t\2\u023b\u0252\5\u00e8"+
		"u\2\u023c\u0252\5\u017e\u00c0\2\u023d\u0252\5\u00eav\2\u023e\u0252\5\u010e"+
		"\u0088\2\u023f\u0252\5\u0110\u0089\2\u0240\u0252\5\u0112\u008a\2\u0241"+
		"\u0252\5\u0114\u008b\2\u0242\u0252\5\u0116\u008c\2\u0243\u0252\5\u0118"+
		"\u008d\2\u0244\u0252\5\u0136\u009c\2\u0245\u0252\5\u0122\u0092\2\u0246"+
		"\u0252\5\u0124\u0093\2\u0247\u0252\5\u0176\u00bc\2\u0248\u0252\5\u0128"+
		"\u0095\2\u0249\u0252\5\u0126\u0094\2\u024a\u0252\5\u012a\u0096\2\u024b"+
		"\u0252\5\u012c\u0097\2\u024c\u0252\5\u0132\u009a\2\u024d\u0252\5\u01c4"+
		"\u00e3\2\u024e\u0252\5\u01c8\u00e5\2\u024f\u0252\5\26\f\2\u0250\u0252"+
		"\5\20\t\2\u0251\u0215\3\2\2\2\u0251\u0216\3\2\2\2\u0251\u0217\3\2\2\2"+
		"\u0251\u0218\3\2\2\2\u0251\u0219\3\2\2\2\u0251\u021a\3\2\2\2\u0251\u021b"+
		"\3\2\2\2\u0251\u021c\3\2\2\2\u0251\u021d\3\2\2\2\u0251\u021e\3\2\2\2\u0251"+
		"\u021f\3\2\2\2\u0251\u0220\3\2\2\2\u0251\u0221\3\2\2\2\u0251\u0222\3\2"+
		"\2\2\u0251\u0223\3\2\2\2\u0251\u0224\3\2\2\2\u0251\u0225\3\2\2\2\u0251"+
		"\u0226\3\2\2\2\u0251\u0227\3\2\2\2\u0251\u0228\3\2\2\2\u0251\u0229\3\2"+
		"\2\2\u0251\u022a\3\2\2\2\u0251\u022b\3\2\2\2\u0251\u022c\3\2\2\2\u0251"+
		"\u022d\3\2\2\2\u0251\u022e\3\2\2\2\u0251\u022f\3\2\2\2\u0251\u0230\3\2"+
		"\2\2\u0251\u0231\3\2\2\2\u0251\u0232\3\2\2\2\u0251\u0233\3\2\2\2\u0251"+
		"\u0234\3\2\2\2\u0251\u0235\3\2\2\2\u0251\u0236\3\2\2\2\u0251\u0237\3\2"+
		"\2\2\u0251\u0238\3\2\2\2\u0251\u0239\3\2\2\2\u0251\u023a\3\2\2\2\u0251"+
		"\u023b\3\2\2\2\u0251\u023c\3\2\2\2\u0251\u023d\3\2\2\2\u0251\u023e\3\2"+
		"\2\2\u0251\u023f\3\2\2\2\u0251\u0240\3\2\2\2\u0251\u0241\3\2\2\2\u0251"+
		"\u0242\3\2\2\2\u0251\u0243\3\2\2\2\u0251\u0244\3\2\2\2\u0251\u0245\3\2"+
		"\2\2\u0251\u0246\3\2\2\2\u0251\u0247\3\2\2\2\u0251\u0248\3\2\2\2\u0251"+
		"\u0249\3\2\2\2\u0251\u024a\3\2\2\2\u0251\u024b\3\2\2\2\u0251\u024c\3\2"+
		"\2\2\u0251\u024d\3\2\2\2\u0251\u024e\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252\17\3\2\2\2\u0253\u0254\t\2\2\2\u0254\21\3\2\2\2\u0255"+
		"\u0257\7k\2\2\u0256\u0258\5\24\13\2\u0257\u0256\3\2\2\2\u0258\u0259\3"+
		"\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\23\3\2\2\2\u025b"+
		"\u025c\7\u013d\2\2\u025c\u025d\7\u0175\2\2\u025d\u025e\7\u0126\2\2\u025e"+
		"\u025f\5\4\3\2\u025f\u0260\n\3\2\2\u0260\25\3\2\2\2\u0261\u0262\7\u00c7"+
		"\2\2\u0262\27\3\2\2\2\u0263\u0264\6\r\3\2\u0264\u0265\5\u019c\u00cf\2"+
		"\u0265\31\3\2\2\2\u0266\u0267\7\u0106\2\2\u0267\u0274\5\u011a\u008e\2"+
		"\u0268\u026a\7\u0106\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u0270\5\34\17\2\u026c\u026d\7\u0160\2\2\u026d\u026f"+
		"\5\34\17\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2"+
		"\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0266"+
		"\3\2\2\2\u0273\u0269\3\2\2\2\u0274\33\3\2\2\2\u0275\u0279\5\36\20\2\u0276"+
		"\u0279\5 \21\2\u0277\u0279\5\"\22\2\u0278\u0275\3\2\2\2\u0278\u0276\3"+
		"\2\2\2\u0278\u0277\3\2\2\2\u0279\35\3\2\2\2\u027a\u027c\5\u01d4\u00eb"+
		"\2\u027b\u027d\7\u015f\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u027f\7\u0164\2\2\u027f\u0280\5\u019c\u00cf\2\u0280"+
		"\u028b\3\2\2\2\u0281\u0282\7\u016e\2\2\u0282\u0283\5\u01d4\u00eb\2\u0283"+
		"\u0285\7\u0171\2\2\u0284\u0286\7\u015f\2\2\u0285\u0284\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7\u0164\2\2\u0288\u0289\5\u019c"+
		"\u00cf\2\u0289\u028b\3\2\2\2\u028a\u027a\3\2\2\2\u028a\u0281\3\2\2\2\u028b"+
		"\37\3\2\2\2\u028c\u028d\7\u016e\2\2\u028d\u0292\5\u01d4\u00eb\2\u028e"+
		"\u028f\7\u0160\2\2\u028f\u0291\5\u01d4\u00eb\2\u0290\u028e\3\2\2\2\u0291"+
		"\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0295\u0297\7\u0171\2\2\u0296\u0298\7\u015f\2"+
		"\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a"+
		"\7\u0164\2\2\u029a\u029b\7\u016e\2\2\u029b\u02a0\5\u019c\u00cf\2\u029c"+
		"\u029d\7\u0160\2\2\u029d\u029f\5\u019c\u00cf\2\u029e\u029c\3\2\2\2\u029f"+
		"\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2"+
		"\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\7\u0171\2\2\u02a4!\3\2\2\2\u02a5"+
		"\u02b2\5\u01d4\u00eb\2\u02a6\u02a7\7\u016e\2\2\u02a7\u02ac\5\u01d4\u00eb"+
		"\2\u02a8\u02a9\7\u0160\2\2\u02a9\u02ab\5\u01d4\u00eb\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b0\7\u0171\2\2\u02b0\u02b2"+
		"\3\2\2\2\u02b1\u02a5\3\2\2\2\u02b1\u02a6\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3"+
		"\u02b5\7\u015f\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02b7\7\u0164\2\2\u02b7\u02b8\7\u016e\2\2\u02b8\u02b9\5"+
		"\u0136\u009c\2\u02b9\u02ba\7\u0171\2\2\u02ba#\3\2\2\2\u02bb\u02bc\7\13"+
		"\2\2\u02bc\u02bd\5\u01d4\u00eb\2\u02bd\u02be\7D\2\2\u02be\u02c2\7v\2\2"+
		"\u02bf\u02c0\7\u00ee\2\2\u02c0\u02c3\7\u0106\2\2\u02c1\u02c3\7\u00e2\2"+
		"\2\u02c2\u02bf\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5"+
		"\5\u01d4\u00eb\2\u02c5%\3\2\2\2\u02c6\u02c9\7\22\2\2\u02c7\u02c8\7\u00ee"+
		"\2\2\u02c8\u02ca\7\u0106\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02cc\t\4\2\2\u02cc\u02cd\7\u016e\2\2\u02cd\u02d2"+
		"\5\u01d4\u00eb\2\u02ce\u02cf\7\u0160\2\2\u02cf\u02d1\5\u01d4\u00eb\2\u02d0"+
		"\u02ce\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\7\u0171\2\2\u02d6"+
		"\u02d7\7\u0140\2\2\u02d7\u02d8\7\u00e2\2\2\u02d8\u02d9\5\u01d4\u00eb\2"+
		"\u02d9\'\3\2\2\2\u02da\u02db\7\27\2\2\u02db\u02dc\7\u012c\2\2\u02dc)\3"+
		"\2\2\2\u02dd\u02de\7\37\2\2\u02de+\3\2\2\2\u02df\u02e0\7\"\2\2\u02e0\u02e7"+
		"\5\u01d4\u00eb\2\u02e1\u02e3\7\u016e\2\2\u02e2\u02e4\5\u01bc\u00df\2\u02e3"+
		"\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e8\7\u0171"+
		"\2\2\u02e6\u02e8\5\u01bc\u00df\2\u02e7\u02e1\3\2\2\2\u02e7\u02e6\3\2\2"+
		"\2\u02e7\u02e8\3\2\2\2\u02e8-\3\2\2\2\u02e9\u02ea\7M\2\2\u02ea\u02ef\5"+
		"\64\33\2\u02eb\u02ec\7\u0160\2\2\u02ec\u02ee\5\64\33\2\u02ed\u02eb\3\2"+
		"\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"/\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7M\2\2\u02f3\u02f4\5\64\33\2"+
		"\u02f4\u02fa\7\u0173\2\2\u02f5\u02f6\5\64\33\2\u02f6\u02f7\7\u0173\2\2"+
		"\u02f7\u02f9\3\2\2\2\u02f8\u02f5\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8"+
		"\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\61\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd"+
		"\u02fe\5\64\33\2\u02fe\u0304\7\u0173\2\2\u02ff\u0300\5\64\33\2\u0300\u0301"+
		"\7\u0173\2\2\u0301\u0303\3\2\2\2\u0302\u02ff\3\2\2\2\u0303\u0306\3\2\2"+
		"\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\63\3\2\2\2\u0306\u0304"+
		"\3\2\2\2\u0307\u030d\5:\36\2\u0308\u030d\58\35\2\u0309\u030d\5@!\2\u030a"+
		"\u030d\5\66\34\2\u030b\u030d\5B\"\2\u030c\u0307\3\2\2\2\u030c\u0308\3"+
		"\2\2\2\u030c\u0309\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030b\3\2\2\2\u030d"+
		"\65\3\2\2\2\u030e\u0313\5\u01d4\u00eb\2\u030f\u0310\7\u0160\2\2\u0310"+
		"\u0312\5\u01d4\u00eb\2\u0311\u030f\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0316"+
		"\u0318\7\20\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3"+
		"\2\2\2\u0319\u031b\5\u0094K\2\u031a\u031c\5\u0096L\2\u031b\u031a\3\2\2"+
		"\2\u031b\u031c\3\2\2\2\u031c\u0320\3\2\2\2\u031d\u031f\5\u0098M\2\u031e"+
		"\u031d\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2"+
		"\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0325\5\u009aN\2\u0324"+
		"\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0332\3\2\2\2\u0326\u0327\5\u01d4"+
		"\u00eb\2\u0327\u0329\7\64\2\2\u0328\u032a\7\20\2\2\u0329\u0328\3\2\2\2"+
		"\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\5\u0094K\2\u032c"+
		"\u032e\5\u0096L\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0330\5\u009aN\2\u0330\u0332\3\2\2\2\u0331\u030e\3\2\2"+
		"\2\u0331\u0326\3\2\2\2\u0332\67\3\2\2\2\u0333\u0334\5\u01d4\u00eb\2\u0334"+
		"\u0335\78\2\2\u03359\3\2\2\2\u0336\u0337\7D\2\2\u0337\u033c\5\u01d4\u00eb"+
		"\2\u0338\u0339\5\u01d4\u00eb\2\u0339\u033a\7D\2\2\u033a\u033c\3\2\2\2"+
		"\u033b\u0336\3\2\2\2\u033b\u0338\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u0340"+
		"\5<\37\2\u033e\u0340\5> \2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0344\t\5\2\2\u0342\u0345\5\u0136"+
		"\u009c\2\u0343\u0345\5\u019c\u00cf\2\u0344\u0342\3\2\2\2\u0344\u0343\3"+
		"\2\2\2\u0345;\3\2\2\2\u0346\u0347\7\u0140\2\2\u0347\u0349\7\u00f0\2\2"+
		"\u0348\u034a\7\u00cd\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034d\3\2\2\2\u034b\u034c\7\u012a\2\2\u034c\u034e\t\6\2\2\u034d\u034b"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e=\3\2\2\2\u034f\u0350\7\u0141\2\2\u0350"+
		"\u0351\7\u00f0\2\2\u0351?\3\2\2\2\u0352\u0353\t\7\2\2\u0353\u0354\7\u0082"+
		"\2\2\u0354\u035a\7v\2\2\u0355\u035b\7\u0112\2\2\u0356\u035b\7\u0115\2"+
		"\2\u0357\u0358\7\u00c5\2\2\u0358\u035b\7y\2\2\u0359\u035b\5\u01d4\u00eb"+
		"\2\u035a\u0355\3\2\2\2\u035a\u0356\3\2\2\2\u035a\u0357\3\2\2\2\u035a\u0359"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\5\b\5\2\u035dA\3\2\2\2\u035e"+
		"\u0360\7~\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361\u0362\7\u0123\2\2\u0362\u0363\7\u0121\2\2\u0363\u0365\5\u01d4"+
		"\u00eb\2\u0364\u0366\5X-\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0368\5J&\2\u0368C\3\2\2\2\u0369\u036b\7>\2\2\u036a"+
		"\u036c\5H%\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2"+
		"\2\u036d\u0371\7\u0121\2\2\u036e\u036f\7\u0089\2\2\u036f\u0370\7\u00c5"+
		"\2\2\u0370\u0372\7m\2\2\u0371\u036e\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0375\5\u0166\u00b4\2\u0374\u0376\5X-\2\u0375\u0374"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\5J&\2\u0378"+
		"E\3\2\2\2\u0379\u0380\7>\2\2\u037a\u037b\7\u00a9\2\2\u037b\u0381\7\u0123"+
		"\2\2\u037c\u037e\t\b\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0381\7\u013c\2\2\u0380\u037a\3\2\2\2\u0380\u037d"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\7\u0121\2\2\u0383\u0385\5\u01d4"+
		"\u00eb\2\u0384\u0386\5X-\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0388\5J&\2\u0388G\3\2\2\2\u0389\u038a\7\u00d8\2"+
		"\2\u038aI\3\2\2\2\u038b\u038d\7\20\2\2\u038c\u038b\3\2\2\2\u038c\u038d"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\7\u016e\2\2\u038f\u0390\5\u0136"+
		"\u009c\2\u0390\u0391\7\u0171\2\2\u0391\u039d\3\2\2\2\u0392\u0394\7\20"+
		"\2\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u039d\5\u0136\u009c\2\u0396\u0397\7\u016e\2\2\u0397\u0398\5L\'\2\u0398"+
		"\u0399\7\u0171\2\2\u0399\u039d\3\2\2\2\u039a\u039b\7\u00a6\2\2\u039b\u039d"+
		"\5\u0166\u00b4\2\u039c\u038c\3\2\2\2\u039c\u0393\3\2\2\2\u039c\u0396\3"+
		"\2\2\2\u039c\u039a\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u03a0\5^\60\2\u039f"+
		"\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0K\3\2\2\2\u03a1\u03a6\5N(\2\u03a2"+
		"\u03a3\7\u0160\2\2\u03a3\u03a5\5N(\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3"+
		"\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7M\3\2\2\2\u03a8\u03a6"+
		"\3\2\2\2\u03a9\u03aa\5P)\2\u03aa\u03ac\5\u0094K\2\u03ab\u03ad\5\u0096"+
		"L\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b1\3\2\2\2\u03ae"+
		"\u03b0\5\u0098M\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b7\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"\u03b6\5R*\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2"+
		"\2\u03b7\u03b8\3\2\2\2\u03b8\u03c0\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bb"+
		"\79\2\2\u03bb\u03bd\5\u01d4\u00eb\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3"+
		"\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\5T+\2\u03bf\u03a9\3\2\2\2\u03bf"+
		"\u03bc\3\2\2\2\u03c0O\3\2\2\2\u03c1\u03c2\5\u01d4\u00eb\2\u03c2Q\3\2\2"+
		"\2\u03c3\u03e4\5\u009aN\2\u03c4\u03c6\7\u00c5\2\2\u03c5\u03c4\3\2\2\2"+
		"\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03e4\7\u00c7\2\2\u03c8"+
		"\u03c9\7\u00df\2\2\u03c9\u03e4\7\u00a1\2\2\u03ca\u03e4\7\u0131\2\2\u03cb"+
		"\u03cc\7\u00e9\2\2\u03cc\u03cd\5\u0166\u00b4\2\u03cd\u03ce\7\u016e\2\2"+
		"\u03ce\u03cf\5\u01d4\u00eb\2\u03cf\u03d3\7\u0171\2\2\u03d0\u03d2\5V,\2"+
		"\u03d1\u03d0\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4"+
		"\3\2\2\2\u03d4\u03e4\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d7\7\u0088\2"+
		"\2\u03d7\u03d8\7\u016e\2\2\u03d8\u03dd\7\u0178\2\2\u03d9\u03da\7\u0160"+
		"\2\2\u03da\u03dc\7\u0178\2\2\u03db\u03d9\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df\u03dd\3\2"+
		"\2\2\u03e0\u03e4\7\u0171\2\2\u03e1\u03e4\7\24\2\2\u03e2\u03e4\7d\2\2\u03e3"+
		"\u03c3\3\2\2\2\u03e3\u03c5\3\2\2\2\u03e3\u03c8\3\2\2\2\u03e3\u03ca\3\2"+
		"\2\2\u03e3\u03cb\3\2\2\2\u03e3\u03d6\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3"+
		"\u03e2\3\2\2\2\u03e4S\3\2\2\2\u03e5\u03e6\7\u00df\2\2\u03e6\u03e8\7\u00a1"+
		"\2\2\u03e7\u03e9\7-\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03eb\7\u016e\2\2\u03eb\u03ed\5\u01d4\u00eb\2\u03ec"+
		"\u03ee\t\t\2\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f6\3\2"+
		"\2\2\u03ef\u03f0\7\u0160\2\2\u03f0\u03f2\5\u01d4\u00eb\2\u03f1\u03f3\t"+
		"\t\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4"+
		"\u03ef\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2"+
		"\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fb\7\u0171\2\2\u03fa"+
		"\u03fc\7d\2\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2"+
		"\2\2\u03fd\u03ff\5\u010a\u0086\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2"+
		"\2\u03ff\u041f\3\2\2\2\u0400\u0401\7w\2\2\u0401\u0402\7\u00a1\2\2\u0402"+
		"\u0403\7\u016e\2\2\u0403\u0408\5\u01d4\u00eb\2\u0404\u0405\7\u0160\2\2"+
		"\u0405\u0407\5\u01d4\u00eb\2\u0406\u0404\3\2\2\2\u0407\u040a\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u0408\3\2"+
		"\2\2\u040b\u040c\7\u0171\2\2\u040c\u040d\7\u00e9\2\2\u040d\u040e\5\u0166"+
		"\u00b4\2\u040e\u040f\7\u016e\2\2\u040f\u0414\5\u01d4\u00eb\2\u0410\u0411"+
		"\7\u0160\2\2\u0411\u0413\5\u01d4\u00eb\2\u0412\u0410\3\2\2\2\u0413\u0416"+
		"\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416"+
		"\u0414\3\2\2\2\u0417\u041b\7\u0171\2\2\u0418\u041a\5V,\2\u0419\u0418\3"+
		"\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u03e5\3\2\2\2\u041e\u0400\3\2"+
		"\2\2\u041fU\3\2\2\2\u0420\u0421\7\u00cc\2\2\u0421\u042a\t\n\2\2\u0422"+
		"\u0423\7\u00c0\2\2\u0423\u042b\7\b\2\2\u0424\u042b\7\u00ed\2\2\u0425\u0426"+
		"\7\u0106\2\2\u0426\u042b\7\u00c7\2\2\u0427\u0428\7\u0106\2\2\u0428\u042b"+
		"\7N\2\2\u0429\u042b\7$\2\2\u042a\u0422\3\2\2\2\u042a\u0424\3\2\2\2\u042a"+
		"\u0425\3\2\2\2\u042a\u0427\3\2\2\2\u042a\u0429\3\2\2\2\u042bW\3\2\2\2"+
		"\u042c\u042e\5Z.\2\u042d\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u042d"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430Y\3\2\2\2\u0431\u0432\7\u0160\2\2\u0432"+
		"\u0435\5\\/\2\u0433\u0435\5h\65\2\u0434\u0431\3\2\2\2\u0434\u0433\3\2"+
		"\2\2\u0435[\3\2\2\2\u0436\u0438\7\u00c0\2\2\u0437\u0436\3\2\2\2\u0437"+
		"\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\t\13\2\2\u043a]\3\2\2\2"+
		"\u043b\u043d\5`\61\2\u043c\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043c"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f_\3\2\2\2\u0440\u0441\7\u00cc\2\2\u0441"+
		"\u0442\7\65\2\2\u0442\u0443\t\f\2\2\u0443\u044b\7\u00f8\2\2\u0444\u044b"+
		"\5b\62\2\u0445\u044b\5d\63\2\u0446\u044b\5f\64\2\u0447\u044b\5h\65\2\u0448"+
		"\u044b\5|?\2\u0449\u044b\5~@\2\u044a\u0440\3\2\2\2\u044a\u0444\3\2\2\2"+
		"\u044a\u0445\3\2\2\2\u044a\u0446\3\2\2\2\u044a\u0447\3\2\2\2\u044a\u0448"+
		"\3\2\2\2\u044a\u0449\3\2\2\2\u044ba\3\2\2\2\u044c\u044d\7\u0103\2\2\u044d"+
		"\u044e\7?\2\2\u044e\u045f\t\r\2\2\u044f\u0450\t\16\2\2\u0450\u045f\7\u0178"+
		"\2\2\u0451\u045f\7\u00c2\2\2\u0452\u045f\t\17\2\2\u0453\u0454\7\u0119"+
		"\2\2\u0454\u0457\7\u016e\2\2\u0455\u0458\5\u01d4\u00eb\2\u0456\u0458\7"+
		"\u0178\2\2\u0457\u0455\3\2\2\2\u0457\u0456\3\2\2\2\u0458\u0459\3\2\2\2"+
		"\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045f"+
		"\7\u0171\2\2\u045c\u045d\7\u0122\2\2\u045d\u045f\5\u01d4\u00eb\2\u045e"+
		"\u044c\3\2\2\2\u045e\u044f\3\2\2\2\u045e\u0451\3\2\2\2\u045e\u0452\3\2"+
		"\2\2\u045e\u0453\3\2\2\2\u045e\u045c\3\2\2\2\u045fc\3\2\2\2\u0460\u0462"+
		"\7\u008e\2\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2"+
		"\2\u0463\u0464\7\u008c\2\2\u0464\u0482\5\u01d4\u00eb\2\u0465\u0466\7\u0140"+
		"\2\2\u0466\u0482\7\u00eb\2\2\u0467\u0468\7\\\2\2\u0468\u0469\7 \2\2\u0469"+
		"\u046a\7\u0083\2\2\u046a\u046b\7\u016e\2\2\u046b\u0470\5\u01d4\u00eb\2"+
		"\u046c\u046d\7\u0160\2\2\u046d\u046f\5\u01d4\u00eb\2\u046e\u046c\3\2\2"+
		"\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0473"+
		"\3\2\2\2\u0472\u0470\3\2\2\2\u0473\u0474\7\u0171\2\2\u0474\u0482\3\2\2"+
		"\2\u0475\u0477\7\u00c5\2\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478\u0482\7\u00af\2\2\u0479\u047a\7\66\2\2\u047a\u0482"+
		"\t\20\2\2\u047b\u047c\7R\2\2\u047c\u0482\7\u00cd\2\2\u047d\u047e\7\u0140"+
		"\2\2\u047e\u047f\7\u00ed\2\2\u047f\u0480\7\u00cc\2\2\u0480\u0482\7_\2"+
		"\2\u0481\u0461\3\2\2\2\u0481\u0465\3\2\2\2\u0481\u0467\3\2\2\2\u0481\u0476"+
		"\3\2\2\2\u0481\u0479\3\2\2\2\u0481\u047b\3\2\2\2\u0481\u047d\3\2\2\2\u0482"+
		"e\3\2\2\2\u0483\u0485\7\u0131\2\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2"+
		"\2\2\u0485\u0486\3\2\2\2\u0486\u0487\7\u00df\2\2\u0487\u0488\7\u008e\2"+
		"\2\u0488\u0489\7\u016e\2\2\u0489\u048e\5\u01d4\u00eb\2\u048a\u048b\7\u0160"+
		"\2\2\u048b\u048d\5\u01d4\u00eb\2\u048c\u048a\3\2\2\2\u048d\u0490\3\2\2"+
		"\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2\2\2\u0490\u048e"+
		"\3\2\2\2\u0491\u0492\7\u0171\2\2\u0492\u0496\3\2\2\2\u0493\u0494\7\u0140"+
		"\2\2\u0494\u0496\7F\2\2\u0495\u0484\3\2\2\2\u0495\u0493\3\2\2\2\u0496"+
		"g\3\2\2\2\u0497\u0499\5j\66\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2"+
		"\u0499\u049a\3\2\2\2\u049a\u049b\5x=\2\u049b\u049c\5r:\2\u049c\u04a1\3"+
		"\2\2\2\u049d\u049e\7\u011a\2\2\u049e\u049f\7\20\2\2\u049f\u04a1\5\u01d4"+
		"\u00eb\2\u04a0\u0498\3\2\2\2\u04a0\u049d\3\2\2\2\u04a1i\3\2\2\2\u04a2"+
		"\u04a3\7\u00dd\2\2\u04a3\u04a4\7 \2\2\u04a4\u04a5\5l\67\2\u04a5k\3\2\2"+
		"\2\u04a6\u04a7\7\u016e\2\2\u04a7\u04ac\5n8\2\u04a8\u04a9\7\u0160\2\2\u04a9"+
		"\u04ab\5n8\2\u04aa\u04a8\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2"+
		"\2\u04ac\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b0"+
		"\7\u0171\2\2\u04b0m\3\2\2\2\u04b1\u04b2\5P)\2\u04b2\u04b4\5\u0094K\2\u04b3"+
		"\u04b5\5p9\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5o\3\2\2\2\u04b6"+
		"\u04b7\7\63\2\2\u04b7\u04b8\5\u019c\u00cf\2\u04b8q\3\2\2\2\u04b9\u04ba"+
		"\7\u011a\2\2\u04ba\u04be\7\20\2\2\u04bb\u04bd\5t;\2\u04bc\u04bb\3\2\2"+
		"\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c2"+
		"\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04c3\5v<\2\u04c2\u04c1\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\5\u019c\u00cf\2\u04c5s"+
		"\3\2\2\2\u04c6\u04c7\5\u01d4\u00eb\2\u04c7\u04c8\5\u019c\u00cf\2\u04c8"+
		"u\3\2\2\2\u04c9\u04ca\7\u00aa\2\2\u04caw\3\2\2\2\u04cb\u04cc\7\u00f7\2"+
		"\2\u04cc\u04ce\7x\2\2\u04cd\u04cf\7T\2\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf"+
		"\3\2\2\2\u04cf\u04d3\3\2\2\2\u04d0\u04d2\5z>\2\u04d1\u04d0\3\2\2\2\u04d2"+
		"\u04d5\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4y\3\2\2\2"+
		"\u04d5\u04d3\3\2\2\2\u04d6\u04d7\7r\2\2\u04d7\u04d8\7\u0124\2\2\u04d8"+
		"\u04d9\7 \2\2\u04d9\u04dd\5\u019c\u00cf\2\u04da\u04db\7g\2\2\u04db\u04dc"+
		"\7 \2\2\u04dc\u04de\5\u019c\u00cf\2\u04dd\u04da\3\2\2\2\u04dd\u04de\3"+
		"\2\2\2\u04de\u04f3\3\2\2\2\u04df\u04e0\7\60\2\2\u04e0\u04e1\7\u009e\2"+
		"\2\u04e1\u04e2\7\u0124\2\2\u04e2\u04e3\7 \2\2\u04e3\u04f3\5\u019c\u00cf"+
		"\2\u04e4\u04e5\7\u00b2\2\2\u04e5\u04e6\7\u00a2\2\2\u04e6\u04e7\7\u0124"+
		"\2\2\u04e7\u04e8\7 \2\2\u04e8\u04f3\5\u019c\u00cf\2\u04e9\u04ea\7\u00a8"+
		"\2\2\u04ea\u04eb\7\u0124\2\2\u04eb\u04ec\7 \2\2\u04ec\u04f3\5\u019c\u00cf"+
		"\2\u04ed\u04ee\7\u00c7\2\2\u04ee\u04ef\7P\2\2\u04ef\u04f0\7\20\2\2\u04f0"+
		"\u04f3\5\u019c\u00cf\2\u04f1\u04f3\5\u019c\u00cf\2\u04f2\u04d6\3\2\2\2"+
		"\u04f2\u04df\3\2\2\2\u04f2\u04e4\3\2\2\2\u04f2\u04e9\3\2\2\2\u04f2\u04ed"+
		"\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3{\3\2\2\2\u04f4\u04f5\7\u00cc\2\2\u04f5"+
		"\u04f9\5\u01d4\u00eb\2\u04f6\u04f7\7\u0125\2\2\u04f7\u04f9\5\u01d4\u00eb"+
		"\2\u04f8\u04f4\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9}\3\2\2\2\u04fa\u04fc"+
		"\7\24\2\2\u04fb\u04fd\7\u0164\2\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2"+
		"\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0516\5\u019c\u00cf\2\u04ff\u0501\7\63"+
		"\2\2\u0500\u0502\7\u0164\2\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502"+
		"\u0503\3\2\2\2\u0503\u0516\5\u019c\u00cf\2\u0504\u0506\7N\2\2\u0505\u0504"+
		"\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u050a\3\2\2\2\u0507\u0508\7)\2\2\u0508"+
		"\u050b\7\u0106\2\2\u0509\u050b\7*\2\2\u050a\u0507\3\2\2\2\u050a\u0509"+
		"\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u050e\7\u0164\2\2\u050d\u050c\3\2\2"+
		"\2\u050d\u050e\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0516\5\u019c\u00cf\2"+
		"\u0510\u0512\7f\2\2\u0511\u0513\7\u0164\2\2\u0512\u0511\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\5\u019c\u00cf\2\u0515\u04fa"+
		"\3\2\2\2\u0515\u04ff\3\2\2\2\u0515\u0505\3\2\2\2\u0515\u0510\3\2\2\2\u0516"+
		"\177\3\2\2\2\u0517\u0518\7\f\2\2\u0518\u0519\7\u0121\2\2\u0519\u051a\5"+
		"\u0166\u00b4\2\u051a\u051b\5\u0082B\2\u051b\u0081\3\2\2\2\u051c\u051d"+
		"\7\t\2\2\u051d\u051e\5\u0084C\2\u051e\u0083\3\2\2\2\u051f\u0522\5\u0090"+
		"I\2\u0520\u0522\5\u0086D\2\u0521\u051f\3\2\2\2\u0521\u0520\3\2\2\2\u0522"+
		"\u0085\3\2\2\2\u0523\u0524\7\62\2\2\u0524\u0525\5\u0088E\2\u0525\u0087"+
		"\3\2\2\2\u0526\u0528\7\20\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2"+
		"\u0528\u0529\3\2\2\2\u0529\u052a\7\u016e\2\2\u052a\u052b\5\u0136\u009c"+
		"\2\u052b\u052c\7\u0171\2\2\u052c\u0538\3\2\2\2\u052d\u052f\7\20\2\2\u052e"+
		"\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0538\5\u0136"+
		"\u009c\2\u0531\u0532\7\u016e\2\2\u0532\u0533\5\u008aF\2\u0533\u0534\7"+
		"\u0171\2\2\u0534\u0538\3\2\2\2\u0535\u0536\7\u00a6\2\2\u0536\u0538\5\u0166"+
		"\u00b4\2\u0537\u0527\3\2\2\2\u0537\u052e\3\2\2\2\u0537\u0531\3\2\2\2\u0537"+
		"\u0535\3\2\2\2\u0538\u0089\3\2\2\2\u0539\u053e\5\u008cG\2\u053a\u053b"+
		"\7\u0160\2\2\u053b\u053d\5\u008cG\2\u053c\u053a\3\2\2\2\u053d\u0540\3"+
		"\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u008b\3\2\2\2\u0540"+
		"\u053e\3\2\2\2\u0541\u0542\5P)\2\u0542\u0544\5\u008eH\2\u0543\u0545\5"+
		"\u0096L\2\u0544\u0543\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0549\3\2\2\2"+
		"\u0546\u0548\5\u0098M\2\u0547\u0546\3\2\2\2\u0548\u054b\3\2\2\2\u0549"+
		"\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054f\3\2\2\2\u054b\u0549\3\2"+
		"\2\2\u054c\u054e\5R*\2\u054d\u054c\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d"+
		"\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0558\3\2\2\2\u0551\u054f\3\2\2\2\u0552"+
		"\u0553\79\2\2\u0553\u0555\5\u01d4\u00eb\2\u0554\u0552\3\2\2\2\u0554\u0555"+
		"\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0558\5T+\2\u0557\u0541\3\2\2\2\u0557"+
		"\u0554\3\2\2\2\u0558\u008d\3\2\2\2\u0559\u0589\7(\2\2\u055a\u0589\7)\2"+
		"\2\u055b\u0589\7\31\2\2\u055c\u0589\7\32\2\2\u055d\u0589\7\33\2\2\u055e"+
		"\u0589\7\34\2\2\u055f\u0589\7\35\2\2\u0560\u0589\7G\2\2\u0561\u0589\7"+
		"H\2\2\u0562\u0589\7K\2\2\u0563\u0589\7L\2\2\u0564\u0566\7^\2\2\u0565\u0567"+
		"\7\u00dc\2\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0589\3\2\2"+
		"\2\u0568\u0589\7u\2\2\u0569\u0589\7\u0093\2\2\u056a\u0589\7\u0094\2\2"+
		"\u056b\u0589\7\u0095\2\2\u056c\u0589\7\u0096\2\2\u056d\u0589\7\u0097\2"+
		"\2\u056e\u0589\7\u00bb\2\2\u056f\u0589\7\u00bd\2\2\u0570\u0589\7\u00bf"+
		"\2\2\u0571\u0589\7\u00c9\2\2\u0572\u0589\7\u00c8\2\2\u0573\u0589\7\u00db"+
		"\2\2\u0574\u0589\7\u00e8\2\2\u0575\u0576\7\u00ef\2\2\u0576\u0589\7\u013b"+
		"\2\2\u0577\u0589\7\u010d\2\2\u0578\u0589\7\u010c\2\2\u0579\u0589\7\u010e"+
		"\2\2\u057a\u0589\7\u0110\2\2\u057b\u0589\7\u010f\2\2\u057c\u0589\7\u011b"+
		"\2\2\u057d\u0589\7\u0120\2\2\u057e\u0589\7\u0127\2\2\u057f\u0589\7\u0128"+
		"\2\2\u0580\u0589\7\u0139\2\2\u0581\u0589\7\u013a\2\2\u0582\u0589\7\u0144"+
		"\2\2\u0583\u0586\5\u01d4\u00eb\2\u0584\u0585\7\5\2\2\u0585\u0587\t\21"+
		"\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3\2\2\2\u0588"+
		"\u0559\3\2\2\2\u0588\u055a\3\2\2\2\u0588\u055b\3\2\2\2\u0588\u055c\3\2"+
		"\2\2\u0588\u055d\3\2\2\2\u0588\u055e\3\2\2\2\u0588\u055f\3\2\2\2\u0588"+
		"\u0560\3\2\2\2\u0588\u0561\3\2\2\2\u0588\u0562\3\2\2\2\u0588\u0563\3\2"+
		"\2\2\u0588\u0564\3\2\2\2\u0588\u0568\3\2\2\2\u0588\u0569\3\2\2\2\u0588"+
		"\u056a\3\2\2\2\u0588\u056b\3\2\2\2\u0588\u056c\3\2\2\2\u0588\u056d\3\2"+
		"\2\2\u0588\u056e\3\2\2\2\u0588\u056f\3\2\2\2\u0588\u0570\3\2\2\2\u0588"+
		"\u0571\3\2\2\2\u0588\u0572\3\2\2\2\u0588\u0573\3\2\2\2\u0588\u0574\3\2"+
		"\2\2\u0588\u0575\3\2\2\2\u0588\u0577\3\2\2\2\u0588\u0578\3\2\2\2\u0588"+
		"\u0579\3\2\2\2\u0588\u057a\3\2\2\2\u0588\u057b\3\2\2\2\u0588\u057c\3\2"+
		"\2\2\u0588\u057d\3\2\2\2\u0588\u057e\3\2\2\2\u0588\u057f\3\2\2\2\u0588"+
		"\u0580\3\2\2\2\u0588\u0581\3\2\2\2\u0588\u0582\3\2\2\2\u0588\u0583\3\2"+
		"\2\2\u0589\u008f\3\2\2\2\u058a\u058b\79\2\2\u058b\u058d\5\u01d4\u00eb"+
		"\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f"+
		"\5\u0092J\2\u058f\u0091\3\2\2\2\u0590\u0591\7\u00df\2\2\u0591\u0593\7"+
		"\u00a1\2\2\u0592\u0594\7-\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2"+
		"\u0594\u0595\3\2\2\2\u0595\u0596\7\u016e\2\2\u0596\u0598\5\u01d4\u00eb"+
		"\2\u0597\u0599\t\t\2\2\u0598\u0597\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u05a1"+
		"\3\2\2\2\u059a\u059b\7\u0160\2\2\u059b\u059d\5\u01d4\u00eb\2\u059c\u059e"+
		"\t\t\2\2\u059d\u059c\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f"+
		"\u059a\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2"+
		"\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05a6\7\u0171\2\2\u05a5"+
		"\u05a7\7d\2\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9\3\2"+
		"\2\2\u05a8\u05aa\5\u010a\u0086\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2"+
		"\2\u05aa\u05cf\3\2\2\2\u05ab\u05ac\7w\2\2\u05ac\u05ad\7\u00a1\2\2\u05ad"+
		"\u05ae\7\u016e\2\2\u05ae\u05b3\5\u01d4\u00eb\2\u05af\u05b0\7\u0160\2\2"+
		"\u05b0\u05b2\5\u01d4\u00eb\2\u05b1\u05af\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3"+
		"\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b3\3\2"+
		"\2\2\u05b6\u05b7\7\u0171\2\2\u05b7\u05b8\7\u00e9\2\2\u05b8\u05b9\5\u0166"+
		"\u00b4\2\u05b9\u05ba\7\u016e\2\2\u05ba\u05bf\5\u01d4\u00eb\2\u05bb\u05bc"+
		"\7\u0160\2\2\u05bc\u05be\5\u01d4\u00eb\2\u05bd\u05bb\3\2\2\2\u05be\u05c1"+
		"\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1"+
		"\u05bf\3\2\2\2\u05c2\u05c6\7\u0171\2\2\u05c3\u05c5\5V,\2\u05c4\u05c3\3"+
		"\2\2\2\u05c5\u05c8\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u05cf\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c9\u05ca\7N\2\2\u05ca\u05cb\5\u019c"+
		"\u00cf\2\u05cb\u05cc\7v\2\2\u05cc\u05cd\5\u01d4\u00eb\2\u05cd\u05cf\3"+
		"\2\2\2\u05ce\u0590\3\2\2\2\u05ce\u05ab\3\2\2\2\u05ce\u05c9\3\2\2\2\u05cf"+
		"\u0093\3\2\2\2\u05d0\u0600\7(\2\2\u05d1\u0600\7)\2\2\u05d2\u0600\7\31"+
		"\2\2\u05d3\u0600\7\32\2\2\u05d4\u0600\7\33\2\2\u05d5\u0600\7\34\2\2\u05d6"+
		"\u0600\7\35\2\2\u05d7\u0600\7G\2\2\u05d8\u0600\7H\2\2\u05d9\u0600\7K\2"+
		"\2\u05da\u0600\7L\2\2\u05db\u05dd\7^\2\2\u05dc\u05de\7\u00dc\2\2\u05dd"+
		"\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u0600\3\2\2\2\u05df\u0600\7u"+
		"\2\2\u05e0\u0600\7\u0093\2\2\u05e1\u0600\7\u0094\2\2\u05e2\u0600\7\u0095"+
		"\2\2\u05e3\u0600\7\u0096\2\2\u05e4\u0600\7\u0097\2\2\u05e5\u0600\7\u00bb"+
		"\2\2\u05e6\u0600\7\u00bd\2\2\u05e7\u0600\7\u00bf\2\2\u05e8\u0600\7\u00c9"+
		"\2\2\u05e9\u0600\7\u00c8\2\2\u05ea\u0600\7\u00db\2\2\u05eb\u0600\7\u00e8"+
		"\2\2\u05ec\u05ed\7\u00ef\2\2\u05ed\u0600\7\u013b\2\2\u05ee\u0600\7\u010d"+
		"\2\2\u05ef\u0600\7\u010c\2\2\u05f0\u0600\7\u010e\2\2\u05f1\u0600\7\u0110"+
		"\2\2\u05f2\u0600\7\u010f\2\2\u05f3\u0600\7\u011b\2\2\u05f4\u0600\7\u0120"+
		"\2\2\u05f5\u0600\7\u0127\2\2\u05f6\u0600\7\u0128\2\2\u05f7\u0600\7\u0139"+
		"\2\2\u05f8\u0600\7\u013a\2\2\u05f9\u0600\7\u0144\2\2\u05fa\u05fd\5\u01d4"+
		"\u00eb\2\u05fb\u05fc\7\5\2\2\u05fc\u05fe\t\21\2\2\u05fd\u05fb\3\2\2\2"+
		"\u05fd\u05fe\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u05d0\3\2\2\2\u05ff\u05d1"+
		"\3\2\2\2\u05ff\u05d2\3\2\2\2\u05ff\u05d3\3\2\2\2\u05ff\u05d4\3\2\2\2\u05ff"+
		"\u05d5\3\2\2\2\u05ff\u05d6\3\2\2\2\u05ff\u05d7\3\2\2\2\u05ff\u05d8\3\2"+
		"\2\2\u05ff\u05d9\3\2\2\2\u05ff\u05da\3\2\2\2\u05ff\u05db\3\2\2\2\u05ff"+
		"\u05df\3\2\2\2\u05ff\u05e0\3\2\2\2\u05ff\u05e1\3\2\2\2\u05ff\u05e2\3\2"+
		"\2\2\u05ff\u05e3\3\2\2\2\u05ff\u05e4\3\2\2\2\u05ff\u05e5\3\2\2\2\u05ff"+
		"\u05e6\3\2\2\2\u05ff\u05e7\3\2\2\2\u05ff\u05e8\3\2\2\2\u05ff\u05e9\3\2"+
		"\2\2\u05ff\u05ea\3\2\2\2\u05ff\u05eb\3\2\2\2\u05ff\u05ec\3\2\2\2\u05ff"+
		"\u05ee\3\2\2\2\u05ff\u05ef\3\2\2\2\u05ff\u05f0\3\2\2\2\u05ff\u05f1\3\2"+
		"\2\2\u05ff\u05f2\3\2\2\2\u05ff\u05f3\3\2\2\2\u05ff\u05f4\3\2\2\2\u05ff"+
		"\u05f5\3\2\2\2\u05ff\u05f6\3\2\2\2\u05ff\u05f7\3\2\2\2\u05ff\u05f8\3\2"+
		"\2\2\u05ff\u05f9\3\2\2\2\u05ff\u05fa\3\2\2\2\u0600\u0095\3\2\2\2\u0601"+
		"\u0602\7\u016e\2\2\u0602\u0604\t\22\2\2\u0603\u0605\t\23\2\2\u0604\u0603"+
		"\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0608\3\2\2\2\u0606\u0607\7\u0160\2"+
		"\2\u0607\u0609\7\u0178\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u060b\7\u0171\2\2\u060b\u0097\3\2\2\2\u060c\u060e"+
		"\7\u00c5\2\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2"+
		"\2\u060f\u0618\7\u00c7\2\2\u0610\u0611\7)\2\2\u0611\u0612\7\u0106\2\2"+
		"\u0612\u0618\5\u01d4\u00eb\2\u0613\u0615\7\u00c5\2\2\u0614\u0613\3\2\2"+
		"\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\t\24\2\2\u0617"+
		"\u060d\3\2\2\2\u0617\u0610\3\2\2\2\u0617\u0614\3\2\2\2\u0618\u0099\3\2"+
		"\2\2\u0619\u061b\7\u015f\2\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061d\7\u0164\2\2\u061d\u0626\5\u019c\u00cf\2\u061e"+
		"\u0620\7\u0140\2\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621"+
		"\3\2\2\2\u0621\u0623\7N\2\2\u0622\u0624\5\u019c\u00cf\2\u0623\u0622\3"+
		"\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2\2\2\u0625\u061a\3\2\2\2\u0625"+
		"\u061f\3\2\2\2\u0626\u009b\3\2\2\2\u0627\u0628\7>\2\2\u0628\u062c\t\25"+
		"\2\2\u0629\u062a\7\u0089\2\2\u062a\u062b\7\u00c5\2\2\u062b\u062d\7m\2"+
		"\2\u062c\u0629\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0632"+
		"\5\u019c\u00cf\2\u062f\u0631\5\u009eP\2\u0630\u062f\3\2\2\2\u0631\u0634"+
		"\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u009d\3\2\2\2\u0634"+
		"\u0632\3\2\2\2\u0635\u0636\7\63\2\2\u0636\u063a\5\u019c\u00cf\2\u0637"+
		"\u0638\7\u00aa\2\2\u0638\u063a\5\u019c\u00cf\2\u0639\u0635\3\2\2\2\u0639"+
		"\u0637\3\2\2\2\u063a\u009f\3\2\2\2\u063b\u0643\7\f\2\2\u063c\u063f\7>"+
		"\2\2\u063d\u063e\7\u00cf\2\2\u063e\u0640\7\u00eb\2\2\u063f\u063d\3\2\2"+
		"\2\u063f\u0640\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u0643\7\u00eb\2\2\u0642"+
		"\u063b\3\2\2\2\u0642\u063c\3\2\2\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2"+
		"\2\2\u0643\u0644\3\2\2\2\u0644\u0645\7|\2\2\u0645\u0647\5\u01d4\u00eb"+
		"\2\u0646\u0648\5\u00b2Z\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u0649\3\2\2\2\u0649\u064b\5\u00a2R\2\u064a\u064c\t\26\2\2\u064b\u064a"+
		"\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u064f\5\62\32\2"+
		"\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651"+
		"\5\b\5\2\u0651\u00a1\3\2\2\2\u0652\u0653\t\27\2\2\u0653\u0655\5\u0094"+
		"K\2\u0654\u0656\5\u0096L\2\u0655\u0654\3\2\2\2\u0655\u0656\3\2\2\2\u0656"+
		"\u00a3\3\2\2\2\u0657\u065f\7\f\2\2\u0658\u065b\7>\2\2\u0659\u065a\7\u00cf"+
		"\2\2\u065a\u065c\7\u00eb\2\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u065f\3\2\2\2\u065d\u065f\7\u00eb\2\2\u065e\u0657\3\2\2\2\u065e\u0658"+
		"\3\2\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\3\2\2\2\u0660"+
		"\u0661\7\u00d6\2\2\u0661\u0662\5\u01d4\u00eb\2\u0662\u0663\t\26\2\2\u0663"+
		"\u0664\5\u00a6T\2\u0664\u0668\7e\2\2\u0665\u0666\5\u01d4\u00eb\2\u0666"+
		"\u0667\7\u0173\2\2\u0667\u0669\3\2\2\2\u0668\u0665\3\2\2\2\u0668\u0669"+
		"\3\2\2\2\u0669\u00a5\3\2\2\2\u066a\u066b\5\u00a8U\2\u066b\u0671\7\u0173"+
		"\2\2\u066c\u066d\5\u00a8U\2\u066d\u066e\7\u0173\2\2\u066e\u0670\3\2\2"+
		"\2\u066f\u066c\3\2\2\2\u0670\u0673\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0672"+
		"\3\2\2\2\u0672\u00a7\3\2\2\2\u0673\u0671\3\2\2\2\u0674\u0682\5\64\33\2"+
		"\u0675\u0676\7|\2\2\u0676\u0678\5\u01d4\u00eb\2\u0677\u0679\5\u00b2Z\2"+
		"\u0678\u0677\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b"+
		"\5\u00a2R\2\u067b\u0682\3\2\2\2\u067c\u067d\t\30\2\2\u067d\u067f\5\u01d4"+
		"\u00eb\2\u067e\u0680\5\u00b2Z\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2"+
		"\2\u0680\u0682\3\2\2\2\u0681\u0674\3\2\2\2\u0681\u0675\3\2\2\2\u0681\u067c"+
		"\3\2\2\2\u0682\u00a9\3\2\2\2\u0683\u068b\7\f\2\2\u0684\u0687\7>\2\2\u0685"+
		"\u0686\7\u00cf\2\2\u0686\u0688\7\u00eb\2\2\u0687\u0685\3\2\2\2\u0687\u0688"+
		"\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u068b\7\u00eb\2\2\u068a\u0683\3\2\2"+
		"\2\u068a\u0684\3\2\2\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c"+
		"\3\2\2\2\u068c\u068d\7\u00d6\2\2\u068d\u068e\7\36\2\2\u068e\u068f\5\u01d4"+
		"\u00eb\2\u068f\u0690\t\26\2\2\u0690\u0691\5\u00acW\2\u0691\u0695\7e\2"+
		"\2\u0692\u0693\5\u01d4\u00eb\2\u0693\u0694\7\u0173\2\2\u0694\u0696\3\2"+
		"\2\2\u0695\u0692\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u00ab\3\2\2\2\u0697"+
		"\u0698\5\u00aeX\2\u0698\u069e\7\u0173\2\2\u0699\u069a\5\u00aeX\2\u069a"+
		"\u069b\7\u0173\2\2\u069b\u069d\3\2\2\2\u069c\u0699\3\2\2\2\u069d\u06a0"+
		"\3\2\2\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u00ad\3\2\2\2\u06a0"+
		"\u069e\3\2\2\2\u06a1\u06a5\5\64\33\2\u06a2\u06a5\5\u00a0Q\2\u06a3\u06a5"+
		"\5\u00b0Y\2\u06a4\u06a1\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a3\3\2\2"+
		"\2\u06a5\u00af\3\2\2\2\u06a6\u06ae\7\f\2\2\u06a7\u06aa\7>\2\2\u06a8\u06a9"+
		"\7\u00cf\2\2\u06a9\u06ab\7\u00eb\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3"+
		"\2\2\2\u06ab\u06ae\3\2\2\2\u06ac\u06ae\7\u00eb\2\2\u06ad\u06a6\3\2\2\2"+
		"\u06ad\u06a7\3\2\2\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af"+
		"\3\2\2\2\u06af\u06b0\t\30\2\2\u06b0\u06b2\5\u01d4\u00eb\2\u06b1\u06b3"+
		"\5\u00b2Z\2\u06b2\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\3\2\2"+
		"\2\u06b4\u06b6\5\u00b6\\\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6"+
		"\u06b8\3\2\2\2\u06b7\u06b9\t\26\2\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3"+
		"\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06bc\5\62\32\2\u06bb\u06ba\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bf\5\u0132\u009a\2\u06be\u06bd"+
		"\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c4\5\f\7\2\u06c1"+
		"\u06c2\5\u01d4\u00eb\2\u06c2\u06c3\7\u0173\2\2\u06c3\u06c5\3\2\2\2\u06c4"+
		"\u06c1\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u00b1\3\2\2\2\u06c6\u06c7\7\u016e"+
		"\2\2\u06c7\u06dd\7\u0171\2\2\u06c8\u06c9\7\u016e\2\2\u06c9\u06ce\5\u00b4"+
		"[\2\u06ca\u06cb\7\u0160\2\2\u06cb\u06cd\5\u00b4[\2\u06cc\u06ca\3\2\2\2"+
		"\u06cd\u06d0\3\2\2\2\u06ce\u06cc\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d1"+
		"\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d1\u06d2\7\u0171\2\2\u06d2\u06dd\3\2\2"+
		"\2\u06d3\u06d4\6Z\4\2\u06d4\u06d9\5\u00b4[\2\u06d5\u06d6\7\u0160\2\2\u06d6"+
		"\u06d8\5\u00b4[\2\u06d7\u06d5\3\2\2\2\u06d8\u06db\3\2\2\2\u06d9\u06d7"+
		"\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06dc"+
		"\u06c6\3\2\2\2\u06dc\u06c8\3\2\2\2\u06dc\u06d3\3\2\2\2\u06dd\u00b3\3\2"+
		"\2\2\u06de\u06e4\7\u008c\2\2\u06df\u06e4\7\u00d1\2\2\u06e0\u06e4\7\u0091"+
		"\2\2\u06e1\u06e2\7\u008c\2\2\u06e2\u06e4\7\u00d1\2\2\u06e3\u06de\3\2\2"+
		"\2\u06e3\u06df\3\2\2\2\u06e3\u06e0\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e3\u06e4"+
		"\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\5\u01d4\u00eb\2\u06e6\u06e8\5"+
		"\u0094K\2\u06e7\u06e9\5\u0096L\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2"+
		"\2\u06e9\u06ed\3\2\2\2\u06ea\u06ec\5\u0098M\2\u06eb\u06ea\3\2\2\2\u06ec"+
		"\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f1\3\2"+
		"\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f2\5\u009aN\2\u06f1\u06f0\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u0709\3\2\2\2\u06f3\u06f9\5\u01d4\u00eb\2\u06f4\u06fa"+
		"\7\u008c\2\2\u06f5\u06fa\7\u00d1\2\2\u06f6\u06fa\7\u0091\2\2\u06f7\u06f8"+
		"\7\u008c\2\2\u06f8\u06fa\7\u00d1\2\2\u06f9\u06f4\3\2\2\2\u06f9\u06f5\3"+
		"\2\2\2\u06f9\u06f6\3\2\2\2\u06f9\u06f7\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa"+
		"\u06fb\3\2\2\2\u06fb\u06fd\5\u0094K\2\u06fc\u06fe\5\u0096L\2\u06fd\u06fc"+
		"\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0702\3\2\2\2\u06ff\u0701\5\u0098M"+
		"\2\u0700\u06ff\3\2\2\2\u0701\u0704\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703"+
		"\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702\3\2\2\2\u0705\u0707\5\u009aN"+
		"\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0709\3\2\2\2\u0708\u06e3"+
		"\3\2\2\2\u0708\u06f3\3\2\2\2\u0709\u00b5\3\2\2\2\u070a\u070c\5\u00b8]"+
		"\2\u070b\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070b\3\2\2\2\u070d\u070e"+
		"\3\2\2\2\u070e\u00b7\3\2\2\2\u070f\u0710\7\u00a3\2\2\u0710\u071b\7\u0111"+
		"\2\2\u0711\u0712\7\u0111\2\2\u0712\u0713\7\u0102\2\2\u0713\u071b\t\31"+
		"\2\2\u0714\u0716\7`\2\2\u0715\u0714\3\2\2\2\u0715\u0716\3\2\2\2\u0716"+
		"\u0717\3\2\2\2\u0717\u0718\7\u00ee\2\2\u0718\u0719\7\u0109\2\2\u0719\u071b"+
		"\7\u0178\2\2\u071a\u070f\3\2\2\2\u071a\u0711\3\2\2\2\u071a\u0715\3\2\2"+
		"\2\u071b\u00b9\3\2\2\2\u071c\u071d\7_\2\2\u071d\u0720\7\u0121\2\2\u071e"+
		"\u071f\7\u0089\2\2\u071f\u0721\7m\2\2\u0720\u071e\3\2\2\2\u0720\u0721"+
		"\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u072b\5\u0166\u00b4\2\u0723\u0724\7"+
		"_\2\2\u0724\u0727\t\25\2\2\u0725\u0726\7\u0089\2\2\u0726\u0728\7m\2\2"+
		"\u0727\u0725\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072b"+
		"\5\u019c\u00cf\2\u072a\u071c\3\2\2\2\u072a\u0723\3\2\2\2\u072b\u00bb\3"+
		"\2\2\2\u072c\u072d\7e\2\2\u072d\u072e\7\u012c\2\2\u072e\u00bd\3\2\2\2"+
		"\u072f\u0731\t\32\2\2\u0730\u0732\7\u008b\2\2\u0731\u0730\3\2\2\2\u0731"+
		"\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0739\5\u019c\u00cf\2\u0734\u0735"+
		"\7\u016e\2\2\u0735\u0736\5\u01bc\u00df\2\u0736\u0737\7\u0171\2\2\u0737"+
		"\u073a\3\2\2\2\u0738\u073a\5\u01bc\u00df\2\u0739\u0734\3\2\2\2\u0739\u0738"+
		"\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u0744\3\2\2\2\u073b\u073c\7\u009a\2"+
		"\2\u073c\u0741\7\u0175\2\2\u073d\u073e\7\u0160\2\2\u073e\u0740\7\u0175"+
		"\2\2\u073f\u073d\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2\2\u0741"+
		"\u0742\3\2\2\2\u0742\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u073b\3\2"+
		"\2\2\u0744\u0745\3\2\2\2\u0745\u0747\3\2\2\2\u0746\u0748\5\u0134\u009b"+
		"\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u00bf\3\2\2\2\u0749\u074d"+
		"\5\u00c2b\2\u074a\u074d\5\u00c4c\2\u074b\u074d\5\u00c6d\2\u074c\u0749"+
		"\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u00c1\3\2\2\2\u074e"+
		"\u074f\7\u0089\2\2\u074f\u0750\5\u018c\u00c7\2\u0750\u0751\7\u0126\2\2"+
		"\u0751\u0755\5\4\3\2\u0752\u0754\5\u00c8e\2\u0753\u0752\3\2\2\2\u0754"+
		"\u0757\3\2\2\2\u0755\u0753\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0759\3\2"+
		"\2\2\u0757\u0755\3\2\2\2\u0758\u075a\5\u00caf\2\u0759\u0758\3\2\2\2\u0759"+
		"\u075a\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075c\7e\2\2\u075c\u075d\7\u0089"+
		"\2\2\u075d\u00c3\3\2\2\2\u075e\u075f\7\u0089\2\2\u075f\u0760\5\u018c\u00c7"+
		"\2\u0760\u0763\5\b\5\2\u0761\u0762\7a\2\2\u0762\u0764\5\b\5\2\u0763\u0761"+
		"\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u00c5\3\2\2\2\u0765\u0766\7\6\2\2\u0766"+
		"\u0767\7\u0089\2\2\u0767\u0768\5\u018c\u00c7\2\u0768\u0769\7\u0126\2\2"+
		"\u0769\u076a\5\b\5\2\u076a\u00c7\3\2\2\2\u076b\u076c\t\33\2\2\u076c\u076d"+
		"\5\u018c\u00c7\2\u076d\u076e\7\u0126\2\2\u076e\u076f\5\4\3\2\u076f\u00c9"+
		"\3\2\2\2\u0770\u0771\7a\2\2\u0771\u0772\5\4\3\2\u0772\u00cb\3\2\2\2\u0773"+
		"\u0776\7\u008d\2\2\u0774\u0777\5\u01ce\u00e8\2\u0775\u0777\5\u019c\u00cf"+
		"\2\u0776\u0774\3\2\2\2\u0776\u0775\3\2\2\2\u0777\u00cd\3\2\2\2\u0778\u077f"+
		"\7\u0092\2\2\u0779\u077a\7\u00d4\2\2\u077a\u0780\7\u0121\2\2\u077b\u077d"+
		"\7\u009a\2\2\u077c\u077e\7\u0121\2\2\u077d\u077c\3\2\2\2\u077d\u077e\3"+
		"\2\2\2\u077e\u0780\3\2\2\2\u077f\u0779\3\2\2\2\u077f\u077b\3\2\2\2\u0780"+
		"\u0781\3\2\2\2\u0781\u0783\5\u0166\u00b4\2\u0782\u0784\5\u00d0i\2\u0783"+
		"\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0788\5\u0136"+
		"\u009c\2\u0786\u0788\5\u00d2j\2\u0787\u0785\3\2\2\2\u0787\u0786\3\2\2"+
		"\2\u0788\u00cf\3\2\2\2\u0789\u078a\7\u016e\2\2\u078a\u078f\5\u01d4\u00eb"+
		"\2\u078b\u078c\7\u0160\2\2\u078c\u078e\5\u01d4\u00eb\2\u078d\u078b\3\2"+
		"\2\2\u078e\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790"+
		"\u0792\3\2\2\2\u0791\u078f\3\2\2\2\u0792\u0793\7\u0171\2\2\u0793\u00d1"+
		"\3\2\2\2\u0794\u0795\7\u0137\2\2\u0795\u079a\5\u00d4k\2\u0796\u0797\7"+
		"\u0160\2\2\u0797\u0799\5\u00d4k\2\u0798\u0796\3\2\2\2\u0799\u079c\3\2"+
		"\2\2\u079a\u0798\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u00d3\3\2\2\2\u079c"+
		"\u079a\3\2\2\2\u079d\u079e\7\u016e\2\2\u079e\u07a3\5\u019c\u00cf\2\u079f"+
		"\u07a0\7\u0160\2\2\u07a0\u07a2\5\u019c\u00cf\2\u07a1\u079f\3\2\2\2\u07a2"+
		"\u07a5\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a6\3\2"+
		"\2\2\u07a5\u07a3\3\2\2\2\u07a6\u07a7\7\u0171\2\2\u07a7\u00d5\3\2\2\2\u07a8"+
		"\u07a9\7\u0092\2\2\u07a9\u07ab\7\u00d4\2\2\u07aa\u07ac\7\u00a9\2\2\u07ab"+
		"\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\7Z"+
		"\2\2\u07ae\u07af\5\u01c2\u00e2\2\u07af\u07b0\5\u01c0\u00e1\2\u07b0\u00d7"+
		"\3\2\2\2\u07b1\u07b3\7n\2\2\u07b2\u07b4\7\u0175\2\2\u07b3\u07b2\3\2\2"+
		"\2\u07b3\u07b4\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b6\7\u013d\2\2\u07b6"+
		"\u07b8\5\u018c\u00c7\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u00d9"+
		"\3\2\2\2\u07b9\u07ba\7}\2\2\u07ba\u07bb\7X\2\2\u07bb\u07bc\5\u00dco\2"+
		"\u07bc\u00db\3\2\2\2\u07bd\u07c0\5\u00dep\2\u07be\u07c0\5\u00e0q\2\u07bf"+
		"\u07bd\3\2\2\2\u07bf\u07be\3\2\2\2\u07c0\u00dd\3\2\2\2\u07c1\u07c2\7k"+
		"\2\2\u07c2\u07c3\7\u0178\2\2\u07c3\u07c4\5\u01d4\u00eb\2\u07c4\u07c5\7"+
		"\u0164\2\2\u07c5\u07c6\7\u00b7\2\2\u07c6\u00df\3\2\2\2\u07c7\u07c8\5\u01d4"+
		"\u00eb\2\u07c8\u07c9\7\u0164\2\2\u07c9\u07ca\7\u00fa\2\2\u07ca\u00e1\3"+
		"\2\2\2\u07cb\u07cc\7\u0080\2\2\u07cc\u07d1\5\u00e4s\2\u07cd\u07ce\7\u0160"+
		"\2\2\u07ce\u07d0\5\u00e4s\2\u07cf\u07cd\3\2\2\2\u07d0\u07d3\3\2\2\2\u07d1"+
		"\u07cf\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d4\3\2\2\2\u07d3\u07d1\3\2"+
		"\2\2\u07d4\u07d5\7\u012a\2\2\u07d5\u07d6\7\u00f5\2\2\u07d6\u07d7\5\u01d4"+
		"\u00eb\2\u07d7\u00e3\3\2\2\2\u07d8\u07d9\7j\2\2\u07d9\u07da\7\u00cc\2"+
		"\2\u07da\u07db\7\u00e2\2\2\u07db\u07dc\5\u01d4\u00eb\2\u07dc\u00e5\3\2"+
		"\2\2\u07dd\u07df\7\u00a4\2\2\u07de\u07e0\7\u0175\2\2\u07df\u07de\3\2\2"+
		"\2\u07df\u07e0\3\2\2\2\u07e0\u00e7\3\2\2\2\u07e1\u07e2\7\u00b2\2\2\u07e2"+
		"\u07e3\7\u00ca\2\2\u07e3\u07e6\5\u019c\u00cf\2\u07e4\u07e5\7\u012a\2\2"+
		"\u07e5\u07e7\5\u019c\u00cf\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7"+
		"\u07ea\3\2\2\2\u07e8\u07e9\7\23\2\2\u07e9\u07eb\5\u019c\u00cf\2\u07ea"+
		"\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u00e9\3\2\2\2\u07ec\u07ed\7\u00ce"+
		"\2\2\u07ed\u07f3\7\u0175\2\2\u07ee\u07f1\7v\2\2\u07ef\u07f2\5\u0136\u009c"+
		"\2\u07f0\u07f2\5\u019c\u00cf\2\u07f1\u07ef\3\2\2\2\u07f1\u07f0\3\2\2\2"+
		"\u07f2\u07f4\3\2\2\2\u07f3\u07ee\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u00eb"+
		"\3\2\2\2\u07f5\u07f7\7q\2\2\u07f6\u07f8\7z\2\2\u07f7\u07f6\3\2\2\2\u07f7"+
		"\u07f8\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\7\u0175\2\2\u07fa\u07fb"+
		"\7\u009a\2\2\u07fb\u0800\7\u0175\2\2\u07fc\u07fd\7\u0160\2\2\u07fd\u07ff"+
		"\7\u0175\2\2\u07fe\u07fc\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3\2\2"+
		"\2\u0800\u0801\3\2\2\2\u0801\u00ed\3\2\2\2\u0802\u0800\3\2\2\2\u0803\u0804"+
		"\7/\2\2\u0804\u0805\t\34\2\2\u0805\u0806\7\u00cc\2\2\u0806\u0808\5\u0166"+
		"\u00b4\2\u0807\u0809\5\u00f0y\2\u0808\u0807\3\2\2\2\u0808\u0809\3\2\2"+
		"\2\u0809\u00ef\3\2\2\2\u080a\u080b\7\61\2\2\u080b\u080c\7\u016e\2\2\u080c"+
		"\u0811\5\u01d4\u00eb\2\u080d\u080e\7\u0160\2\2\u080e\u0810\5\u01d4\u00eb"+
		"\2\u080f\u080d\3\2\2\2\u0810\u0813\3\2\2\2\u0811\u080f\3\2\2\2\u0811\u0812"+
		"\3\2\2\2\u0812\u0814\3\2\2\2\u0813\u0811\3\2\2\2\u0814\u0815\7\u0171\2"+
		"\2\u0815\u00f1\3\2\2\2\u0816\u0817\7,\2\2\u0817\u0818\7\u0175\2\2\u0818"+
		"\u00f3\3\2\2\2\u0819\u081a\7.\2\2\u081a\u081b\t\35\2\2\u081b\u081c\5\u00f6"+
		"|\2\u081c\u081d\7\u0160\2\2\u081d\u081e\5\u00f6|\2\u081e\u00f5\3\2\2\2"+
		"\u081f\u0821\5\u0166\u00b4\2\u0820\u0822\5\u0168\u00b5\2\u0821\u0820\3"+
		"\2\2\2\u0821\u0822\3\2\2\2\u0822\u0828\3\2\2\2\u0823\u0824\7\u016e\2\2"+
		"\u0824\u0825\5\u0136\u009c\2\u0825\u0826\7\u0171\2\2\u0826\u0828\3\2\2"+
		"\2\u0827\u081f\3\2\2\2\u0827\u0823\3\2\2\2\u0828\u082b\3\2\2\2\u0829\u082a"+
		"\7\23\2\2\u082a\u082c\5\u01d4\u00eb\2\u082b";
	private static final String _serializedATNSegment1 =
		"\u0829\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u00f7\3\2\2\2\u082d\u082e\7;"+
		"\2\2\u082e\u082f\7z\2\2\u082f\u0830\7\u00a9\2\2\u0830\u0835\5\u00fc\177"+
		"\2\u0831\u0832\7\u0160\2\2\u0832\u0834\5\u00fc\177\2\u0833\u0831\3\2\2"+
		"\2\u0834\u0837\3\2\2\2\u0835\u0833\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0838"+
		"\3\2\2\2\u0837\u0835\3\2\2\2\u0838\u0839\7\u012a\2\2\u0839\u083d\5\u00fe"+
		"\u0080\2\u083a\u083c\5\u0102\u0082\2\u083b\u083a\3\2\2\2\u083c\u083f\3"+
		"\2\2\2\u083d\u083b\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u00f9\3\2\2\2\u083f"+
		"\u083d\3\2\2\2\u0840\u0846\7;\2\2\u0841\u0847\5\u0166\u00b4\2\u0842\u0843"+
		"\7\u016e\2\2\u0843\u0844\5\u0136\u009c\2\u0844\u0845\7\u0171\2\2\u0845"+
		"\u0847\3\2\2\2\u0846\u0841\3\2\2\2\u0846\u0842\3\2\2\2\u0847\u0848\3\2"+
		"\2\2\u0848\u084a\7\u012a\2\2\u0849\u084b\7\u0085\2\2\u084a\u0849\3\2\2"+
		"\2\u084a\u084b\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u0850\5\u00fe\u0080\2"+
		"\u084d\u084f\5\u0100\u0081\2\u084e\u084d\3\2\2\2\u084f\u0852\3\2\2\2\u0850"+
		"\u084e\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u00fb\3\2\2\2\u0852\u0850\3\2"+
		"\2\2\u0853\u0856\5\u01ce\u00e8\2\u0854\u0856\5\u019c\u00cf\2\u0855\u0853"+
		"\3\2\2\2\u0855\u0854\3\2\2\2\u0856\u00fd\3\2\2\2\u0857\u085a\5\u01ce\u00e8"+
		"\2\u0858\u085a\5\u019c\u00cf\2\u0859\u0857\3\2\2\2\u0859\u0858\3\2\2\2"+
		"\u085a\u00ff\3\2\2\2\u085b\u085c\7\23\2\2\u085c\u0864\5\u01d4\u00eb\2"+
		"\u085d\u085e\7\26\2\2\u085e\u0864\5\u019c\u00cf\2\u085f\u0860\7U\2\2\u0860"+
		"\u0864\5\u019c\u00cf\2\u0861\u0862\7\u0113\2\2\u0862\u0864\5\u01d4\u00eb"+
		"\2\u0863\u085b\3\2\2\2\u0863\u085d\3\2\2\2\u0863\u085f\3\2\2\2\u0863\u0861"+
		"\3\2\2\2\u0864\u0101\3\2\2\2\u0865\u0866\t\36\2\2\u0866\u0103\3\2\2\2"+
		"\u0867\u0869\7\65\2\2\u0868\u086a\7\u0142\2\2\u0869\u0868\3\2\2\2\u0869"+
		"\u086a\3\2\2\2\u086a\u0105\3\2\2\2\u086b\u086d\7>\2\2\u086c\u086e\7\u0131"+
		"\2\2\u086d\u086c\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u086f\3\2\2\2\u086f"+
		"\u0870\7\u008e\2\2\u0870\u0871\5\u01d4\u00eb\2\u0871\u0872\7\u00cc\2\2"+
		"\u0872\u0873\5\u0166\u00b4\2\u0873\u0874\7\u016e\2\2\u0874\u0879\5\u0108"+
		"\u0085\2\u0875\u0876\7\u0160\2\2\u0876\u0878\5\u0108\u0085\2\u0877\u0875"+
		"\3\2\2\2\u0878\u087b\3\2\2\2\u0879\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a"+
		"\u087c\3\2\2\2\u087b\u0879\3\2\2\2\u087c\u087d\7\u0171\2\2\u087d\u0107"+
		"\3\2\2\2\u087e\u0880\5\u01d4\u00eb\2\u087f\u0881\t\t\2\2\u0880\u087f\3"+
		"\2\2\2\u0880\u0881\3\2\2\2\u0881\u0109\3\2\2\2\u0882\u0883\5\u010c\u0087"+
		"\2\u0883\u010b\3\2\2\2\u0884\u0885\7\u0140\2\2\u0885\u0886\7\u016e\2\2"+
		"\u0886\u0887\5\u01d4\u00eb\2\u0887\u0888\7\u0164\2\2\u0888\u0890\5\u01d4"+
		"\u00eb\2\u0889\u088a\7\u0160\2\2\u088a\u088b\5\u01d4\u00eb\2\u088b\u088c"+
		"\7\u0164\2\2\u088c\u088d\5\u01d4\u00eb\2\u088d\u088f\3\2\2\2\u088e\u0889"+
		"\3\2\2\2\u088f\u0892\3\2\2\2\u0890\u088e\3\2\2\2\u0890\u0891\3\2\2\2\u0891"+
		"\u0893\3\2\2\2\u0892\u0890\3\2\2\2\u0893\u0897\7\u0171\2\2\u0894\u0896"+
		"\5|?\2\u0895\u0894\3\2\2\2\u0896\u0899\3\2\2\2\u0897\u0895\3\2\2\2\u0897"+
		"\u0898\3\2\2\2\u0898\u010d\3\2\2\2\u0899\u0897\3\2\2\2\u089a\u089b\7\u00e0"+
		"\2\2\u089b\u08a2\5\u019c\u00cf\2\u089c\u089d\7\u00e0\2\2\u089d\u089e\7"+
		"\u016e\2\2\u089e\u089f\5\u019c\u00cf\2\u089f\u08a0\7\u0171\2\2\u08a0\u08a2"+
		"\3\2\2\2\u08a1\u089a\3\2\2\2\u08a1\u089c\3\2\2\2\u08a2\u010f\3\2\2\2\u08a3"+
		"\u08a5\7\6\2\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2"+
		"\2\2\u08a6\u08a8\7\u00e5\2\2\u08a7\u08a9\5\u019c\u00cf\2\u08a8\u08a7\3"+
		"\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u0111\3\2\2\2\u08aa\u08ab\7\u00e7\2\2"+
		"\u08ab\u0113\3\2\2\2\u08ac\u08b8\7\u00ec\2\2\u08ad\u08af\7\u0114\2\2\u08ae"+
		"\u08b0\7\u0136\2\2\u08af\u08ae\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b1"+
		"\3\2\2\2\u08b1\u08b6\5\u019c\u00cf\2\u08b2\u08b3\7\u0106\2\2\u08b3\u08b4"+
		"\7\u00b7\2\2\u08b4\u08b5\7\u0164\2\2\u08b5\u08b7\5\u019c\u00cf\2\u08b6"+
		"\u08b2\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b9\3\2\2\2\u08b8\u08ad\3\2"+
		"\2\2\u08b8\u08b9\3\2\2\2\u08b9\u0115\3\2\2\2\u08ba\u08bc\7\u00f0\2\2\u08bb"+
		"\u08bd\5\u019c\u00cf\2\u08bc\u08bb\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u0117"+
		"\3\2\2\2\u08be\u08c0\7\u00f6\2\2\u08bf\u08c1\7\u0142\2\2\u08c0\u08bf\3"+
		"\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u0119\3\2\2\2\u08c2\u08c6\5\u011c\u008f"+
		"\2\u08c3\u08c6\5\u011e\u0090\2\u08c4\u08c6\5\u0120\u0091\2\u08c5\u08c2"+
		"\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c5\u08c4\3\2\2\2\u08c6\u011b\3\2\2\2\u08c7"+
		"\u08c9\7B\2\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3\2"+
		"\2\2\u08ca\u08cd\7\u00ff\2\2\u08cb\u08cd\7C\2\2\u08cc\u08c8\3\2\2\2\u08cc"+
		"\u08cb\3\2\2\2\u08cd\u08cf\3\2\2\2\u08ce\u08d0\7\u0164\2\2\u08cf\u08ce"+
		"\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\5\u019c\u00cf"+
		"\2\u08d2\u011d\3\2\2\2\u08d3\u08d4\t\37\2\2\u08d4\u08d5\t \2\2\u08d5\u011f"+
		"\3\2\2\2\u08d6\u08d7\7\u00e4\2\2\u08d7\u08da\7\u0164\2\2\u08d8\u08db\5"+
		"\u019c\u00cf\2\u08d9\u08db\7\u00c4\2\2\u08da\u08d8\3\2\2\2\u08da\u08d9"+
		"\3\2\2\2\u08db\u08dd\3\2\2\2\u08dc\u08de\7\u0132\2\2\u08dd\u08dc\3\2\2"+
		"\2\u08dd\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\7v\2\2\u08e0\u08e1"+
		"\t!\2\2\u08e1\u0121\3\2\2\2\u08e2\u08e3\7\u010b\2\2\u08e3\u08e4\5\u01d4"+
		"\u00eb\2\u08e4\u0123\3\2\2\2\u08e5\u08e8\7\u011f\2\2\u08e6\u08e7\7\u012b"+
		"\2\2\u08e7\u08e9\5\u019c\u00cf\2\u08e8\u08e6\3\2\2\2\u08e8\u08e9\3\2\2"+
		"\2\u08e9\u08ea\3\2\2\2\u08ea\u08f4\7v\2\2\u08eb\u08f5\5\u0136\u009c\2"+
		"\u08ec\u08ee\5\u0166\u00b4\2\u08ed\u08ef\5\u0168\u00b5\2\u08ee\u08ed\3"+
		"\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f2\3\2\2\2\u08f0\u08f1\7\u00a7\2\2"+
		"\u08f1\u08f3\5\u019c\u00cf\2\u08f2\u08f0\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3"+
		"\u08f5\3\2\2\2\u08f4\u08eb\3\2\2\2\u08f4\u08ec\3\2\2\2\u08f5\u0125\3\2"+
		"\2\2\u08f6\u08f8\7\u012e\2\2\u08f7\u08f9\7\u0121\2\2\u08f8\u08f7\3\2\2"+
		"\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fb\5\u0166\u00b4\2"+
		"\u08fb\u0127\3\2\2\2\u08fc\u08fd\7\u0134\2\2\u08fd\u08fe\5\u019c\u00cf"+
		"\2\u08fe\u0129\3\2\2\2\u08ff\u0901\7\u0137\2\2\u0900\u0902\7\u016e\2\2"+
		"\u0901\u0900\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0908"+
		"\5\u019c\u00cf\2\u0904\u0905\7\u0160\2\2\u0905\u0907\5\u019c\u00cf\2\u0906"+
		"\u0904\3\2\2\2\u0907\u090a\3\2\2\2\u0908\u0906\3\2\2\2\u0908\u0909\3\2"+
		"\2\2\u0909\u090c\3\2\2\2\u090a\u0908\3\2\2\2\u090b\u090d\7\u0171\2\2\u090c"+
		"\u090b\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u0910\7\u009a"+
		"\2\2\u090f\u0911\7\u016e\2\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911"+
		"\u0912\3\2\2\2\u0912\u0917\5\u01d4\u00eb\2\u0913\u0914\7\u0160\2\2\u0914"+
		"\u0916\5\u01d4\u00eb\2\u0915\u0913\3\2\2\2\u0916\u0919\3\2\2\2\u0917\u0915"+
		"\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091b\3\2\2\2\u0919\u0917\3\2\2\2\u091a"+
		"\u091c\7\u0171\2\2\u091b\u091a\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u012b"+
		"\3\2\2\2\u091d\u091e\7\u013f\2\2\u091e\u091f\5\u018c\u00c7\2\u091f\u0920"+
		"\t\"\2\2\u0920\u0921\5\4\3\2\u0921\u0923\7e\2\2\u0922\u0924\t#\2\2\u0923"+
		"\u0922\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u012d\3\2\2\2\u0925\u0926\7v"+
		"\2\2\u0926\u0927\7\u0175\2\2\u0927\u0929\7\u008c\2\2\u0928\u092a\7\u016e"+
		"\2\2\u0929\u0928\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\3\2\2\2\u092b"+
		"\u092d\5\u0136\u009c\2\u092c\u092e\7\u0171\2\2\u092d\u092c\3\2\2\2\u092d"+
		"\u092e\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u0930\7\u00b1\2\2\u0930\u0931"+
		"\5\4\3\2\u0931\u0932\7e\2\2\u0932\u0933\7\u00b1\2\2\u0933\u012f\3\2\2"+
		"\2\u0934\u0935\7v\2\2\u0935\u0936\7\u0175\2\2\u0936\u0938\7\u008c\2\2"+
		"\u0937\u0939\7\u00f2\2\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939"+
		"\u093a\3\2\2\2\u093a\u093b\5\u019c\u00cf\2\u093b\u093c\7\u0163\2\2\u093c"+
		"\u093f\5\u019c\u00cf\2\u093d\u093e\t$\2\2\u093e\u0940\5\u019c\u00cf\2"+
		"\u093f\u093d\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0942"+
		"\7\u00b1\2\2\u0942\u0943\5\4\3\2\u0943\u0944\7e\2\2\u0944\u0945\7\u00b1"+
		"\2\2\u0945\u0131\3\2\2\2\u0946\u094d\7\u017e\2\2\u0947\u0948\7\u016a\2"+
		"\2\u0948\u0949\7\u016a\2\2\u0949\u094a\7\u0175\2\2\u094a\u094b\7\u0168"+
		"\2\2\u094b\u094d\7\u0168\2\2\u094c\u0946\3\2\2\2\u094c\u0947\3\2\2\2\u094d"+
		"\u0133\3\2\2\2\u094e\u094f\7\u0135\2\2\u094f\u0954\5\u019c\u00cf\2\u0950"+
		"\u0951\7\u0160\2\2\u0951\u0953\5\u019c\u00cf\2\u0952\u0950\3\2\2\2\u0953"+
		"\u0956\3\2\2\2\u0954\u0952\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0135\3\2"+
		"\2\2\u0956\u0954\3\2\2\2\u0957\u0959\5\u0138\u009d\2\u0958\u0957\3\2\2"+
		"\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095b\5\u013e\u00a0\2"+
		"\u095b\u0137\3\2\2\2\u095c\u095d\7\u0140\2\2\u095d\u0962\5\u013a\u009e"+
		"\2\u095e\u095f\7\u0160\2\2\u095f\u0961\5\u013a\u009e\2\u0960\u095e\3\2"+
		"\2\2\u0961\u0964\3\2\2\2\u0962\u0960\3\2\2\2\u0962\u0963\3\2\2\2\u0963"+
		"\u0139\3\2\2\2\u0964\u0962\3\2\2\2\u0965\u0967\5\u01d4\u00eb\2\u0966\u0968"+
		"\5\u013c\u009f\2\u0967\u0966\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\3"+
		"\2\2\2\u0969\u096a\7\20\2\2\u096a\u096b\7\u016e\2\2\u096b\u096c\5\u013e"+
		"\u00a0\2\u096c\u096d\7\u0171\2\2\u096d\u013b\3\2\2\2\u096e\u096f\7\u016e"+
		"\2\2\u096f\u0974\5\u01d4\u00eb\2\u0970\u0971\7\u0160\2\2\u0971\u0973\5"+
		"\u01d4\u00eb\2\u0972\u0970\3\2\2\2\u0973\u0976\3\2\2\2\u0974\u0972\3\2"+
		"\2\2\u0974\u0975\3\2\2\2\u0975\u0977\3\2\2\2\u0976\u0974\3\2\2\2\u0977"+
		"\u0978\7\u0171\2\2\u0978\u013d\3\2\2\2\u0979\u097f\5\u0140\u00a1\2\u097a"+
		"\u097b\5\u0142\u00a2\2\u097b\u097c\5\u0140\u00a1\2\u097c\u097e\3\2\2\2"+
		"\u097d\u097a\3\2\2\2\u097e\u0981\3\2\2\2\u097f\u097d\3\2\2\2\u097f\u0980"+
		"\3\2\2\2\u0980\u013f\3\2\2\2\u0981\u097f\3\2\2\2\u0982\u0988\5\u0144\u00a3"+
		"\2\u0983\u0984\7\u016e\2\2\u0984\u0985\5\u013e\u00a0\2\u0985\u0986\7\u0171"+
		"\2\2\u0986\u0988\3\2\2\2\u0987\u0982\3\2\2\2\u0987\u0983\3\2\2\2\u0988"+
		"\u0141\3\2\2\2\u0989\u098b\7\u0130\2\2\u098a\u098c\7\n\2\2\u098b\u098a"+
		"\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u0996\3\2\2\2\u098d\u098f\7h\2\2\u098e"+
		"\u0990\7\n\2\2\u098f\u098e\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0996\3\2"+
		"\2\2\u0991\u0993\7\u0098\2\2\u0992\u0994\7\n\2\2\u0993\u0992\3\2\2\2\u0993"+
		"\u0994\3\2\2\2\u0994\u0996\3\2\2\2\u0995\u0989\3\2\2\2\u0995\u098d\3\2"+
		"\2\2\u0995\u0991\3\2\2\2\u0996\u0143\3\2\2\2\u0997\u0998\t%\2\2\u0998"+
		"\u099a\5\u0146\u00a4\2\u0999\u099b\5\u0152\u00aa\2\u099a\u0999\3\2\2\2"+
		"\u099a\u099b\3\2\2\2\u099b\u099d\3\2\2\2\u099c\u099e\5\u0154\u00ab\2\u099d"+
		"\u099c\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u09a0\3\2\2\2\u099f\u09a1\5\u0168"+
		"\u00b5\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a3\3\2\2\2\u09a2"+
		"\u09a4\5\u016a\u00b6\2\u09a3\u09a2\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a7"+
		"\3\2\2\2\u09a5\u09a8\5\u016c\u00b7\2\u09a6\u09a8\5\u016e\u00b8\2\u09a7"+
		"\u09a5\3\2\2\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09aa\3\2"+
		"\2\2\u09a9\u09ab\5\u0170\u00b9\2\u09aa\u09a9\3\2\2\2\u09aa\u09ab\3\2\2"+
		"\2\u09ab\u09ad\3\2\2\2\u09ac\u09ae\5\u0172\u00ba\2\u09ad\u09ac\3\2\2\2"+
		"\u09ad\u09ae\3\2\2\2\u09ae\u0145\3\2\2\2\u09af\u09b1\5\u0148\u00a5\2\u09b0"+
		"\u09af\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b3\3\2\2\2\u09b2\u09b4\5\u014a"+
		"\u00a6\2\u09b3\u09b2\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5"+
		"\u09ba\5\u014c\u00a7\2\u09b6\u09b7\7\u0160\2\2\u09b7\u09b9\5\u014c\u00a7"+
		"\2\u09b8\u09b6\3\2\2\2\u09b9\u09bc\3\2\2\2\u09ba\u09b8\3\2\2\2\u09ba\u09bb"+
		"\3\2\2\2\u09bb\u0147\3\2\2\2\u09bc\u09ba\3\2\2\2\u09bd\u09be\t&\2\2\u09be"+
		"\u0149\3\2\2\2\u09bf\u09c0\7\u012b\2\2\u09c0\u09c1\5\u019c\u00cf\2\u09c1"+
		"\u014b\3\2\2\2\u09c2\u09c3\5\u01d4\u00eb\2\u09c3\u09c4\7\u0164\2\2\u09c4"+
		"\u09c6\3\2\2\2\u09c5\u09c2\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\3\2"+
		"\2\2\u09c7\u09c9\5\u019c\u00cf\2\u09c8\u09ca\5\u014e\u00a8\2\u09c9\u09c8"+
		"\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cd\3\2\2\2\u09cb\u09cd\5\u0150\u00a9"+
		"\2\u09cc\u09c5\3\2\2\2\u09cc\u09cb\3\2\2\2\u09cd\u014d\3\2\2\2\u09ce\u09d0"+
		"\6\u00a8\5\2\u09cf\u09d1\7\20\2\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2"+
		"\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d8\5\u01d4\u00eb\2\u09d3\u09d4\7\u016e"+
		"\2\2\u09d4\u09d5\7\u0129\2\2\u09d5\u09d6\7\u0176\2\2\u09d6\u09d8\7\u0171"+
		"\2\2\u09d7\u09ce\3\2\2\2\u09d7\u09d3\3\2\2\2\u09d8\u014f\3\2\2\2\u09d9"+
		"\u09da\7\u0175\2\2\u09da\u09dc\7\6\2\2\u09db\u09d9\3\2\2\2\u09db\u09dc"+
		"\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09de\7\u016c\2\2\u09de\u0151\3\2\2"+
		"\2\u09df\u09e0\7\u009a\2\2\u09e0\u09e5\5\u01d4\u00eb\2\u09e1\u09e2\7\u0160"+
		"\2\2\u09e2\u09e4\5\u01d4\u00eb\2\u09e3\u09e1\3\2\2\2\u09e4\u09e7\3\2\2"+
		"\2\u09e5\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u0153\3\2\2\2\u09e7\u09e5"+
		"\3\2\2\2\u09e8\u09e9\7z\2\2\u09e9\u09ed\5\u0156\u00ac\2\u09ea\u09ec\5"+
		"\u015c\u00af\2\u09eb\u09ea\3\2\2\2\u09ec\u09ef\3\2\2\2\u09ed\u09eb\3\2"+
		"\2\2\u09ed\u09ee\3\2\2\2\u09ee\u0155\3\2\2\2\u09ef\u09ed\3\2\2\2\u09f0"+
		"\u09f4\5\u0158\u00ad\2\u09f1\u09f4\5\u015a\u00ae\2\u09f2\u09f4\5\u0160"+
		"\u00b1\2\u09f3\u09f0\3\2\2\2\u09f3\u09f1\3\2\2\2\u09f3\u09f2\3\2\2\2\u09f4"+
		"\u0157\3\2\2\2\u09f5\u09f7\5\u0166\u00b4\2\u09f6\u09f8\5\u0164\u00b3\2"+
		"\u09f7\u09f6\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u0159\3\2\2\2\u09f9\u09fa"+
		"\7\u016e\2\2\u09fa\u09fb\5\u0136\u009c\2\u09fb\u09fd\7\u0171\2\2\u09fc"+
		"\u09fe\5\u0164\u00b3\2\u09fd\u09fc\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u015b"+
		"\3\2\2\2\u09ff\u0a00\7\u0160\2\2\u0a00\u0a07\5\u0156\u00ac\2\u0a01\u0a02"+
		"\5\u015e\u00b0\2\u0a02\u0a03\5\u0156\u00ac\2\u0a03\u0a04\7\u00cc\2\2\u0a04"+
		"\u0a05\5\u018c\u00c7\2\u0a05\u0a07\3\2\2\2\u0a06\u09ff\3\2\2\2\u0a06\u0a01"+
		"\3\2\2\2\u0a07\u015d\3\2\2\2\u0a08\u0a0a\7\u0090\2\2\u0a09\u0a08\3\2\2"+
		"\2\u0a09\u0a0a\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a12\7\u009f\2\2\u0a0c"+
		"\u0a0e\t\'\2\2\u0a0d\u0a0f\7\u00d2\2\2\u0a0e\u0a0d\3\2\2\2\u0a0e\u0a0f"+
		"\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a12\7\u009f\2\2\u0a11\u0a09\3\2\2"+
		"\2\u0a11\u0a0c\3\2\2\2\u0a12\u015f\3\2\2\2\u0a13\u0a14\7\u0121\2\2\u0a14"+
		"\u0a15\7\u016e\2\2\u0a15\u0a16\7\u0137\2\2\u0a16\u0a1b\5\u0162\u00b2\2"+
		"\u0a17\u0a18\7\u0160\2\2\u0a18\u0a1a\5\u0162\u00b2\2\u0a19\u0a17\3\2\2"+
		"\2\u0a1a\u0a1d\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1e"+
		"\3\2\2\2\u0a1d\u0a1b\3\2\2\2\u0a1e\u0a20\7\u0171\2\2\u0a1f\u0a21\5\u0164"+
		"\u00b3\2\u0a20\u0a1f\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0161\3\2\2\2\u0a22"+
		"\u0a2f\5\u019c\u00cf\2\u0a23\u0a24\7\u016e\2\2\u0a24\u0a29\5\u019c\u00cf"+
		"\2\u0a25\u0a26\7\u0160\2\2\u0a26\u0a28\5\u019c\u00cf\2\u0a27\u0a25\3\2"+
		"\2\2\u0a28\u0a2b\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a"+
		"\u0a2c\3\2\2\2\u0a2b\u0a29\3\2\2\2\u0a2c\u0a2d\7\u0171\2\2\u0a2d\u0a2f"+
		"\3\2\2\2\u0a2e\u0a22\3\2\2\2\u0a2e\u0a23\3\2\2\2\u0a2f\u0163\3\2\2\2\u0a30"+
		"\u0a32\6\u00b3\6\2\u0a31\u0a33\7\20\2\2\u0a32\u0a31\3\2\2\2\u0a32\u0a33"+
		"\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a3f\5\u01d4\u00eb\2\u0a35\u0a36\7"+
		"\u016e\2\2\u0a36\u0a3b\7\u0175\2\2\u0a37\u0a38\7\u0160\2\2\u0a38\u0a3a"+
		"\7\u0175\2\2\u0a39\u0a37\3\2\2\2\u0a3a\u0a3d\3\2\2\2\u0a3b\u0a39\3\2\2"+
		"\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3e\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3e\u0a40"+
		"\7\u0171\2\2\u0a3f\u0a35\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0165\3\2\2"+
		"\2\u0a41\u0a42\5\u01d4\u00eb\2\u0a42\u0167\3\2\2\2\u0a43\u0a44\7\u013e"+
		"\2\2\u0a44\u0a45\5\u018c\u00c7\2\u0a45\u0169\3\2\2\2\u0a46\u0a47\7\u0081"+
		"\2\2\u0a47\u0a48\7 \2\2\u0a48\u0a4d\5\u019c\u00cf\2\u0a49\u0a4a\7\u0160"+
		"\2\2\u0a4a\u0a4c\5\u019c\u00cf\2\u0a4b\u0a49\3\2\2\2\u0a4c\u0a4f\3\2\2"+
		"\2\u0a4d\u0a4b\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u016b\3\2\2\2\u0a4f\u0a4d"+
		"\3\2\2\2\u0a50\u0a51\7\u0084\2\2\u0a51\u0a52\5\u018c\u00c7\2\u0a52\u016d"+
		"\3\2\2\2\u0a53\u0a54\7\u00e3\2\2\u0a54\u0a55\5\u018c\u00c7\2\u0a55\u016f"+
		"\3\2\2\2\u0a56\u0a57\7\u00d0\2\2\u0a57\u0a58\7 \2\2\u0a58\u0a5a\5\u019c"+
		"\u00cf\2\u0a59\u0a5b\t\t\2\2\u0a5a\u0a59\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b"+
		"\u0a63\3\2\2\2\u0a5c\u0a5d\7\u0160\2\2\u0a5d\u0a5f\5\u019c\u00cf\2\u0a5e"+
		"\u0a60\t\t\2\2\u0a5f\u0a5e\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60\u0a62\3\2"+
		"\2\2\u0a61\u0a5c\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a63"+
		"\u0a64\3\2\2\2\u0a64\u0171\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a66\u0a68\5\u0174"+
		"\u00bb\2\u0a67\u0a66\3\2\2\2\u0a68\u0a69\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a69"+
		"\u0a6a\3\2\2\2\u0a6a\u0173\3\2\2\2\u0a6b\u0a6c\7\u00a7\2\2\u0a6c\u0a77"+
		"\5\u019c\u00cf\2\u0a6d\u0a6e\7\u0140\2\2\u0a6e\u0a74\t(\2\2\u0a6f\u0a70"+
		"\7\u0134\2\2\u0a70\u0a71\7\r\2\2\u0a71\u0a72\7\u00a0\2\2\u0a72\u0a73\t"+
		")\2\2\u0a73\u0a75\7\u00ad\2\2\u0a74\u0a6f\3\2\2\2\u0a74\u0a75\3\2\2\2"+
		"\u0a75\u0a77\3\2\2\2\u0a76\u0a6b\3\2\2\2\u0a76\u0a6d\3\2\2\2\u0a77\u0175"+
		"\3\2\2\2\u0a78\u0a79\7\u0132\2\2\u0a79\u0a7a\5\u017a\u00be\2\u0a7a\u0a7b"+
		"\7\u0106\2\2\u0a7b\u0a7d\5\u0178\u00bd\2\u0a7c\u0a7e\5\u0168\u00b5\2\u0a7d"+
		"\u0a7c\3\2\2\2\u0a7d\u0a7e\3\2\2\2\u0a7e\u0a80\3\2\2\2\u0a7f\u0a81\5\u017c"+
		"\u00bf\2\u0a80\u0a7f\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81\u0177\3\2\2\2\u0a82"+
		"\u0a87\5\34\17\2\u0a83\u0a84\7\u0160\2\2\u0a84\u0a86\5\34\17\2\u0a85\u0a83"+
		"\3\2\2\2\u0a86\u0a89\3\2\2\2\u0a87\u0a85\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88"+
		"\u0179\3\2\2\2\u0a89\u0a87\3\2\2\2\u0a8a\u0a8c\5\u0166\u00b4\2\u0a8b\u0a8d"+
		"\5\u0154\u00ab\2\u0a8c\u0a8b\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a93\3"+
		"\2\2\2\u0a8e\u0a8f\7\u016e\2\2\u0a8f\u0a90\5\u0136\u009c\2\u0a90\u0a91"+
		"\7\u0171\2\2\u0a91\u0a93\3\2\2\2\u0a92\u0a8a\3\2\2\2\u0a92\u0a8e\3\2\2"+
		"\2\u0a93\u0a98\3\2\2\2\u0a94\u0a96\7\20\2\2\u0a95\u0a94\3\2\2\2\u0a95"+
		"\u0a96\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a99\5\u01d4\u00eb\2\u0a98\u0a95"+
		"\3\2\2\2\u0a98\u0a99\3\2\2\2\u0a99\u017b\3\2\2\2\u0a9a\u0a9b\7a\2\2\u0a9b"+
		"\u0a9c\5\u00ceh\2\u0a9c\u017d\3\2\2\2\u0a9d\u0a9e\7\u00b6\2\2\u0a9e\u0a9f"+
		"\7\u009a\2\2\u0a9f\u0aa0\5\u0180\u00c1\2\u0aa0\u0aa1\7\u0135\2\2\u0aa1"+
		"\u0aa2\5\u0180\u00c1\2\u0aa2\u0aa3\7\u00cc\2\2\u0aa3\u0aa5\5\u018c\u00c7"+
		"\2\u0aa4\u0aa6\5\u0182\u00c2\2\u0aa5\u0aa4\3\2\2\2\u0aa6\u0aa7\3\2\2\2"+
		"\u0aa7\u0aa5\3\2\2\2\u0aa7\u0aa8\3\2\2\2\u0aa8\u017f\3\2\2\2\u0aa9\u0aaf"+
		"\5\u0166\u00b4\2\u0aaa\u0aab\7\u016e\2\2\u0aab\u0aac\5\u0136\u009c\2\u0aac"+
		"\u0aad\7\u0171\2\2\u0aad\u0aaf\3\2\2\2\u0aae\u0aa9\3\2\2\2\u0aae\u0aaa"+
		"\3\2\2\2\u0aaf\u0ab4\3\2\2\2\u0ab0\u0ab2\7\20\2\2\u0ab1\u0ab0\3\2\2\2"+
		"\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab5\5\u01d4\u00eb\2\u0ab4"+
		"\u0ab1\3\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5\u0181\3\2\2\2\u0ab6\u0ab8\7\u013d"+
		"\2\2\u0ab7\u0ab9\7\u00c5\2\2\u0ab8\u0ab7\3\2\2\2\u0ab8\u0ab9\3\2\2\2\u0ab9"+
		"\u0aba\3\2\2\2\u0aba\u0abd\7\u00b3\2\2\u0abb\u0abc\7\r\2\2\u0abc\u0abe"+
		"\5\u018c\u00c7\2\u0abd\u0abb\3\2\2\2\u0abd\u0abe\3\2\2\2\u0abe\u0abf\3"+
		"\2\2\2\u0abf\u0ac0\7\u0126\2\2\u0ac0\u0ac4\5\u0184\u00c3\2\u0ac1\u0ac2"+
		"\7a\2\2\u0ac2\u0ac4\7\u008a\2\2\u0ac3\u0ab6\3\2\2\2\u0ac3\u0ac1\3\2\2"+
		"\2\u0ac4\u0183\3\2\2\2\u0ac5\u0ac7\7\u0092\2\2\u0ac6\u0ac8\5\u00d0i\2"+
		"\u0ac7\u0ac6\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0aca"+
		"\7\u0137\2\2\u0aca\u0ada\5\u00d4k\2\u0acb\u0acc\7\u0132\2\2\u0acc\u0acd"+
		"\7\u0106\2\2\u0acd\u0ad2\5\34\17\2\u0ace\u0acf\7\u0160\2\2\u0acf\u0ad1"+
		"\5\34\17\2\u0ad0\u0ace\3\2\2\2\u0ad1\u0ad4\3\2\2\2\u0ad2\u0ad0\3\2\2\2"+
		"\u0ad2\u0ad3\3\2\2\2\u0ad3\u0ad6\3\2\2\2\u0ad4\u0ad2\3\2\2\2\u0ad5\u0ad7"+
		"\5\u0168\u00b5\2\u0ad6\u0ad5\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ada\3"+
		"\2\2\2\u0ad8\u0ada\7S\2\2\u0ad9\u0ac5\3\2\2\2\u0ad9\u0acb\3\2\2\2\u0ad9"+
		"\u0ad8\3\2\2\2\u0ada\u0185\3\2\2\2\u0adb\u0add\7S\2\2\u0adc\u0ade\7z\2"+
		"\2\u0add\u0adc\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0ae1"+
		"\5\u0166\u00b4\2\u0ae0\u0ae2\5\u0188\u00c5\2\u0ae1\u0ae0\3\2\2\2\u0ae1"+
		"\u0ae2\3\2\2\2\u0ae2\u0ae5\3\2\2\2\u0ae3\u0ae6\5\u0168\u00b5\2\u0ae4\u0ae6"+
		"\7\n\2\2\u0ae5\u0ae3\3\2\2\2\u0ae5\u0ae4\3\2\2\2\u0ae5\u0ae6\3\2\2\2\u0ae6"+
		"\u0187\3\2\2\2\u0ae7\u0ae9\6\u00c5\7\2\u0ae8\u0aea\7\20\2\2\u0ae9\u0ae8"+
		"\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u0aec\5\u01d4\u00eb"+
		"\2\u0aec\u0189\3\2\2\2\u0aed\u0aef\t*\2\2\u0aee\u0af0\7\u0121\2\2\u0aef"+
		"\u0aee\3\2\2\2\u0aef\u0af0\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1\u0af2\5\u0166"+
		"\u00b4\2\u0af2\u018b\3\2\2\2\u0af3\u0af5\b\u00c7\1\2\u0af4\u0af6\7\u00c5"+
		"\2\2\u0af5\u0af4\3\2\2\2\u0af5\u0af6\3\2\2\2\u0af6\u0af7\3\2\2\2\u0af7"+
		"\u0af8\7\u016e\2\2\u0af8\u0af9\5\u018c\u00c7\2\u0af9\u0afa\7\u0171\2\2"+
		"\u0afa\u0afd\3\2\2\2\u0afb\u0afd\5\u018e\u00c8\2\u0afc\u0af3\3\2\2\2\u0afc"+
		"\u0afb\3\2\2\2\u0afd\u0b04\3\2\2\2\u0afe\u0aff\f\4\2\2\u0aff\u0b00\5\u0198"+
		"\u00cd\2\u0b00\u0b01\5\u018c\u00c7\5\u0b01\u0b03\3\2\2\2\u0b02\u0afe\3"+
		"\2\2\2\u0b03\u0b06\3\2\2\2\u0b04\u0b02\3\2\2\2\u0b04\u0b05\3\2\2\2\u0b05"+
		"\u018d\3\2\2\2\u0b06\u0b04\3\2\2\2\u0b07\u0b0b\5\u0190\u00c9\2\u0b08\u0b0b"+
		"\5\u0196\u00cc\2\u0b09\u0b0b\5\u019c\u00cf\2\u0b0a\u0b07\3\2\2\2\u0b0a"+
		"\u0b08\3\2\2\2\u0b0a\u0b09\3\2\2\2\u0b0b\u018f\3\2\2\2\u0b0c\u0b0d\5\u019c"+
		"\u00cf\2\u0b0d\u0b0f\7\u009c\2\2\u0b0e\u0b10\7\u00c5\2\2\u0b0f\u0b0e\3"+
		"\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10\u0b11\3\2\2\2\u0b11\u0b12\7\u00c7\2\2"+
		"\u0b12\u0b24\3\2\2\2\u0b13\u0b14\5\u019c\u00cf\2\u0b14\u0b15\7\30\2\2"+
		"\u0b15\u0b16\5\u019c\u00cf\2\u0b16\u0b17\7\r\2\2\u0b17\u0b18\5\u019c\u00cf"+
		"\2\u0b18\u0b24\3\2\2\2\u0b19\u0b1b\7\u00c5\2\2\u0b1a\u0b19\3\2\2\2\u0b1a"+
		"\u0b1b\3\2\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c\u0b1d\7m\2\2\u0b1d\u0b1e\7\u016e"+
		"\2\2\u0b1e\u0b1f\5\u0136\u009c\2\u0b1f\u0b20\7\u0171\2\2\u0b20\u0b24\3"+
		"\2\2\2\u0b21\u0b24\5\u0192\u00ca\2\u0b22\u0b24\5\u0194\u00cb\2\u0b23\u0b0c"+
		"\3\2\2\2\u0b23\u0b13\3\2\2\2\u0b23\u0b1a\3\2\2\2\u0b23\u0b21\3\2\2\2\u0b23"+
		"\u0b22\3\2\2\2\u0b24\u0191\3\2\2\2\u0b25\u0b27\5\u019c\u00cf\2\u0b26\u0b28"+
		"\7\u00c5\2\2\u0b27\u0b26\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b29\3\2\2"+
		"\2\u0b29\u0b2a\7\u008c\2\2\u0b2a\u0b34\7\u016e\2\2\u0b2b\u0b30\5\u019c"+
		"\u00cf\2\u0b2c\u0b2d\7\u0160\2\2\u0b2d\u0b2f\5\u019c\u00cf\2\u0b2e\u0b2c"+
		"\3\2\2\2\u0b2f\u0b32\3\2\2\2\u0b30\u0b2e\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31"+
		"\u0b35\3\2\2\2\u0b32\u0b30\3\2\2\2\u0b33\u0b35\5\u0136\u009c\2\u0b34\u0b2b"+
		"\3\2\2\2\u0b34\u0b33\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b37\7\u0171\2"+
		"\2\u0b37\u0193\3\2\2\2\u0b38\u0b39\7\u016e\2\2\u0b39\u0b3e\5\u019c\u00cf"+
		"\2\u0b3a\u0b3b\7\u0160\2\2\u0b3b\u0b3d\5\u019c\u00cf\2\u0b3c\u0b3a\3\2"+
		"\2\2\u0b3d\u0b40\3\2\2\2\u0b3e\u0b3c\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f"+
		"\u0b41\3\2\2\2\u0b40\u0b3e\3\2\2\2\u0b41\u0b43\7\u0171\2\2\u0b42\u0b44"+
		"\7\u00c5\2\2\u0b43\u0b42\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b45\3\2\2"+
		"\2\u0b45\u0b46\7\u008c\2\2\u0b46\u0b47\7\u016e\2\2\u0b47\u0b48\5\u0136"+
		"\u009c\2\u0b48\u0b49\7\u0171\2\2\u0b49\u0195\3\2\2\2\u0b4a\u0b4b\5\u019c"+
		"\u00cf\2\u0b4b\u0b4c\5\u019a\u00ce\2\u0b4c\u0b4d\5\u019c\u00cf\2\u0b4d"+
		"\u0197\3\2\2\2\u0b4e\u0b4f\t+\2\2\u0b4f\u0199\3\2\2\2\u0b50\u0b5d\7\u0164"+
		"\2\2\u0b51\u0b5d\7\u0165\2\2\u0b52\u0b5d\7\u0166\2\2\u0b53\u0b5d\7\u0167"+
		"\2\2\u0b54\u0b5d\7\u016a\2\2\u0b55\u0b5d\7\u016b\2\2\u0b56\u0b5d\7\u0168"+
		"\2\2\u0b57\u0b5d\7\u0169\2\2\u0b58\u0b5a\7\u00c5\2\2\u0b59\u0b58\3\2\2"+
		"\2\u0b59\u0b5a\3\2\2\2\u0b5a\u0b5b\3\2\2\2\u0b5b\u0b5d\t,\2\2\u0b5c\u0b50"+
		"\3\2\2\2\u0b5c\u0b51\3\2\2\2\u0b5c\u0b52\3\2\2\2\u0b5c\u0b53\3\2\2\2\u0b5c"+
		"\u0b54\3\2\2\2\u0b5c\u0b55\3\2\2\2\u0b5c\u0b56\3\2\2\2\u0b5c\u0b57\3\2"+
		"\2\2\u0b5c\u0b59\3\2\2\2\u0b5d\u019b\3\2\2\2\u0b5e\u0b5f\b\u00cf\1\2\u0b5f"+
		"\u0b60\7\u016e\2\2\u0b60\u0b61\5\u0136\u009c\2\u0b61\u0b62\7\u0171\2\2"+
		"\u0b62\u0b70\3\2\2\2\u0b63\u0b64\7\u016e\2\2\u0b64\u0b65\5\u019c\u00cf"+
		"\2\u0b65\u0b66\7\u0171\2\2\u0b66\u0b70\3\2\2\2\u0b67\u0b70\5\u01a0\u00d1"+
		"\2\u0b68\u0b70\5\u01a4\u00d3\2\u0b69\u0b70\5\u01a8\u00d5\2\u0b6a\u0b70"+
		"\5\u01ae\u00d8\2\u0b6b\u0b70\5\u01b0\u00d9\2\u0b6c\u0b70\5\u01b8\u00dd"+
		"\2\u0b6d\u0b70\5\u01ba\u00de\2\u0b6e\u0b70\5\u019e\u00d0\2\u0b6f\u0b5e"+
		"\3\2\2\2\u0b6f\u0b63\3\2\2\2\u0b6f\u0b67\3\2\2\2\u0b6f\u0b68\3\2\2\2\u0b6f"+
		"\u0b69\3\2\2\2\u0b6f\u0b6a\3\2\2\2\u0b6f\u0b6b\3\2\2\2\u0b6f\u0b6c\3\2"+
		"\2\2\u0b6f\u0b6d\3\2\2\2\u0b6f\u0b6e\3\2\2\2\u0b70\u0b81\3\2\2\2\u0b71"+
		"\u0b72\f\20\2\2\u0b72\u0b73\7\u016c\2\2\u0b73\u0b80\5\u019c\u00cf\21\u0b74"+
		"\u0b75\f\17\2\2\u0b75\u0b76\7\u0162\2\2\u0b76\u0b80\5\u019c\u00cf\20\u0b77"+
		"\u0b78\f\16\2\2\u0b78\u0b79\7\u015e\2\2\u0b79\u0b80\5\u019c\u00cf\17\u0b7a"+
		"\u0b7b\f\r\2\2\u0b7b\u0b7c\7\u0174\2\2\u0b7c\u0b80\5\u019c\u00cf\16\u0b7d"+
		"\u0b7e\f\21\2\2\u0b7e\u0b80\5\u01a2\u00d2\2\u0b7f\u0b71\3\2\2\2\u0b7f"+
		"\u0b74\3\2\2\2\u0b7f\u0b77\3\2\2\2\u0b7f\u0b7a\3\2\2\2\u0b7f\u0b7d\3\2"+
		"\2\2\u0b80\u0b83\3\2\2\2\u0b81\u0b7f\3\2\2\2\u0b81\u0b82\3\2\2\2\u0b82"+
		"\u019d\3\2\2\2\u0b83\u0b81\3\2\2\2\u0b84\u0b8d\5\u01d0\u00e9\2\u0b85\u0b8d"+
		"\5\u01d2\u00ea\2\u0b86\u0b8d\5\u01dc\u00ef\2\u0b87\u0b8d\5\u01d4\u00eb"+
		"\2\u0b88\u0b8d\5\u01d6\u00ec\2\u0b89\u0b8d\5\u01da\u00ee\2\u0b8a\u0b8d"+
		"\5\u01d8\u00ed\2\u0b8b\u0b8d\5\u01de\u00f0\2\u0b8c\u0b84\3\2\2\2\u0b8c"+
		"\u0b85\3\2\2\2\u0b8c\u0b86\3\2\2\2\u0b8c\u0b87\3\2\2\2\u0b8c\u0b88\3\2"+
		"\2\2\u0b8c\u0b89\3\2\2\2\u0b8c\u0b8a\3\2\2\2\u0b8c\u0b8b\3\2\2\2\u0b8d"+
		"\u019f\3\2\2\2\u0b8e\u0b8f\7\u0099\2\2\u0b8f\u0b90\5\u019c\u00cf\2\u0b90"+
		"\u0b91\5\u01a2\u00d2\2\u0b91\u01a1\3\2\2\2\u0b92\u0b93\t-\2\2\u0b93\u01a3"+
		"\3\2\2\2\u0b94\u0b95\5\u01a6\u00d4\2\u0b95\u0b96\t.\2\2\u0b96\u0b9b\5"+
		"\u01a6\u00d4\2\u0b97\u0b98\t.\2\2\u0b98\u0b9a\5\u01a6\u00d4\2\u0b99\u0b97"+
		"\3\2\2\2\u0b9a\u0b9d\3\2\2\2\u0b9b\u0b99\3\2\2\2\u0b9b\u0b9c\3\2\2\2\u0b9c"+
		"\u01a5\3\2\2\2\u0b9d\u0b9b\3\2\2\2\u0b9e\u0b9f\7\u016e\2\2\u0b9f\u0ba0"+
		"\5\u019c\u00cf\2\u0ba0\u0ba1\7\u0171\2\2\u0ba1\u0ba8\3\2\2\2\u0ba2\u0ba8"+
		"\5\u01a8\u00d5\2\u0ba3\u0ba8\5\u01b0\u00d9\2\u0ba4\u0ba8\5\u01b8\u00dd"+
		"\2\u0ba5\u0ba8\5\u01ba\u00de\2\u0ba6\u0ba8\5\u019e\u00d0\2\u0ba7\u0b9e"+
		"\3\2\2\2\u0ba7\u0ba2\3\2\2\2\u0ba7\u0ba3\3\2\2\2\u0ba7\u0ba4\3\2\2\2\u0ba7"+
		"\u0ba5\3\2\2\2\u0ba7\u0ba6\3\2\2\2\u0ba8\u01a7\3\2\2\2\u0ba9\u0bac\5\u01aa"+
		"\u00d6\2\u0baa\u0bac\5\u01ac\u00d7\2\u0bab\u0ba9\3\2\2\2\u0bab\u0baa\3"+
		"\2\2\2\u0bac\u01a9\3\2\2\2\u0bad\u0bae\7%\2\2\u0bae\u0bb4\5\u019c\u00cf"+
		"\2\u0baf\u0bb0\7\u013d\2\2\u0bb0\u0bb1\5\u019c\u00cf\2\u0bb1\u0bb2\7\u0126"+
		"\2\2\u0bb2\u0bb3\5\u019c\u00cf\2\u0bb3\u0bb5\3\2\2\2\u0bb4\u0baf\3\2\2"+
		"\2\u0bb5\u0bb6\3\2\2\2\u0bb6\u0bb4\3\2\2\2\u0bb6\u0bb7\3\2\2\2\u0bb7\u0bba"+
		"\3\2\2\2\u0bb8\u0bb9\7a\2\2\u0bb9\u0bbb\5\u019c\u00cf\2\u0bba\u0bb8\3"+
		"\2\2\2\u0bba\u0bbb\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u0bbd\7e\2\2\u0bbd"+
		"\u01ab\3\2\2\2\u0bbe\u0bc4\7%\2\2\u0bbf\u0bc0\7\u013d\2\2\u0bc0\u0bc1"+
		"\5\u018c\u00c7\2\u0bc1\u0bc2\7\u0126\2\2\u0bc2\u0bc3\5\u019c\u00cf\2\u0bc3"+
		"\u0bc5\3\2\2\2\u0bc4\u0bbf\3\2\2\2\u0bc5\u0bc6\3\2\2\2\u0bc6\u0bc4\3\2"+
		"\2\2\u0bc6\u0bc7\3\2\2\2\u0bc7\u0bca\3\2\2\2\u0bc8\u0bc9\7a\2\2\u0bc9"+
		"\u0bcb\5\u019c\u00cf\2\u0bca\u0bc8\3\2\2\2\u0bca\u0bcb\3\2\2\2\u0bcb\u0bcc"+
		"\3\2\2\2\u0bcc\u0bcd\7e\2\2\u0bcd\u01ad\3\2\2\2\u0bce\u0bcf\5\u01d4\u00eb"+
		"\2\u0bcf\u0bd0\7\5\2\2\u0bd0\u0bd1\t/\2\2\u0bd1\u01af\3\2\2\2\u0bd2\u0bd3"+
		"\7\25\2\2\u0bd3\u0bd5\7\u016e\2\2\u0bd4\u0bd6\5\u01b2\u00da\2\u0bd5\u0bd4"+
		"\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u0bd7\3\2\2\2\u0bd7\u0bd8\5\u019c\u00cf"+
		"\2\u0bd8\u0bda\7\u0171\2\2\u0bd9\u0bdb\5\u01b4\u00db\2\u0bda\u0bd9\3\2"+
		"\2\2\u0bda\u0bdb\3\2\2\2\u0bdb\u0c6b\3\2\2\2\u0bdc\u0bdd\7<\2\2\u0bdd"+
		"\u0be3\7\u016e\2\2\u0bde\u0be0\5\u01b2\u00da\2\u0bdf\u0bde\3\2\2\2\u0bdf"+
		"\u0be0\3\2\2\2\u0be0\u0be1\3\2\2\2\u0be1\u0be4\5\u019c\u00cf\2\u0be2\u0be4"+
		"\7\u016c\2\2\u0be3\u0bdf\3\2\2\2\u0be3\u0be2\3\2\2\2\u0be4\u0be5\3\2\2"+
		"\2\u0be5\u0be7\7\u0171\2\2\u0be6\u0be8\5\u01b4\u00db\2\u0be7\u0be6\3\2"+
		"\2\2\u0be7\u0be8\3\2\2\2\u0be8\u0c6b\3\2\2\2\u0be9\u0bea\7=\2\2\u0bea"+
		"\u0bf0\7\u016e\2\2\u0beb\u0bed\5\u01b2\u00da\2\u0bec\u0beb\3\2\2\2\u0bec"+
		"\u0bed\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0bf1\5\u019c\u00cf\2\u0bef\u0bf1"+
		"\7\u016c\2\2\u0bf0\u0bec\3\2\2\2\u0bf0\u0bef\3\2\2\2\u0bf1\u0bf2\3\2\2"+
		"\2\u0bf2\u0bf4\7\u0171\2\2\u0bf3\u0bf5\5\u01b4\u00db\2\u0bf4\u0bf3\3\2"+
		"\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0c6b\3\2\2\2\u0bf6\u0bf7\7\u0147\2\2\u0bf7"+
		"\u0bf8\7\u016e\2\2\u0bf8\u0bf9\7\u0171\2\2\u0bf9\u0c6b\5\u01b4\u00db\2"+
		"\u0bfa\u0bfb\7\u014b\2\2\u0bfb\u0bfc\7\u016e\2\2\u0bfc\u0bfd\7\u0171\2"+
		"\2\u0bfd\u0c6b\5\u01b4\u00db\2\u0bfe\u0bff\7\u014c\2\2\u0bff\u0c00\7\u016e"+
		"\2\2\u0c00\u0c01\5\u019c\u00cf\2\u0c01\u0c02\7\u0171\2\2\u0c02\u0c03\5"+
		"\u01b4\u00db\2\u0c03\u0c6b\3\2\2\2\u0c04\u0c05\7\u014d\2\2\u0c05\u0c06"+
		"\7\u016e\2\2\u0c06\u0c0d\5\u019c\u00cf\2\u0c07\u0c08\7\u0160\2\2\u0c08"+
		"\u0c0b\5\u019c\u00cf\2\u0c09\u0c0a\7\u0160\2\2\u0c0a\u0c0c\5\u019c\u00cf"+
		"\2\u0c0b\u0c09\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0c0e\3\2\2\2\u0c0d\u0c07"+
		"\3\2\2\2\u0c0d\u0c0e\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f\u0c10\7\u0171\2"+
		"\2\u0c10\u0c11\5\u01b4\u00db\2\u0c11\u0c6b\3\2\2\2\u0c12\u0c13\7\u014e"+
		"\2\2\u0c13\u0c14\7\u016e\2\2\u0c14\u0c15\5\u019c\u00cf\2\u0c15\u0c16\7"+
		"\u0171\2\2\u0c16\u0c17\5\u01b4\u00db\2\u0c17\u0c6b\3\2\2\2\u0c18\u0c19"+
		"\7\u014f\2\2\u0c19\u0c1a\7\u016e\2\2\u0c1a\u0c21\5\u019c\u00cf\2\u0c1b"+
		"\u0c1c\7\u0160\2\2\u0c1c\u0c1f\5\u019c\u00cf\2\u0c1d\u0c1e\7\u0160\2\2"+
		"\u0c1e\u0c20\5\u019c\u00cf\2\u0c1f\u0c1d\3\2\2\2\u0c1f\u0c20\3\2\2\2\u0c20"+
		"\u0c22\3\2\2\2\u0c21\u0c1b\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22\u0c23\3\2"+
		"\2\2\u0c23\u0c24\7\u0171\2\2\u0c24\u0c25\5\u01b4\u00db\2\u0c25\u0c6b\3"+
		"\2\2\2\u0c26\u0c27\7\u00b4\2\2\u0c27\u0c29\7\u016e\2\2\u0c28\u0c2a\5\u01b2"+
		"\u00da\2\u0c29\u0c28\3\2\2\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0c2b\3\2\2\2\u0c2b"+
		"\u0c2c\5\u019c\u00cf\2\u0c2c\u0c2e\7\u0171\2\2\u0c2d\u0c2f\5\u01b4\u00db"+
		"\2\u0c2e\u0c2d\3\2\2\2\u0c2e\u0c2f\3\2\2\2\u0c2f\u0c6b\3\2\2\2\u0c30\u0c31"+
		"\7\u00ba\2\2\u0c31\u0c33\7\u016e\2\2\u0c32\u0c34\5\u01b2\u00da\2\u0c33"+
		"\u0c32\3\2\2\2\u0c33\u0c34\3\2\2\2\u0c34\u0c35\3\2\2\2\u0c35\u0c36\5\u019c"+
		"\u00cf\2\u0c36\u0c38\7\u0171\2\2\u0c37\u0c39\5\u01b4\u00db\2\u0c38\u0c37"+
		"\3\2\2\2\u0c38\u0c39\3\2\2\2\u0c39\u0c6b\3\2\2\2\u0c3a\u0c3b\7\u0158\2"+
		"\2\u0c3b\u0c3c\7\u016e\2\2\u0c3c\u0c3d\7\u0171\2\2\u0c3d\u0c6b\5\u01b4"+
		"\u00db\2\u0c3e\u0c3f\7\u0159\2\2\u0c3f\u0c40\7\u016e\2\2\u0c40\u0c41\7"+
		"\u0171\2\2\u0c41\u0c6b\5\u01b4\u00db\2\u0c42\u0c43\7\u015a\2\2\u0c43\u0c45"+
		"\7\u016e\2\2\u0c44\u0c46\5\u01b2\u00da\2\u0c45\u0c44\3\2\2\2\u0c45\u0c46"+
		"\3\2\2\2\u0c46\u0c47\3\2\2\2\u0c47\u0c48\5\u019c\u00cf\2\u0c48\u0c4a\7"+
		"\u0171\2\2\u0c49\u0c4b\5\u01b4\u00db\2\u0c4a\u0c49\3\2\2\2\u0c4a\u0c4b"+
		"\3\2\2\2\u0c4b\u0c6b\3\2\2\2\u0c4c\u0c4d\7\u011e\2\2\u0c4d\u0c4f\7\u016e"+
		"\2\2\u0c4e\u0c50\5\u01b2\u00da\2\u0c4f\u0c4e\3\2\2\2\u0c4f\u0c50\3\2\2"+
		"\2\u0c50\u0c51\3\2\2\2\u0c51\u0c52\5\u019c\u00cf\2\u0c52\u0c54\7\u0171"+
		"\2\2\u0c53\u0c55\5\u01b4\u00db\2\u0c54\u0c53\3\2\2\2\u0c54\u0c55\3\2\2"+
		"\2\u0c55\u0c6b\3\2\2\2\u0c56\u0c57\7\u0138\2\2\u0c57\u0c59\7\u016e\2\2"+
		"\u0c58\u0c5a\5\u01b2\u00da\2\u0c59\u0c58\3\2\2\2\u0c59\u0c5a\3\2\2\2\u0c5a"+
		"\u0c5b\3\2\2\2\u0c5b\u0c5c\5\u019c\u00cf\2\u0c5c\u0c5e\7\u0171\2\2\u0c5d"+
		"\u0c5f\5\u01b4\u00db\2\u0c5e\u0c5d\3\2\2\2\u0c5e\u0c5f\3\2\2\2\u0c5f\u0c6b"+
		"\3\2\2\2\u0c60\u0c61\7\u015c\2\2\u0c61\u0c63\7\u016e\2\2\u0c62\u0c64\5"+
		"\u01b2\u00da\2\u0c63\u0c62\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64\u0c65\3\2"+
		"\2\2\u0c65\u0c66\5\u019c\u00cf\2\u0c66\u0c68\7\u0171\2\2\u0c67\u0c69\5"+
		"\u01b4\u00db\2\u0c68\u0c67\3\2\2\2\u0c68\u0c69\3\2\2\2\u0c69\u0c6b\3\2"+
		"\2\2\u0c6a\u0bd2\3\2\2\2\u0c6a\u0bdc\3\2\2\2\u0c6a\u0be9\3\2\2\2\u0c6a"+
		"\u0bf6\3\2\2\2\u0c6a\u0bfa\3\2\2\2\u0c6a\u0bfe\3\2\2\2\u0c6a\u0c04\3\2"+
		"\2\2\u0c6a\u0c12\3\2\2\2\u0c6a\u0c18\3\2\2\2\u0c6a\u0c26\3\2\2\2\u0c6a"+
		"\u0c30\3\2\2\2\u0c6a\u0c3a\3\2\2\2\u0c6a\u0c3e\3\2\2\2\u0c6a\u0c42\3\2"+
		"\2\2\u0c6a\u0c4c\3\2\2\2\u0c6a\u0c56\3\2\2\2\u0c6a\u0c60\3\2\2\2\u0c6b"+
		"\u01b1\3\2\2\2\u0c6c\u0c6d\t&\2\2\u0c6d\u01b3\3\2\2\2\u0c6e\u0c6f\7\u00d3"+
		"\2\2\u0c6f\u0c71\7\u016e\2\2\u0c70\u0c72\5\u01b6\u00dc\2\u0c71\u0c70\3"+
		"\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u0c74\3\2\2\2\u0c73\u0c75\5\u0170\u00b9"+
		"\2\u0c74\u0c73\3\2\2\2\u0c74\u0c75\3\2\2\2\u0c75\u0c76\3\2\2\2\u0c76\u0c77"+
		"\7\u0171\2\2\u0c77\u01b5\3\2\2\2\u0c78\u0c79\7\u00d7\2\2\u0c79\u0c7a\7"+
		" \2\2\u0c7a\u0c7f\5\u019c\u00cf\2\u0c7b\u0c7c\7\u0160\2\2\u0c7c\u0c7e"+
		"\5\u019c\u00cf\2\u0c7d\u0c7b\3\2\2\2\u0c7e\u0c81\3\2\2\2\u0c7f\u0c7d\3"+
		"\2\2\2\u0c7f\u0c80\3\2\2\2\u0c80\u01b7\3\2\2\2\u0c81\u0c7f\3\2\2\2\u0c82"+
		"\u0d4b\7\u0146\2\2\u0c83\u0c84\7\'\2\2\u0c84\u0c85\7\u016e\2\2\u0c85\u0c86"+
		"\5\u019c\u00cf\2\u0c86\u0c87\7\20\2\2\u0c87\u0c89\5\u0094K\2\u0c88\u0c8a"+
		"\5\u0096L\2\u0c89\u0c88\3\2\2\2\u0c89\u0c8a\3\2\2\2\u0c8a\u0c8b\3\2\2"+
		"\2\u0c8b\u0c8c\7\u0171\2\2\u0c8c\u0d4b\3\2\2\2\u0c8d\u0c8e\7<\2\2\u0c8e"+
		"\u0c91\7\u016e\2\2\u0c8f\u0c92\5\u019c\u00cf\2\u0c90\u0c92\7\u016c\2\2"+
		"\u0c91\u0c8f\3\2\2\2\u0c91\u0c90\3\2\2\2\u0c92\u0c93\3\2\2\2\u0c93\u0d4b"+
		"\7\u0171\2\2\u0c94\u0d4b\7\u0148\2\2\u0c95\u0c96\7B\2\2\u0c96\u0d4b\7"+
		"G\2\2\u0c97\u0c9b\7\u0149\2\2\u0c98\u0c99\7B\2\2\u0c99\u0c9b\7\u0127\2"+
		"\2\u0c9a\u0c97\3\2\2\2\u0c9a\u0c98\3\2\2\2\u0c9b\u0ca0\3\2\2\2\u0c9c\u0c9d"+
		"\7\u016e\2\2\u0c9d\u0c9e\5\u019c\u00cf\2\u0c9e\u0c9f\7\u0171\2\2\u0c9f"+
		"\u0ca1\3\2\2\2\u0ca0\u0c9c\3\2\2\2\u0ca0\u0ca1\3\2\2\2\u0ca1\u0d4b\3\2"+
		"\2\2\u0ca2\u0d4b\7\u014a\2\2\u0ca3\u0ca4\7B\2\2\u0ca4\u0d4b\7\u015d\2"+
		"\2\u0ca5\u0ca6\7\u0150\2\2\u0ca6\u0ca7\7\u016e\2\2\u0ca7\u0cb4\5\u019c"+
		"\u00cf\2\u0ca8\u0ca9\7\u0160\2\2\u0ca9\u0cb1\5\u019c\u00cf\2\u0caa\u0cab"+
		"\7\u0160\2\2\u0cab\u0cac\5\u019c\u00cf\2\u0cac\u0cad\7\u0164\2\2\u0cad"+
		"\u0cae\5\u019c\u00cf\2\u0cae\u0cb0\3\2\2\2\u0caf\u0caa\3\2\2\2\u0cb0\u0cb3"+
		"\3\2\2\2\u0cb1\u0caf\3\2\2\2\u0cb1\u0cb2\3\2\2\2\u0cb2\u0cb5\3\2\2\2\u0cb3"+
		"\u0cb1\3\2\2\2\u0cb4\u0ca8\3\2\2\2\u0cb4\u0cb5\3\2\2\2\u0cb5\u0cb6\3\2"+
		"\2\2\u0cb6\u0cb7\7\u0171\2\2\u0cb7\u0d4b\3\2\2\2\u0cb8\u0cb9\7\u0151\2"+
		"\2\u0cb9\u0cba\7\u016e\2\2\u0cba\u0cc7\5\u019c\u00cf\2\u0cbb\u0cbc\7\u0160"+
		"\2\2\u0cbc\u0cc4\5\u019c\u00cf\2\u0cbd\u0cbe\7\u0160\2\2\u0cbe\u0cbf\5"+
		"\u019c\u00cf\2\u0cbf\u0cc0\7\u0164\2\2\u0cc0\u0cc1\5\u019c\u00cf\2\u0cc1"+
		"\u0cc3\3\2\2\2\u0cc2\u0cbd\3\2\2\2\u0cc3\u0cc6\3\2\2\2\u0cc4\u0cc2\3\2"+
		"\2\2\u0cc4\u0cc5\3\2\2\2\u0cc5\u0cc8\3\2\2\2\u0cc6\u0cc4\3\2\2\2\u0cc7"+
		"\u0cbb\3\2\2\2\u0cc7\u0cc8\3\2\2\2\u0cc8\u0cc9\3\2\2\2\u0cc9\u0cca\7\u0171"+
		"\2\2\u0cca\u0d4b\3\2\2\2\u0ccb\u0ccc\7\u0152\2\2\u0ccc\u0ccd\7\u016e\2"+
		"\2\u0ccd\u0cda\5\u019c\u00cf\2\u0cce\u0ccf\7\u0160\2\2\u0ccf\u0cd7\5\u019c"+
		"\u00cf\2\u0cd0\u0cd1\7\u0160\2\2\u0cd1\u0cd2\5\u019c\u00cf\2\u0cd2\u0cd3"+
		"\7\u0164\2\2\u0cd3\u0cd4\5\u019c\u00cf\2\u0cd4\u0cd6\3\2\2\2\u0cd5\u0cd0"+
		"\3\2\2\2\u0cd6\u0cd9\3\2\2\2\u0cd7\u0cd5\3\2\2\2\u0cd7\u0cd8\3\2\2\2\u0cd8"+
		"\u0cdb\3\2\2\2\u0cd9\u0cd7\3\2\2\2\u0cda\u0cce\3\2\2\2\u0cda\u0cdb\3\2"+
		"\2\2\u0cdb\u0cdc\3\2\2\2\u0cdc\u0cdd\7\u0171\2\2\u0cdd\u0d4b\3\2\2\2\u0cde"+
		"\u0cdf\7\u0153\2\2\u0cdf\u0ce0\7\u016e\2\2\u0ce0\u0ced\5\u019c\u00cf\2"+
		"\u0ce1\u0ce2\7\u0160\2\2\u0ce2\u0cea\5\u019c\u00cf\2\u0ce3\u0ce4\7\u0160"+
		"\2\2\u0ce4\u0ce5\5\u019c\u00cf\2\u0ce5\u0ce6\7\u0164\2\2\u0ce6\u0ce7\5"+
		"\u019c\u00cf\2\u0ce7\u0ce9\3\2\2\2\u0ce8\u0ce3\3\2\2\2\u0ce9\u0cec\3\2"+
		"\2\2\u0cea\u0ce8\3\2\2\2\u0cea\u0ceb\3\2\2\2\u0ceb\u0cee\3\2\2\2\u0cec"+
		"\u0cea\3\2\2\2\u0ced\u0ce1\3\2\2\2\u0ced\u0cee\3\2\2\2\u0cee\u0cef\3\2"+
		"\2\2\u0cef\u0cf0\7\u0171\2\2\u0cf0\u0d4b\3\2\2\2\u0cf1\u0cf2\7\u0154\2"+
		"\2\u0cf2\u0cf3\7\u016e\2\2\u0cf3\u0d00\5\u019c\u00cf\2\u0cf4\u0cf5\7\u0160"+
		"\2\2\u0cf5\u0cfd\5\u019c\u00cf\2\u0cf6\u0cf7\7\u0160\2\2\u0cf7\u0cf8\5"+
		"\u019c\u00cf\2\u0cf8\u0cf9\7\u0164\2\2\u0cf9\u0cfa\5\u019c\u00cf\2\u0cfa"+
		"\u0cfc\3\2\2\2\u0cfb\u0cf6\3\2\2\2\u0cfc\u0cff\3\2\2\2\u0cfd\u0cfb\3\2"+
		"\2\2\u0cfd\u0cfe\3\2\2\2\u0cfe\u0d01\3\2\2\2\u0cff\u0cfd\3\2\2\2\u0d00"+
		"\u0cf4\3\2\2\2\u0d00\u0d01\3\2\2\2\u0d01\u0d02\3\2\2\2\u0d02\u0d03\7\u0171"+
		"\2\2\u0d03\u0d4b\3\2\2\2\u0d04\u0d05\7\u0155\2\2\u0d05\u0d06\7\u016e\2"+
		"\2\u0d06\u0d13\5\u019c\u00cf\2\u0d07\u0d08\7\u0160\2\2\u0d08\u0d10\5\u019c"+
		"\u00cf\2\u0d09\u0d0a\7\u0160\2\2\u0d0a\u0d0b\5\u019c\u00cf\2\u0d0b\u0d0c"+
		"\7\u0164\2\2\u0d0c\u0d0d\5\u019c\u00cf\2\u0d0d\u0d0f\3\2\2\2\u0d0e\u0d09"+
		"\3\2\2\2\u0d0f\u0d12\3\2\2\2\u0d10\u0d0e\3\2\2\2\u0d10\u0d11\3\2\2\2\u0d11"+
		"\u0d14\3\2\2\2\u0d12\u0d10\3\2\2\2\u0d13\u0d07\3\2\2\2\u0d13\u0d14\3\2"+
		"\2\2\u0d14\u0d15\3\2\2\2\u0d15\u0d16\7\u0171\2\2\u0d16\u0d4b\3\2\2\2\u0d17"+
		"\u0d18\7\u0156\2\2\u0d18\u0d19\7\u016e\2\2\u0d19\u0d21\5\u019c\u00cf\2"+
		"\u0d1a\u0d1b\7\u0160\2\2\u0d1b\u0d1c\5\u019c\u00cf\2\u0d1c\u0d1d\7\u0164"+
		"\2\2\u0d1d\u0d1e\5\u019c\u00cf\2\u0d1e\u0d20\3\2\2\2\u0d1f\u0d1a\3\2\2"+
		"\2\u0d20\u0d23\3\2\2\2\u0d21\u0d1f\3\2\2\2\u0d21\u0d22\3\2\2\2\u0d22\u0d24"+
		"\3\2\2\2\u0d23\u0d21\3\2\2\2\u0d24\u0d25\7\u0171\2\2\u0d25\u0d4b\3\2\2"+
		"\2\u0d26\u0d27\7\u0157\2\2\u0d27\u0d28\7\u016e\2\2\u0d28\u0d2e\5\u019c"+
		"\u00cf\2\u0d29\u0d2a\7\u0160\2\2\u0d2a\u0d2b\5\u019c\u00cf\2\u0d2b\u0d2c"+
		"\7\u0164\2\2\u0d2c\u0d2d\5\u019c\u00cf\2\u0d2d\u0d2f\3\2\2\2\u0d2e\u0d29"+
		"\3\2\2\2\u0d2f\u0d30\3\2\2\2\u0d30\u0d2e\3\2\2\2\u0d30\u0d31\3\2\2\2\u0d31"+
		"\u0d34\3\2\2\2\u0d32\u0d33\7\u0160\2\2\u0d33\u0d35\5\u019c\u00cf\2\u0d34"+
		"\u0d32\3\2\2\2\u0d34\u0d35\3\2\2\2\u0d35\u0d36\3\2\2\2\u0d36\u0d37\7\u0171"+
		"\2\2\u0d37\u0d4b\3\2\2\2\u0d38\u0d39\7\u00fe\2\2\u0d39\u0d3a\7\u016e\2"+
		"\2\u0d3a\u0d3b\5\u019c\u00cf\2\u0d3b\u0d3c\7\u0171\2\2\u0d3c\u0d4b\3\2"+
		"\2\2\u0d3d\u0d3e\7\u011d\2\2\u0d3e\u0d3f\7\u016e\2\2\u0d3f\u0d40\5\u019c"+
		"\u00cf\2\u0d40\u0d41\7z\2\2\u0d41\u0d44\5\u019c\u00cf\2\u0d42\u0d43\7"+
		"v\2\2\u0d43\u0d45\5\u019c\u00cf\2\u0d44\u0d42\3\2\2\2\u0d44\u0d45\3\2"+
		"\2\2\u0d45\u0d46\3\2\2\2\u0d46\u0d47\7\u0171\2\2\u0d47\u0d4b\3\2\2\2\u0d48"+
		"\u0d4b\7\u015b\2\2\u0d49\u0d4b\7\u015d\2\2\u0d4a\u0c82\3\2\2\2\u0d4a\u0c83"+
		"\3\2\2\2\u0d4a\u0c8d\3\2\2\2\u0d4a\u0c94\3\2\2\2\u0d4a\u0c95\3\2\2\2\u0d4a"+
		"\u0c9a\3\2\2\2\u0d4a\u0ca2\3\2\2\2\u0d4a\u0ca3\3\2\2\2\u0d4a\u0ca5\3\2"+
		"\2\2\u0d4a\u0cb8\3\2\2\2\u0d4a\u0ccb\3\2\2\2\u0d4a\u0cde\3\2\2\2\u0d4a"+
		"\u0cf1\3\2\2\2\u0d4a\u0d04\3\2\2\2\u0d4a\u0d17\3\2\2\2\u0d4a\u0d26\3\2"+
		"\2\2\u0d4a\u0d38\3\2\2\2\u0d4a\u0d3d\3\2\2\2\u0d4a\u0d48\3\2\2\2\u0d4a"+
		"\u0d49\3\2\2\2\u0d4b\u01b9\3\2\2\2\u0d4c\u0d4d\5\u01d4\u00eb\2\u0d4d\u0d4f"+
		"\7\u016e\2\2\u0d4e\u0d50\5\u01bc\u00df\2\u0d4f\u0d4e\3\2\2\2\u0d4f\u0d50"+
		"\3\2\2\2\u0d50\u0d51\3\2\2\2\u0d51\u0d52\7\u0171\2\2\u0d52\u01bb\3\2\2"+
		"\2\u0d53\u0d58\5\u01be\u00e0\2\u0d54\u0d55\7\u0160\2\2\u0d55\u0d57\5\u01be"+
		"\u00e0\2\u0d56\u0d54\3\2\2\2\u0d57\u0d5a\3\2\2\2\u0d58\u0d56\3\2\2\2\u0d58"+
		"\u0d59\3\2\2\2\u0d59\u01bd\3\2\2\2\u0d5a\u0d58\3\2\2\2\u0d5b\u0d61\6\u00e0"+
		"\16\2\u0d5c\u0d5d\5\u01d4\u00eb\2\u0d5d\u0d5f\7\u0164\2\2\u0d5e\u0d60"+
		"\7\u0168\2\2\u0d5f\u0d5e\3\2\2\2\u0d5f\u0d60\3\2\2\2\u0d60\u0d62\3\2\2"+
		"\2\u0d61\u0d5c\3\2\2\2\u0d61\u0d62\3\2\2\2\u0d62\u0d63\3\2\2\2\u0d63\u0d64"+
		"\5\u019c\u00cf\2\u0d64\u01bf\3\2\2\2\u0d65\u0d68\5\u0136\u009c\2\u0d66"+
		"\u0d68\5\u019c\u00cf\2\u0d67\u0d65\3\2\2\2\u0d67\u0d66\3\2\2\2\u0d68\u01c1"+
		"\3\2\2\2\u0d69\u0d6c\5\u01ce\u00e8\2\u0d6a\u0d6c\5\u019c\u00cf\2\u0d6b"+
		"\u0d69\3\2\2\2\u0d6b\u0d6a\3\2\2\2\u0d6c\u01c3\3\2\2\2\u0d6d\u0d71\7\u0086"+
		"\2\2\u0d6e\u0d70\5\u01c6\u00e4\2\u0d6f\u0d6e\3\2\2\2\u0d70\u0d73\3\2\2"+
		"\2\u0d71\u0d6f\3\2\2\2\u0d71\u0d72\3\2\2\2\u0d72\u01c5\3\2\2\2\u0d73\u0d71"+
		"\3\2\2\2\u0d74\u0d75\7\u0174\2\2\u0d75\u0d76\5\u01d4\u00eb\2\u0d76\u0d77"+
		"\5\u019c\u00cf\2\u0d77\u0d81\3\2\2\2\u0d78\u0d79\7\u0174\2\2\u0d79\u0d7a"+
		"\5\u01d4\u00eb\2\u0d7a\u0d7b\7\u0175\2\2\u0d7b\u0d7c\7\u0164\2\2\u0d7c"+
		"\u0d7d\5\u019c\u00cf\2\u0d7d\u0d81\3\2\2\2\u0d7e\u0d7f\7\u0174\2\2\u0d7f"+
		"\u0d81\5\u01d4\u00eb\2\u0d80\u0d74\3\2\2\2\u0d80\u0d78\3\2\2\2\u0d80\u0d7e"+
		"\3\2\2\2\u0d81\u01c7\3\2\2\2\u0d82\u0d83\7\7\2\2\u0d83\u0d84\5\u01ca\u00e6"+
		"\2\u0d84\u0d85\7\u0173\2\2\u0d85\u0d88\3\2\2\2\u0d86\u0d88\5\u01cc\u00e7"+
		"\2\u0d87\u0d82\3\2\2\2\u0d87\u0d86\3\2\2\2\u0d88\u01c9\3\2\2\2\u0d89\u0d8b"+
		"\13\2\2\2\u0d8a\u0d89\3\2\2\2\u0d8b\u0d8e\3\2\2\2\u0d8c\u0d8d\3\2\2\2"+
		"\u0d8c\u0d8a\3\2\2\2\u0d8d\u01cb\3\2\2\2\u0d8e\u0d8c\3\2\2\2\u0d8f\u0d90"+
		"\7\u0087\2\2\u0d90\u0d91\5\u019c\u00cf\2\u0d91\u01cd\3\2\2\2\u0d92\u0da1"+
		"\7\u017d\2\2\u0d93\u0d97\7\u0162\2\2\u0d94\u0d95\7\6\2\2\u0d95\u0d97\7"+
		"\u0162\2\2\u0d96\u0d93\3\2\2\2\u0d96\u0d94\3\2\2\2\u0d96\u0d97\3\2\2\2"+
		"\u0d97\u0d98\3\2\2\2\u0d98\u0d9d\5\u01d4\u00eb\2\u0d99\u0d9a\7\u0162\2"+
		"\2\u0d9a\u0d9c\5\u01d4\u00eb\2\u0d9b\u0d99\3\2\2\2\u0d9c\u0d9f\3\2\2\2"+
		"\u0d9d\u0d9b\3\2\2\2\u0d9d\u0d9e\3\2\2\2\u0d9e\u0da1\3\2\2\2\u0d9f\u0d9d"+
		"\3\2\2\2\u0da0\u0d92\3\2\2\2\u0da0\u0d96\3\2\2\2\u0da1\u01cf\3\2\2\2\u0da2"+
		"\u0da3\7G\2\2\u0da3\u0da4\5\u01d6\u00ec\2\u0da4\u01d1\3\2\2\2\u0da5\u0da6"+
		"\7\u0127\2\2\u0da6\u0da7\5\u01d6\u00ec\2\u0da7\u01d3\3\2\2\2\u0da8\u0daa"+
		"\7\u0174\2\2\u0da9\u0da8\3\2\2\2\u0da9\u0daa\3\2\2\2\u0daa\u0dad\3\2\2"+
		"\2\u0dab\u0dae\7\u0175\2\2\u0dac\u0dae\5\u01e0\u00f1\2\u0dad\u0dab\3\2"+
		"\2\2\u0dad\u0dac\3\2\2\2\u0dae\u0db6\3\2\2\2\u0daf\u0db2\7\6\2\2\u0db0"+
		"\u0db3\7\u0175\2\2\u0db1\u0db3\5\u01e0\u00f1\2\u0db2\u0db0\3\2\2\2\u0db2"+
		"\u0db1\3\2\2\2\u0db3\u0db5\3\2\2\2\u0db4\u0daf\3\2\2\2\u0db5\u0db8\3\2"+
		"\2\2\u0db6\u0db4\3\2\2\2\u0db6\u0db7\3\2\2\2\u0db7\u01d5\3\2\2\2\u0db8"+
		"\u0db6\3\2\2\2\u0db9\u0dbc\7\u0176\2\2\u0dba\u0dbc\7\u0177\2\2\u0dbb\u0db9"+
		"\3\2\2\2\u0dbb\u0dba\3\2\2\2\u0dbc\u01d7\3\2\2\2\u0dbd\u0dbf\t\60\2\2"+
		"\u0dbe\u0dbd\3\2\2\2\u0dbe\u0dbf\3\2\2\2\u0dbf\u0dc0\3\2\2\2\u0dc0\u0dc1"+
		"\7\u0178\2\2\u0dc1\u01d9\3\2\2\2\u0dc2\u0dc4\t\60\2\2\u0dc3\u0dc2\3\2"+
		"\2\2\u0dc3\u0dc4\3\2\2\2\u0dc4\u0dc5\3\2\2\2\u0dc5\u0dc6\7\u0179\2\2\u0dc6"+
		"\u01db\3\2\2\2\u0dc7\u0dc8\t\61\2\2\u0dc8\u01dd\3\2\2\2\u0dc9\u0dca\7"+
		"\u00c7\2\2\u0dca\u01df\3\2\2\2\u0dcb\u0dcc\t\62\2\2\u0dcc\u01e1\3\2\2"+
		"\2\u01be\u01e7\u01ea\u01ee\u01f1\u01f6\u01fd\u0203\u0205\u020e\u0211\u0213"+
		"\u0251\u0259\u0269\u0270\u0273\u0278\u027c\u0285\u028a\u0292\u0297\u02a0"+
		"\u02ac\u02b1\u02b4\u02c2\u02c9\u02d2\u02e3\u02e7\u02ef\u02fa\u0304\u030c"+
		"\u0313\u0317\u031b\u0320\u0324\u0329\u032d\u0331\u033b\u033f\u0344\u0349"+
		"\u034d\u035a\u035f\u0365\u036b\u0371\u0375\u037d\u0380\u0385\u038c\u0393"+
		"\u039c\u039f\u03a6\u03ac\u03b1\u03b7\u03bc\u03bf\u03c5\u03d3\u03dd\u03e3"+
		"\u03e8\u03ed\u03f2\u03f6\u03fb\u03fe\u0408\u0414\u041b\u041e\u042a\u042f"+
		"\u0434\u0437\u043e\u044a\u0457\u0459\u045e\u0461\u0470\u0476\u0481\u0484"+
		"\u048e\u0495\u0498\u04a0\u04ac\u04b4\u04be\u04c2\u04ce\u04d3\u04dd\u04f2"+
		"\u04f8\u04fc\u0501\u0505\u050a\u050d\u0512\u0515\u0521\u0527\u052e\u0537"+
		"\u053e\u0544\u0549\u054f\u0554\u0557\u0566\u0586\u0588\u058c\u0593\u0598"+
		"\u059d\u05a1\u05a6\u05a9\u05b3\u05bf\u05c6\u05ce\u05dd\u05fd\u05ff\u0604"+
		"\u0608\u060d\u0614\u0617\u061a\u061f\u0623\u0625\u062c\u0632\u0639\u063f"+
		"\u0642\u0647\u064b\u064e\u0655\u065b\u065e\u0668\u0671\u0678\u067f\u0681"+
		"\u0687\u068a\u0695\u069e\u06a4\u06aa\u06ad\u06b2\u06b5\u06b8\u06bb\u06be"+
		"\u06c4\u06ce\u06d9\u06dc\u06e3\u06e8\u06ed\u06f1\u06f9\u06fd\u0702\u0706"+
		"\u0708\u070d\u0715\u071a\u0720\u0727\u072a\u0731\u0739\u0741\u0744\u0747"+
		"\u074c\u0755\u0759\u0763\u0776\u077d\u077f\u0783\u0787\u078f\u079a\u07a3"+
		"\u07ab\u07b3\u07b7\u07bf\u07d1\u07df\u07e6\u07ea\u07f1\u07f3\u07f7\u0800"+
		"\u0808\u0811\u0821\u0827\u082b\u0835\u083d\u0846\u084a\u0850\u0855\u0859"+
		"\u0863\u0869\u086d\u0879\u0880\u0890\u0897\u08a1\u08a4\u08a8\u08af\u08b6"+
		"\u08b8\u08bc\u08c0\u08c5\u08c8\u08cc\u08cf\u08da\u08dd\u08e8\u08ee\u08f2"+
		"\u08f4\u08f8\u0901\u0908\u090c\u0910\u0917\u091b\u0923\u0929\u092d\u0938"+
		"\u093f\u094c\u0954\u0958\u0962\u0967\u0974\u097f\u0987\u098b\u098f\u0993"+
		"\u0995\u099a\u099d\u09a0\u09a3\u09a7\u09aa\u09ad\u09b0\u09b3\u09ba\u09c5"+
		"\u09c9\u09cc\u09d0\u09d7\u09db\u09e5\u09ed\u09f3\u09f7\u09fd\u0a06\u0a09"+
		"\u0a0e\u0a11\u0a1b\u0a20\u0a29\u0a2e\u0a32\u0a3b\u0a3f\u0a4d\u0a5a\u0a5f"+
		"\u0a63\u0a69\u0a74\u0a76\u0a7d\u0a80\u0a87\u0a8c\u0a92\u0a95\u0a98\u0aa7"+
		"\u0aae\u0ab1\u0ab4\u0ab8\u0abd\u0ac3\u0ac7\u0ad2\u0ad6\u0ad9\u0add\u0ae1"+
		"\u0ae5\u0ae9\u0aef\u0af5\u0afc\u0b04\u0b0a\u0b0f\u0b1a\u0b23\u0b27\u0b30"+
		"\u0b34\u0b3e\u0b43\u0b59\u0b5c\u0b6f\u0b7f\u0b81\u0b8c\u0b9b\u0ba7\u0bab"+
		"\u0bb6\u0bba\u0bc6\u0bca\u0bd5\u0bda\u0bdf\u0be3\u0be7\u0bec\u0bf0\u0bf4"+
		"\u0c0b\u0c0d\u0c1f\u0c21\u0c29\u0c2e\u0c33\u0c38\u0c45\u0c4a\u0c4f\u0c54"+
		"\u0c59\u0c5e\u0c63\u0c68\u0c6a\u0c71\u0c74\u0c7f\u0c89\u0c91\u0c9a\u0ca0"+
		"\u0cb1\u0cb4\u0cc4\u0cc7\u0cd7\u0cda\u0cea\u0ced\u0cfd\u0d00\u0d10\u0d13"+
		"\u0d21\u0d30\u0d34\u0d44\u0d4a\u0d4f\u0d58\u0d5f\u0d61\u0d67\u0d6b\u0d71"+
		"\u0d80\u0d87\u0d8c\u0d96\u0d9d\u0da0\u0da9\u0dad\u0db2\u0db6\u0dbb\u0dbe"+
		"\u0dc3";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}