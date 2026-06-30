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

public class UserDetail_getLastSelectTicket_99921030038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4251068;

    public UserDetail_getLastSelectTicket_99921030038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4251072 = new Long(-978448106392119367L);
        Integer term4251135 = new Integer(-59523762);
        Integer term4251137 = new Integer(25345151);
        Integer term4251139 = new Integer(651655016);
        Integer term4251141 = new Integer(-1388448851);
        Integer term4251143 = new Integer(-1565944347);
        ArrayList term4251133 = new ArrayList();
        ((ArrayList) term4251133).add(term4251135);
        ((ArrayList) term4251133).add(term4251137);
        ((ArrayList) term4251133).add(term4251139);
        ((ArrayList) term4251133).add(term4251141);
        ((ArrayList) term4251133).add(term4251143);
        Integer term4251149 = new Integer(20706388);
        Integer term4251151 = new Integer(836069699);
        Integer term4251153 = new Integer(1595274836);
        Integer term4251155 = new Integer(691227128);
        Integer term4251157 = new Integer(1336238944);
        ArrayList term4251147 = new ArrayList();
        ((ArrayList) term4251147).add(term4251149);
        ((ArrayList) term4251147).add(term4251151);
        ((ArrayList) term4251147).add(term4251153);
        ((ArrayList) term4251147).add(term4251155);
        ((ArrayList) term4251147).add(term4251157);
        term4251068 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4251070 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4251086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4251087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4251091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4251096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4251097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4251101 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4251068, term4251068.getClass(), "id", -2379029909421448966L);
        setLongField(term4251070, term4251070.getClass(), "id", -9119492023030712494L);
        setField(term4251070, term4251070.getClass(), "extId", term4251072);
        setField(term4251070, term4251070.getClass(), "luid", "UTIPLrLqDk");
        setIntField(term4251087, term4251087.getClass(), "year", 2023);
        setShortField(term4251087, term4251087.getClass(), "month", (short) 5);
        setShortField(term4251087, term4251087.getClass(), "day", (short) 18);
        setField(term4251086, term4251086.getClass(), "date", term4251087);
        setByteField(term4251091, term4251091.getClass(), "hour", (byte) 10);
        setByteField(term4251091, term4251091.getClass(), "minute", (byte) 8);
        setByteField(term4251091, term4251091.getClass(), "second", (byte) 7);
        setIntField(term4251091, term4251091.getClass(), "nano", 533381651);
        setField(term4251086, term4251086.getClass(), "time", term4251091);
        setField(term4251070, term4251070.getClass(), "registerTime", term4251086);
        setIntField(term4251097, term4251097.getClass(), "year", 2026);
        setShortField(term4251097, term4251097.getClass(), "month", (short) 4);
        setShortField(term4251097, term4251097.getClass(), "day", (short) 9);
        setField(term4251096, term4251096.getClass(), "date", term4251097);
        setByteField(term4251101, term4251101.getClass(), "hour", (byte) 21);
        setByteField(term4251101, term4251101.getClass(), "minute", (byte) 11);
        setByteField(term4251101, term4251101.getClass(), "second", (byte) 9);
        setIntField(term4251101, term4251101.getClass(), "nano", 15086498);
        setField(term4251096, term4251096.getClass(), "time", term4251101);
        setField(term4251070, term4251070.getClass(), "accessTime", term4251096);
        setField(term4251068, term4251068.getClass(), "card", term4251070);
        setField(term4251068, term4251068.getClass(), "userName", "RTJRpURgVZ");
        setIntField(term4251068, term4251068.getClass(), "isNetMember", -441113502);
        setIntField(term4251068, term4251068.getClass(), "iconId", -795209452);
        setIntField(term4251068, term4251068.getClass(), "plateId", 1435740941);
        setIntField(term4251068, term4251068.getClass(), "titleId", 794736867);
        setIntField(term4251068, term4251068.getClass(), "partnerId", -2048855479);
        setIntField(term4251068, term4251068.getClass(), "frameId", 1869790695);
        setIntField(term4251068, term4251068.getClass(), "selectMapId", 86121121);
        setIntField(term4251068, term4251068.getClass(), "totalAwake", 130027912);
        setIntField(term4251068, term4251068.getClass(), "gradeRating", 2010173390);
        setIntField(term4251068, term4251068.getClass(), "musicRating", -53217836);
        setIntField(term4251068, term4251068.getClass(), "playerRating", -1290979585);
        setIntField(term4251068, term4251068.getClass(), "highestRating", -2050379258);
        setIntField(term4251068, term4251068.getClass(), "gradeRank", -2000466734);
        setIntField(term4251068, term4251068.getClass(), "classRank", 1648889564);
        setIntField(term4251068, term4251068.getClass(), "courseRank", -672772044);
        setField(term4251068, term4251068.getClass(), "charaSlot", term4251133);
        setField(term4251068, term4251068.getClass(), "charaLockSlot", term4251147);
        setLongField(term4251068, term4251068.getClass(), "contentBit", -2214497610772232731L);
        setIntField(term4251068, term4251068.getClass(), "playCount", -85953360);
        setField(term4251068, term4251068.getClass(), "eventWatchedDate", "kbAlvNWXnM");
        setField(term4251068, term4251068.getClass(), "lastGameId", "RkHfpppMYh");
        setField(term4251068, term4251068.getClass(), "lastRomVersion", "uPFNXfsBwb");
        setField(term4251068, term4251068.getClass(), "lastDataVersion", "vSdaLTAIpo");
        setField(term4251068, term4251068.getClass(), "lastLoginDate", "HIIZTmVVum");
        setField(term4251068, term4251068.getClass(), "lastPlayDate", "fahItiarFN");
        setIntField(term4251068, term4251068.getClass(), "lastPlayCredit", 1855471495);
        setIntField(term4251068, term4251068.getClass(), "lastPlayMode", 615213229);
        setIntField(term4251068, term4251068.getClass(), "lastPlaceId", 1849405368);
        setField(term4251068, term4251068.getClass(), "lastPlaceName", "CcSCOsmwMf");
        setIntField(term4251068, term4251068.getClass(), "lastAllNetId", -1431839846);
        setIntField(term4251068, term4251068.getClass(), "lastRegionId", 1317531955);
        setField(term4251068, term4251068.getClass(), "lastRegionName", "qthwEKTaUO");
        setField(term4251068, term4251068.getClass(), "lastClientId", "FZnZDtsZMV");
        setField(term4251068, term4251068.getClass(), "lastCountryCode", "ogysGKpxga");
        setIntField(term4251068, term4251068.getClass(), "lastSelectEMoney", -1894607852);
        setIntField(term4251068, term4251068.getClass(), "lastSelectTicket", -184967984);
        setIntField(term4251068, term4251068.getClass(), "lastSelectCourse", -1133328600);
        setIntField(term4251068, term4251068.getClass(), "lastCountCourse", 1989792563);
        setField(term4251068, term4251068.getClass(), "firstGameId", "YARvJYAwoG");
        setField(term4251068, term4251068.getClass(), "firstRomVersion", "eFEpEyWYEb");
        setField(term4251068, term4251068.getClass(), "firstDataVersion", "yodCYaWZIk");
        setField(term4251068, term4251068.getClass(), "firstPlayDate", "tLDdeCjsoT");
        setField(term4251068, term4251068.getClass(), "compatibleCmVersion", "BzapBFOVeA");
        setField(term4251068, term4251068.getClass(), "dailyBonusDate", "CjpNlLsOHr");
        setField(term4251068, term4251068.getClass(), "dailyCourseBonusDate", "NLFxZSYJLw");
        setField(term4251068, term4251068.getClass(), "lastPairLoginDate", "MryMgPdCti");
        setField(term4251068, term4251068.getClass(), "lastTrialPlayDate", "nupyfMOrTc");
        setIntField(term4251068, term4251068.getClass(), "playVsCount", -1465451088);
        setIntField(term4251068, term4251068.getClass(), "playSyncCount", -710098125);
        setIntField(term4251068, term4251068.getClass(), "winCount", 1156612577);
        setIntField(term4251068, term4251068.getClass(), "helpCount", -1268580286);
        setIntField(term4251068, term4251068.getClass(), "comboCount", 1855393768);
        setLongField(term4251068, term4251068.getClass(), "totalDeluxscore", -5364641526325812960L);
        setLongField(term4251068, term4251068.getClass(), "totalBasicDeluxscore", -6555665900664739543L);
        setLongField(term4251068, term4251068.getClass(), "totalAdvancedDeluxscore", -5033204564210322183L);
        setLongField(term4251068, term4251068.getClass(), "totalExpertDeluxscore", -3769689738444991249L);
        setLongField(term4251068, term4251068.getClass(), "totalMasterDeluxscore", -5869317257892417527L);
        setLongField(term4251068, term4251068.getClass(), "totalReMasterDeluxscore", -5819842187481639137L);
        setIntField(term4251068, term4251068.getClass(), "totalSync", -1288577040);
        setIntField(term4251068, term4251068.getClass(), "totalBasicSync", -1233242744);
        setIntField(term4251068, term4251068.getClass(), "totalAdvancedSync", -1655370245);
        setIntField(term4251068, term4251068.getClass(), "totalExpertSync", 194117662);
        setIntField(term4251068, term4251068.getClass(), "totalMasterSync", -2017929074);
        setIntField(term4251068, term4251068.getClass(), "totalReMasterSync", -59630227);
        setLongField(term4251068, term4251068.getClass(), "totalAchievement", 6809320977341144023L);
        setLongField(term4251068, term4251068.getClass(), "totalBasicAchievement", -866016388621462233L);
        setLongField(term4251068, term4251068.getClass(), "totalAdvancedAchievement", 4552793340849836454L);
        setLongField(term4251068, term4251068.getClass(), "totalExpertAchievement", 8495642753870387195L);
        setLongField(term4251068, term4251068.getClass(), "totalMasterAchievement", -7168607807099662306L);
        setLongField(term4251068, term4251068.getClass(), "totalReMasterAchievement", -4717948504081935268L);
        setLongField(term4251068, term4251068.getClass(), "playerOldRating", -6527754351419390165L);
        setLongField(term4251068, term4251068.getClass(), "playerNewRating", 1102719631819551579L);
        setIntField(term4251068, term4251068.getClass(), "banState", -93719908);
        setLongField(term4251068, term4251068.getClass(), "dateTime", 4799848690602360357L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectTicket", argTypes, term4251068, args);
    }

};


