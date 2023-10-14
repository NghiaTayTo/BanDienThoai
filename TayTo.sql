

create table TaiKhoan(
   TenDangNhap NVARCHAR(20) primary key not null,
   Matkhau NVARCHAR(50) not null,
);

Create table MaGG(
	MaVoucher Nchar(20) primary key not null,
	Ten Nvarchar(255),
	Loaima Nvarchar(255),
	Giamgia int,
	trangthai bit ,
	thoigian date
);

create table MauSac(
	MaMau nchar(10) primary key not null,
	tenMau1 nvarchar(50)  null,
	tenMau2 nvarchar(50)  null,
	tenMau3 nvarchar(50)  null,
	tenMau4 nvarchar(50)  null,
	tenMau5 nvarchar(50)  null,
	tenMau6 nvarchar(50)  null,
	tenMau7 nvarchar(50)  null,
	tenMau8 nvarchar(50)  null,
	tenMau9 nvarchar(50)  null,
	tenMau10 nvarchar(50)  null
)


CREATE TABLE SanPham (
    MaSanPham int Identity(1,1) PRIMARY KEY,
    TenSanPham NVARCHAR(100),
    GiaBan DECIMAL(18, 2) not null,
	ram nvarchar(10) not null,
	pin nvarchar(10) not null,
	rom nvarchar(20) not null,
	manHinh nvarchar(20) not null,
	cpu nvarchar(20) not null,
	soLuong int not null,
	heDieuHanh nvarchar(20) not null,
	xuatXu nvarchar(30) not null,
	camera nvarchar(30) not null,
	phanLoaiHang nvarchar(10) not null,
	tenLoaiHang nvarchar(50) not null,
	logo NVARCHAR(50) NOT NULL,
	moTa NVARCHAR(50) NULL,
	doPhanGiai nvarchar(150) not null,
	giaNhap DECIMAL(18, 2) not null,
	MaMau nchar(10)  not null,
	FOREIGN KEY (MaMau) REFERENCES MauSac(MaMau)

);

CREATE TABLE KhachHang(
	MaKH  int IDENTITY(1,1) primary key not null,
	TenKH NVARCHAR(255) not null,
	TenDangNhap NVARCHAR(20) not null,
	MatKhau NVARCHAR(50) not null,
	SoDienThoai varchar(10) not null,
	email varchar(50) not null,
	NgaySinh DATE not null,
	ngaytao date not null,
	GioiTinh BIT not null,
	SoTaiKhoan INT,
	NganHangThuHuong nvarchar(50),
	ghichu nvarchar(max),
	soLanMua int,	
	DiaChi NVARCHAR(255) not null,
	MaVT NVARCHAR(5) NOT NULL,
	FOREIGN KEY (TenDangNhap) REFERENCES TaiKhoan(TenDangNhap)
);



CREATE TABLE NhanVien(
 MaNV NCHAR(7) primary key not null,
 TenDangNhap NVARCHAR(20) not null,
 MatKhau NVARCHAR(50) not null,
 TenNV NVARCHAR(50) not null,
 NgaySinh DATE not null,
 ngayBatDau date not null,
 DiaChi NVARCHAR(200) not null,
 Vaitro bit not null,
 Email NVARCHAR(50) not null,
 SoDT int not null,
 Gioitinh bit,
 Ghichu Nvarchar(255) null,
 hinh Nvarchar(255) null
 FOREIGN KEY (TenDangNhap) REFERENCES TaiKhoan(TenDangNhap)
);





CREATE TABLE HoaDon (
    MaHoaDon INT IDENTITY(1,1) PRIMARY KEY,
    NgayLap DATE,
    TongTien DECIMAL(18, 2),
    MaKH INT,
    FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
    MaNV NCHAR(7),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);


