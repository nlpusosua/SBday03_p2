package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Day03Application {

	public static void main(String[] args) {
		SpringApplication.run(Day03Application.class, args);
//// sử dụng class implement Greeting
//		Greeting vietnam = new VietNam();
//		vietnam.greet("nguyễn văn a");
//
//// sử dụng anonymous class
//		Greeting china= new Greeting() {
//			@Override
//			public void greet(String name) {
//				System.out.println("ní hảo "+ name);
//			}
//		};
//		china.greet("vloll");
//
////	sự dụng lamda expression
//		Greeting japan =(name)-> System.out.println("anicato "+ name);
//		japan.greet("tokuda");
////	sự dụng lamda expression cho clac
//		Calc add = (a, b)->a+b;
//		System.out.println("5+3= "+add.calculate(5,3));
//
//		Calc minus = (a, b)->a-b;
//		System.out.println("5-3= "+minus.calculate(5,3));
//
//		Calc mul = (a, b)->a*b;
//		System.out.println("5*3= "+mul.calculate(5,3));
//
		List<Integer> số_lượng = List.of(10, 5, 3, 12, 6, 7, 5, 3);

// 1. Duyệt số_lượng
		số_lượng.stream().forEach(System.out::println);

// 2. Tìm các giá trị chẵn trong list
		List<Integer> số_chẵn = số_lượng.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Số chẵn: " + số_chẵn);

// 3. Tìm các giá trị > 5 trong list
		List<Integer> lớn_hơn_năm = số_lượng.stream()
				.filter(n -> n > 5)
				.collect(Collectors.toList());
		System.out.println("Lớn hơn 5: " + lớn_hơn_năm);

// 4. Tìm giá trị max trong list
		int max = số_lượng.stream()
				.mapToInt(Integer::intValue)
				.max()
				.orElse(0);
		System.out.println("Giá trị lớn nhất: " + max);

// 5. Tìm giá trị min trong list
		int min = số_lượng.stream()
				.mapToInt(Integer::intValue)
				.min()
				.orElse(0);
		System.out.println("Giá trị nhỏ nhất: " + min);

// 6. Tính tổng các phần tử của mảng
		int tổng = số_lượng.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Tổng: " + tổng);

// 7. Lấy danh sách các phần tử không trùng nhau
		List<Integer> số_duy_nhất = số_lượng.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Số duy nhất: " + số_duy_nhất);

// 8. Lấy 5 phần tử đầu tiên trong mảng
		List<Integer> năm_đầu = số_lượng.stream()
				.limit(5)
				.collect(Collectors.toList());
		System.out.println("Năm đầu tiên: " + năm_đầu);

// 9. Lấy phần tử từ thứ 3 -> thứ 5
		List<Integer> từ_ba_đến_năm = số_lượng.stream()
				.skip(2)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println("Từ thứ 3 đến thứ 5: " + từ_ba_đến_năm);

// 10. Lấy phần tử đầu tiên > 5
		Integer đầu_tiên_lớn_hơn_năm = số_lượng.stream()
				.filter(n -> n > 5)
				.findFirst()
				.orElse(null);
		System.out.println("Đầu tiên lớn hơn 5: " + đầu_tiên_lớn_hơn_năm);

// 11. Kiểm tra xem list có phải là list chẵn hay không
		boolean là_số_chẵn = số_lượng.stream()
				.allMatch(n -> n % 2 == 0);
		System.out.println("Có phải là list số chẵn? " + là_số_chẵn);

// 12. Kiểm tra xem list có phần tử > 10 hay không
		boolean có_lớn_hơn_mười = số_lượng.stream()
				.anyMatch(n -> n > 10);
		System.out.println("Có phần tử lớn hơn 10? " + có_lớn_hơn_mười);

// 13. Có bao nhiêu phần tử > 5
		long số_lượng_lớn_hơn_năm = số_lượng.stream()
				.filter(n -> n > 5)
				.count();
		System.out.println("Số lượng lớn hơn 5: " + số_lượng_lớn_hơn_năm);

// 14. Nhân đôi các phần tủ trong list và trả về list mới
		List<Integer> số_gấp_đôi = số_lượng.stream()
				.map(n -> n * 2)
				.collect(Collectors.toList());
		System.out.println("Số gấp đôi: " + số_gấp_đôi);

// 15. Kiểm tra xem list không chứa giá trị nào = 8
		boolean có_chứa_tám = số_lượng.stream()
				.anyMatch(n -> n == 8);
		System.out.println("Có chứa 8? " + có_chứa_tám);
	}
}