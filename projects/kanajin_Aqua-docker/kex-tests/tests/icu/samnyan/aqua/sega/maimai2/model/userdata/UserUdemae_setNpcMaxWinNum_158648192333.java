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

public class UserUdemae_setNpcMaxWinNum_158648192333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114287;
     Object term114666;

    public UserUdemae_setNpcMaxWinNum_158648192333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114293 = new Long(4795660804170399986L);
        Integer term114356 = new Integer(-716654499);
        Integer term114358 = new Integer(1641117123);
        Integer term114360 = new Integer(-1084408453);
        ArrayList term114354 = new ArrayList();
        ((ArrayList) term114354).add(term114356);
        ((ArrayList) term114354).add(term114358);
        ((ArrayList) term114354).add(term114360);
        Integer term114366 = new Integer(-1466822773);
        Integer term114368 = new Integer(-230022261);
        Integer term114370 = new Integer(831967494);
        Integer term114372 = new Integer(-1858635791);
        Integer term114374 = new Integer(1919079331);
        Integer term114376 = new Integer(144872711);
        Integer term114378 = new Integer(-720037395);
        Integer term114380 = new Integer(1232105469);
        ArrayList term114364 = new ArrayList();
        ((ArrayList) term114364).add(term114366);
        ((ArrayList) term114364).add(term114368);
        ((ArrayList) term114364).add(term114370);
        ((ArrayList) term114364).add(term114372);
        ((ArrayList) term114364).add(term114374);
        ((ArrayList) term114364).add(term114376);
        ((ArrayList) term114364).add(term114378);
        ((ArrayList) term114364).add(term114380);
        term114287 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term114289 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term114291 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term114307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114312 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114322 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term114287, term114287.getClass(), "id", 2031577096594269874L);
        setLongField(term114289, term114289.getClass(), "id", 851269462212379561L);
        setLongField(term114291, term114291.getClass(), "id", -3023642624075318286L);
        setField(term114291, term114291.getClass(), "extId", term114293);
        setField(term114291, term114291.getClass(), "luid", "HVZdePgPWv");
        setIntField(term114308, term114308.getClass(), "year", 2018);
        setShortField(term114308, term114308.getClass(), "month", (short) 9);
        setShortField(term114308, term114308.getClass(), "day", (short) 19);
        setField(term114307, term114307.getClass(), "date", term114308);
        setByteField(term114312, term114312.getClass(), "hour", (byte) 23);
        setByteField(term114312, term114312.getClass(), "minute", (byte) 30);
        setByteField(term114312, term114312.getClass(), "second", (byte) 11);
        setIntField(term114312, term114312.getClass(), "nano", 615798597);
        setField(term114307, term114307.getClass(), "time", term114312);
        setField(term114291, term114291.getClass(), "registerTime", term114307);
        setIntField(term114318, term114318.getClass(), "year", 2021);
        setShortField(term114318, term114318.getClass(), "month", (short) 3);
        setShortField(term114318, term114318.getClass(), "day", (short) 13);
        setField(term114317, term114317.getClass(), "date", term114318);
        setByteField(term114322, term114322.getClass(), "hour", (byte) 11);
        setByteField(term114322, term114322.getClass(), "minute", (byte) 11);
        setByteField(term114322, term114322.getClass(), "second", (byte) 36);
        setIntField(term114322, term114322.getClass(), "nano", 411690155);
        setField(term114317, term114317.getClass(), "time", term114322);
        setField(term114291, term114291.getClass(), "accessTime", term114317);
        setField(term114289, term114289.getClass(), "card", term114291);
        setField(term114289, term114289.getClass(), "userName", "VhpcclRPZX");
        setIntField(term114289, term114289.getClass(), "isNetMember", 1944444886);
        setIntField(term114289, term114289.getClass(), "iconId", 813872033);
        setIntField(term114289, term114289.getClass(), "plateId", -289587627);
        setIntField(term114289, term114289.getClass(), "titleId", 249117272);
        setIntField(term114289, term114289.getClass(), "partnerId", 569136290);
        setIntField(term114289, term114289.getClass(), "frameId", -769809783);
        setIntField(term114289, term114289.getClass(), "selectMapId", -1572273604);
        setIntField(term114289, term114289.getClass(), "totalAwake", -884285296);
        setIntField(term114289, term114289.getClass(), "gradeRating", -332552768);
        setIntField(term114289, term114289.getClass(), "musicRating", -734809675);
        setIntField(term114289, term114289.getClass(), "playerRating", -2032445161);
        setIntField(term114289, term114289.getClass(), "highestRating", 2055666026);
        setIntField(term114289, term114289.getClass(), "gradeRank", -961904013);
        setIntField(term114289, term114289.getClass(), "classRank", 467298258);
        setIntField(term114289, term114289.getClass(), "courseRank", -1307824288);
        setField(term114289, term114289.getClass(), "charaSlot", term114354);
        setField(term114289, term114289.getClass(), "charaLockSlot", term114364);
        setLongField(term114289, term114289.getClass(), "contentBit", 5754464717374858428L);
        setIntField(term114289, term114289.getClass(), "playCount", -343537352);
        setField(term114289, term114289.getClass(), "eventWatchedDate", "jecnsmPrVs");
        setField(term114289, term114289.getClass(), "lastGameId", "QkdgrEdqYo");
        setField(term114289, term114289.getClass(), "lastRomVersion", "oqAIcYaMFy");
        setField(term114289, term114289.getClass(), "lastDataVersion", "eMJZEUCuiE");
        setField(term114289, term114289.getClass(), "lastLoginDate", "psNXkIHjLW");
        setField(term114289, term114289.getClass(), "lastPlayDate", "DeWUQxbivp");
        setIntField(term114289, term114289.getClass(), "lastPlayCredit", -504159112);
        setIntField(term114289, term114289.getClass(), "lastPlayMode", -693581216);
        setIntField(term114289, term114289.getClass(), "lastPlaceId", -1414257808);
        setField(term114289, term114289.getClass(), "lastPlaceName", "PcRiAbKXvK");
        setIntField(term114289, term114289.getClass(), "lastAllNetId", -2048269349);
        setIntField(term114289, term114289.getClass(), "lastRegionId", 2127262366);
        setField(term114289, term114289.getClass(), "lastRegionName", "EhjpwiDlaG");
        setField(term114289, term114289.getClass(), "lastClientId", "HowhKdqLBn");
        setField(term114289, term114289.getClass(), "lastCountryCode", "FXwdarPRcu");
        setIntField(term114289, term114289.getClass(), "lastSelectEMoney", 1192955580);
        setIntField(term114289, term114289.getClass(), "lastSelectTicket", -1390904271);
        setIntField(term114289, term114289.getClass(), "lastSelectCourse", 894136168);
        setIntField(term114289, term114289.getClass(), "lastCountCourse", -1571407716);
        setField(term114289, term114289.getClass(), "firstGameId", "HzWNDDgUtc");
        setField(term114289, term114289.getClass(), "firstRomVersion", "umqvxozDpq");
        setField(term114289, term114289.getClass(), "firstDataVersion", "HieTCBVeDD");
        setField(term114289, term114289.getClass(), "firstPlayDate", "cTSwYlchXv");
        setField(term114289, term114289.getClass(), "compatibleCmVersion", "QbalcMEEdv");
        setField(term114289, term114289.getClass(), "dailyBonusDate", "xiYIPdzlXo");
        setField(term114289, term114289.getClass(), "dailyCourseBonusDate", "MYonccVvzc");
        setField(term114289, term114289.getClass(), "lastPairLoginDate", "cxwnnBgfmJ");
        setField(term114289, term114289.getClass(), "lastTrialPlayDate", "tNXQltoRar");
        setIntField(term114289, term114289.getClass(), "playVsCount", -1634609318);
        setIntField(term114289, term114289.getClass(), "playSyncCount", 911431447);
        setIntField(term114289, term114289.getClass(), "winCount", -1798345464);
        setIntField(term114289, term114289.getClass(), "helpCount", 991660062);
        setIntField(term114289, term114289.getClass(), "comboCount", 1387364689);
        setLongField(term114289, term114289.getClass(), "totalDeluxscore", 1769538929299224531L);
        setLongField(term114289, term114289.getClass(), "totalBasicDeluxscore", 2744046861965577334L);
        setLongField(term114289, term114289.getClass(), "totalAdvancedDeluxscore", 5536006113004390813L);
        setLongField(term114289, term114289.getClass(), "totalExpertDeluxscore", 7613276437096698267L);
        setLongField(term114289, term114289.getClass(), "totalMasterDeluxscore", -15012344473260735L);
        setLongField(term114289, term114289.getClass(), "totalReMasterDeluxscore", -7302717476024398618L);
        setIntField(term114289, term114289.getClass(), "totalSync", -180600496);
        setIntField(term114289, term114289.getClass(), "totalBasicSync", -1916507105);
        setIntField(term114289, term114289.getClass(), "totalAdvancedSync", -269773023);
        setIntField(term114289, term114289.getClass(), "totalExpertSync", -718649828);
        setIntField(term114289, term114289.getClass(), "totalMasterSync", -324751303);
        setIntField(term114289, term114289.getClass(), "totalReMasterSync", 59394991);
        setLongField(term114289, term114289.getClass(), "totalAchievement", 6708116358743842821L);
        setLongField(term114289, term114289.getClass(), "totalBasicAchievement", 8164291404572285008L);
        setLongField(term114289, term114289.getClass(), "totalAdvancedAchievement", -2427315021561332890L);
        setLongField(term114289, term114289.getClass(), "totalExpertAchievement", -6816141902035124591L);
        setLongField(term114289, term114289.getClass(), "totalMasterAchievement", -83252622637557191L);
        setLongField(term114289, term114289.getClass(), "totalReMasterAchievement", 2703347811680968422L);
        setLongField(term114289, term114289.getClass(), "playerOldRating", -3614998234615616494L);
        setLongField(term114289, term114289.getClass(), "playerNewRating", 448310655487166741L);
        setIntField(term114289, term114289.getClass(), "banState", 1340125056);
        setLongField(term114289, term114289.getClass(), "dateTime", 6665682102336248554L);
        setField(term114287, term114287.getClass(), "user", term114289);
        setIntField(term114287, term114287.getClass(), "rate", -163957346);
        setIntField(term114287, term114287.getClass(), "maxRate", 536808724);
        setIntField(term114287, term114287.getClass(), "classValue", -534385154);
        setIntField(term114287, term114287.getClass(), "maxClassValue", -1277688883);
        setIntField(term114287, term114287.getClass(), "totalWinNum", 2143702118);
        setIntField(term114287, term114287.getClass(), "totalLoseNum", -1514256392);
        setIntField(term114287, term114287.getClass(), "maxWinNum", -706084233);
        setIntField(term114287, term114287.getClass(), "maxLoseNum", 786595172);
        setIntField(term114287, term114287.getClass(), "winNum", 1090005556);
        setIntField(term114287, term114287.getClass(), "loseNum", 86451720);
        setIntField(term114287, term114287.getClass(), "npcTotalWinNum", -1916270131);
        setIntField(term114287, term114287.getClass(), "npcTotalLoseNum", 430692285);
        setIntField(term114287, term114287.getClass(), "npcMaxWinNum", 354561212);
        setIntField(term114287, term114287.getClass(), "npcMaxLoseNum", -1171538201);
        setIntField(term114287, term114287.getClass(), "npcWinNum", 1030420582);
        setIntField(term114287, term114287.getClass(), "npcLoseNum", 1441242370);
        term114666 = new Integer(-1266421079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term114666;
        callMethod(klass, "setNpcMaxWinNum", argTypes, term114287, args);
    }

};


