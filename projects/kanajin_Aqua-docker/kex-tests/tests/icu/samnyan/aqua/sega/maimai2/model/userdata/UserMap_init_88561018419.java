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
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;

public class UserMap_init_88561018419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584747;
     Object term584749;
     Object term585104;
     Object term585106;
     Object term585108;
     Object term585110;
     Object term585112;

    public UserMap_init_88561018419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584747 = new Long(-4109998349867863445L);
        Long term584753 = new Long(-8195504192950938590L);
        Integer term584816 = new Integer(729482578);
        Integer term584818 = new Integer(-368397845);
        Integer term584820 = new Integer(-279315948);
        Integer term584822 = new Integer(-195577818);
        Integer term584824 = new Integer(1457197657);
        ArrayList term584814 = new ArrayList();
        ((ArrayList) term584814).add(term584816);
        ((ArrayList) term584814).add(term584818);
        ((ArrayList) term584814).add(term584820);
        ((ArrayList) term584814).add(term584822);
        ((ArrayList) term584814).add(term584824);
        Integer term584830 = new Integer(1961784130);
        Integer term584832 = new Integer(-1669337588);
        Integer term584834 = new Integer(2041255104);
        ArrayList term584828 = new ArrayList();
        ((ArrayList) term584828).add(term584830);
        ((ArrayList) term584828).add(term584832);
        ((ArrayList) term584828).add(term584834);
        term584749 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term584751 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term584767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term584768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term584772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term584777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term584778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term584782 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term584749, term584749.getClass(), "id", 1028500321421900282L);
        setLongField(term584751, term584751.getClass(), "id", -7095812972871086127L);
        setField(term584751, term584751.getClass(), "extId", term584753);
        setField(term584751, term584751.getClass(), "luid", "hiNlKXLudr");
        setIntField(term584768, term584768.getClass(), "year", 2012);
        setShortField(term584768, term584768.getClass(), "month", (short) 7);
        setShortField(term584768, term584768.getClass(), "day", (short) 14);
        setField(term584767, term584767.getClass(), "date", term584768);
        setByteField(term584772, term584772.getClass(), "hour", (byte) 3);
        setByteField(term584772, term584772.getClass(), "minute", (byte) 53);
        setByteField(term584772, term584772.getClass(), "second", (byte) 44);
        setIntField(term584772, term584772.getClass(), "nano", 995672949);
        setField(term584767, term584767.getClass(), "time", term584772);
        setField(term584751, term584751.getClass(), "registerTime", term584767);
        setIntField(term584778, term584778.getClass(), "year", 2016);
        setShortField(term584778, term584778.getClass(), "month", (short) 10);
        setShortField(term584778, term584778.getClass(), "day", (short) 30);
        setField(term584777, term584777.getClass(), "date", term584778);
        setByteField(term584782, term584782.getClass(), "hour", (byte) 20);
        setByteField(term584782, term584782.getClass(), "minute", (byte) 18);
        setByteField(term584782, term584782.getClass(), "second", (byte) 6);
        setIntField(term584782, term584782.getClass(), "nano", 566555534);
        setField(term584777, term584777.getClass(), "time", term584782);
        setField(term584751, term584751.getClass(), "accessTime", term584777);
        setField(term584749, term584749.getClass(), "card", term584751);
        setField(term584749, term584749.getClass(), "userName", "RbnyUrTKij");
        setIntField(term584749, term584749.getClass(), "isNetMember", 338917700);
        setIntField(term584749, term584749.getClass(), "iconId", -1758374224);
        setIntField(term584749, term584749.getClass(), "plateId", -541492895);
        setIntField(term584749, term584749.getClass(), "titleId", 1679680930);
        setIntField(term584749, term584749.getClass(), "partnerId", -840451665);
        setIntField(term584749, term584749.getClass(), "frameId", 458371210);
        setIntField(term584749, term584749.getClass(), "selectMapId", 1788222239);
        setIntField(term584749, term584749.getClass(), "totalAwake", -1892736852);
        setIntField(term584749, term584749.getClass(), "gradeRating", -1653949830);
        setIntField(term584749, term584749.getClass(), "musicRating", -1193429946);
        setIntField(term584749, term584749.getClass(), "playerRating", 460207154);
        setIntField(term584749, term584749.getClass(), "highestRating", -663695836);
        setIntField(term584749, term584749.getClass(), "gradeRank", -432170187);
        setIntField(term584749, term584749.getClass(), "classRank", -219471197);
        setIntField(term584749, term584749.getClass(), "courseRank", 1581835557);
        setField(term584749, term584749.getClass(), "charaSlot", term584814);
        setField(term584749, term584749.getClass(), "charaLockSlot", term584828);
        setLongField(term584749, term584749.getClass(), "contentBit", 1104319774738612812L);
        setIntField(term584749, term584749.getClass(), "playCount", 1759213669);
        setField(term584749, term584749.getClass(), "eventWatchedDate", "pDNmxYNRQA");
        setField(term584749, term584749.getClass(), "lastGameId", "JaNfaByzjj");
        setField(term584749, term584749.getClass(), "lastRomVersion", "QwormAekid");
        setField(term584749, term584749.getClass(), "lastDataVersion", "xgDsfSfbxa");
        setField(term584749, term584749.getClass(), "lastLoginDate", "njnnJUfAGX");
        setField(term584749, term584749.getClass(), "lastPlayDate", "TkWJBHlihh");
        setIntField(term584749, term584749.getClass(), "lastPlayCredit", -47998812);
        setIntField(term584749, term584749.getClass(), "lastPlayMode", 700862533);
        setIntField(term584749, term584749.getClass(), "lastPlaceId", 1883717277);
        setField(term584749, term584749.getClass(), "lastPlaceName", "kpvtVoxYME");
        setIntField(term584749, term584749.getClass(), "lastAllNetId", -659077295);
        setIntField(term584749, term584749.getClass(), "lastRegionId", -444824158);
        setField(term584749, term584749.getClass(), "lastRegionName", "cpklPxyQuR");
        setField(term584749, term584749.getClass(), "lastClientId", "kruvJvwGRC");
        setField(term584749, term584749.getClass(), "lastCountryCode", "oGZfrLltuz");
        setIntField(term584749, term584749.getClass(), "lastSelectEMoney", -1388185909);
        setIntField(term584749, term584749.getClass(), "lastSelectTicket", 939048673);
        setIntField(term584749, term584749.getClass(), "lastSelectCourse", 1644824967);
        setIntField(term584749, term584749.getClass(), "lastCountCourse", 978546242);
        setField(term584749, term584749.getClass(), "firstGameId", "ywAGnjWmTw");
        setField(term584749, term584749.getClass(), "firstRomVersion", "JlajojGuNe");
        setField(term584749, term584749.getClass(), "firstDataVersion", "IanzkOueKU");
        setField(term584749, term584749.getClass(), "firstPlayDate", "bXLqLFIDHG");
        setField(term584749, term584749.getClass(), "compatibleCmVersion", "xoZIHjWlEV");
        setField(term584749, term584749.getClass(), "dailyBonusDate", "QxgcbxWXBm");
        setField(term584749, term584749.getClass(), "dailyCourseBonusDate", "jiyJAiKGzj");
        setField(term584749, term584749.getClass(), "lastPairLoginDate", "ibonPVXXfL");
        setField(term584749, term584749.getClass(), "lastTrialPlayDate", "IIYIISHTet");
        setIntField(term584749, term584749.getClass(), "playVsCount", -1145732319);
        setIntField(term584749, term584749.getClass(), "playSyncCount", -331635812);
        setIntField(term584749, term584749.getClass(), "winCount", -801104683);
        setIntField(term584749, term584749.getClass(), "helpCount", -586036938);
        setIntField(term584749, term584749.getClass(), "comboCount", 584643858);
        setLongField(term584749, term584749.getClass(), "totalDeluxscore", 8418445547130201014L);
        setLongField(term584749, term584749.getClass(), "totalBasicDeluxscore", 2445910923180630498L);
        setLongField(term584749, term584749.getClass(), "totalAdvancedDeluxscore", -5989039923064799133L);
        setLongField(term584749, term584749.getClass(), "totalExpertDeluxscore", -3075537550890479419L);
        setLongField(term584749, term584749.getClass(), "totalMasterDeluxscore", 313575014537279104L);
        setLongField(term584749, term584749.getClass(), "totalReMasterDeluxscore", -3845089305081339776L);
        setIntField(term584749, term584749.getClass(), "totalSync", -1859513374);
        setIntField(term584749, term584749.getClass(), "totalBasicSync", -124327444);
        setIntField(term584749, term584749.getClass(), "totalAdvancedSync", 132766580);
        setIntField(term584749, term584749.getClass(), "totalExpertSync", -1077500896);
        setIntField(term584749, term584749.getClass(), "totalMasterSync", 1528915568);
        setIntField(term584749, term584749.getClass(), "totalReMasterSync", 738649938);
        setLongField(term584749, term584749.getClass(), "totalAchievement", 2639634211020552304L);
        setLongField(term584749, term584749.getClass(), "totalBasicAchievement", -6380413320133597142L);
        setLongField(term584749, term584749.getClass(), "totalAdvancedAchievement", 5390040204523212796L);
        setLongField(term584749, term584749.getClass(), "totalExpertAchievement", 5956283779395103907L);
        setLongField(term584749, term584749.getClass(), "totalMasterAchievement", -3921745930465949138L);
        setLongField(term584749, term584749.getClass(), "totalReMasterAchievement", 6816221047543531805L);
        setLongField(term584749, term584749.getClass(), "playerOldRating", -7524237839895708289L);
        setLongField(term584749, term584749.getClass(), "playerNewRating", -4119359753088902178L);
        setIntField(term584749, term584749.getClass(), "banState", 1578185238);
        setLongField(term584749, term584749.getClass(), "dateTime", 3581391828997246516L);
        term585104 = new Integer(127139223);
        term585106 = new Integer(-1526659017);
        term585108 = new Boolean(false);
        term585110 = new Boolean(true);
        term585112 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term584747;
        args[1] = term584749;
        args[2] = term585104;
        args[3] = term585106;
        args[4] = term585108;
        args[5] = term585110;
        args[6] = term585112;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


