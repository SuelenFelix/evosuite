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

public class UserDetail_getMusicRating_205033527613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202447;

    public UserDetail_getMusicRating_205033527613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term202451 = new Long(1740732617708040141L);
        Integer term202514 = new Integer(1483253425);
        ArrayList term202512 = new ArrayList();
        ((ArrayList) term202512).add(term202514);
        Integer term202520 = new Integer(-1101871231);
        Integer term202522 = new Integer(928527949);
        Integer term202524 = new Integer(435463871);
        ArrayList term202518 = new ArrayList();
        ((ArrayList) term202518).add(term202520);
        ((ArrayList) term202518).add(term202522);
        ((ArrayList) term202518).add(term202524);
        term202447 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term202449 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term202465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term202475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202480 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term202447, term202447.getClass(), "id", 8570009922272534626L);
        setLongField(term202449, term202449.getClass(), "id", -8902259157428840686L);
        setField(term202449, term202449.getClass(), "extId", term202451);
        setField(term202449, term202449.getClass(), "luid", "qItcoIgEyi");
        setIntField(term202466, term202466.getClass(), "year", 2013);
        setShortField(term202466, term202466.getClass(), "month", (short) 6);
        setShortField(term202466, term202466.getClass(), "day", (short) 2);
        setField(term202465, term202465.getClass(), "date", term202466);
        setByteField(term202470, term202470.getClass(), "hour", (byte) 6);
        setByteField(term202470, term202470.getClass(), "minute", (byte) 13);
        setByteField(term202470, term202470.getClass(), "second", (byte) 6);
        setIntField(term202470, term202470.getClass(), "nano", 466304404);
        setField(term202465, term202465.getClass(), "time", term202470);
        setField(term202449, term202449.getClass(), "registerTime", term202465);
        setIntField(term202476, term202476.getClass(), "year", 2022);
        setShortField(term202476, term202476.getClass(), "month", (short) 4);
        setShortField(term202476, term202476.getClass(), "day", (short) 10);
        setField(term202475, term202475.getClass(), "date", term202476);
        setByteField(term202480, term202480.getClass(), "hour", (byte) 5);
        setByteField(term202480, term202480.getClass(), "minute", (byte) 55);
        setByteField(term202480, term202480.getClass(), "second", (byte) 27);
        setIntField(term202480, term202480.getClass(), "nano", 974485423);
        setField(term202475, term202475.getClass(), "time", term202480);
        setField(term202449, term202449.getClass(), "accessTime", term202475);
        setField(term202447, term202447.getClass(), "card", term202449);
        setField(term202447, term202447.getClass(), "userName", "iSagnJzhui");
        setIntField(term202447, term202447.getClass(), "isNetMember", 1817148676);
        setIntField(term202447, term202447.getClass(), "iconId", 1276665124);
        setIntField(term202447, term202447.getClass(), "plateId", 631763699);
        setIntField(term202447, term202447.getClass(), "titleId", -2016696905);
        setIntField(term202447, term202447.getClass(), "partnerId", 820644673);
        setIntField(term202447, term202447.getClass(), "frameId", 1395411611);
        setIntField(term202447, term202447.getClass(), "selectMapId", 1535159183);
        setIntField(term202447, term202447.getClass(), "totalAwake", 542305172);
        setIntField(term202447, term202447.getClass(), "gradeRating", 1880502684);
        setIntField(term202447, term202447.getClass(), "musicRating", 1208089406);
        setIntField(term202447, term202447.getClass(), "playerRating", -822607091);
        setIntField(term202447, term202447.getClass(), "highestRating", -1404356844);
        setIntField(term202447, term202447.getClass(), "gradeRank", 1214654693);
        setIntField(term202447, term202447.getClass(), "classRank", -1144368319);
        setIntField(term202447, term202447.getClass(), "courseRank", -1299647512);
        setField(term202447, term202447.getClass(), "charaSlot", term202512);
        setField(term202447, term202447.getClass(), "charaLockSlot", term202518);
        setLongField(term202447, term202447.getClass(), "contentBit", -3803614501416114575L);
        setIntField(term202447, term202447.getClass(), "playCount", -738749379);
        setField(term202447, term202447.getClass(), "eventWatchedDate", "OaAAAMaerG");
        setField(term202447, term202447.getClass(), "lastGameId", "LjWsBZjyXH");
        setField(term202447, term202447.getClass(), "lastRomVersion", "IzVaWJAeHd");
        setField(term202447, term202447.getClass(), "lastDataVersion", "tjPkQolRer");
        setField(term202447, term202447.getClass(), "lastLoginDate", "ngoLwQfpWZ");
        setField(term202447, term202447.getClass(), "lastPlayDate", "uTWBfvAsyO");
        setIntField(term202447, term202447.getClass(), "lastPlayCredit", 2067337022);
        setIntField(term202447, term202447.getClass(), "lastPlayMode", -462097537);
        setIntField(term202447, term202447.getClass(), "lastPlaceId", 1791338762);
        setField(term202447, term202447.getClass(), "lastPlaceName", "PjflZBjLQm");
        setIntField(term202447, term202447.getClass(), "lastAllNetId", 1852645839);
        setIntField(term202447, term202447.getClass(), "lastRegionId", 439157981);
        setField(term202447, term202447.getClass(), "lastRegionName", "vKTFdmINnO");
        setField(term202447, term202447.getClass(), "lastClientId", "yluqSskhal");
        setField(term202447, term202447.getClass(), "lastCountryCode", "eqfsGIytdB");
        setIntField(term202447, term202447.getClass(), "lastSelectEMoney", 2026803446);
        setIntField(term202447, term202447.getClass(), "lastSelectTicket", -1060834778);
        setIntField(term202447, term202447.getClass(), "lastSelectCourse", 1424979936);
        setIntField(term202447, term202447.getClass(), "lastCountCourse", 1913639183);
        setField(term202447, term202447.getClass(), "firstGameId", "LKQjNTptZn");
        setField(term202447, term202447.getClass(), "firstRomVersion", "tKBauOxKfc");
        setField(term202447, term202447.getClass(), "firstDataVersion", "iAYffLkiOU");
        setField(term202447, term202447.getClass(), "firstPlayDate", "EImxDcfgVv");
        setField(term202447, term202447.getClass(), "compatibleCmVersion", "IppSJALLml");
        setField(term202447, term202447.getClass(), "dailyBonusDate", "eMvdmaaxyJ");
        setField(term202447, term202447.getClass(), "dailyCourseBonusDate", "DzDqqkuTQG");
        setField(term202447, term202447.getClass(), "lastPairLoginDate", "MMwjHFVUHz");
        setField(term202447, term202447.getClass(), "lastTrialPlayDate", "ulHIZcfbJZ");
        setIntField(term202447, term202447.getClass(), "playVsCount", -2065117323);
        setIntField(term202447, term202447.getClass(), "playSyncCount", 1455954533);
        setIntField(term202447, term202447.getClass(), "winCount", 596927400);
        setIntField(term202447, term202447.getClass(), "helpCount", 717640575);
        setIntField(term202447, term202447.getClass(), "comboCount", 1377342355);
        setLongField(term202447, term202447.getClass(), "totalDeluxscore", 6102475192058129247L);
        setLongField(term202447, term202447.getClass(), "totalBasicDeluxscore", -4281244125783955710L);
        setLongField(term202447, term202447.getClass(), "totalAdvancedDeluxscore", 403186353656902852L);
        setLongField(term202447, term202447.getClass(), "totalExpertDeluxscore", 2784445642622626925L);
        setLongField(term202447, term202447.getClass(), "totalMasterDeluxscore", -5453777250967497602L);
        setLongField(term202447, term202447.getClass(), "totalReMasterDeluxscore", -8149935998454675151L);
        setIntField(term202447, term202447.getClass(), "totalSync", 303367492);
        setIntField(term202447, term202447.getClass(), "totalBasicSync", -1689842535);
        setIntField(term202447, term202447.getClass(), "totalAdvancedSync", 1550009784);
        setIntField(term202447, term202447.getClass(), "totalExpertSync", -1322057757);
        setIntField(term202447, term202447.getClass(), "totalMasterSync", 106608060);
        setIntField(term202447, term202447.getClass(), "totalReMasterSync", -97528141);
        setLongField(term202447, term202447.getClass(), "totalAchievement", 3428486638437521102L);
        setLongField(term202447, term202447.getClass(), "totalBasicAchievement", 3764731684576741944L);
        setLongField(term202447, term202447.getClass(), "totalAdvancedAchievement", 8932365346248063195L);
        setLongField(term202447, term202447.getClass(), "totalExpertAchievement", -6598276650320885409L);
        setLongField(term202447, term202447.getClass(), "totalMasterAchievement", 405274616298957014L);
        setLongField(term202447, term202447.getClass(), "totalReMasterAchievement", 4272568189267567670L);
        setLongField(term202447, term202447.getClass(), "playerOldRating", -1376360718446582689L);
        setLongField(term202447, term202447.getClass(), "playerNewRating", 5868440555894643459L);
        setIntField(term202447, term202447.getClass(), "banState", 103420135);
        setLongField(term202447, term202447.getClass(), "dateTime", 449789890077874470L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicRating", argTypes, term202447, args);
    }

};