CREATE TABLE ChiTietHoaDon (
    MaChiTiet INT IDENTITY(1, 1) PRIMARY KEY,
    MaHoaDon INT,
    FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    MaSanPham int FOREIGN KEY REFERENCES SanPham(MaSanPham),
    SoLuong INT not null,
    DonGia DECIMAL(18, 2) not null,
	PhiVanChuyen DECIMAL(18, 2) not null,
    ThanhTien DECIMAL(18, 2),
    ghichu NVARCHAR(200) not null , 
    PTNH bit default 0 ,
	diachiNH NVARCHAR(200) not null,
    NgayGiao date,
    trangthai int,
    MaVoucher Nchar(20) foreign key references MaGG(MaVoucher)
);


	INSERT INTO TaiKhoan (TenDangNhap, Matkhau) VALUES
    ( 'user1', '123'),
    ( 'user2', '123'),
    ('user3', '123'),
    ('user4', '123'),
	('user5', '123'),
	('user6', '123'),
	('user7', '123'),
	('user8', '123'),
	('user9', '123'),
	('user10', '123'),
	('userNV1', 'password1'),
	('userNV2', 'password2'),
	('userNV3', 'password3'),
	('userNV4', 'password4'),
	('userNV5', 'password5'),
	('userNV6', 'password6'),
	('userNV7', 'password7'),
	('userNV8', 'password8'),
	('userNV9', 'password9'),
	('userNV10', 'password10');

	INSERT INTO MauSac (MaMau, tenMau1, tenMau2,tenMau3,tenMau4,tenMau5,tenMau6,tenMau7,tenMau8,tenMau9,tenMau10) VALUES
    ('M001', N'Đen', N'Đỏ',N'Vàng',N'Xanh dương',N'Xanh lá',N'tím',N'Hồng',N'Be',N'Cam',N'vàng cam'),
    ('M002', N'Đen', N'Đỏ',N'Vàng','',N'Xanh lá',N'tím',N'Hồng',N'Be',N'Cam',N'vàng cam'),
	('M003', N'Đen', N'Đỏ',N'Vàng',N'Xanh dương',N'Xanh lá',N'tím',N'Hồng',N'Be',N'Cam',N'vàng cam'),
	('M004', N'Đen', N'Đỏ',N'Vàng',N'Xanh dương',N'Xanh lá',N'tím',N'Hồng',N'Be',N'Cam',N'vàng cam'),
	('M005', N'Đen', N'Đỏ',N'Vàng',N'Xanh dương',N'Xanh lá',N'tím',N'Hồng',N'Be',N'Cam',N'vàng cam');

	INSERT INTO MaGG (MaVoucher, Ten,Loaima ,Giamgia ,trangthai , thoigian ) VALUES
    ( 'giamgia1', 'Voucher1',N'Siêu sale','10',0,'2023-12-1'),
    ( 'giamgia2', 'Voucher2',N'Siêu sale','15',0,'2023-12-1'),
	( 'giamgia3', 'Voucher3',N'Siêu sale','20',0,'2023-12-1'),
	( 'giamgia4', 'Voucher4',N'Siêu sale','25',0,'2023-12-1'),
	( 'giamgia5', 'Voucher5',N'Siêu sale','30',0,'2023-12-1'),
	( 'giamgia6', 'Voucher6',N'Siêu sale','35',0,'2023-12-1'),
	( 'giamgia7', 'Voucher7',N'Siêu sale','40',0,'2023-12-1'),
	( 'giamgia8', 'Voucher8',N'Siêu sale','50',0,'2023-12-1');

