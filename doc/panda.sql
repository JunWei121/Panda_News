/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : panda

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 08/07/2019 11:20:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `cid` int(20) NOT NULL AUTO_INCREMENT,
  `Ccontent` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `Nid` int(20) NULL DEFAULT NULL,
  `Uid` int(20) NULL DEFAULT NULL,
  `CReleaseTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, 'C罗牛逼！！！！！！', 1, 1, '2019-07-08 11:06:23');
INSERT INTO `comment` VALUES (2, 'C罗牛逼！！！！！！C罗牛逼！！！！！！C罗牛逼！！！！！！ 顶上去', 1, 1, '2019-07-08 11:06:59');
INSERT INTO `comment` VALUES (3, '分数好高啊 ！  还好考的早！', 5, 1, '2019-07-08 11:07:21');
INSERT INTO `comment` VALUES (4, '全新的系统UI视觉全新的系统UI视觉全新的系统UI视觉', 11, 1, '2019-07-08 11:07:42');
INSERT INTO `comment` VALUES (5, '华仔好帅啊！！！！！！1', 10, 1, '2019-07-08 11:07:59');
INSERT INTO `comment` VALUES (6, '学霸加美女！！！！！！', 3, 1, '2019-07-08 11:08:17');
INSERT INTO `comment` VALUES (7, '国足可拉到吧！', 7, 1, '2019-07-08 11:08:36');
INSERT INTO `comment` VALUES (8, '谁能想到02年不是起点，是巅峰！', 7, 1, '2019-07-08 11:09:09');
INSERT INTO `comment` VALUES (9, '退坑，有缘江湖再见', 9, 1, '2019-07-08 11:09:33');
INSERT INTO `comment` VALUES (10, '川普： 隐形守护者', 4, 1, '2019-07-08 11:10:01');
INSERT INTO `comment` VALUES (11, '川国强 加油啊', 4, 1, '2019-07-08 11:10:27');
INSERT INTO `comment` VALUES (12, '我的中国心', 4, 4, '2019-07-08 11:11:03');
INSERT INTO `comment` VALUES (13, '支持川普', 4, 4, '2019-07-08 11:12:21');
INSERT INTO `comment` VALUES (14, 'H支持小米', 11, 4, '2019-07-08 11:14:01');
INSERT INTO `comment` VALUES (15, '雷军牛逼', 11, 2, '2019-07-08 11:15:04');
INSERT INTO `comment` VALUES (16, '坎坎坷坷', 11, 2, '2019-07-08 11:15:23');
INSERT INTO `comment` VALUES (17, 'c罗还能再战五百年', 1, 2, '2019-07-08 11:18:03');
INSERT INTO `comment` VALUES (18, 'c罗 会踢球中最帅的，帅哥中种最会踢球的', 1, 2, '2019-07-08 11:19:44');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `NId` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UId` int(11) NULL DEFAULT NULL,
  `ReleaseTime` datetime(0) NULL DEFAULT NULL,
  `UpdateTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `NContent` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `sortId` int(11) NULL DEFAULT NULL,
  `clicks` int(10) UNSIGNED NULL DEFAULT 0,
  `cover` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`NId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, 'C罗帽子戏法救主', 1, '2019-07-08 10:14:11', '2019-07-08 10:14:48', '<h1>C罗帽子戏法救主</h1><br>\r\n\r\n<p><span style=\"font-size: 20px;\">世界足坛有很多的帽子戏法，但是能够在职业生涯超过50个帽子戏法的球员，也许只有梅西和C罗，C罗职业生涯已经打进53个帽子戏法，梅西紧随其后，也闯进了50大关，恐怖的是，他们仍旧有机会创造历史，也许能够打破这个纪录的也只有他们自己。</span></p>\r\n\r\n<p align=\"center\"><img src=\"img/d52a2834349b033b72ee7ba263f332d6d539bd22.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\n\r\n<p align=\"center\">C罗帽子戏法救主。</p>\r\n\r\n<p><span style=\"font-size: 20px;\">18/19赛季的欧冠淘汰赛，C罗所在的尤文在首回合，0-2不敌马竞，由于双方势均力敌，马竞看到了晋级的希望，但是这一切都被C罗摧毁，次回合回到尤文主场，C罗带队火力全开，帮助尤文3-0淘汰马竞，C罗帽子戏法功不可没。</span></p>', 1, 8500, 'img/d52a2834349b033b72ee7ba263f332d6d539bd22.jpg');
