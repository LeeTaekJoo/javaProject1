package aproject.controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import aproject.model.EmpService;
import aproject.view.EmpView;
import aproject.vo.EmpVO;
// 수정하기
// 수정하기1
public class EmpController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmpService eService = new EmpService();
		
		
		while(true) {
			
			System.out.println("1. selectAll-모든직원");
			System.out.println("2. selectById-직원상세");
			System.out.println("3. selectByDept-부서의직원");
			System.out.println("4. selectByCondition-부서,직책,급여");
			System.out.println("5. 부서의 평균급여 이하를 받는 직원조회");
			System.out.println("6. 신규직원등록");
			System.out.println("7. 직원정보수정");
			System.out.println("8. 직원정보삭제");
			System.out.println("9. 직원의 급여조회(SP)");
			System.out.println("exit (종료)");
			System.out.print("====작업선택>>");
			String job = sc.next();
			
			if(job.equals("exit")) break;
			
			switch (job) {
			case "1":
				EmpView.print(eService.selectAll());
				break;
		
			case "2":{
				System.out.print("조회할 직원번호>>");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));
				break;
			}
			case "3":{
				System.out.print("조회할 부서를 입력하세요>>");
				int deptid = sc.nextInt();
				EmpView.print(eService.selectByDept(deptid));
				break;
			}
			case "4":{
				System.out.print("조회할 부서번호, job, salary>>");
				int deptid = sc.nextInt();
				String jobid = sc.next();
				double salary = sc.nextDouble();
				EmpView.print(eService.selectByCondition(deptid, jobid, salary));
				break;
			}
			case "5":{
				List<EmpVO> empList = eService.selectLAB();
				System.out.println("[Controller] 5번작업: " + empList.size());
				EmpView.print(empList);
				break;
			}
			case "6":{
				EmpVO emp = makeEmp(sc);
				EmpView.print(eService.empInsert(emp));
				break;
			}
			case "7":{
				System.out.print("==수정할 직원ID>>");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));
				
				EmpVO emp = makeEmp2(sc, empid);
				EmpView.print(eService.empUpdate(emp));
				break;
			}
			case "8":{	
				System.out.println("==삭제할 직원ID>>");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));
				System.out.println("삭제를 계속진행(Y/N)?");
				String yn = sc.next();
				if(yn.equals("Y")) {
					EmpView.print(eService.empDelete(empid));
				}			
			}
			case "9":{
				System.out.print("조회할 직원번호>>");
				int empid = sc.nextInt();
				EmpView.print("급여는 " + eService.getSalary(empid));
				break;
			}
			
			default:
				break;
			}
		}
		System.out.println("수고하셨습니다...");
	}

	private static EmpVO makeEmp(Scanner sc) {
		System.out.print("1. 신규직원의 first_name>>");
		String fName = sc.next();
		System.out.print("2. 신규직원의 LAST_NAME>>");
		String lastName = sc.next();
		System.out.print("3. 신규직원의 email>>");
		String email = sc.next();
		System.out.print("4. 신규직원의 jobid>>");
		String jobid = sc.next();
		System.out.print("5. 신규직원의 phone>>");
		String phone = sc.next();
		System.out.print("6. 신규직원의 manager>>");
		int mid = sc.nextInt();
		System.out.print("7. 신규직원의 dept>>");
		int deptid = sc.nextInt();
		System.out.print("8. 신규직원의 commission>>");
		double comm = sc.nextDouble();
		System.out.print("9. 신규직원의 salary>>");
		double sal = sc.nextDouble();
		
		System.out.print("10. 신규직원의 입사일 yyyy/mm/dd>>");
		String sdate = sc.next();
		//String -> Date
		Date hiredate = DateUtil.converToDate(sdate);
		
		EmpVO emp = new EmpVO();
		emp.setLast_name(lastName);
		emp.setEmail(email);
		emp.setJob_id(jobid);
		emp.setCommission_pct(comm);
		emp.setDepartment_id(deptid);
		emp.setFirst_name(fName);
		emp.setHire_date(hiredate);		
		emp.setManager_id(mid);
		emp.setPhone_number(phone);
		emp.setSalary(sal);
		return emp;
		
	}
	private static EmpVO makeEmp2(Scanner sc, int empid) {
		
		System.out.print("1. 직원의 email>>");
		String email = sc.next();
		System.out.print("2. 직원의 jobid>>");
		String jobid = sc.next();
		System.out.print("3. 직원의 dept>>");
		int deptid = sc.nextInt();
		System.out.print("4. 직원의 salary>>");
		double sal = sc.nextDouble();
		System.out.print("5. 직원의 입사일 yyyy/mm/dd>>");
		String sdate = sc.next();
		//String -> Date
		Date hiredate = DateUtil.converToDate(sdate);
		System.out.print("6. 직원의 manager>>");
		int mid = sc.nextInt();
		
		
		EmpVO emp = new EmpVO();
		emp.setEmployee_id(empid);
		emp.setEmail(email);
		emp.setJob_id(jobid);
		emp.setDepartment_id(deptid);
		emp.setSalary(sal);
		emp.setHire_date(hiredate);
		emp.setManager_id(mid);
		return emp;
		
	}

}