INSERT INTO SanPham (TenSanPham, GiaBan, ram, pin, rom, manHinh, cpu, soLuong, heDieuHanh, xuatXu, camera, phanLoaiHang, tenLoaiHang, logo, moTa, doPhanGiai, giaNhap,MaMau) VALUES
    ( N'Sản phẩm 1', 1000000, '4GB', '3000mAh', '64GB', '6.2 inch', 'Snapdragon 855', 10, 'Android', N'Việt Nam', '12 MP', 'A', 'Smartphone', '','','HD - 1280 x 720',1200000,'M005'),
    ( N'Sản phẩm 2', 2000000, '6GB', '4000mAh', '128GB', '6.5 inch', 'Exynos 9820', 15, 'Android', N'Hàn Quốc', '16 MP', 'B', 'Smartphone', '','','4K - 3840 x 2160',1200000,'M002'),
    ( N'Sản phẩm 3', 1500000, '4GB', '3500mAh', '32GB', '6.0 inch', 'Helio P60', 8, 'Android', N'Trung Quốc', '8 MP', 'A', 'Smartphone', '','','4K - 3840 x 2160',1200000,'M003'),
    ( N'Sản phẩm 4', 1800000, '8GB', '4500mAh', '256GB', '6.4 inch', 'Kirin 980', 12, 'Android', N'Trung Quốc', '20 MP', 'B', 'Smartphone', '','','HD - 1280 x 720',1200000,'M004'),
    ( N'Sản phẩm 5', 1200000, '3GB', '3000mAh', '16GB', '5.8 inch', 'Snapdragon 665', 5, 'Android', N'Việt Nam', '12 MP', 'A', 'Smartphone', '','','HD+ - 1480 x 720',1200000,'M005'),
    ( N'Sản phẩm 6', 2500000, '8GB', '5000mAh', '128GB', '6.7 inch', 'Exynos 990', 20, 'Android', N'Hàn Quốc', '16 MP', 'B', 'Smartphone', '','','HD - 1280 x 720',1200000,'M001'),
    ( N'Sản phẩm 7', 1600000, '6GB', '3500mAh', '64GB', '6.1 inch', 'Helio G90T', 10, 'Android', N'Trung Quốc', '8 MP', 'A', 'Smartphone', '','','HD+ - 1480 x 720',1200000,'M001'),
    ( N'Sản phẩm 8', 1900000, '8GB', '4000mAh', '128GB', '6.5 inch', 'Snapdragon 865', 15, 'Android', N'Trung Quốc', '12 MP', 'B', 'Smartphone', '','','HD - 1280 x 720',1200000,'M002'),
    ( N'Sản phẩm 9', 1300000, '4GB', '3000mAh', '32GB', '5.5 inch', 'Kirin 710', 8, 'Android', N'Việt Nam', '16 MP', 'A', 'Smartphone', '','','QHD - 960 x 540',1200000,'M002'),
    ( N'Sản phẩm 10', 2200000, '12GB', '5000mAh', '256GB', '6.8 inch', 'Snapdragon 888', 12, 'Android', N'Hàn Quốc', '20 MP', 'B', 'Smartphone', '','','Full HD - 1920 x 1080',1200000,'M004');




	INSERT INTO KhachHang (TenKH, TenDangNhap, MatKhau, SoDienThoai, Email, NgaySinh, NgayTao, GioiTinh, SoTaiKhoan, GhiChu, SoLanMua, DiaChi, MaVT) VALUES
    (N'Nguyễn Ngọc Mạnh', 'user1', '123', '0123456789', 'user1@example.com', '1990-01-01', '2023-10-11', 1, 123456789, NULL, 5, '123 ABC Street', 'VT1'),
    (N'Nguyễn Việt Hà', 'user2', '123', '0123456789', 'user2@example.com', '1992-02-02', '2023-10-11', 0, 987654321, NULL, 3, '456 XYZ Street', 'VT1'),
    (N'Nguyễn Văn Nghị', 'user2', '123', '0123456789', 'user3@example.com', '1988-03-03', '2023-10-11', 1, 246813579, NULL, 8, '789 DEF Street', 'VT1'),
    (N'Đỗ Tuyết Lê', 'user4',  '123', '0123456789', 'user4@example.com', '1995-04-04', '2023-10-11', 0, 135792468, NULL, 2, '321 GHI Street', 'VT1'),
    (N'Nguyễn Huy Đoàn', 'user5', '123', '0123456789', 'user5@example.com', '1993-05-05', '2023-10-11', 1, 987654321, NULL, 6, '654 JKL Street', 'VT1'),
    (N'Hồ Thu Thủy', 'user6',  '123', '0123456789', 'user7@example.com', '1994-07-07', '2023-10-11', 1, 987654321, NULL, 7, '789 PQR Street', 'VT1'),
    (N'Nguyễn Ngọc Mai', 'user8',  '123', '0123456789', 'user8@example.com', '1989-08-08', '2023-10-11', 0, 246813579, NULL, 3, '543 STU Street', 'VT1'),
    (N'Vũ Tiến Đạt', 'user9',  '123', '0123456789', 'user9@example.com', '1996-09-09', '2023-10-11', 1, 135792468, NULL, 5, '876 VWX Street', 'VT1'),
    (N'Đào Tân Quốc Vũ', 'user10',  '123', '0123456789', 'user10@example.com', '1997-10-10', '2023-10-11', 0, 123456789, NULL, 2, '135 YZA Street', 'VT1');

-- Thêm dữ liệu vào bảng NhanVien