INSERT INTO `news` VALUES (2, '西班牙2:2摩洛哥 凭进球优势小组第一出线', 1, '2019-07-08 10:15:18', '2019-07-08 10:16:25', '\r\n<h1>西班牙2:2摩洛哥 凭进球优势小组第一出线</h1><br>\r\n\r\n<p><span style=\"font-size: 20px;\">2018年世界杯中，西班牙对阵摩洛哥。摩洛哥已小组出局，本场比赛将为荣誉而战。西班牙本场比赛打平即可出线。上半场，布塔伊卜抓住对方失误的机会，单刀破门得分，西班牙伊斯科破门扳平比分。下半场第80分钟，恩内斯里头槌破门，再度领先。第92分钟，阿斯帕斯破门再次扳平比分。最终，西班牙2-2战平摩洛哥，西班牙凭借进球优势获得小组头名出线。 </span></p>\r\n\r\n<p align=\"center\"><img src=\"img/20180626064402269.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\n\r\n<p align=\"center\">伊斯科一脚低射，被莫尼尔没收。</p>\r\n\r\n<p><span style=\"font-size: 20px;\"> 第11分钟，西班牙右路配合，卡瓦哈尔直传，席尔瓦传中横传门前滑门而过。<br><br>\r\n\r\n第13分钟，拉莫斯和伊涅斯塔在后场配合失误，布塔伊卜断球长驱直入，破门得分。摩洛哥1-0领先西班牙。<br><br>\r\n\r\n第19分钟，伊涅斯塔在禁区左侧得球，在禁区底线倒三角回传，伊斯科在小禁区前沿右脚爆射破门。西班牙1-1摩洛哥。<br><br>\r\n\r\n第25分钟，摩洛哥中场左侧边线球掷出，布塔伊卜单刀杀入禁区，德赫亚封堵出射门。<br><br>\r\n\r\n第43分钟，摩洛哥将球推进到前场，阿什拉夫把球横抽到中前场中路，齐耶赫左脚张弓搭箭，皮球高出了横梁。<br><br>\r\n\r\n易边再战，第55分钟，阿姆拉巴特在禁区前沿右侧张弓搭箭，皮球打到了门柱横梁的交界处。<br><br>\r\n\r\n第61分钟，卡瓦哈尔前场右路将球斜传到禁区，伊斯科头球攻门，赛伊斯在门线头球将球解围。<br><br>\r\n\r\n第68分钟，科斯塔在对方禁区将球回传，蒂亚戈在防守球员干扰下射门打高。<br><br>\r\n\r\n第80分钟，摩洛哥恩内斯里接角球，力压拉莫斯头槌破门。摩洛哥2-1领先西班牙。<br><br>\r\n\r\n第92分钟，西班牙队采取战术角球，皮球传到小禁区前沿的阿斯帕斯，阿斯帕斯将球推射入网。经过视频助理裁判确认，阿斯帕斯破门有效。西班牙2-2摩洛哥。 </span></p>', 1, 8800, 'img/20180626064402269.jpg');
INSERT INTO `news` VALUES (3, '清秀女孩高考723分，超一本线200分，被赞学霸', 1, '2019-07-08 10:16:40', '2019-07-08 10:23:38', '\r\n<h1>清秀女孩高考723分，超一本线200分，被赞学霸</h1><br>\r\n\r\n<p><span style=\"font-size: 20px;\">高考诞生了许多“高考状元”，谈起高考学霸亦或是高考状元，他们都是许多人羡慕的对象，每一位高考状元的背后都有着自己的奋斗故事，他们也并非是天赋异禀，只是比他人更加的努力，有着很强的自我管理能力，能够合理地安排自己的学习规划，而且只有我们懂得努力，其实每个人也可以成为高考学霸。</span></p>\r\n\r\n<p align=\"center\"><img src=\"lmjimg/ykCd-heirxyf5011435.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\n\r\n<p align=\"center\">高颜值女孩。</p>\r\n\r\n<p><span style=\"font-size: 20px;\">杨承絮从小学习认真，是老师和同学眼中的学霸，考试常常是名列前茅，他也成为了同学们的“小老师”，经常帮助周边的同学，为他们讲解一些知识难点，杨晨煜曾参加全国中学生物理竞赛，还赢得一枚金牌，他对于物理、生物学科颇有兴趣。</span></p>\r\n\r\n<p><span style=\"font-size: 20px;\">其实令人羡慕的除了杨承絮取得723分的高分之外，更令人羡慕的是他的家庭背景，杨承絮可以说是出生于书香门第，爸妈都是高材生，爸爸毕业于清华大学，妈妈毕业于上海交通大学，在这么好的家庭背景下，不出人才才怪呢。</span></p>', 6, 9000, 'lmjimg/ykCd-heirxyf5011435.jpg');
INSERT INTO `news` VALUES (4, '安倍搅局“特金会” 黄金多头极有可能被最后一根稻草托起', 1, '2019-07-08 10:19:50', '2019-07-08 10:23:47', '<h1>安倍搅局“特金会” 黄金多头极有可能被最后一根稻草托起</h1><br>\r\n\r\n<p><span style=\"font-size: 20px;\">据报道，美国白宫确认美国总统特朗普与日本首相安倍晋三计划在美朝峰会之前进行会面，并且美国总统特朗普和日本首相安倍晋三称必须要实现朝鲜无核化。<br>朝鲜实现无核化，是大势所趋，也是朝鲜以及各国盼望已久的愿望。今年，金正恩突然转变以往的封锁政策，开始与世界各国进行接触，说明朝鲜政府的工作重心已经发生了变化，由原来的强军政治转变为经济建设。</span></p>\r\n\r\n<p align=\"center\"><img src=\"img/1527574860578784.png\" width=\"700\" class=\"wp-image-3132106 size-full fr-fin\" height=\"460\"></p>\r\n\r\n<p align=\"center\">欧盟周三将施压美国,就钢铝关税豁免作最后努力。</p>\r\n\r\n<p><span style=\"font-size: 20px;\">据报道，欧盟最高贸易官员西西莉亚·玛姆斯托姆将于周三在巴黎与美国同级官员举行会晤。欧盟官员称，届时她将向美国商务部长罗斯施压，以便在周五的最后期限前获得钢铝关税豁免。这是欧盟寻求获得美国钢铝关税豁免的最后努力。玛姆斯托姆周三还将与美国贸易代表莱特希泽会面，谈论全球贸易议程，日本经济产业大臣世耕弘成周四将加入他们的会谈，一起推动联合应对不公平贸易行为。</span></p>\r\n', 2, 8000, 'img/1527574860578784.png');
INSERT INTO `news` VALUES (5, '刷屏！2019年全国各省高考分数线发布后，这些省的考生哭了', 6, '2019-07-08 10:22:00', '2019-07-08 10:23:50', '\r\n\r\n\r\n<h1>刷屏！2019年全国各省高考分数线发布后，这些省的考生哭了</h1><br>\r\n\r\n<p><span style=\"font-size: 20px;\">20天前，2019年高考笔试谢幕，考生们的心情渐渐平息；20天后，随着全国各省份分数线全部发布完毕，考生们的心情又渐起波澜。</span></p>\r\n\r\n<p align=\"center\"><img src=\"img/f31fbe096b63f6247569f1c9a74de7fd1b4ca3d6.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\n\r\n<p align=\"center\">国家的栋梁们。</p>\r\n\r\n<p><span style=\"font-size: 20px;\">目前，全国各省份的高考分数线全部公布。有的省份高，有的省份低，有的省分数线比往年高，有的省分数线比去年低，真是“月亮弯弯照九州，几家欢乐几家愁”。下面汇总了2019年全国31个省区市的高考分数线，让我们与考生们一起去体味其中的欢乐与悲伤：</span></p>\r\n\r\n<p align=\"center\"><img data-pagespeed-url-hash=\"2997403130\" src=\"img/2cf5e0fe9925bc31f9ca8b2e74d681b4ca1370fb.jpg\" alt=\"\" width=\"500\" class=\"wp-image-3132105 size-full fr-fin\" height=\"800\"></p>\r\n\r\n<p align=\"center\">各省录取分数线</p>\r\n\r\n<p><span style=\"font-size: 20px;\">考生们，你们看了全国各省份的高考分数线后，有何感想呢？这些分数线居高的省份，竞争力又是大小呢？听说最悲惨的省份是四川省，这也是今年最先公布分数线的省份，分数线一公布后，很多考生瞬间哭了，分数线天高，700分上不了“清北”。唉！高考呀，高考，真是“令人欢喜令人忧”“成也萧何，败也萧何”。同时，欢迎考生们在留言区内发表评论。</span></p>', 6, 10000, 'img/f31fbe096b63f6247569f1c9a74de7fd1b4ca3d6.jpg');
INSERT INTO `news` VALUES (6, '社保基数7月起上调 你到手的工资要变了！', 6, '2019-07-08 10:24:17', '2019-07-08 10:25:20', '<h1>社保基数7月起上调 你到手的工资要变了！</h1><br>\r\n\r\n<p><span style=\"font-size: 20px;\">每年7月，很多地区的社保缴费基数迎来调整期，近期北京、天津、上海、重庆、山西、新疆、江苏等省市相继公布了2018年社保缴费基数。一般来说，随着职工工资的上涨，每年社保缴费基数都是上调的，职工的到手工资也会发生变化。</span></p>\r\n\r\n<p align=\"center\"><img src=\"img/456456456.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\n\r\n<p align=\"center\">社保缴费基数上限和下限。</p>\r\n\r\n<p><span style=\"font-size: 20px;\">你当前的工资和你的社保缴费基数有可能相同，也有可能不同，如果你是老员工的话，那么不同的概率较大，新员工则都是相同的。<br>\r\n\r\n假设你是一名老员工，2018年的工资为10000元/月，当前的社保缴费基数为8000元/月（2016年的平均月薪），五险一金每个月要扣除8000*（8％+0.2％+2％+12％）+3=1779元，10000-1779=8221元，再减去3500元的个税起征点，剩下的4721元为应纳税所得额，带入个税公式，需要缴纳389元个税。<br>\r\n\r\n最终到手的工资是10000-1779-389.2=7831.8元。<br>\r\n\r\n7月之后社保缴费基数上调至9500元，工资为10000元不变，五险一金每个月要扣除9500*（8％+0.2％+2％+12％）+3=2112元，10000-2112=7888元，减去3500元的个税起征点，剩下的4388元为应纳税所得额，需要缴纳的个税为333.8元。<br>\r\n\r\n最终到手的工资是10000-2112-333.8=7554.2元。<br>\r\n\r\n社保基数每个月上调了1500元之后，到手的工资反而少了277.6元。<br>\r\n\r\n融360理财分析师认为，虽然到手的工资减少了，但其实并非坏事，因为你的其它权益增加了，养老保险缴的多意味着以后能领取的养老金也多，医疗保险缴的多，个人账户中的钱也会变多，公积金就更不用说了，单位和个人缴纳的金额都纳入个人账户，卖房租房都可提取。</span></p>', 7, 8000, 'img/456456456.jpg');
INSERT INTO `news` VALUES (7, '国足同世界杯差在哪？还要中超推一把', 6, '2019-07-08 10:25:40', '2019-07-08 10:26:10', '<h1>国足同世界杯差在哪？还要中超推一把</h1><br>\r\n\r\n<p><span style=\"font-size: 20px;\">中国足球队没有来到世界杯，差在哪？相信所有人都会脱口而出：国足水平太差。</span></p><br>\r\n\r\n<p>的确，中国男足的水平不要说和世界杯参赛球队相比，即使在亚洲也算不上一流球队。凭心而论，中国男足整体水平有所提高，其实，最近几届世预赛国家队人员虽有有变化，但是大的骨架没有变，恒大为班底的国脚几乎都是历届国家队的主要构成人员，90年前后出生的国脚在某种程度上，个人能力并不如此前的85年龄段球员。那么，国家队的提高在哪里，实际上还要归结于联赛水平的提高。随着中超联赛最近几年加大投入，不断有高水平的外援、外教来到中超联赛，中国球员的个人能力也得到提高，其中一个最明显的例子就是，恒大球员在当初与孔卡、穆里奇、埃尔克森、高拉特、保利尼奥在一起训练和比赛，球员们都称比过去“涨球了”。</p>\r\n\r\n<p align=\"center\"><img src=\"img/nZWv-heirxyf4606956.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\n\r\n<p align=\"center\">中国足球真的很差吗？</p>\r\n\r\n<p><span style=\"font-size: 20px;\">要提高国家队的水平，从根本上还是要提高联赛质量。而提高联赛质量绝不仅仅是吸引天价外援，还是要提高参赛球队的整体竞技水平，具体的直接体现就是净打时间，只有这样才能提高本土球员的个人能力，继而让他们到了国家队也能有个高水平的起点，再配备高水平教练，才能大幅提高国家队的水平。可以想像，如果用两年的时间提高联赛质量，肯定有利于国家队冲击2022年世界杯。</span></p>', 1, 5600, 'img/nZWv-heirxyf4606956.jpg');
INSERT INTO `news` VALUES (8, '沃尔沃承诺3年内推4级自动驾驶汽车', 5, '2019-07-08 10:26:22', '2019-07-08 10:27:53', '<h1>沃尔沃承诺3年内推4级自动驾驶汽车</h1>\r<br>\r\r\n<p><span style=\"font-size: 20px;\">据国外媒体报道称，自动驾驶汽车的概念如今已经从美国国防高级研究计划局（Defense Advanced Research Projects Agency）的秘密实验室走到了街头巷尾，且这一速度比所有人预想中都更快一些。</span></p>\r\r\r\n<p align=\"center\"><img src=\"img/woerwo1.webp\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">沃尔沃自动驾驶新一代车型</p>\r\r\r\n<p><span style=\"font-size: 20px;\">那么，现在的问题就变成了“我们究竟什么时候可以购买到一辆全自动驾驶车型？”\r\n\r\n对此，瑞典车企沃尔沃就做出了比其他大多数竞争都更为具体、现实的承诺，即公司将在2021年推出拥有4级自动驾驶功能的车型，且这一车型将不仅仅放在展厅用于展示，而是普通消费者可以购买和实际上路的产品。当然，虽然4级自动驾驶并不等同于完全自动驾驶，但这一级别的车辆至少也可以使车主通勤的大部分操作实现完全自动化。\r\n\r\n消息称，沃尔沃推出的这项服务将称为“高速公路辅助”（Highway Assist），听起来类似特斯拉的Autopilot，但却比后者要安全的多。沃尔沃研发高级副总裁亨利克-格林（HenrikGreen）表示，这一系统将使车主在开车时能做任何事情，包括吃饭、睡觉、工作、看电影、放松。而且，它只会在已规划出来的适当道路上工作（比如高速公路），以确保行车安全。</span></p>\r\r\r\n<p align=\"center\">\r\n<img data-pagespeed-url-hash=\"2997403130\" src=\"img/woerwo2.jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132105 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">自动驾驶优势图</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n外界分析认为，沃尔沃的自动驾驶实现方式非常巧妙，同时也是我们向全自动驾驶车型进行过渡的最安全方式。目前许多汽车制造商正在打造半自动驾驶系统（类似于特斯拉的Autopilot），即汽车可以在绝大部分时间内实现自动驾驶。但其依旧需要人们保持警觉来确保安全，并在接到车辆警告后立即接管汽车。但这一模式的问题在于，人类通常会忽视汽车发出的所有警告，只要他们认为车子自己开的还不错就不会主动接管驾驶。\r\n\r\n因此沃尔沃正在研发的是一套更为“防呆”的自动驾驶系统，毕竟自动驾驶系统的安全与否取决于整个驾驶流程中最薄弱的一环。比如，如果车主处于醉酒或疲劳驾驶状态下，任何安全系统都无法保证其行车安全。目前的消息指出，这套“高速公路辅助”系统最初将安装在沃尔沃XC90 SUV车型上，成本达到数千美元。但随着后期物料成本的降低，该系统也将出现在沃尔沃其他车型中。\r\n</span></p>\r\r\r\n<p align=\"center\"><img src=\"img/woerwo3.jpg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">警方拘捕2名匪徒</p>\r\r\r\n<p><span style=\"font-size: 20px;\">事实上除了汽车以外，沃尔沃日前还在瑞典哥德堡现场展示了旗下自动驾驶游艇。当时，一艘搭载自动驾驶系统的68英尺游艇成功在两艘沃尔沃Ocean Race 65赛艇之间滑行。游艇搭载的传感器和计算机能够根据风和水的变化情况迅速做出调整，调整功率和沃尔沃IPS游艇操纵杆控制器，以确保游艇安全停靠。</span></p>', 3, 6000, 'img/woerwo2.jpeg');
INSERT INTO `news` VALUES (9, '《逆水寒》今日限号开服 会呼吸的江湖来了', 5, '2019-07-08 10:28:20', '2019-07-08 10:29:02', '<h1>《逆水寒》今日限号开服 会呼吸的江湖来了</h1>\r\r\r\n<p><span style=\"font-size: 20px;\">听雪封测刚过，转眼夏至已至。时光匆匆，《逆水寒》又和玩家一起走过了半个年头。</span></p>\r\r\r\n<p align=\"center\"><img src=\"img/nishuihan1.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\"></p>\r\r\r\n<p><span style=\"font-size: 20px;\">在整整五年的蛰伏之后，《逆水寒》为玩家们以及中国游戏行业带来了哪些前所未有的变化呢？</span></p>\r\r\r\n<p align=\"center\">\r\n<img data-pagespeed-url-hash=\"2997403130\" src=\"img/nishuihan2.jpg\" alt=\"\" width=\"704\" class=\"wp-image-3132105 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">游戏内容画面</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n按照两宋古籍、古画与存世文物，构建出如临其境的北宋市井。清明上河图的各种生活场景，一千年来首次被3D复原，漫步游戏中汴河两岸，如在画中；途经无名村庄，耳畔随时响起民歌小调。</span></p>\r\r\r\n<p align=\"center\"><img src=\"img/nishuihan3.jpg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">游戏内容画面</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n无论是“ 烟柳画桥,风帘翠幕,参差十万人家”的壮景，还是“杨柳岸，晓风残月”的柔美，又或是“左牵黄，右擎苍，千骑卷平冈”的豪迈，在游戏中都能找到意境还原，处处弥漫着大宋风雅。\r\n</span></p>', 5, 6050, 'img/nishuihan2.jpg');
INSERT INTO `news` VALUES (10, '刘德华金城武张艾嘉等获邀加入奥斯卡评委阵容', 5, '2019-07-08 10:29:36', '2019-07-08 10:43:40', '\r\n\r\n<h1>刘德华金城武张艾嘉等获邀加入奥斯卡评委阵容</h1>\r\r\r\n<p><span style=\"font-size: 20px;\">其中包括刘德华、金城武、张艾嘉，导演娄烨、刘健，编剧王蕙玲、严歌苓，影业高层王中磊、王中军、于冬等，获得奥斯卡投票资格。</span></p>\r\r\r\n<p align=\"center\"><img src=\"img/liudehua.jpg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">刘德华</p>\r\r\r\n<p><span style=\"font-size: 20px;\"></span></p>\r\r\r\n<p align=\"center\">\r\n<img data-pagespeed-url-hash=\"2997403130\" src=\"img/jinchengwu.jpg\" alt=\"\" width=\"704\" class=\"wp-image-3132105 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">金城武</p>\r\r\r\n<p><span style=\"font-size: 20px;\"></span></p>\r\r\n<p align=\"center\"><img src=\"img/zhangaijia.jpg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">张艾嘉</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n 据国外媒体报道，作为奥斯卡的主办方，美国电影艺术与科学学院每年都会招收大量的新会员，今年“招新”人数再破记录， 邀请928位新成员。其中包括刘德华、金城武、张艾嘉，导演娄烨[微博]、刘健，编剧王蕙玲、严歌苓，影业高层王中磊[微博]、王中军、于冬等华语电影人，获得奥斯卡投票资格。\r\n\r\n　　奥斯卡评委今年再次“扩招”，去年的邀请人数为774人，2016年是683人，2015年则是322人。如果所有新成员都接受，学院成员将增至9226席。\r\n\r\n　　去年有包括张曼玉、姜文、刘嘉玲[微博]、梁朝伟[微博]、甄子丹[微博]、范冰冰[微博]、冯小刚[微博]、陈可辛、许鞍华、杜琪峰等近20位华人入选。\r\n\r\n　　今年获邀成员中女性占49%，达历史新高。演员比例则占20%，还包括蒂莫西·柴勒梅德、布莱克·莱弗利、艾米莉亚·克拉克、伊娃·格林、黛西·雷德利、莉莉·柯林斯、科洛·莫瑞兹、蕾亚·赛杜、裴斗娜、金敏喜等。\r\n</span></p>', 4, 5730, 'images/l1.jpg');
INSERT INTO `news` VALUES (11, 'MIUI 10系统，是否真的十全十美呢', 1, '2019-07-08 10:30:28', '2019-07-08 10:31:42', '<h1>MIUI 10系统，是否真的十全十美呢</h1>\r\r\r\n<p><span style=\"font-size: 20px;\">随着MIUI系统的不断更新换代，从MIUI 1到MIUI 10着实给广大的米粉朋友们带来非常给力的体验，功能也是面向米粉朋友们的需要推陈出新，人性化的操作、交互都给米粉朋友们留下了深刻的印象！尤其是这次发布的MIUI10——AI加持的全面屏系统！着实打造出十全十美，快过闪电般基于Android的手机操作系统！无论是玩游戏、浏览网页、打开App，重要的内置小爱同学，AI拍照等，都技高一筹！MIUI 10 的第一个内测版本于2018年6月1日开始内测推送。首发适配机型有小米8、小米手机MIX 2S、小米6等，我也是第一时间体验到了“快过闪电”的MIUI 10——AI加持的全面屏系统。下面就关于MIUI 10的部分功能进行体验并感受说明。</span></p>\r\r\r\n<p align=\"center\"><img src=\"img/miui1.jpeg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">全新的系统UI视觉</p>\r\r\r\n<p><span style=\"font-size: 20px;\">外观方面，MIUI 10去掉了MIUI 9中分割感强烈的模块化设计，为全面屏而生，全新的系统UI视觉，通知栏、状态界面图标、近期任务、天气、日历等，都进行了全新的设计，使其功能更丰富，颠覆了以往的设计，让功能更全面，对于初次体验的来说，的确需要一定的时间来适应。</span></p>\r\r\r\n<p align=\"center\">\r\n<img data-pagespeed-url-hash=\"2997403130\" src=\"img/miui2.jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132105 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">支持小爱同学训练计划</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n在之前只能借助小米AI音箱才能训练的功能，如今已经植入到手机之中，让米粉朋友们随时随地训练，创建和分享你的独特技能！手机就是你的小爱同学，长按主界面，呼唤出你的小爱同学，进入设置，有小爱教学实验室，可以开启小爱录屏教学，让小爱同学帮你做的更多的事，譬如一次性签到，帮你发朋友圈、领京豆、发红包等，也都是一句话搞定的事儿。\r\n</span></p>\r\r\n<p align=\"center\"><img src=\"img/miui3。jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">全新音效—自然音噪音</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n首先MIUI 10对手机界面音效进行精简，减少了约76%的系统发声，给用户的耳朵减负，这个还是很不错的。其次MIUI 10重新改写手机声音，从自然获取灵感，让每一次的通知音都不相同，减少对通知音的厌恶等。在始终倒计时里内置了高品质的自然白噪音，开启倒计时后，伴随精选的背景壁纸结合白噪音，如身临其境之感！点赞！\r\n</span></p>\r\n<p align=\"center\"><img src=\"img/miui4.jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">图片超清化</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n还记得朋友圈那些模糊的表情包与图片吗？还在为其纠结再发一遍么？MIUI 10会将模糊的小尺寸图片放大，并通过AI技术补足图像的细节，让本来模糊的图片变清晰。发任何图片都毫不费力，舒舒服服的体验斗图的乐趣吧！\r\n\r\n总结：颠覆传统的MIUI 10，进行了革新设计，主打AI加持的全面屏系统，去掉原有的虚拟按键，让同样尺寸的屏幕能够承载更多有效内容信息，AI能力加入让新系统的体验再上一个台阶。在实际的体验中，笔者的小米6也能玩出新花样，但对于部分更新的新功能是无法使用的，比如AI单摄背景虚化、AI预加载等，都是基于有AI加持的比如小米8，小米MIX 2S等，对于小米6这样不是全面屏的用户来说，有点失望，都是寄希望能实现不是全面屏的小米手机，但是全面屏已经是当下的趋势，能否添加两个MIUI系统呢，全面屏的一个趋势和普通小米手机的一个趋势，这样不是适应更多的用户，你说呢？\r\n</span></p>', 3, 6300, 'images/k1.jpg');
INSERT INTO `news` VALUES (12, '内外敏感时期，土耳其总统埃尔多安第6次访华', 1, '2019-07-08 10:32:20', '2019-07-08 10:33:01', '<h1>内外敏感时期，土耳其总统埃尔多安第6次访华</h1>\r<br>\r\r\n<p><span style=\"font-size: 20px;\">土耳其总统埃尔多安于7月2日访华。作为土耳其执政党正义与发展党（正发党）主席，这将是埃尔多安第6次访华。</span></p>\r\r\r\n<p align=\"center\"><img src=\"img/tuerqi1.jpeg\" width=\"704\" class=\"wp-image-3132106 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">埃尔多安2001年创建正发党并任党主席，次年该党赢得议会选举成为执政党。2003年1月，埃尔多安以正发党主席身份首次访华。</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n\r\n2003年3月出任土耳其总理后，埃尔多安分别在2007年和2011年两次连任，并在2014年土耳其首次总统直选中获胜，2018年成功连任。至今，埃尔多安领导正发党已在土耳其执政16年。\r\n\r\n期间，2012年4月埃尔多安首次以总理身份访华，当时是土耳其总理27年来首次访华。2015年7月，他首次以总统身份访华。此后，埃尔多安在2016年9月、2017年5月分别来华出席二十国集团（G20）杭州峰会、首届“一带一路”国际合作高峰论坛。</span></p>\r\r\r\n<p align=\"center\">\r\n<img data-pagespeed-url-hash=\"2997403130\" src=\"img/tuerqi2.jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132105 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">2016年9月，埃尔多安携夫人乘专机抵达杭州出席G20峰会。\r\n</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n\r\n与前5次访华有所差别的是，埃尔多安此次访华时，土耳其面临的国内外环境正在或已经发生巨大且复杂的变化。\r\n\r\n就国内形势而言，土耳其在经历经济和金融动荡的同时，政治生态也已经出现微妙演变。\r\n\r\n自2016年7月的未遂政变以来，埃尔多安便在国内进行大规模整肃行动、涉及军方、司法、警察、教育、公务员等多个领域。即便是3年后的今天，相关案件的审理仍在继续。\r\n</span></p>\r\n<p align=\"center\"><img src=\"img/tuerqi3.jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">2016年7月，土耳其发生未遂政变。</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n\r\n\r\n虽然未遂政变被迅速平息，但从那时起，埃尔多安及其领导的正发党的执政根基开始遭到冲击。与此同时，过去十多年来，埃尔多安之所以能够连选连任长期执政，成为中东地区有名的政治强人，很大程度上得益于其良好的经济成绩单。在他治下，土耳其经济快速发展，成为重要的新兴经济体之一，随之在中东地区事务中的影响力也大幅提升，中等强国地位进一步巩固。\r\n\r\n然而，近年来土耳其经济遭遇寒冬。特别是去年，该国经济遭遇重创。去年8月，土耳其货币里拉的汇率暴跌20%。据统计，土耳其里拉过去五年贬值近70%。土耳其的金融动荡还蔓延至其他新兴经济体，造成多个新兴市场国家发生货币危机。\r\n</span></p>\r\n<p align=\"center\"><img src=\"img/tuerqi4.jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">土耳其货币里拉</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n同时，去年土耳其的通胀和失业率均处于高位。去年全年的居民消费价格指数（CPI）上涨超过20%，失业率超过11%。一连串的经济问题拖累土耳其去年GDP增速将至2.6%，其中去年第四季度的GDP甚至萎缩了3%。\r\n\r\n经济问题引发政治领域的连锁反应，从地方选举开始，正发党的执政地位遭到反对党前所未有的挑战。\r\n\r\n今年3月底的地方选举中，正发党输掉了首都安卡拉、最大城市伊斯坦布尔、第三大城市伊兹密尔，以及安塔利亚等主要城市的市长选举。这是正发党执政16年来首次失去首都的行政领导权，而伊斯坦布尔则是埃尔多安的政治大本营。他曾在竞选期间表示，“谁赢得伊斯坦布尔，谁就赢得土耳其。”\r\n</span></p>\r\n<p align=\"center\"><img src=\"img/tuerqi5.jpeg\" alt=\"\" width=\"704\" class=\"wp-image-3132107 size-full fr-fin\" height=\"467\"></p>\r\r\r\n<p align=\"center\">土耳其面临的外部环境也愈发复杂和严峻，特别是与西方国家关系以及中东地区局势，都处在一个敏感时刻。</p>\r\r\r\n<p><span style=\"font-size: 20px;\">\r\n过去数十年来，向西看、融入欧洲一直是土耳其外交政策的大方向，虽然只在欧洲大陆保有伊斯坦布尔周边面积不大的领土，但土耳其始终以欧洲国家自居。\r\n\r\n土耳其铁了心向西，但西方国家却对此态度冷淡，在西方看来，他们与土耳其“不是一路人”，这正是土耳其与欧盟展开入盟谈判几十年原地踏步的根源所在。</span></p>', 2, 5600, 'img/tuerqi2.jpeg');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `RId` int(20) NOT NULL AUTO_INCREMENT,
  `Rname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `oprSys` int(2) NULL DEFAULT 0 COMMENT '1为可操作 0不可以',
  `oprUser` int(2) NULL DEFAULT 0,
  `oprNews` int(2) NULL DEFAULT 0,
  `oprComment` int(2) NULL DEFAULT 0,
  PRIMARY KEY (`RId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '系统管理员', 1, 1, 1, 1);
