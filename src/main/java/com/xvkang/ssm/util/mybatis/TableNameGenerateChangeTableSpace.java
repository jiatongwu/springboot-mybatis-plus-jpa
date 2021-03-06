package com.xvkang.ssm.util.mybatis;

public class TableNameGenerateChangeTableSpace {
	public static void main(String[] args) {

		String start = "ALTER TABLE ";
		String end = " MOVE TABLESPACE USERS";
		String[] arr = { 
				"GP_FILING",
				"GP_PROD",
				"GP_SOURCE",
				"INPUT_RECORD",
				"LAWCHECKLIST",
				"LAWCHECKLIST_CATE",
				"LAWCHECKLIST_CATE_BEHA",
				"LAWCHECKLIST_CATE_CONT",
				"LAWCHECKLIST_PLACE",
				"LAWCHECKLIST_PROD",
				"LAW_BEHAVIORS",
				"GP_PROOF_REGI_NOTICE",
				"GP_PROOF_SEAL_DECI",
				"GP_PROOF_SEAL_DECI_PROD",
				"GP_PROOF_SEAL_RECORD",
				"GP_PROOF_DISMI_DECI",
				"GP_PROOF_DISMI_DECI_PROD",
				"GP_PROOF_TALK_NOTICE",
				"GP_PROOF_POWEROFATTORNEY",
				"GP_PROOF_PROD_CALC",
				"GP_REVIPROC_CASESTATE",
				"GP_PEVI_CAILIAN_PUNI",
				"GP_REVIPROC_PUNIDISC",
				"GP_REVIPROC_MAJOR_PUNIDISC",
				"GP_NOTIFY_ORDER_CORR",
				"GP_NOTIFY_PUNI_NOTI",
				"GP_HEAR_PUNI_NOTI",
				"GP_HEAR_RECORD",
				"GP_HEAR_REPORT",
				"GP_DECISION_APPROVAL",
				"GP_DECISION_DECI",
				"GP_SERVICE_RECEIPT",
				"LAW_BEHAVIOR_CATEGORIES",
				"LAW_BEHAVIOR_EXTENTS",
				"PUNISHMENT_TYPE",
				"RUN_MODES",
				"SIMPLE_PROGRAM",
				"SIMPLE_PROGRAM_PRODUCT",
				"SUPERVISES",
				"SUPERVISE_RUN_MODE",
				"SUPERVISE_SUPERVISION_TYPE",
				"SUPERVISION_TYPES",
				"TEST",
				"USER_CONF_CASES",
				"USER_ZFTYPE",
				"ZFTYPES",
				"USERS",
				"GP_PROG",
				"GP_PROOF_IMG",
				"GP_PROOF_INQUIRY",
				"GP_PROOF_SITERECORD",
				"GP_PROOF_SAMPLING",
				"GP_PROOF_SAMPLING_PROD",
				"GP_PROOF_PROD_CONFIR",
				"GP_PROOF_PROD_CONFIR_PROD",
				"GP_PROOF_EVID_LIST",
				"GP_PROOF_EVID_LIST_PROD",
				"MEASUREMENT_UNIT",
				"MEASURE_UNIT_MONE",
				"MEASURE_UNIT_SPECI",
				"SYS_ROLE_PERMISSION",
				"SYS_ROLE",
				"SYS_PERMISSION",
				"SYS_USER_ROLE",
				"USER_INFO",
				"GP_SERVICE_RECEIPT_INST",
				"GP_EXE_PENARECO",
				"GP_EXE_URGE",
				"GP_EXE_MANDATORY",
				"GP_CLOSE_PUNIREPO",
				"GP_CLOSE_MARJORREPO",
				"GP_CLOSE_PASTE",
				"GP_TRANSFER",
				"GP_TRANSFER_ATTA",
				"GP_ROLLING_PUNI",
				"GP_ROLLING_REMARK",
				"GP_ROLLING_TABLE",
				"GP_CLOSE_ATTA_TYPE",
				"AREAS"

		};
		for (String ar : arr) {

			String token = ar;

			System.out.println(start + token + end + ";");
		}
	}

}
