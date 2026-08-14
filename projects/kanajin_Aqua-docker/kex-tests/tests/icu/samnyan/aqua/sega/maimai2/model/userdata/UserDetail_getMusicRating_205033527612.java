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

public class UserDetail_getMusicRating_205033527612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202392;

    public UserDetail_getMusicRating_205033527612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term202396 = new Long(1740732617708040141L);
        Integer term202459 = new Integer(1483253425);
        ArrayList term202457 = new ArrayList();
        ((ArrayList) term202457).add(term202459);
        Integer term202465 = new Integer(-1101871231);
        Integer term202467 = new Integer(928527949);
        Integer term202469 = new Integer(435463871);
        ArrayList term202463 = new ArrayList();
        ((ArrayList) term202463).add(term202465);
        ((ArrayList) term202463).add(term202467);
        ((ArrayList) term202463).add(term202469);
        term202392 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term202394 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term202410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202415 = newInstance(Class.forName("java.time.LocalTime"));
        Object term202420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202425 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term202392, term202392.getClass(), "id", 8570009922272534626L);
        setLongField(term202394, term202394.getClass(), "id", -8902259157428840686L);
        setField(term202394, term202394.getClass(), "extId", term202396);
        setField(term202394, term202394.getClass(), "luid", "qItcoIgEyi");
        setIntField(term202411, term202411.getClass(), "year", 2013);
        setShortField(term202411, term202411.getClass(), "month", (short) 6);
        setShortField(term202411, term202411.getClass(), "day", (short) 2);
        setField(term202410, term202410.getClass(), "date", term202411);
        setByteField(term202415, term202415.getClass(), "hour", (byte) 6);
        setByteField(term202415, term202415.getClass(), "minute", (byte) 13);
        setByteField(term202415, term202415.getClass(), "second", (byte) 6);
        setIntField(term202415, term202415.getClass(), "nano", 466304404);
        setField(term202410, term202410.getClass(), "time", term202415);
        setField(term202394, term202394.getClass(), "registerTime", term202410);
        setIntField(term202421, term202421.getClass(), "year", 2022);
        setShortField(term202421, term202421.getClass(), "month", (short) 4);
        setShortField(term202421, term202421.getClass(), "day", (short) 10);
        setField(term202420, term202420.getClass(), "date", term202421);
        setByteField(term202425, term202425.getClass(), "hour", (byte) 5);
        setByteField(term202425, term202425.getClass(), "minute", (byte) 55);
        setByteField(term202425, term202425.getClass(), "second", (byte) 27);
        setIntField(term202425, term202425.getClass(), "nano", 974485423);
        setField(term202420, term202420.getClass(), "time", term202425);
        setField(term202394, term202394.getClass(), "accessTime", term202420);
        setField(term202392, term202392.getClass(), "card", term202394);
        setField(term202392, term202392.getClass(), "userName", "iSagnJzhui");
        setIntField(term202392, term202392.getClass(), "isNetMember", 1817148676);
        setIntField(term202392, term202392.getClass(), "iconId", 1276665124);
        setIntField(term202392, term202392.getClass(), "plateId", 631763699);
        setIntField(term202392, term202392.getClass(), "titleId", -2016696905);
        setIntField(term202392, term202392.getClass(), "partnerId", 820644673);
        setIntField(term202392, term202392.getClass(), "frameId", 1395411611);
        setIntField(term202392, term202392.getClass(), "selectMapId", 1535159183);
        setIntField(term202392, term202392.getClass(), "totalAwake", 542305172);
        setIntField(term202392, term202392.getClass(), "gradeRating", 1880502684);
        setIntField(term202392, term202392.getClass(), "musicRating", 1208089406);
        setIntField(term202392, term202392.getClass(), "playerRating", -822607091);
        setIntField(term202392, term202392.getClass(), "highestRating", -1404356844);
        setIntField(term202392, term202392.getClass(), "gradeRank", 1214654693);
        setIntField(term202392, term202392.getClass(), "classRank", -1144368319);
        setIntField(term202392, term202392.getClass(), "courseRank", -1299647512);
        setField(term202392, term202392.getClass(), "charaSlot", term202457);
        setField(term202392, term202392.getClass(), "charaLockSlot", term202463);
        setLongField(term202392, term202392.getClass(), "contentBit", -3803614501416114575L);
        setIntField(term202392, term202392.getClass(), "playCount", -738749379);
        setField(term202392, term202392.getClass(), "eventWatchedDate", "OaAAAMaerG");
        setField(term202392, term202392.getClass(), "lastGameId", "LjWsBZjyXH");
        setField(term202392, term202392.getClass(), "lastRomVersion", "IzVaWJAeHd");
        setField(term202392, term202392.getClass(), "lastDataVersion", "tjPkQolRer");
        setField(term202392, term202392.getClass(), "lastLoginDate", "ngoLwQfpWZ");
        setField(term202392, term202392.getClass(), "lastPlayDate", "uTWBfvAsyO");
        setIntField(term202392, term202392.getClass(), "lastPlayCredit", 2067337022);
        setIntField(term202392, term202392.getClass(), "lastPlayMode", -462097537);
        setIntField(term202392, term202392.getClass(), "lastPlaceId", 1791338762);
        setField(term202392, term202392.getClass(), "lastPlaceName", "PjflZBjLQm");
        setIntField(term202392, term202392.getClass(), "lastAllNetId", 1852645839);
        setIntField(term202392, term202392.getClass(), "lastRegionId", 439157981);
        setField(term202392, term202392.getClass(), "lastRegionName", "vKTFdmINnO");
        setField(term202392, term202392.getClass(), "lastClientId", "yluqSskhal");
        setField(term202392, term202392.getClass(), "lastCountryCode", "eqfsGIytdB");
        setIntField(term202392, term202392.getClass(), "lastSelectEMoney", 2026803446);
        setIntField(term202392, term202392.getClass(), "lastSelectTicket", -1060834778);
        setIntField(term202392, term202392.getClass(), "lastSelectCourse", 1424979936);
        setIntField(term202392, term202392.getClass(), "lastCountCourse", 1913639183);
        setField(term202392, term202392.getClass(), "firstGameId", "LKQjNTptZn");
        setField(term202392, term202392.getClass(), "firstRomVersion", "tKBauOxKfc");
        setField(term202392, term202392.getClass(), "firstDataVersion", "iAYffLkiOU");
        setField(term202392, term202392.getClass(), "firstPlayDate", "EImxDcfgVv");
        setField(term202392, term202392.getClass(), "compatibleCmVersion", "IppSJALLml");
        setField(term202392, term202392.getClass(), "dailyBonusDate", "eMvdmaaxyJ");
        setField(term202392, term202392.getClass(), "dailyCourseBonusDate", "DzDqqkuTQG");
        setField(term202392, term202392.getClass(), "lastPairLoginDate", "MMwjHFVUHz");
        setField(term202392, term202392.getClass(), "lastTrialPlayDate", "ulHIZcfbJZ");
        setIntField(term202392, term202392.getClass(), "playVsCount", -2065117323);
        setIntField(term202392, term202392.getClass(), "playSyncCount", 1455954533);
        setIntField(term202392, term202392.getClass(), "winCount", 596927400);
        setIntField(term202392, term202392.getClass(), "helpCount", 717640575);
        setIntField(term202392, term202392.getClass(), "comboCount", 1377342355);
        setLongField(term202392, term202392.getClass(), "totalDeluxscore", 6102475192058129247L);
        setLongField(term202392, term202392.getClass(), "totalBasicDeluxscore", -4281244125783955710L);
        setLongField(term202392, term202392.getClass(), "totalAdvancedDeluxscore", 403186353656902852L);
        setLongField(term202392, term202392.getClass(), "totalExpertDeluxscore", 2784445642622626925L);
        setLongField(term202392, term202392.getClass(), "totalMasterDeluxscore", -5453777250967497602L);
        setLongField(term202392, term202392.getClass(), "totalReMasterDeluxscore", -8149935998454675151L);
        setIntField(term202392, term202392.getClass(), "totalSync", 303367492);
        setIntField(term202392, term202392.getClass(), "totalBasicSync", -1689842535);
        setIntField(term202392, term202392.getClass(), "totalAdvancedSync", 1550009784);
        setIntField(term202392, term202392.getClass(), "totalExpertSync", -1322057757);
        setIntField(term202392, term202392.getClass(), "totalMasterSync", 106608060);
        setIntField(term202392, term202392.getClass(), "totalReMasterSync", -97528141);
        setLongField(term202392, term202392.getClass(), "totalAchievement", 3428486638437521102L);
        setLongField(term202392, term202392.getClass(), "totalBasicAchievement", 3764731684576741944L);
        setLongField(term202392, term202392.getClass(), "totalAdvancedAchievement", 8932365346248063195L);
        setLongField(term202392, term202392.getClass(), "totalExpertAchievement", -6598276650320885409L);
        setLongField(term202392, term202392.getClass(), "totalMasterAchievement", 405274616298957014L);
        setLongField(term202392, term202392.getClass(), "totalReMasterAchievement", 4272568189267567670L);
        setLongField(term202392, term202392.getClass(), "playerOldRating", -1376360718446582689L);
        setLongField(term202392, term202392.getClass(), "playerNewRating", 5868440555894643459L);
        setIntField(term202392, term202392.getClass(), "banState", 103420135);
        setLongField(term202392, term202392.getClass(), "dateTime", 449789890077874470L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicRating", argTypes, term202392, args);
    }

};