INSERT INTO NhanVien (MaNV, TenDangNhap, MatKhau, TenNV, NgaySinh, NgayBatDau, DiaChi,  Vaitro , Email, SoDT , Gioitinh, Ghichu, hinh )
VALUES
    ('NV1', 'userNV1', 'password1', N'Phạm Ngọc Tiên', '1990-01-01', '2020-01-01', N'181, Hoàng Văn Thụ, P.8, Q.Phú Nhuận, TP.HCM', 0, 'Nhavien1@gmail.com',0911865724,1,N'thanh công1',''),
    ('NV2', 'userNV2', 'password2', N'Nguyễn Viết Lưu', '1990-01-01', '2020-01-01', N'181, Hoàng Văn Thụ, P.8, Q.Phú Nhuận, TP.HCM', 0,'Nhavien2@gmail.com',0911865724,1,N'thanh công1',''),
    ('NV3', 'userNV3', 'password3', N'Hoàng Hải Anh', '1995-08-20', '2022-03-10', N'371, Kết Đoàn, P.Bình Thọ, Q.Thủ Đức, TP.HCM', 0,'Nhavien3@gmail.com',0911857245,1,N'thanh công1',''),
    ('NV4', 'userNV4', 'password4', N'Nguyễn Văn Toàn', '1988-12-05', '2018-07-20', '114 Quốc Lộ 1, P.Tân Tạo, Q.Bình Chánh, TP.HCM', 1, 'Nhavien4@gmail.com',0911857245,1,N'thanh công1',''),
    ('NV5', 'userNV5', 'password5', N'Đào Ngọc Long', '1992-03-25', '2021-09-05', '543 Đinh Đức Thiện, X.Bình Chánh, H.Bình Chánh, TP.HCM', 0, 'Nhavien5@gmail.com',0118657245,1,N'thanh công1',''),
    ('NV6', 'userNV6', 'password6', N'Trần Đăng Long', '1980-06-10', '2017-11-11',  '303 Quang Trung, Thị Trấn Hóc Môn, TP.HCM', 1, 'Nhavien6@gmail.com',0911865725,1,N'thanh công1',''),
    ('NV7', 'userNV7', 'password7', N'Trần Diệu Anh', '1993-11-30', '2020-08-15', '404 Nguyễn Văn Tạo, Ấp 2, Xã Long Thới, H.Nhà Bè, TP.HCM', 0, 'Nhavien7@gmail.com',0118657245,1,N'thanh công1',''),
    ('NV8', 'userNV8', 'password8', N'Nguyễn Thị Thu Trang', '1982-04-18', '2019-04-30', '505 Chợ Cầu Tre, Đà Nẵng, Ngô Quyên, Hải Phòng', 1, 'Nhavien8@gmail.com',0911857245,1,N'thanh công1',''),
    ('NV9', 'userNV9', 'password9', N'Đào Vũ Nghiệp', '1998-07-05', '2022-01-22',  '423 Nguyễn Trãi, Tân Sơn, Hồng Hải, TP.Hạ Long', 0,'Nhavien9@gmail.com',0911865725,1,N'thanh công1',''),
    ('NV10', 'userNV10', 'password10', N'Lê Quang Huy', '1984-09-15', '2018-12-12', '707 Khố 2, Thị Trấn Đô Lương, Nghệ An', 1, 'Nhavien10@gmail.com',0911865725,1,N'thanh công1','');



	INSERT INTO HoaDon ( NgayLap, TongTien, MaKH, MaNV) VALUES
    ('2023-10-01', 1500000, 1, 'NV1'),
    ('2023-10-02', 2000000, 2, 'NV2'),
    ('2023-10-03', 1800000, 3, 'NV3'),
    ('2023-10-04', 2200000, 4, 'NV4'),
    ('2023-10-05', 1900000, 5, 'NV5'),
    ('2023-10-06', 2500000, 6, 'NV6'),
    ('2023-10-07', 2100000, 7, 'NV7'),
    ('2023-10-08', 2300000, 8, 'NV8'),
    ('2023-10-09', 1750000, 9, 'NV9'),
    ('2023-10-10', 2400000, 2, 'NV10');




	INSERT INTO ChiTietHoaDon ( MaHoaDon, MaSanPham, SoLuong, DonGia, PhiVanChuyen, ThanhTien,ghichu,PTNH,diachiNH,NgayGiao,trangthai,MaVoucher) VALUES
    (1, 1, 2, 500000, 20000, 1000000,N'Chưa ghi chú',1,N'thôn 5, huyện đạ hoai','2022-01-02',1,N'giamgia1'),
    (2, 2, 1, 2000000, 30000, 2000000,N'Chưa ghi chú',0,N'thôn 7, huyện đạ hoai','2022-01-02',2,N'giamgia2'),
    (3, 3, 3, 500000, 25000, 1500000,N'Chưa ghi chú',0,N'thôn 8, huyện đạ hoai','2022-01-02',1,N'giamgia3'),
    (4, 4, 2, 900000, 20000, 1800000,N'Chưa ghi chú',1,N'369, Dương thị mười','2022-01-02',3,N'giamgia4'),
    (5, 5, 1, 1200000, 30000, 1200000,N'Chưa ghi chú',1,N' 58, trần thủ độ','2022-01-02',2,N'giamgia5'),
    (6, 6, 2, 1100000, 40000, 2200000,N'Chưa ghi chú',0,N'thôn 5, huyện đạ hoai','2022-01-02',1,N'giamgia6'),
    (6, 7, 1, 1900000, 20000, 1900000,N'Chưa ghi chú',0,N'thôn 4, huyện đạ hoai','2022-01-02',2,N'giamgia7'),
    (7, 8, 2, 1000000, 50000, 2000000,N'Chưa ghi chú',1,N'thôn 3, huyện đạ hoai','2022-01-02',2,N'giamgia8'),
    (8, 9, 3, 600000, 15000, 1800000,N'Chưa ghi chú',1,N'thôn 2, huyện đạ hoai','2022-01-02',1,N'giamgia5'),
    (9, 10, 1, 2400000, 30000, 2400000,N'Chưa ghi chú',1,N'thôn 1, huyện đạ hoai','2022-01-02',3,N'giamgia3');


