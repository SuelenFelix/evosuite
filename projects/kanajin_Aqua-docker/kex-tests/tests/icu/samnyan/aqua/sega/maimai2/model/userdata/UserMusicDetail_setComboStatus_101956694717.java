package icu.samnyan.aqua.sega.maimai2.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserMusicDetail_setComboStatus_101956694717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65359;
     Object term65740;

    public UserMusicDetail_setComboStatus_101956694717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65365 = new Long(1368340889161782793L);
        Integer term65428 = new Integer(-532304223);
        Integer term65430 = new Integer(666218293);
        Integer term65432 = new Integer(1737876343);
        Integer term65434 = new Integer(-897937940);
        Integer term65436 = new Integer(1523261232);
        Integer term65438 = new Integer(-428988337);
        Integer term65440 = new Integer(48047085);
        ArrayList term65426 = new ArrayList();
        ((ArrayList) term65426).add(term65428);
        ((ArrayList) term65426).add(term65430);
        ((ArrayList) term65426).add(term65432);
        ((ArrayList) term65426).add(term65434);
        ((ArrayList) term65426).add(term65436);
        ((ArrayList) term65426).add(term65438);
        ((ArrayList) term65426).add(term65440);
        Integer term65446 = new Integer(1902784843);
        Integer term65448 = new Integer(2021136615);
        Integer term65450 = new Integer(1778570695);
        Integer term65452 = new Integer(-1142164411);
        Integer term65454 = new Integer(-1619435313);
        Integer term65456 = new Integer(1013801066);
        Integer term65458 = new Integer(1512541853);
        Integer term65460 = new Integer(-965421502);
        Integer term65462 = new Integer(1319026002);
        ArrayList term65444 = new ArrayList();
        ((ArrayList) term65444).add(term65446);
        ((ArrayList) term65444).add(term65448);
        ((ArrayList) term65444).add(term65450);
        ((ArrayList) term65444).add(term65452);
        ((ArrayList) term65444).add(term65454);
        ((ArrayList) term65444).add(term65456);
        ((ArrayList) term65444).add(term65458);
        ((ArrayList) term65444).add(term65460);
        ((ArrayList) term65444).add(term65462);
        term65359 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term65361 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term65363 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65394 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65359, term65359.getClass(), "id", 3546596014708806813L);
        setLongField(term65361, term65361.getClass(), "id", -2670369629600189900L);
        setLongField(term65363, term65363.getClass(), "id", -177713589369472164L);
        setField(term65363, term65363.getClass(), "extId", term65365);
        setField(term65363, term65363.getClass(), "luid", "JUQnEoujef");
        setIntField(term65380, term65380.getClass(), "year", 2020);
        setShortField(term65380, term65380.getClass(), "month", (short) 4);
        setShortField(term65380, term65380.getClass(), "day", (short) 2);
        setField(term65379, term65379.getClass(), "date", term65380);
        setByteField(term65384, term65384.getClass(), "hour", (byte) 11);
        setByteField(term65384, term65384.getClass(), "minute", (byte) 26);
        setByteField(term65384, term65384.getClass(), "second", (byte) 22);
        setIntField(term65384, term65384.getClass(), "nano", 168224721);
        setField(term65379, term65379.getClass(), "time", term65384);
        setField(term65363, term65363.getClass(), "registerTime", term65379);
        setIntField(term65390, term65390.getClass(), "year", 2010);
        setShortField(term65390, term65390.getClass(), "month", (short) 10);
        setShortField(term65390, term65390.getClass(), "day", (short) 26);
        setField(term65389, term65389.getClass(), "date", term65390);
        setByteField(term65394, term65394.getClass(), "hour", (byte) 6);
        setByteField(term65394, term65394.getClass(), "minute", (byte) 28);
        setByteField(term65394, term65394.getClass(), "second", (byte) 52);
        setIntField(term65394, term65394.getClass(), "nano", 197540216);
        setField(term65389, term65389.getClass(), "time", term65394);
        setField(term65363, term65363.getClass(), "accessTime", term65389);
        setField(term65361, term65361.getClass(), "card", term65363);
        setField(term65361, term65361.getClass(), "userName", "riXARUiigm");
        setIntField(term65361, term65361.getClass(), "isNetMember", 2011572896);
        setIntField(term65361, term65361.getClass(), "iconId", 1517650676);
        setIntField(term65361, term65361.getClass(), "plateId", -1559743160);
        setIntField(term65361, term65361.getClass(), "titleId", -2067828357);
        setIntField(term65361, term65361.getClass(), "partnerId", -2049221981);
        setIntField(term65361, term65361.getClass(), "frameId", 2046964718);
        setIntField(term65361, term65361.getClass(), "selectMapId", 1610353449);
        setIntField(term65361, term65361.getClass(), "totalAwake", -1431201540);
        setIntField(term65361, term65361.getClass(), "gradeRating", 921611666);
        setIntField(term65361, term65361.getClass(), "musicRating", 505159138);
        setIntField(term65361, term65361.getClass(), "playerRating", 816436710);
        setIntField(term65361, term65361.getClass(), "highestRating", 1372386941);
        setIntField(term65361, term65361.getClass(), "gradeRank", -558285340);
        setIntField(term65361, term65361.getClass(), "classRank", -1351747599);
        setIntField(term65361, term65361.getClass(), "courseRank", 376811147);
        setField(term65361, term65361.getClass(), "charaSlot", term65426);
        setField(term65361, term65361.getClass(), "charaLockSlot", term65444);
        setLongField(term65361, term65361.getClass(), "contentBit", 792816556387097064L);
        setIntField(term65361, term65361.getClass(), "playCount", 1230466580);
        setField(term65361, term65361.getClass(), "eventWatchedDate", "RbXhBDZbRT");
        setField(term65361, term65361.getClass(), "lastGameId", "QDaTqkWnGj");
        setField(term65361, term65361.getClass(), "lastRomVersion", "vNObzQvzxo");
        setField(term65361, term65361.getClass(), "lastDataVersion", "uyuWzXeJvn");
        setField(term65361, term65361.getClass(), "lastLoginDate", "jvQHxWAYDO");
        setField(term65361, term65361.getClass(), "lastPlayDate", "mntnLPfhte");
        setIntField(term65361, term65361.getClass(), "lastPlayCredit", -367049771);
        setIntField(term65361, term65361.getClass(), "lastPlayMode", 469812226);
        setIntField(term65361, term65361.getClass(), "lastPlaceId", 1798598374);
        setField(term65361, term65361.getClass(), "lastPlaceName", "rIKLUjcdnZ");
        setIntField(term65361, term65361.getClass(), "lastAllNetId", -1689820547);
        setIntField(term65361, term65361.getClass(), "lastRegionId", 100902964);
        setField(term65361, term65361.getClass(), "lastRegionName", "MQaKKukkYD");
        setField(term65361, term65361.getClass(), "lastClientId", "ThGyaiqnHq");
        setField(term65361, term65361.getClass(), "lastCountryCode", "AtEuOtHJrK");
        setIntField(term65361, term65361.getClass(), "lastSelectEMoney", -619984116);
        setIntField(term65361, term65361.getClass(), "lastSelectTicket", -468766084);
        setIntField(term65361, term65361.getClass(), "lastSelectCourse", -1511205639);
        setIntField(term65361, term65361.getClass(), "lastCountCourse", 488730747);
        setField(term65361, term65361.getClass(), "firstGameId", "gzqokHWvLu");
        setField(term65361, term65361.getClass(), "firstRomVersion", "ANCcRsABGP");
        setField(term65361, term65361.getClass(), "firstDataVersion", "MBadwVIvwu");
        setField(term65361, term65361.getClass(), "firstPlayDate", "zTMIjtwMQL");
        setField(term65361, term65361.getClass(), "compatibleCmVersion", "cjJhlsbSLZ");
        setField(term65361, term65361.getClass(), "dailyBonusDate", "BvcBilSFZf");
        setField(term65361, term65361.getClass(), "dailyCourseBonusDate", "ppUmoMssug");
        setField(term65361, term65361.getClass(), "lastPairLoginDate", "FcponInvBb");
        setField(term65361, term65361.getClass(), "lastTrialPlayDate", "IFOOxmFxbX");
        setIntField(term65361, term65361.getClass(), "playVsCount", 1410439573);
        setIntField(term65361, term65361.getClass(), "playSyncCount", -982945087);
        setIntField(term65361, term65361.getClass(), "winCount", 171057010);
        setIntField(term65361, term65361.getClass(), "helpCount", -1039706080);
        setIntField(term65361, term65361.getClass(), "comboCount", 1009893493);
        setLongField(term65361, term65361.getClass(), "totalDeluxscore", 5391287373597316604L);
        setLongField(term65361, term65361.getClass(), "totalBasicDeluxscore", 6929574138600777534L);
        setLongField(term65361, term65361.getClass(), "totalAdvancedDeluxscore", 7306228148506563384L);
        setLongField(term65361, term65361.getClass(), "totalExpertDeluxscore", -3759875741196067125L);
        setLongField(term65361, term65361.getClass(), "totalMasterDeluxscore", 3301022507846192876L);
        setLongField(term65361, term65361.getClass(), "totalReMasterDeluxscore", -436006713622235897L);
        setIntField(term65361, term65361.getClass(), "totalSync", -1097846142);
        setIntField(term65361, term65361.getClass(), "totalBasicSync", 1026272483);
        setIntField(term65361, term65361.getClass(), "totalAdvancedSync", -48026838);
        setIntField(term65361, term65361.getClass(), "totalExpertSync", 1557093855);
        setIntField(term65361, term65361.getClass(), "totalMasterSync", -445911899);
        setIntField(term65361, term65361.getClass(), "totalReMasterSync", -1254075402);
        setLongField(term65361, term65361.getClass(), "totalAchievement", -5888397861122761293L);
        setLongField(term65361, term65361.getClass(), "totalBasicAchievement", -2860770035477349220L);
        setLongField(term65361, term65361.getClass(), "totalAdvancedAchievement", 1263388002539564753L);
        setLongField(term65361, term65361.getClass(), "totalExpertAchievement", 226144339570799839L);
        setLongField(term65361, term65361.getClass(), "totalMasterAchievement", 2847433178831759443L);
        setLongField(term65361, term65361.getClass(), "totalReMasterAchievement", 4472414114652978334L);
        setLongField(term65361, term65361.getClass(), "playerOldRating", 6759285425911636341L);
        setLongField(term65361, term65361.getClass(), "playerNewRating", -2312307545038820068L);
        setIntField(term65361, term65361.getClass(), "banState", -1886407162);
        setLongField(term65361, term65361.getClass(), "dateTime", -5076378196239032509L);
        setField(term65359, term65359.getClass(), "user", term65361);
        setIntField(term65359, term65359.getClass(), "musicId", -97996127);
        setIntField(term65359, term65359.getClass(), "level", 668350997);
        setIntField(term65359, term65359.getClass(), "playCount", -1280690194);
        setIntField(term65359, term65359.getClass(), "achievement", -1825481062);
        setIntField(term65359, term65359.getClass(), "comboStatus", 662456234);
        setIntField(term65359, term65359.getClass(), "syncStatus", -1932565769);
        setIntField(term65359, term65359.getClass(), "deluxscoreMax", 480924614);
        setIntField(term65359, term65359.getClass(), "scoreRank", 1423620762);
        term65740 = new Integer(-182687795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65740;
        callMethod(klass, "setComboStatus", argTypes, term65359, args);
    }

};


