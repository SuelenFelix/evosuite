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
import java.lang.Boolean;

public class UserCourse_setLastClear_50162439318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83251;
     Object term83664;

    public UserCourse_setLastClear_50162439318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term83257 = new Long(7489064039921396098L);
        Integer term83320 = new Integer(-1231122778);
        Integer term83322 = new Integer(1923558221);
        Integer term83324 = new Integer(1762934060);
        ArrayList term83318 = new ArrayList();
        ((ArrayList) term83318).add(term83320);
        ((ArrayList) term83318).add(term83322);
        ((ArrayList) term83318).add(term83324);
        Integer term83330 = new Integer(-859828739);
        Integer term83332 = new Integer(1986855642);
        Integer term83334 = new Integer(1280322790);
        Integer term83336 = new Integer(-1702209203);
        Integer term83338 = new Integer(-1592307668);
        ArrayList term83328 = new ArrayList();
        ((ArrayList) term83328).add(term83330);
        ((ArrayList) term83328).add(term83332);
        ((ArrayList) term83328).add(term83334);
        ((ArrayList) term83328).add(term83336);
        ((ArrayList) term83328).add(term83338);
        term83251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term83253 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term83255 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term83271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83286 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term83251, term83251.getClass(), "id", -2400272512040933740L);
        setLongField(term83253, term83253.getClass(), "id", 2471459865342914246L);
        setLongField(term83255, term83255.getClass(), "id", 1298833491565248675L);
        setField(term83255, term83255.getClass(), "extId", term83257);
        setField(term83255, term83255.getClass(), "luid", "JqDCwLjqnp");
        setIntField(term83272, term83272.getClass(), "year", 2029);
        setShortField(term83272, term83272.getClass(), "month", (short) 1);
        setShortField(term83272, term83272.getClass(), "day", (short) 21);
        setField(term83271, term83271.getClass(), "date", term83272);
        setByteField(term83276, term83276.getClass(), "hour", (byte) 9);
        setByteField(term83276, term83276.getClass(), "minute", (byte) 46);
        setByteField(term83276, term83276.getClass(), "second", (byte) 1);
        setIntField(term83276, term83276.getClass(), "nano", 276350652);
        setField(term83271, term83271.getClass(), "time", term83276);
        setField(term83255, term83255.getClass(), "registerTime", term83271);
        setIntField(term83282, term83282.getClass(), "year", 2019);
        setShortField(term83282, term83282.getClass(), "month", (short) 12);
        setShortField(term83282, term83282.getClass(), "day", (short) 20);
        setField(term83281, term83281.getClass(), "date", term83282);
        setByteField(term83286, term83286.getClass(), "hour", (byte) 22);
        setByteField(term83286, term83286.getClass(), "minute", (byte) 20);
        setByteField(term83286, term83286.getClass(), "second", (byte) 29);
        setIntField(term83286, term83286.getClass(), "nano", 582302461);
        setField(term83281, term83281.getClass(), "time", term83286);
        setField(term83255, term83255.getClass(), "accessTime", term83281);
        setField(term83253, term83253.getClass(), "card", term83255);
        setField(term83253, term83253.getClass(), "userName", "FHqHhmdJat");
        setIntField(term83253, term83253.getClass(), "isNetMember", 540968254);
        setIntField(term83253, term83253.getClass(), "iconId", 1166539646);
        setIntField(term83253, term83253.getClass(), "plateId", 1055557164);
        setIntField(term83253, term83253.getClass(), "titleId", -1601763818);
        setIntField(term83253, term83253.getClass(), "partnerId", 562192186);
        setIntField(term83253, term83253.getClass(), "frameId", -904648920);
        setIntField(term83253, term83253.getClass(), "selectMapId", -457236509);
        setIntField(term83253, term83253.getClass(), "totalAwake", 1719352674);
        setIntField(term83253, term83253.getClass(), "gradeRating", 1551152450);
        setIntField(term83253, term83253.getClass(), "musicRating", -1821029149);
        setIntField(term83253, term83253.getClass(), "playerRating", -1120692414);
        setIntField(term83253, term83253.getClass(), "highestRating", 630179419);
        setIntField(term83253, term83253.getClass(), "gradeRank", -1314338966);
        setIntField(term83253, term83253.getClass(), "classRank", 632003573);
        setIntField(term83253, term83253.getClass(), "courseRank", 253586199);
        setField(term83253, term83253.getClass(), "charaSlot", term83318);
        setField(term83253, term83253.getClass(), "charaLockSlot", term83328);
        setLongField(term83253, term83253.getClass(), "contentBit", -5282656070291958064L);
        setIntField(term83253, term83253.getClass(), "playCount", 1269448265);
        setField(term83253, term83253.getClass(), "eventWatchedDate", "QvpedpvzkV");
        setField(term83253, term83253.getClass(), "lastGameId", "hSWpWtRQyH");
        setField(term83253, term83253.getClass(), "lastRomVersion", "DgHnOCKjBN");
        setField(term83253, term83253.getClass(), "lastDataVersion", "nSSytCAuBk");
        setField(term83253, term83253.getClass(), "lastLoginDate", "XiZyOHXnNC");
        setField(term83253, term83253.getClass(), "lastPlayDate", "gQlDPvSqrX");
        setIntField(term83253, term83253.getClass(), "lastPlayCredit", 1407128598);
        setIntField(term83253, term83253.getClass(), "lastPlayMode", -799093829);
        setIntField(term83253, term83253.getClass(), "lastPlaceId", 432526848);
        setField(term83253, term83253.getClass(), "lastPlaceName", "EnYnZHmIml");
        setIntField(term83253, term83253.getClass(), "lastAllNetId", 1875904227);
        setIntField(term83253, term83253.getClass(), "lastRegionId", -273652787);
        setField(term83253, term83253.getClass(), "lastRegionName", "jvhvoAISsw");
        setField(term83253, term83253.getClass(), "lastClientId", "NkOntrweCo");
        setField(term83253, term83253.getClass(), "lastCountryCode", "hVtvnBKztu");
        setIntField(term83253, term83253.getClass(), "lastSelectEMoney", -20800272);
        setIntField(term83253, term83253.getClass(), "lastSelectTicket", -2012090266);
        setIntField(term83253, term83253.getClass(), "lastSelectCourse", 1298920245);
        setIntField(term83253, term83253.getClass(), "lastCountCourse", 1539128914);
        setField(term83253, term83253.getClass(), "firstGameId", "VOpwlWudOv");
        setField(term83253, term83253.getClass(), "firstRomVersion", "eEXpzGjDgl");
        setField(term83253, term83253.getClass(), "firstDataVersion", "vGLuBgtHzA");
        setField(term83253, term83253.getClass(), "firstPlayDate", "iOiyjODkqg");
        setField(term83253, term83253.getClass(), "compatibleCmVersion", "pgpXJLwACM");
        setField(term83253, term83253.getClass(), "dailyBonusDate", "JgrZdrciib");
        setField(term83253, term83253.getClass(), "dailyCourseBonusDate", "mjPUAINebK");
        setField(term83253, term83253.getClass(), "lastPairLoginDate", "QdBJxwpNcu");
        setField(term83253, term83253.getClass(), "lastTrialPlayDate", "jdwewuUtBW");
        setIntField(term83253, term83253.getClass(), "playVsCount", 627813167);
        setIntField(term83253, term83253.getClass(), "playSyncCount", -2047312469);
        setIntField(term83253, term83253.getClass(), "winCount", 38231753);
        setIntField(term83253, term83253.getClass(), "helpCount", 1404509429);
        setIntField(term83253, term83253.getClass(), "comboCount", -438218058);
        setLongField(term83253, term83253.getClass(), "totalDeluxscore", -4217861566486163749L);
        setLongField(term83253, term83253.getClass(), "totalBasicDeluxscore", -4945539086208200375L);
        setLongField(term83253, term83253.getClass(), "totalAdvancedDeluxscore", -1244149061151367736L);
        setLongField(term83253, term83253.getClass(), "totalExpertDeluxscore", 985346718698079792L);
        setLongField(term83253, term83253.getClass(), "totalMasterDeluxscore", 4787080389628135236L);
        setLongField(term83253, term83253.getClass(), "totalReMasterDeluxscore", -8904293163264570294L);
        setIntField(term83253, term83253.getClass(), "totalSync", -1026369377);
        setIntField(term83253, term83253.getClass(), "totalBasicSync", 1373311750);
        setIntField(term83253, term83253.getClass(), "totalAdvancedSync", 1699366);
        setIntField(term83253, term83253.getClass(), "totalExpertSync", 692170348);
        setIntField(term83253, term83253.getClass(), "totalMasterSync", -1022512329);
        setIntField(term83253, term83253.getClass(), "totalReMasterSync", 201236178);
        setLongField(term83253, term83253.getClass(), "totalAchievement", -9146144965408025864L);
        setLongField(term83253, term83253.getClass(), "totalBasicAchievement", -2955701716630821049L);
        setLongField(term83253, term83253.getClass(), "totalAdvancedAchievement", 8810510947864468259L);
        setLongField(term83253, term83253.getClass(), "totalExpertAchievement", 2653516526280557602L);
        setLongField(term83253, term83253.getClass(), "totalMasterAchievement", 562794068928395674L);
        setLongField(term83253, term83253.getClass(), "totalReMasterAchievement", -2826036159687567411L);
        setLongField(term83253, term83253.getClass(), "playerOldRating", -4457208393673096945L);
        setLongField(term83253, term83253.getClass(), "playerNewRating", 6449000223758009356L);
        setIntField(term83253, term83253.getClass(), "banState", 985775690);
        setLongField(term83253, term83253.getClass(), "dateTime", -6691521986846521707L);
        setField(term83251, term83251.getClass(), "user", term83253);
        setIntField(term83251, term83251.getClass(), "courseId", 1159262757);
        setBooleanField(term83251, term83251.getClass(), "isLastClear", true);
        setIntField(term83251, term83251.getClass(), "totalRestlife", 967155072);
        setIntField(term83251, term83251.getClass(), "totalAchievement", 1011025023);
        setIntField(term83251, term83251.getClass(), "totalDeluxscore", 921803217);
        setIntField(term83251, term83251.getClass(), "playCount", 2011014435);
        setField(term83251, term83251.getClass(), "clearDate", "CXekzSdVWc");
        setField(term83251, term83251.getClass(), "lastPlayDate", "heJZxFqAJC");
        setIntField(term83251, term83251.getClass(), "bestAchievement", 256804816);
        setField(term83251, term83251.getClass(), "bestAchievementDate", "DGNjGJtXwQ");
        setIntField(term83251, term83251.getClass(), "bestDeluxscore", -726670877);
        setField(term83251, term83251.getClass(), "bestDeluxscoreDate", "BIFQrvbqSd");
        term83664 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term83664;
        callMethod(klass, "setLastClear", argTypes, term83251, args);
    }

};