go

CREATE PROC sp_BanHang(@MaSP nchar(10))
AS BEGIN
	SELECT 
		kh.TenKH TenKH,
		nv.TenNV TenNV,
		cthd.ghichu ghichu,
		cthd.PTNH Phuongthucthanhtoan,
		cthd.diachiNH diachi,
		cthd.PhiVanChuyen phivc,
		cthd.NgayGiao ngaygiao,
		cthd.trangthai ngaygiao,
		gg.MaVoucher MaVoucher

	FROM ChiTietHoaDon cthd
		JOIN HoaDon hd ON cthd.MaHoaDon =hd.MaHoaDon
		JOIN NhanVien nv ON nv.MaNV =hd.MaNV
		JOIN KhachHang kh ON kh.MaKH =hd.MaKH
		JOIN MaGG gg ON gg.MaVoucher =cthd.MaVoucher
	WHERE cthd.MaSanPham = @MaSP
	group BY kh.TenKH,nv.TenNV,cthd.ghichu,cthd.PTNH ,cthd.diachiNH ,cthd.PhiVanChuyen ,cthd.NgayGiao ,cthd.trangthai ,gg.MaVoucher  
END
drop proc sp_Hoadon
execute  sp_BanHang @MaSP = '1';
go

CREATE PROC sp_Hoadon
AS BEGIN
	SELECT 
		kh.TenKH TenKH,
		Kh.SoDienThoai Sdtkh,
		hd.MaNV MaNV,
		hd.NgayLap NgayTao,
		cthd.SoLuong SoLuong,
		CAST(cthd.SoLuong*sp.GiaBan as integer) tienhang,
		CONVERT(int,cthd.PhiVanChuyen) PhiVanChuyen,
		CONVERT(int,(gg.Giamgia*sp.GiaBan)/100) giagiam,
		CONVERT(int,(cthd.SoLuong*sp.GiaBan+cthd.DonGia)-cthd.PhiVanChuyen-((gg.Giamgia*sp.GiaBan)/100)) tongtien,
		cthd.ghichu ghichu

	FROM HoaDon hd
		JOIN ChiTietHoaDon cthd  ON cthd.MaHoaDon =hd.MaHoaDon
		JOIN KhachHang kh ON kh.MaKH =hd.MaKH
		JOIN MaGG gg ON gg.MaVoucher =cthd.MaVoucher
		JOIN SanPham sp ON sp.MaSanPham=cthd.MaSanPham

	group BY kh.TenKH,Kh.SoDienThoai ,hd.MaNV,hd.NgayLap,sp.GiaBan,cthd.DonGia,gg.Giamgia,cthd.SoLuong,cthd.PhiVanChuyen,cthd.ghichu
END
execute  sp_cacsanpham ;
drop proc sp_cacsanpham
go

CREATE PROC sp_cacsanpham 
AS BEGIN
	SELECT	
		sp.TenSanPham Tensp,
		sp.GiaBan giaban,
		CONVERT(int,(gg.Giamgia*sp.GiaBan)/100) giasale,
		cthd.SoLuong SoLuong,
		CAST( sp.GiaBan-((gg.Giamgia*sp.GiaBan)/100) as integer) thanhtien
	FROM ChiTietHoaDon cthd
		JOIN MaGG gg ON gg.MaVoucher =cthd.MaVoucher
		JOIN SanPham sp ON sp.MaSanPham=cthd.MaSanPham

	group BY sp.TenSanPham,sp.GiaBan,gg.Giamgia,cthd.SoLuong
END