INSERT INTO `role` VALUES (2, '账号管理员', 0, 1, 0, 0);
INSERT INTO `role` VALUES (3, '资讯管理员', 0, 0, 1, 1);
INSERT INTO `role` VALUES (4, '评论管理员', 0, 0, 0, 1);

-- ----------------------------
-- Table structure for sort
-- ----------------------------
DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort`  (
  `sortId` int(11) NOT NULL AUTO_INCREMENT,
  `sortname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sortId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sort
-- ----------------------------
INSERT INTO `sort` VALUES (1, '体育新闻');
INSERT INTO `sort` VALUES (2, '国际新闻');
INSERT INTO `sort` VALUES (3, '科技新闻');
INSERT INTO `sort` VALUES (4, '娱乐新闻');
INSERT INTO `sort` VALUES (5, '游戏新闻');
INSERT INTO `sort` VALUES (6, '教育新闻');
INSERT INTO `sort` VALUES (7, '社会新闻');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `Sid` int(20) NOT NULL AUTO_INCREMENT,
  `Sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Spwd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `RId` int(11) NULL DEFAULT NULL COMMENT '1系统管理员 2账号管理员 3资讯管理员',
  `createtime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `state` int(2) NULL DEFAULT NULL COMMENT '1为可用  0为封禁',
  PRIMARY KEY (`Sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'admin', '123', 1, '2019-07-08 09:05:41', 1);
INSERT INTO `sys_user` VALUES (2, 'userMgr', '123', 2, '2019-07-08 09:06:24', 1);
INSERT INTO `sys_user` VALUES (3, 'infoMgr', '123', 3, '2019-07-08 09:12:47', 1);
INSERT INTO `sys_user` VALUES (4, 'commentMgr', '123', 4, '2019-07-08 09:13:06', 0);
INSERT INTO `sys_user` VALUES (5, '小红', '123', 3, '2019-07-08 09:13:52', 0);
INSERT INTO `sys_user` VALUES (6, '小绿', '123', 2, '2019-07-08 09:14:52', 1);
INSERT INTO `sys_user` VALUES (7, '小蓝', '123', 2, '2019-07-08 09:15:52', 0);
INSERT INTO `sys_user` VALUES (8, '小看', '123', 2, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (9, 'test', '123', 2, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (10, 'test', '123', 4, '2019-07-08 09:15:59', 0);
INSERT INTO `sys_user` VALUES (11, 'test', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (12, 'test', '123', 4, '2019-07-08 09:15:59', 0);
INSERT INTO `sys_user` VALUES (13, 'test', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (14, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (15, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (16, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (17, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (18, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (19, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (20, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (21, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (22, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (23, '测试', '123', 3, '2019-07-08 09:15:59', 1);
INSERT INTO `sys_user` VALUES (24, '测试', '123', 3, '2019-07-08 09:15:59', 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `UId` int(11) NOT NULL AUTO_INCREMENT,
  `Uname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像路径 /xxxxx.png/jpg/gif',
  `Upwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uCreatetime` datetime(0) NULL DEFAULT NULL COMMENT '注册日期',
  `Hpath` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `IsVerify` int(1) UNSIGNED ZEROFILL NULL DEFAULT 0 COMMENT '(1为已认证 0为未认证)',
  PRIMARY KEY (`UId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:18:04', NULL, 1);
INSERT INTO `user` VALUES (2, '李四', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:18:21', NULL, 0);
INSERT INTO `user` VALUES (3, '王五', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:19:13', NULL, 0);
INSERT INTO `user` VALUES (4, '123', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:19:27', NULL, 0);
INSERT INTO `user` VALUES (5, '卢姥爷', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:20:02', NULL, 1);
INSERT INTO `user` VALUES (6, '章恩来', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:20:47', NULL, 1);
INSERT INTO `user` VALUES (7, '赵六', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:21:20', NULL, 0);
INSERT INTO `user` VALUES (8, '面筋哥', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:23:21', NULL, 1);
INSERT INTO `user` VALUES (9, '波澜哥', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:23:40', NULL, 1);
INSERT INTO `user` VALUES (10, '高音哥', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:23:59', NULL, 1);
INSERT INTO `user` VALUES (11, '诗人', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:24:22', NULL, 1);
INSERT INTO `user` VALUES (12, '周某', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:24:42', NULL, 1);
INSERT INTO `user` VALUES (13, '鸡你太美', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:25:10', NULL, 0);
INSERT INTO `user` VALUES (14, 'cxk', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:25:39', NULL, 1);
INSERT INTO `user` VALUES (15, '王境泽', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:25:52', NULL, 1);
INSERT INTO `user` VALUES (16, '郭美美', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:26:05', NULL, 1);
INSERT INTO `user` VALUES (17, '川桑', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:27:15', NULL, 1);
INSERT INTO `user` VALUES (18, '51凡', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:27:49', NULL, 1);
INSERT INTO `user` VALUES (19, '雄氏老方', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:28:26', NULL, 1);
INSERT INTO `user` VALUES (20, '洪世贤', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:28:48', NULL, 1);
INSERT INTO `user` VALUES (21, '萌新1', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:35:03', NULL, 0);
INSERT INTO `user` VALUES (22, '萌新2', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:35:19', NULL, 0);
INSERT INTO `user` VALUES (23, '萌新3', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:35:35', NULL, 0);
INSERT INTO `user` VALUES (24, '萌新4', '202CB962AC59075B964B07152D234B70', '2019-07-08 09:36:09', NULL, 0);

-- ----------------------------
-- Table structure for verify
-- ----------------------------
DROP TABLE IF EXISTS `verify`;
CREATE TABLE `verify`  (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NULL DEFAULT NULL,
  `vCreatetime` datetime(0) NULL DEFAULT NULL,
  `vContent` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `isDeal` int(1) UNSIGNED ZEROFILL NULL DEFAULT 1 COMMENT '0和1  0为已经操作 不显示',
  PRIMARY KEY (`vid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of verify
-- ----------------------------
INSERT INTO `verify` VALUES (1, 2, '2019-07-08 09:36:37', '我叫李四，我很像做新闻工作者，请给我个机会', 1);
INSERT INTO `verify` VALUES (2, 3, '2019-07-08 09:37:22', '我是在想的时候，没事的时候，无聊的时候，到一个地方来，来了吗可以发布新闻', 1);
INSERT INTO `verify` VALUES (3, 7, '2019-07-08 09:48:46', '在下尼古拉找死的弟弟', 1);
INSERT INTO `verify` VALUES (4, 13, '2019-07-08 09:49:45', '鸡你太美，鸡你太美，鸡你太美', 1);
INSERT INTO `verify` VALUES (5, 21, '2019-07-08 09:50:13', '萌新想要发布新闻', 1);
INSERT INTO `verify` VALUES (6, 22, '2019-07-08 09:50:14', '萌新想要发布新闻', 1);
INSERT INTO `verify` VALUES (7, 23, '2019-07-08 09:50:20', '萌新想要发布新闻', 1);
INSERT INTO `verify` VALUES (8, 24, '2019-07-08 09:50:30', '萌新想要发布新闻', 1);

SET FOREIGN_KEY_CHECKS = 1;
