import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RobloxRunner {

	
	static Colorers Sp1=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(193,56,24),new Color(104,76,47),new Color(97,71,43),new Color(122,93,58),new Color(196,58,24),new Color(186,52,22),new Color(185,51,22),new Color(185,51,22),new Color(190,55,23),new Color(188,54,22),new Color(191,56,23),new Color(120,86,52),new Color(174,49,20),new Color(194,56,24),new Color(104,76,47),new Color(104,76,46),new Color(121,93,57),new Color(196,58,24),new Color(186,52,22),new Color(185,51,22),new Color(185,51,22),new Color(191,55,23),new Color(188,54,22),new Color(191,56,23),new Color(120,86,52),new Color(174,49,20),new Color(103,76,46),new Color(103,76,46),new Color(103,75,46),new Color(128,98,62),new Color(120,91,56),new Color(112,85,51),new Color(110,84,51),new Color(117,88,54),new Color(115,88,54),new Color(188,54,22),new Color(191,56,23),new Color(120,86,51),new Color(174,49,20))),25);
	static Colorers Sp2=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(99,73,43),new Color(179,49,21),new Color(174,48,20),new Color(172,47,20),new Color(162,43,17),new Color(161,42,17),new Color(161,43,17),new Color(106,77,44),new Color(114,88,52),new Color(101,77,45),new Color(171,49,20),new Color(66,137,183),new Color(64,135,182),new Color(99,73,43),new Color(180,49,22),new Color(176,49,20),new Color(174,48,20),new Color(163,43,17),new Color(161,43,17),new Color(162,43,17),new Color(107,77,44),new Color(170,47,19),new Color(101,77,45),new Color(171,49,20),new Color(56,125,170),new Color(58,127,173),new Color(98,73,42),new Color(180,49,22),new Color(177,49,20),new Color(174,48,20),new Color(164,43,17),new Color(162,43,17),new Color(162,43,17),new Color(107,77,44),new Color(170,47,19),new Color(101,77,45),new Color(171,49,20),new Color(54,121,167),new Color(56,124,170))),25);
	static Colorers Sp3=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(61,117,52),new Color(146,249,137),new Color(215,154,43),new Color(69,153,63),new Color(150,250,141),new Color(214,139,38),new Color(148,249,138),new Color(146,249,138),new Color(149,250,140),new Color(211,161,46),new Color(209,144,42),new Color(50,74,49),new Color(196,82,58),new Color(60,117,54),new Color(67,146,60),new Color(147,249,137),new Color(68,152,62),new Color(208,159,44),new Color(147,249,138),new Color(146,249,137),new Color(205,126,35),new Color(149,249,140),new Color(210,159,45),new Color(61,134,57),new Color(50,74,52),new Color(30,228,254),new Color(138,159,67),new Color(144,249,135),new Color(146,249,137),new Color(147,249,137),new Color(147,249,137),new Color(146,249,137),new Color(146,249,136),new Color(206,147,40),new Color(58,140,53),new Color(54,130,49),new Color(57,115,53),new Color(49,72,51),new Color(196,88,78))),25);
	static Colorers Sp4=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(101,73,41),new Color(102,74,41),new Color(103,74,42),new Color(103,75,42),new Color(104,76,42),new Color(105,76,43),new Color(106,76,44),new Color(118,87,51),new Color(136,102,62),new Color(179,51,19),new Color(179,51,19),new Color(171,46,18),new Color(172,46,18),new Color(101,73,41),new Color(101,74,41),new Color(103,74,42),new Color(103,75,42),new Color(104,76,42),new Color(104,76,43),new Color(105,76,43),new Color(117,86,50),new Color(135,102,62),new Color(178,50,19),new Color(179,51,19),new Color(171,46,17),new Color(172,46,18),new Color(100,72,40),new Color(101,73,41),new Color(102,74,41),new Color(103,74,42),new Color(104,75,42),new Color(104,76,43),new Color(105,76,43),new Color(116,85,49),new Color(135,102,61),new Color(149,116,70),new Color(150,117,71),new Color(151,117,71),new Color(151,117,72))),25);
	static Colorers Sp5=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(163,42,16),new Color(108,80,49),new Color(108,80,49),new Color(169,45,17),new Color(169,45,17),new Color(159,41,15),new Color(159,41,15),new Color(161,42,16),new Color(170,46,17),new Color(120,87,51),new Color(160,41,15),new Color(97,70,38),new Color(170,46,17),new Color(163,42,16),new Color(108,80,48),new Color(108,80,48),new Color(169,45,17),new Color(169,45,17),new Color(159,41,15),new Color(159,41,15),new Color(161,42,15),new Color(170,46,17),new Color(120,86,51),new Color(160,41,15),new Color(97,70,38),new Color(170,46,17),new Color(163,42,16),new Color(162,42,16),new Color(107,80,48),new Color(107,80,48),new Color(169,45,17),new Color(159,41,15),new Color(159,41,15),new Color(161,42,15),new Color(170,46,17),new Color(119,86,51),new Color(159,41,15),new Color(97,69,38),new Color(169,45,17))),25);
	static Colorers Sp6=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(252,187,10),new Color(252,184,9),new Color(175,49,17),new Color(39,45,38),new Color(159,41,15),new Color(158,41,15),new Color(165,44,16),new Color(94,68,36),new Color(100,71,39),new Color(93,66,35),new Color(165,44,16),new Color(158,41,15),new Color(157,40,15),new Color(206,73,15),new Color(252,186,10),new Color(65,50,38),new Color(167,45,16),new Color(158,41,15),new Color(157,40,14),new Color(165,44,16),new Color(93,67,36),new Color(99,70,38),new Color(93,65,35),new Color(165,44,16),new Color(158,41,15),new Color(157,40,15),new Color(164,97,50),new Color(210,79,17),new Color(59,43,30),new Color(37,41,32),new Color(39,45,38),new Color(156,40,14),new Color(164,44,16),new Color(93,67,35),new Color(164,44,16),new Color(91,64,35),new Color(165,44,16),new Color(158,41,15),new Color(157,40,15))),25);
	static Colorers Sp7=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(154,90,96),new Color(138,245,249),new Color(136,244,250),new Color(155,83,91),new Color(138,245,249),new Color(147,75,104),new Color(139,245,250),new Color(158,100,138),new Color(159,99,124),new Color(160,100,107),new Color(145,246,250),new Color(136,244,249),new Color(149,38,19),new Color(47,87,136),new Color(49,93,132),new Color(147,96,120),new Color(37,80,101),new Color(136,244,249),new Color(147,80,93),new Color(140,245,250),new Color(138,245,249),new Color(56,121,151),new Color(159,84,111),new Color(140,245,250),new Color(46,73,79),new Color(149,37,22),new Color(154,86,98),new Color(155,86,96),new Color(138,245,249),new Color(138,245,249),new Color(137,245,249),new Color(137,245,249),new Color(140,245,249),new Color(137,245,250),new Color(137,245,249),new Color(54,110,125),new Color(56,119,144),new Color(48,82,129),new Color(46,66,98))),25);
	static Colorers Sp8=new Colorers(610,911,26,80,new ArrayList<>(List.of(new Color(147,115,101),new Color(140,227,252),new Color(142,228,252),new Color(134,125,155),new Color(144,229,252),new Color(141,227,252),new Color(139,227,252),new Color(137,226,252),new Color(136,224,251),new Color(138,140,175),new Color(81,130,188),new Color(142,230,252),new Color(146,234,253),new Color(56,65,71),new Color(134,224,251),new Color(143,228,252),new Color(138,226,252),new Color(144,229,252),new Color(138,226,252),new Color(144,229,252),new Color(141,227,252),new Color(140,227,252),new Color(140,227,252),new Color(136,148,185),new Color(136,226,251),new Color(145,232,252),new Color(56,62,61),new Color(69,102,148),new Color(137,226,251),new Color(138,226,251),new Color(137,225,251),new Color(137,226,251),new Color(137,225,251),new Color(135,224,251),new Color(137,225,251),new Color(136,224,251),new Color(134,224,251),new Color(137,225,251),new Color(136,225,251))),25);
	static Colorers Loading =new Colorers(473,1334,81,290,new ArrayList<>(List.of(new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45),new Color(45,45,45))),100);
	static Colorers RndDone =new Colorers(890,1035,711,739,new ArrayList<>(List.of(new Color(255,0,0),new Color(255,0,0),new Color(255,0,0),new Color(255,0,0),new Color(255,0,0),new Color(255,0,0),new Color(255,0,0),new Color(255,0,0),new Color(211,1,1),new Color(229,187,187),new Color(255,255,255),new Color(181,62,62),new Color(168,28,28),new Color(211,141,141),new Color(226,181,181),new Color(255,0,0))),20);
	static Colorers InHub =new Colorers(1180,1194,725,733,new ArrayList<>(List.of(new Color(121,121,121),new Color(137,137,137),new Color(121,121,121),new Color(137,137,137),new Color(121,121,121),new Color(154,154,154))),5);
	static Colorers CanSkip =new Colorers(855,939,226,245,new ArrayList<>(List.of(new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(70,147,0),new Color(37,198,0),new Color(66,153,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0))),10);
	static Colorers IsPlay =new Colorers(204,722,694,722,new ArrayList<>(List.of(new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111),new Color(0,176,111))),30);
	static Colorers Disconnect = new Colorers(1043,1140,534,558,new ArrayList<>(List.of(new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61),new Color(57,59,61))),10);
	static Colorers InGame = new Colorers(25,90,353,424,new ArrayList<>(List.of(new Color(12,16,17),new Color(12,16,17),new Color(12,16,17),new Color(19,25,26),new Color(126,36,57),new Color(54,54,54),new Color(25,34,35),new Color(128,35,56),new Color(168,35,56))),25);
	static Colorers CanUpgd =new Colorers(1002,1144,702,705,new ArrayList<>(List.of(new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0),new Color(0,255,0))),10);
	static Colorers DailyReward =new Colorers(895,1035,629,677,new ArrayList<>(List.of(new Color(43,43,43),new Color(43,43,43),new Color(43,43,43),new Color(43,43,43),new Color(42,42,42),new Color(37,37,37),new Color(37,37,37),new Color(42,42,42))),45);
	static Colorers InCross = new Colorers(789,1044,732,778,new ArrayList<>(List.of(new Color(43,97,131),new Color(163,177,122),new Color(65,102,119),new Color(69,94,117),new Color(90,116,130),new Color(255,255,255),new Color(28,66,82),new Color(53,94,113),new Color(49,134,116),new Color(63,148,124),new Color(58,138,112),new Color(13,63,59),new Color(122,68,76),new Color(32,90,119),new Color(35,87,116),new Color(32,82,110),new Color(44,91,124),new Color(36,89,121),new Color(44,97,128),new Color(9,71,82),new Color(53,142,125),new Color(61,104,127),new Color(56,140,118),new Color(53,117,97),new Color(62,139,108),new Color(60,128,91),new Color(47,50,51),new Color(56,60,68),new Color(69,89,69),new Color(63,66,77),new Color(70,73,81),new Color(54,57,66),new Color(20,47,21),new Color(79,139,81),new Color(118,117,116),new Color(69,125,70),new Color(65,46,33),new Color(66,120,66),new Color(34,80,53))),20);
	static Colorers InEvent =new Colorers(689,888,491,585,new ArrayList<>(List.of(new Color(49,8,0),new Color(71,11,0),new Color(98,18,0),new Color(97,11,0),new Color(145,42,0),new Color(170,36,0),new Color(175,44,0),new Color(102,45,0),new Color(111,37,0),new Color(133,47,0),new Color(121,42,8),new Color(124,44,8),new Color(111,18,0),new Color(193,106,0),new Color(86,28,0),new Color(71,17,1),new Color(82,53,64),new Color(217,131,32),new Color(103,31,15),new Color(85,15,6),new Color(235,175,0),new Color(187,62,0),new Color(130,87,31),new Color(150,152,175),new Color(127,74,86),new Color(96,33,13),new Color(80,53,63),new Color(121,54,1))),30);
	static Colorers WorkOnline =new Colorers(128,490,415,755,new ArrayList<>(List.of(new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(97,115,145),new Color(63,77,95),new Color(99,117,146),new Color(99,117,146),new Color(255,200,105),new Color(255,190,125),new Color(70,83,104),new Color(196,148,114),new Color(70,83,104),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105),new Color(255,200,105))),75);
	static Colorers at800 =new Colorers(648,853,910,938,new ArrayList<>(List.of(new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(177,126,36),new Color(177,126,36),new Color(255,255,255),new Color(255,255,255),new Color(179,130,43),new Color(255,255,255),new Color(255,255,255),new Color(255,255,255),new Color(212,184,135),new Color(177,126,36),new Color(177,126,36),new Color(177,126,36),new Color(231,215,186))),15);
	static Colorers StWorking =new Colorers(1273,1549,674,761,new ArrayList<>(List.of(new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88),new Color(255,205,88))),50);
	static Colorers PayNow =new Colorers(1651,1754,782,819,new ArrayList<>(List.of(new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(128,194,145),new Color(85,255,127),new Color(85,255,127))),20);
	static Colorers Cont =new Colorers(858,1073,944,976,new ArrayList<>(List.of(new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(255,255,255),new Color(85,255,127),new Color(85,255,127),new Color(240,255,243),new Color(255,255,255),new Color(255,255,255),new Color(85,255,127),new Color(255,255,255),new Color(255,255,255),new Color(85,255,127),new Color(255,255,255),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(85,255,127),new Color(193,255,208),new Color(255,255,255),new Color(91,255,132),new Color(240,255,243),new Color(255,255,255),new Color(255,255,255),new Color(85,255,127),new Color(255,255,255),new Color(255,255,255),new Color(98,255,137),new Color(255,255,255),new Color(184,255,201),new Color(85,255,127),new Color(85,255,127))),15);
	
	
	public static void p(String a) {//print line to terminal
		System.out.println(a);
	}
	
	public static void click(int x,int y) throws Exception {//click x,y position then move mouse away
		AutoType a = new AutoType();
		GlidingMoose b = new GlidingMoose();
		b.mouseGlide(x, y, 300);
		Thread.sleep(150);
		a.click();
		Thread.sleep(150);
		b.mouseGlide(1589, 1001, 300);
	}
	
	public static void LeaveGame() throws Exception {
		FQuit();
		/*
		AutoType a = new AutoType();
		a.escape();
		a.type("l");
		click(866,479);*/
	}
	
	public static void FQuit() throws Exception{
		click(1914,12);
	}
	public static boolean MoveToGame() throws Exception{
		AutoType tp = new AutoType();
		int d=24;
		boolean ab=false;
		if(Sp1.check(d)) {
			tp.doe("w",2000);
			tp.does("wd");
			tp.doe("w",2000);
			if(InHub.check())
				ab=true;
		}else if(Sp2.check(d)) {
			tp.doe("w",1200);
			tp.does("wa",5000);
			if(InHub.check())
				ab=true;
		}else if(Sp3.check(d)) {
			tp.doe("a",5000);
			tp.does("aw");
			if(InHub.check())
				ab=true;
		}else if(Sp4.check(d)) {
			tp.doe("a");
			tp.does("as");;
			tp.doe("a",500);
			tp.does("as",7000);
			if(InHub.check())
				ab=true;
		}else if(Sp5.check(d)) {
			tp.doe("a",1300);
			tp.does("as");
			tp.doe("s",8000);
			if(InHub.check())
				ab=true;
		}else if(Sp6.check(d)) {
			tp.does("sd",6000);
			tp.doe("s",5000);
			if(InHub.check())
				ab=true;
		}else if(Sp7.check(d)) {
			tp.doe("d",2000);
			tp.does("ds",6000);
			tp.doe("d",4000);
			if(InHub.check())
				ab=true;
		}else if(Sp8.check(d)) {
			tp.doe("w",1500);
			tp.doe("d",5000);
			if(InHub.check())
				ab=true;
		}
		
		return ab;
	}
	
	public static void main(String[] args)throws Exception{
		boolean inLobby =false;
		boolean inGame =false;
		boolean gametime=false;
		
		Scanner scan = new Scanner(System.in);
		AutoType tp = new AutoType();
		GlidingMoose cl = new GlidingMoose();
		
		while (true){
			p("Type 1 for Hard Core grinding. Type 2 for Event grinding. Type 3 for AFK");
			String value = scan.nextLine();
			
			if(value.equals("1")) {
				while(true) {//while loop for hard core grinding
					
					if(IsPlay.check()) {//starts game
						click(500,700);
					}
					
					if(Loading.check()) {//waits through loading screen and lets objects load
						while(Loading.check()) {
							Thread.sleep(50);
						}
						if(inLobby==false)
							inLobby=true;
						Thread.sleep(4700);
						boolean inHub1=InGame.check();
						if(InGame.check()) {
							if(!MoveToGame()) {
								Thread.sleep(2000);
								if(!MoveToGame())
									FQuit();
							}
							if(InCross.check()) {
								gametime=true;
							}
						} else {
							/*if(gametime) {
								click(615,1061);
								click(154,49);
								click(220,652);
								gametime=false;
								Thread.sleep(410000);
							}else {*/
								tp.doe("1");
								click(971,797);
								//}
						}
						
					}
					if(DailyReward.check(4))
						click(950,645);
					
					if(Disconnect.check(5))
						FQuit();
					
					if(CanSkip.check(10))
						click(900,230);
					
					if(CanUpgd.check(15))
						click(1064,690);
					
					if(RndDone.check(5)) {
						click(950,720);
						Thread.sleep(3000);
					}
					
				}
				
			}else if(value.equals("2")) {
				p("This has not been coded yet");
				p("Psyche!");
				while (true) {
					if(IsPlay.check()) {//starts game
						click(500,700);
					}
					if(Loading.check()) {
						while(Loading.check()) {
							Thread.sleep(50);
						}
						Thread.sleep(4000);
						if(InGame.check()) {
							tp.doe("s",2000);
							if(InEvent.check()) {
								click(782,541);
							}else {
								FQuit();
							}
						}
					}
					
					if(RndDone.check(5)) {
						click(950,720);
						Thread.sleep(3000);
					}
					
					if(DailyReward.check(4))
						click(950,645);
					
					if(Disconnect.check(5))
						FQuit();
					
				}
				
				
			}else if(value.equals("3")) {
				Thread.sleep(3000);
				while(true) {
				if(StWorking.check(5)) {
					click(1377,723);
					for(int q = 5;q>=0;q++) {
						tp.type("u");
						Thread.sleep(5);
						if(q%250==0){
						if(PayNow.check(5))
							click(1708,801);
						if(at800.check(5))
							break;
						}
					}
				}else if(WorkOnline.check(5)) {
					click(337,587);
				}else if(at800.check(5)) {
					click(808,727);
				}else if(Cont.check(5)) {
					click(947,973);
					tp.type(" ad");
					Thread.sleep(500);
					tp.type("e");
				}
			}
				}else if(value.equals("4")) {
					System.out.println(WorkOnline.check(5));
					System.out.println(Cont.check(5));
					System.out.println(StWorking.check(5));
					System.out.println(PayNow.check(5));
				}
			
			
			
		}
		
	}
	
}
