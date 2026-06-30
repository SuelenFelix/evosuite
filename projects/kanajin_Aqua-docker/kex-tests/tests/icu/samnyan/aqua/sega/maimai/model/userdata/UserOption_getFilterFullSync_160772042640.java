package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserOption_getFilterFullSync_160772042640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63049;

    public UserOption_getFilterFullSync_160772042640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63055 = new Long(185793058502220865L);
        term63049 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term63051 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term63053 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63074 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63084 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63049, term63049.getClass(), "id", -4994148485124075625L);
        setLongField(term63051, term63051.getClass(), "id", -8842842172497711872L);
        setLongField(term63053, term63053.getClass(), "id", -5367775625638780650L);
        setField(term63053, term63053.getClass(), "extId", term63055);
        setField(term63053, term63053.getClass(), "luid", "viZRlrisPY");
        setIntField(term63070, term63070.getClass(), "year", 2021);
        setShortField(term63070, term63070.getClass(), "month", (short) 9);
        setShortField(term63070, term63070.getClass(), "day", (short) 7);
        setField(term63069, term63069.getClass(), "date", term63070);
        setByteField(term63074, term63074.getClass(), "hour", (byte) 16);
        setByteField(term63074, term63074.getClass(), "minute", (byte) 9);
        setByteField(term63074, term63074.getClass(), "second", (byte) 0);
        setIntField(term63074, term63074.getClass(), "nano", 530894568);
        setField(term63069, term63069.getClass(), "time", term63074);
        setField(term63053, term63053.getClass(), "registerTime", term63069);
        setIntField(term63080, term63080.getClass(), "year", 2016);
        setShortField(term63080, term63080.getClass(), "month", (short) 8);
        setShortField(term63080, term63080.getClass(), "day", (short) 27);
        setField(term63079, term63079.getClass(), "date", term63080);
        setByteField(term63084, term63084.getClass(), "hour", (byte) 3);
        setByteField(term63084, term63084.getClass(), "minute", (byte) 10);
        setByteField(term63084, term63084.getClass(), "second", (byte) 27);
        setIntField(term63084, term63084.getClass(), "nano", 429898470);
        setField(term63079, term63079.getClass(), "time", term63084);
        setField(term63053, term63053.getClass(), "accessTime", term63079);
        setField(term63051, term63051.getClass(), "card", term63053);
        setIntField(term63051, term63051.getClass(), "lastDataVersion", 1634880098);
        setField(term63051, term63051.getClass(), "userName", "VSfRsPLslq");
        setIntField(term63051, term63051.getClass(), "point", 1459664470);
        setIntField(term63051, term63051.getClass(), "totalPoint", 390456498);
        setIntField(term63051, term63051.getClass(), "iconId", -75818278);
        setIntField(term63051, term63051.getClass(), "nameplateId", -638713910);
        setIntField(term63051, term63051.getClass(), "frameId", 1047195730);
        setIntField(term63051, term63051.getClass(), "trophyId", -1089490394);
        setIntField(term63051, term63051.getClass(), "playCount", 1288764916);
        setIntField(term63051, term63051.getClass(), "playVsCount", -1590776943);
        setIntField(term63051, term63051.getClass(), "playSyncCount", -55708653);
        setIntField(term63051, term63051.getClass(), "winCount", -618645376);
        setIntField(term63051, term63051.getClass(), "helpCount", -1757025350);
        setIntField(term63051, term63051.getClass(), "comboCount", 241494222);
        setIntField(term63051, term63051.getClass(), "feverCount", -1394120293);
        setIntField(term63051, term63051.getClass(), "totalHiScore", 1365082165);
        setIntField(term63051, term63051.getClass(), "totalEasyHighScore", 237330727);
        setIntField(term63051, term63051.getClass(), "totalBasicHighScore", 1865561086);
        setIntField(term63051, term63051.getClass(), "totalAdvancedHighScore", -1717770104);
        setIntField(term63051, term63051.getClass(), "totalExpertHighScore", 1002436799);
        setIntField(term63051, term63051.getClass(), "totalMasterHighScore", 491797710);
        setIntField(term63051, term63051.getClass(), "totalReMasterHighScore", -528313320);
        setIntField(term63051, term63051.getClass(), "totalHighSync", 1438707097);
        setIntField(term63051, term63051.getClass(), "totalEasySync", -776758828);
        setIntField(term63051, term63051.getClass(), "totalBasicSync", -1084450309);
        setIntField(term63051, term63051.getClass(), "totalAdvancedSync", -701546274);
        setIntField(term63051, term63051.getClass(), "totalExpertSync", -875355024);
        setIntField(term63051, term63051.getClass(), "totalMasterSync", -741514277);
        setIntField(term63051, term63051.getClass(), "totalReMasterSync", 1849014808);
        setIntField(term63051, term63051.getClass(), "playerRating", 452254325);
        setIntField(term63051, term63051.getClass(), "highestRating", 68487577);
        setIntField(term63051, term63051.getClass(), "rankAuthTailId", 225702811);
        setField(term63051, term63051.getClass(), "eventWatchedDate", "dwygneuBjP");
        setField(term63051, term63051.getClass(), "webLimitDate", "LfKgkzPZpX");
        setIntField(term63051, term63051.getClass(), "challengeTrackPhase", 243703890);
        setIntField(term63051, term63051.getClass(), "firstPlayBits", -2015558089);
        setField(term63051, term63051.getClass(), "lastPlayDate", "belyXxMqFm");
        setIntField(term63051, term63051.getClass(), "lastPlaceId", -1965545269);
        setField(term63051, term63051.getClass(), "lastPlaceName", "LPotuCwkwB");
        setIntField(term63051, term63051.getClass(), "lastRegionId", -1898898123);
        setField(term63051, term63051.getClass(), "lastRegionName", "zpCKXLOzse");
        setField(term63051, term63051.getClass(), "lastClientId", "qhlWSiHAHt");
        setField(term63051, term63051.getClass(), "lastCountryCode", "XrKIhxpIJD");
        setIntField(term63051, term63051.getClass(), "eventPoint", 499139452);
        setIntField(term63051, term63051.getClass(), "totalLv", -471563064);
        setIntField(term63051, term63051.getClass(), "lastLoginBonusDay", -1803846804);
        setIntField(term63051, term63051.getClass(), "lastSurvivalBonusDay", 1011728980);
        setIntField(term63051, term63051.getClass(), "loginBonusLv", -1674151373);
        setField(term63049, term63049.getClass(), "user", term63051);
        setIntField(term63049, term63049.getClass(), "soudEffect", 2007242087);
        setIntField(term63049, term63049.getClass(), "mirrorMode", 33663834);
        setIntField(term63049, term63049.getClass(), "guideSpeed", 1194874786);
        setIntField(term63049, term63049.getClass(), "bgInfo", -1495464639);
        setIntField(term63049, term63049.getClass(), "brightness", -1504462202);
        setIntField(term63049, term63049.getClass(), "isStarRot", 125976040);
        setIntField(term63049, term63049.getClass(), "breakSe", -666251907);
        setIntField(term63049, term63049.getClass(), "slideSe", 417356870);
        setIntField(term63049, term63049.getClass(), "hardJudge", -488295525);
        setIntField(term63049, term63049.getClass(), "isTagJump", 2035542822);
        setIntField(term63049, term63049.getClass(), "breakSeVol", 1606668266);
        setIntField(term63049, term63049.getClass(), "slideSeVol", 1659642005);
        setIntField(term63049, term63049.getClass(), "isUpperDisp", 1181466680);
        setIntField(term63049, term63049.getClass(), "trackSkip", 1039050085);
        setIntField(term63049, term63049.getClass(), "optionMode", -1960930871);
        setIntField(term63049, term63049.getClass(), "simpleOptionParam", -1230284197);
        setIntField(term63049, term63049.getClass(), "adjustTiming", -506167207);
        setIntField(term63049, term63049.getClass(), "dispTiming", 1701319929);
        setIntField(term63049, term63049.getClass(), "timingPos", 753637194);
        setIntField(term63049, term63049.getClass(), "ansVol", -1087577082);
        setIntField(term63049, term63049.getClass(), "noteVol", 827590140);
        setIntField(term63049, term63049.getClass(), "dmgVol", 1280674880);
        setIntField(term63049, term63049.getClass(), "appealFlame", -2081016929);
        setIntField(term63049, term63049.getClass(), "isFeverDisp", 345548771);
        setIntField(term63049, term63049.getClass(), "dispJudge", 1092807671);
        setIntField(term63049, term63049.getClass(), "judgePos", -1828014109);
        setIntField(term63049, term63049.getClass(), "ratingGuard", 1241624050);
        setIntField(term63049, term63049.getClass(), "selectChara", 21533705);
        setIntField(term63049, term63049.getClass(), "sortType", -1838381563);
        setIntField(term63049, term63049.getClass(), "filterGenre", -1277391013);
        setIntField(term63049, term63049.getClass(), "filterLevel", 68174233);
        setIntField(term63049, term63049.getClass(), "filterRank", -1037932427);
        setIntField(term63049, term63049.getClass(), "filterVersion", 1911553569);
        setIntField(term63049, term63049.getClass(), "filterRec", -2021373513);
        setIntField(term63049, term63049.getClass(), "filterFullCombo", -451056248);
        setIntField(term63049, term63049.getClass(), "filterAllPerfect", 1245561718);
        setIntField(term63049, term63049.getClass(), "filterDifficulty", -1727696105);
        setIntField(term63049, term63049.getClass(), "filterFullSync", -164210021);
        setIntField(term63049, term63049.getClass(), "filterReMaster", -1813428473);
        setIntField(term63049, term63049.getClass(), "filterMaxFever", 2092175435);
        setIntField(term63049, term63049.getClass(), "finalSelectId", -759305129);
        setIntField(term63049, term63049.getClass(), "finalSelectCategory", -1698841717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterFullSync", argTypes, term63049, args);
    }

};


