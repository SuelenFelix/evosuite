package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCourse_isFullCombo_847092799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1917616;

    public UserCourse_isFullCombo_847092799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1917622 = new Long(7959584504878946737L);
        term1917616 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1917618 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1917620 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1917636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917641 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917646 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917647 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917651 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917668 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917669 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917673 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917828 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917908 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1917616, term1917616.getClass(), "id", 1983088905773473120L);
        setLongField(term1917618, term1917618.getClass(), "id", -8154762338447164752L);
        setLongField(term1917620, term1917620.getClass(), "id", 2312679925638646049L);
        setField(term1917620, term1917620.getClass(), "extId", term1917622);
        setField(term1917620, term1917620.getClass(), "luid", "vXDlSFtbzt");
        setIntField(term1917637, term1917637.getClass(), "year", 2013);
        setShortField(term1917637, term1917637.getClass(), "month", (short) 8);
        setShortField(term1917637, term1917637.getClass(), "day", (short) 31);
        setField(term1917636, term1917636.getClass(), "date", term1917637);
        setByteField(term1917641, term1917641.getClass(), "hour", (byte) 13);
        setByteField(term1917641, term1917641.getClass(), "minute", (byte) 9);
        setByteField(term1917641, term1917641.getClass(), "second", (byte) 13);
        setIntField(term1917641, term1917641.getClass(), "nano", 644469686);
        setField(term1917636, term1917636.getClass(), "time", term1917641);
        setField(term1917620, term1917620.getClass(), "registerTime", term1917636);
        setIntField(term1917647, term1917647.getClass(), "year", 2022);
        setShortField(term1917647, term1917647.getClass(), "month", (short) 12);
        setShortField(term1917647, term1917647.getClass(), "day", (short) 17);
        setField(term1917646, term1917646.getClass(), "date", term1917647);
        setByteField(term1917651, term1917651.getClass(), "hour", (byte) 8);
        setByteField(term1917651, term1917651.getClass(), "minute", (byte) 0);
        setByteField(term1917651, term1917651.getClass(), "second", (byte) 5);
        setIntField(term1917651, term1917651.getClass(), "nano", 328173708);
        setField(term1917646, term1917646.getClass(), "time", term1917651);
        setField(term1917620, term1917620.getClass(), "accessTime", term1917646);
        setField(term1917618, term1917618.getClass(), "card", term1917620);
        setField(term1917618, term1917618.getClass(), "userName", "hclkhslChL");
        setIntField(term1917669, term1917669.getClass(), "year", 2025);
        setShortField(term1917669, term1917669.getClass(), "month", (short) 2);
        setShortField(term1917669, term1917669.getClass(), "day", (short) 22);
        setField(term1917668, term1917668.getClass(), "date", term1917669);
        setByteField(term1917673, term1917673.getClass(), "hour", (byte) 13);
        setByteField(term1917673, term1917673.getClass(), "minute", (byte) 21);
        setByteField(term1917673, term1917673.getClass(), "second", (byte) 18);
        setIntField(term1917673, term1917673.getClass(), "nano", 244735760);
        setField(term1917668, term1917668.getClass(), "time", term1917673);
        setField(term1917618, term1917618.getClass(), "lastLoginDate", term1917668);
        setBooleanField(term1917618, term1917618.getClass(), "isWebJoin", false);
        setField(term1917618, term1917618.getClass(), "webLimitDate", "ligMzBgIPe");
        setIntField(term1917618, term1917618.getClass(), "level", -1419524563);
        setIntField(term1917618, term1917618.getClass(), "reincarnationNum", 1775634353);
        setField(term1917618, term1917618.getClass(), "exp", "YOjtvwLxzo");
        setLongField(term1917618, term1917618.getClass(), "point", 8137915455558824629L);
        setLongField(term1917618, term1917618.getClass(), "totalPoint", 7655316368487098166L);
        setIntField(term1917618, term1917618.getClass(), "playCount", 1962742547);
        setIntField(term1917618, term1917618.getClass(), "multiPlayCount", 1625616752);
        setIntField(term1917618, term1917618.getClass(), "multiWinCount", -294307635);
        setIntField(term1917618, term1917618.getClass(), "requestResCount", -869069249);
        setIntField(term1917618, term1917618.getClass(), "acceptResCount", -1508812533);
        setIntField(term1917618, term1917618.getClass(), "successResCount", -1483205757);
        setIntField(term1917618, term1917618.getClass(), "playerRating", -1926653988);
        setIntField(term1917618, term1917618.getClass(), "highestRating", -928052774);
        setIntField(term1917618, term1917618.getClass(), "nameplateId", 812071452);
        setIntField(term1917618, term1917618.getClass(), "frameId", 957333411);
        setIntField(term1917618, term1917618.getClass(), "characterId", 971742398);
        setIntField(term1917618, term1917618.getClass(), "trophyId", 1512329871);
        setIntField(term1917618, term1917618.getClass(), "playedTutorialBit", -1630518330);
        setIntField(term1917618, term1917618.getClass(), "firstTutorialCancelNum", 1439303920);
        setIntField(term1917618, term1917618.getClass(), "masterTutorialCancelNum", -2004951518);
        setIntField(term1917618, term1917618.getClass(), "totalRepertoireCount", 1834194132);
        setIntField(term1917618, term1917618.getClass(), "totalMapNum", -1047690278);
        setLongField(term1917618, term1917618.getClass(), "totalHiScore", 2924136532135797647L);
        setLongField(term1917618, term1917618.getClass(), "totalBasicHighScore", 786689057616396737L);
        setLongField(term1917618, term1917618.getClass(), "totalAdvancedHighScore", -3164194284484944673L);
        setLongField(term1917618, term1917618.getClass(), "totalExpertHighScore", -3684072423074036031L);
        setLongField(term1917618, term1917618.getClass(), "totalMasterHighScore", -6442400715660482230L);
        setIntField(term1917730, term1917730.getClass(), "year", 2019);
        setShortField(term1917730, term1917730.getClass(), "month", (short) 2);
        setShortField(term1917730, term1917730.getClass(), "day", (short) 10);
        setField(term1917729, term1917729.getClass(), "date", term1917730);
        setByteField(term1917734, term1917734.getClass(), "hour", (byte) 19);
        setByteField(term1917734, term1917734.getClass(), "minute", (byte) 11);
        setByteField(term1917734, term1917734.getClass(), "second", (byte) 44);
        setIntField(term1917734, term1917734.getClass(), "nano", 837771784);
        setField(term1917729, term1917729.getClass(), "time", term1917734);
        setField(term1917618, term1917618.getClass(), "eventWatchedDate", term1917729);
        setIntField(term1917618, term1917618.getClass(), "friendCount", 495042105);
        setBooleanField(term1917618, term1917618.getClass(), "isMaimai", false);
        setField(term1917618, term1917618.getClass(), "firstGameId", "mMUkAGUPYV");
        setField(term1917618, term1917618.getClass(), "firstRomVersion", "UkZzgynjoT");
        setField(term1917618, term1917618.getClass(), "firstDataVersion", "hmvbejiwMV");
        setIntField(term1917778, term1917778.getClass(), "year", 2026);
        setShortField(term1917778, term1917778.getClass(), "month", (short) 3);
        setShortField(term1917778, term1917778.getClass(), "day", (short) 13);
        setField(term1917777, term1917777.getClass(), "date", term1917778);
        setByteField(term1917782, term1917782.getClass(), "hour", (byte) 1);
        setByteField(term1917782, term1917782.getClass(), "minute", (byte) 34);
        setByteField(term1917782, term1917782.getClass(), "second", (byte) 6);
        setIntField(term1917782, term1917782.getClass(), "nano", 376153268);
        setField(term1917777, term1917777.getClass(), "time", term1917782);
        setField(term1917618, term1917618.getClass(), "firstPlayDate", term1917777);
        setField(term1917618, term1917618.getClass(), "lastGameId", "mMkEuDUQEz");
        setField(term1917618, term1917618.getClass(), "lastRomVersion", "YmzmJCIxPC");
        setField(term1917618, term1917618.getClass(), "lastDataVersion", "VDqgKeEjzU");
        setIntField(term1917824, term1917824.getClass(), "year", 2014);
        setShortField(term1917824, term1917824.getClass(), "month", (short) 11);
        setShortField(term1917824, term1917824.getClass(), "day", (short) 18);
        setField(term1917823, term1917823.getClass(), "date", term1917824);
        setByteField(term1917828, term1917828.getClass(), "hour", (byte) 0);
        setByteField(term1917828, term1917828.getClass(), "minute", (byte) 49);
        setByteField(term1917828, term1917828.getClass(), "second", (byte) 25);
        setIntField(term1917828, term1917828.getClass(), "nano", 126360847);
        setField(term1917823, term1917823.getClass(), "time", term1917828);
        setField(term1917618, term1917618.getClass(), "lastPlayDate", term1917823);
        setIntField(term1917618, term1917618.getClass(), "lastPlaceId", 1836955167);
        setField(term1917618, term1917618.getClass(), "lastPlaceName", "CQfjkEgdXv");
        setField(term1917618, term1917618.getClass(), "lastRegionId", "jikLPzfrCN");
        setField(term1917618, term1917618.getClass(), "lastRegionName", "FTVdqZZffj");
        setField(term1917618, term1917618.getClass(), "lastAllNetId", "SRJTcsAIxz");
        setField(term1917618, term1917618.getClass(), "lastClientId", "HrsdUazKrd");
        setField(term1917616, term1917616.getClass(), "user", term1917618);
        setIntField(term1917616, term1917616.getClass(), "courseId", -1485625637);
        setIntField(term1917616, term1917616.getClass(), "classId", -2123344577);
        setIntField(term1917616, term1917616.getClass(), "playCount", -1462914711);
        setIntField(term1917616, term1917616.getClass(), "scoreMax", -1202919783);
        setBooleanField(term1917616, term1917616.getClass(), "isFullCombo", true);
        setBooleanField(term1917616, term1917616.getClass(), "isAllJustice", false);
        setBooleanField(term1917616, term1917616.getClass(), "isSuccess", true);
        setIntField(term1917616, term1917616.getClass(), "scoreRank", 2093866790);
        setIntField(term1917616, term1917616.getClass(), "eventId", 1588901107);
        setIntField(term1917904, term1917904.getClass(), "year", 2019);
        setShortField(term1917904, term1917904.getClass(), "month", (short) 5);
        setShortField(term1917904, term1917904.getClass(), "day", (short) 29);
        setField(term1917903, term1917903.getClass(), "date", term1917904);
        setByteField(term1917908, term1917908.getClass(), "hour", (byte) 19);
        setByteField(term1917908, term1917908.getClass(), "minute", (byte) 3);
        setByteField(term1917908, term1917908.getClass(), "second", (byte) 49);
        setIntField(term1917908, term1917908.getClass(), "nano", 906000773);
        setField(term1917903, term1917903.getClass(), "time", term1917908);
        setField(term1917616, term1917616.getClass(), "lastPlayDate", term1917903);
        setIntField(term1917616, term1917616.getClass(), "param1", 203981376);
        setIntField(term1917616, term1917616.getClass(), "param2", 1400545257);
        setIntField(term1917616, term1917616.getClass(), "param3", 1348485215);
        setIntField(term1917616, term1917616.getClass(), "param4", 1539138384);
        setBooleanField(term1917616, term1917616.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term1917616, args);
    }

};


