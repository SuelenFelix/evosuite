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

public class UserLoginBonus_init_25556449417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54284;
     Object term54286;
     Object term54635;
     Object term54637;
     Object term54639;
     Object term54641;

    public UserLoginBonus_init_25556449417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54284 = new Long(8346326079558512850L);
        Long term54290 = new Long(2701184207686293431L);
        Integer term54353 = new Integer(1478914037);
        Integer term54355 = new Integer(1630231519);
        ArrayList term54351 = new ArrayList();
        ((ArrayList) term54351).add(term54353);
        ((ArrayList) term54351).add(term54355);
        Integer term54361 = new Integer(1460702778);
        Integer term54363 = new Integer(-1398142433);
        Integer term54365 = new Integer(-1112119058);
        ArrayList term54359 = new ArrayList();
        ((ArrayList) term54359).add(term54361);
        ((ArrayList) term54359).add(term54363);
        ((ArrayList) term54359).add(term54365);
        term54286 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term54288 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54309 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54319 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54286, term54286.getClass(), "id", 4554910377138538493L);
        setLongField(term54288, term54288.getClass(), "id", -2306787824604312942L);
        setField(term54288, term54288.getClass(), "extId", term54290);
        setField(term54288, term54288.getClass(), "luid", "cHRLXsgRzr");
        setIntField(term54305, term54305.getClass(), "year", 2020);
        setShortField(term54305, term54305.getClass(), "month", (short) 2);
        setShortField(term54305, term54305.getClass(), "day", (short) 1);
        setField(term54304, term54304.getClass(), "date", term54305);
        setByteField(term54309, term54309.getClass(), "hour", (byte) 0);
        setByteField(term54309, term54309.getClass(), "minute", (byte) 46);
        setByteField(term54309, term54309.getClass(), "second", (byte) 1);
        setIntField(term54309, term54309.getClass(), "nano", 544722812);
        setField(term54304, term54304.getClass(), "time", term54309);
        setField(term54288, term54288.getClass(), "registerTime", term54304);
        setIntField(term54315, term54315.getClass(), "year", 2027);
        setShortField(term54315, term54315.getClass(), "month", (short) 8);
        setShortField(term54315, term54315.getClass(), "day", (short) 16);
        setField(term54314, term54314.getClass(), "date", term54315);
        setByteField(term54319, term54319.getClass(), "hour", (byte) 15);
        setByteField(term54319, term54319.getClass(), "minute", (byte) 1);
        setByteField(term54319, term54319.getClass(), "second", (byte) 18);
        setIntField(term54319, term54319.getClass(), "nano", 245350825);
        setField(term54314, term54314.getClass(), "time", term54319);
        setField(term54288, term54288.getClass(), "accessTime", term54314);
        setField(term54286, term54286.getClass(), "card", term54288);
        setField(term54286, term54286.getClass(), "userName", "QpqQKmCtoC");
        setIntField(term54286, term54286.getClass(), "isNetMember", -1134943583);
        setIntField(term54286, term54286.getClass(), "iconId", -694277686);
        setIntField(term54286, term54286.getClass(), "plateId", -2044994445);
        setIntField(term54286, term54286.getClass(), "titleId", -883941371);
        setIntField(term54286, term54286.getClass(), "partnerId", -1545047968);
        setIntField(term54286, term54286.getClass(), "frameId", 665116636);
        setIntField(term54286, term54286.getClass(), "selectMapId", 1255353874);
        setIntField(term54286, term54286.getClass(), "totalAwake", 550111365);
        setIntField(term54286, term54286.getClass(), "gradeRating", 1756090789);
        setIntField(term54286, term54286.getClass(), "musicRating", -315044098);
        setIntField(term54286, term54286.getClass(), "playerRating", 2920253);
        setIntField(term54286, term54286.getClass(), "highestRating", 310113293);
        setIntField(term54286, term54286.getClass(), "gradeRank", -1668505285);
        setIntField(term54286, term54286.getClass(), "classRank", 9043673);
        setIntField(term54286, term54286.getClass(), "courseRank", 2059842684);
        setField(term54286, term54286.getClass(), "charaSlot", term54351);
        setField(term54286, term54286.getClass(), "charaLockSlot", term54359);
        setLongField(term54286, term54286.getClass(), "contentBit", 5604034478428783596L);
        setIntField(term54286, term54286.getClass(), "playCount", 578623316);
        setField(term54286, term54286.getClass(), "eventWatchedDate", "AYRvbRJxWI");
        setField(term54286, term54286.getClass(), "lastGameId", "MGNiaVqEDc");
        setField(term54286, term54286.getClass(), "lastRomVersion", "qeVNCFrTbT");
        setField(term54286, term54286.getClass(), "lastDataVersion", "sreEtRBWQl");
        setField(term54286, term54286.getClass(), "lastLoginDate", "UKQejaeJWY");
        setField(term54286, term54286.getClass(), "lastPlayDate", "lNbVasLAKL");
        setIntField(term54286, term54286.getClass(), "lastPlayCredit", -676216760);
        setIntField(term54286, term54286.getClass(), "lastPlayMode", 1859109121);
        setIntField(term54286, term54286.getClass(), "lastPlaceId", 1727853532);
        setField(term54286, term54286.getClass(), "lastPlaceName", "wKeyHBCSLZ");
        setIntField(term54286, term54286.getClass(), "lastAllNetId", -54706718);
        setIntField(term54286, term54286.getClass(), "lastRegionId", 461863345);
        setField(term54286, term54286.getClass(), "lastRegionName", "iQCLduwSPi");
        setField(term54286, term54286.getClass(), "lastClientId", "ZcODLNhxqg");
        setField(term54286, term54286.getClass(), "lastCountryCode", "iNtHOROBMq");
        setIntField(term54286, term54286.getClass(), "lastSelectEMoney", 733174414);
        setIntField(term54286, term54286.getClass(), "lastSelectTicket", -1055100686);
        setIntField(term54286, term54286.getClass(), "lastSelectCourse", 1994661826);
        setIntField(term54286, term54286.getClass(), "lastCountCourse", -2050574403);
        setField(term54286, term54286.getClass(), "firstGameId", "GbvfbbsrOl");
        setField(term54286, term54286.getClass(), "firstRomVersion", "IIZlqzOmtY");
        setField(term54286, term54286.getClass(), "firstDataVersion", "iRFRSxtnkr");
        setField(term54286, term54286.getClass(), "firstPlayDate", "iGWkLjLGBY");
        setField(term54286, term54286.getClass(), "compatibleCmVersion", "jUkXaNkoAg");
        setField(term54286, term54286.getClass(), "dailyBonusDate", "mZsPsRzyhQ");
        setField(term54286, term54286.getClass(), "dailyCourseBonusDate", "IExlbTemvJ");
        setField(term54286, term54286.getClass(), "lastPairLoginDate", "zaljyXXCoy");
        setField(term54286, term54286.getClass(), "lastTrialPlayDate", "dKoYnXLGEI");
        setIntField(term54286, term54286.getClass(), "playVsCount", 1891840747);
        setIntField(term54286, term54286.getClass(), "playSyncCount", -118389472);
        setIntField(term54286, term54286.getClass(), "winCount", -706486666);
        setIntField(term54286, term54286.getClass(), "helpCount", 1426550776);
        setIntField(term54286, term54286.getClass(), "comboCount", 1793694701);
        setLongField(term54286, term54286.getClass(), "totalDeluxscore", 2830531040991289470L);
        setLongField(term54286, term54286.getClass(), "totalBasicDeluxscore", -5227262300045722571L);
        setLongField(term54286, term54286.getClass(), "totalAdvancedDeluxscore", 8547681246636788948L);
        setLongField(term54286, term54286.getClass(), "totalExpertDeluxscore", -2070418897756378076L);
        setLongField(term54286, term54286.getClass(), "totalMasterDeluxscore", 4733182453235379235L);
        setLongField(term54286, term54286.getClass(), "totalReMasterDeluxscore", -5161762055522201695L);
        setIntField(term54286, term54286.getClass(), "totalSync", 1334634518);
        setIntField(term54286, term54286.getClass(), "totalBasicSync", -1358832342);
        setIntField(term54286, term54286.getClass(), "totalAdvancedSync", 330525017);
        setIntField(term54286, term54286.getClass(), "totalExpertSync", -2097182938);
        setIntField(term54286, term54286.getClass(), "totalMasterSync", -1911268197);
        setIntField(term54286, term54286.getClass(), "totalReMasterSync", 1989699628);
        setLongField(term54286, term54286.getClass(), "totalAchievement", -6455995631591797782L);
        setLongField(term54286, term54286.getClass(), "totalBasicAchievement", -992220562260824979L);
        setLongField(term54286, term54286.getClass(), "totalAdvancedAchievement", -2035190444044214401L);
        setLongField(term54286, term54286.getClass(), "totalExpertAchievement", -447638576776090708L);
        setLongField(term54286, term54286.getClass(), "totalMasterAchievement", -3876284999950409934L);
        setLongField(term54286, term54286.getClass(), "totalReMasterAchievement", 219518058983770018L);
        setLongField(term54286, term54286.getClass(), "playerOldRating", 1549908057368393138L);
        setLongField(term54286, term54286.getClass(), "playerNewRating", 1779727837594554817L);
        setIntField(term54286, term54286.getClass(), "banState", 1406976166);
        setLongField(term54286, term54286.getClass(), "dateTime", -6445063982585716818L);
        term54635 = new Integer(-683361157);
        term54637 = new Integer(1735058829);
        term54639 = new Boolean(false);
        term54641 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term54284;
        args[1] = term54286;
        args[2] = term54635;
        args[3] = term54637;
        args[4] = term54639;
        args[5] = term54641;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


