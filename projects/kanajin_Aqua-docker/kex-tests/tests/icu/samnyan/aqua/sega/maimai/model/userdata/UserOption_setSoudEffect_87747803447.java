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
import java.lang.Integer;

public class UserOption_setSoudEffect_87747803447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65471;
     Object term65689;

    public UserOption_setSoudEffect_87747803447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65477 = new Long(-4043093655001688454L);
        term65471 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term65473 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term65475 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65506 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65471, term65471.getClass(), "id", -723697646775816649L);
        setLongField(term65473, term65473.getClass(), "id", -5671086125367688052L);
        setLongField(term65475, term65475.getClass(), "id", 7875739215674729968L);
        setField(term65475, term65475.getClass(), "extId", term65477);
        setField(term65475, term65475.getClass(), "luid", "bOZSTccXbt");
        setIntField(term65492, term65492.getClass(), "year", 2012);
        setShortField(term65492, term65492.getClass(), "month", (short) 6);
        setShortField(term65492, term65492.getClass(), "day", (short) 7);
        setField(term65491, term65491.getClass(), "date", term65492);
        setByteField(term65496, term65496.getClass(), "hour", (byte) 19);
        setByteField(term65496, term65496.getClass(), "minute", (byte) 20);
        setByteField(term65496, term65496.getClass(), "second", (byte) 29);
        setIntField(term65496, term65496.getClass(), "nano", 953959934);
        setField(term65491, term65491.getClass(), "time", term65496);
        setField(term65475, term65475.getClass(), "registerTime", term65491);
        setIntField(term65502, term65502.getClass(), "year", 2024);
        setShortField(term65502, term65502.getClass(), "month", (short) 3);
        setShortField(term65502, term65502.getClass(), "day", (short) 21);
        setField(term65501, term65501.getClass(), "date", term65502);
        setByteField(term65506, term65506.getClass(), "hour", (byte) 1);
        setByteField(term65506, term65506.getClass(), "minute", (byte) 21);
        setByteField(term65506, term65506.getClass(), "second", (byte) 2);
        setIntField(term65506, term65506.getClass(), "nano", 692012262);
        setField(term65501, term65501.getClass(), "time", term65506);
        setField(term65475, term65475.getClass(), "accessTime", term65501);
        setField(term65473, term65473.getClass(), "card", term65475);
        setIntField(term65473, term65473.getClass(), "lastDataVersion", 363051486);
        setField(term65473, term65473.getClass(), "userName", "MBSsxxeNUU");
        setIntField(term65473, term65473.getClass(), "point", 668773961);
        setIntField(term65473, term65473.getClass(), "totalPoint", -1762018663);
        setIntField(term65473, term65473.getClass(), "iconId", 1974419093);
        setIntField(term65473, term65473.getClass(), "nameplateId", -393770145);
        setIntField(term65473, term65473.getClass(), "frameId", 772000733);
        setIntField(term65473, term65473.getClass(), "trophyId", -1694461759);
        setIntField(term65473, term65473.getClass(), "playCount", -1209885402);
        setIntField(term65473, term65473.getClass(), "playVsCount", 544600300);
        setIntField(term65473, term65473.getClass(), "playSyncCount", 680424981);
        setIntField(term65473, term65473.getClass(), "winCount", -972500336);
        setIntField(term65473, term65473.getClass(), "helpCount", 1208675424);
        setIntField(term65473, term65473.getClass(), "comboCount", 1546061631);
        setIntField(term65473, term65473.getClass(), "feverCount", -1211628823);
        setIntField(term65473, term65473.getClass(), "totalHiScore", -1281293973);
        setIntField(term65473, term65473.getClass(), "totalEasyHighScore", -542138921);
        setIntField(term65473, term65473.getClass(), "totalBasicHighScore", 1572030763);
        setIntField(term65473, term65473.getClass(), "totalAdvancedHighScore", -1020308117);
        setIntField(term65473, term65473.getClass(), "totalExpertHighScore", -1195161500);
        setIntField(term65473, term65473.getClass(), "totalMasterHighScore", -824702620);
        setIntField(term65473, term65473.getClass(), "totalReMasterHighScore", -1695248876);
        setIntField(term65473, term65473.getClass(), "totalHighSync", 1112501548);
        setIntField(term65473, term65473.getClass(), "totalEasySync", -519151155);
        setIntField(term65473, term65473.getClass(), "totalBasicSync", -403167960);
        setIntField(term65473, term65473.getClass(), "totalAdvancedSync", 2052324257);
        setIntField(term65473, term65473.getClass(), "totalExpertSync", 294062046);
        setIntField(term65473, term65473.getClass(), "totalMasterSync", 506380814);
        setIntField(term65473, term65473.getClass(), "totalReMasterSync", 2141338064);
        setIntField(term65473, term65473.getClass(), "playerRating", 1629871);
        setIntField(term65473, term65473.getClass(), "highestRating", 745945402);
        setIntField(term65473, term65473.getClass(), "rankAuthTailId", 1563368376);
        setField(term65473, term65473.getClass(), "eventWatchedDate", "NmUhmPLSgG");
        setField(term65473, term65473.getClass(), "webLimitDate", "WJosrfBMfA");
        setIntField(term65473, term65473.getClass(), "challengeTrackPhase", -253159654);
        setIntField(term65473, term65473.getClass(), "firstPlayBits", 1226284936);
        setField(term65473, term65473.getClass(), "lastPlayDate", "ttlGywalKc");
        setIntField(term65473, term65473.getClass(), "lastPlaceId", 1372790052);
        setField(term65473, term65473.getClass(), "lastPlaceName", "rQFBspqBzf");
        setIntField(term65473, term65473.getClass(), "lastRegionId", -784035623);
        setField(term65473, term65473.getClass(), "lastRegionName", "FmWhAOGAMI");
        setField(term65473, term65473.getClass(), "lastClientId", "GdjCkRsIrS");
        setField(term65473, term65473.getClass(), "lastCountryCode", "MJNyYzLhkh");
        setIntField(term65473, term65473.getClass(), "eventPoint", 1007848598);
        setIntField(term65473, term65473.getClass(), "totalLv", -1042332332);
        setIntField(term65473, term65473.getClass(), "lastLoginBonusDay", 752158731);
        setIntField(term65473, term65473.getClass(), "lastSurvivalBonusDay", 941368721);
        setIntField(term65473, term65473.getClass(), "loginBonusLv", -1460524367);
        setField(term65471, term65471.getClass(), "user", term65473);
        setIntField(term65471, term65471.getClass(), "soudEffect", 947338447);
        setIntField(term65471, term65471.getClass(), "mirrorMode", -1451763306);
        setIntField(term65471, term65471.getClass(), "guideSpeed", -1644935195);
        setIntField(term65471, term65471.getClass(), "bgInfo", 1161859055);
        setIntField(term65471, term65471.getClass(), "brightness", 1235637820);
        setIntField(term65471, term65471.getClass(), "isStarRot", -120629892);
        setIntField(term65471, term65471.getClass(), "breakSe", -1054441261);
        setIntField(term65471, term65471.getClass(), "slideSe", -1849440649);
        setIntField(term65471, term65471.getClass(), "hardJudge", 215428761);
        setIntField(term65471, term65471.getClass(), "isTagJump", 196912819);
        setIntField(term65471, term65471.getClass(), "breakSeVol", -2106416475);
        setIntField(term65471, term65471.getClass(), "slideSeVol", 1801549268);
        setIntField(term65471, term65471.getClass(), "isUpperDisp", -2109900781);
        setIntField(term65471, term65471.getClass(), "trackSkip", 1524003020);
        setIntField(term65471, term65471.getClass(), "optionMode", 1117653130);
        setIntField(term65471, term65471.getClass(), "simpleOptionParam", -277091079);
        setIntField(term65471, term65471.getClass(), "adjustTiming", 421713339);
        setIntField(term65471, term65471.getClass(), "dispTiming", -998894691);
        setIntField(term65471, term65471.getClass(), "timingPos", -334578847);
        setIntField(term65471, term65471.getClass(), "ansVol", -1048098682);
        setIntField(term65471, term65471.getClass(), "noteVol", -1887879558);
        setIntField(term65471, term65471.getClass(), "dmgVol", 333645088);
        setIntField(term65471, term65471.getClass(), "appealFlame", 154374104);
        setIntField(term65471, term65471.getClass(), "isFeverDisp", 852769097);
        setIntField(term65471, term65471.getClass(), "dispJudge", -1958995134);
        setIntField(term65471, term65471.getClass(), "judgePos", -2134940262);
        setIntField(term65471, term65471.getClass(), "ratingGuard", 1543999925);
        setIntField(term65471, term65471.getClass(), "selectChara", -1587400954);
        setIntField(term65471, term65471.getClass(), "sortType", 822645894);
        setIntField(term65471, term65471.getClass(), "filterGenre", -1570295297);
        setIntField(term65471, term65471.getClass(), "filterLevel", 823152755);
        setIntField(term65471, term65471.getClass(), "filterRank", 929229690);
        setIntField(term65471, term65471.getClass(), "filterVersion", -454507797);
        setIntField(term65471, term65471.getClass(), "filterRec", 304461972);
        setIntField(term65471, term65471.getClass(), "filterFullCombo", 907796752);
        setIntField(term65471, term65471.getClass(), "filterAllPerfect", -1758084707);
        setIntField(term65471, term65471.getClass(), "filterDifficulty", -1982548161);
        setIntField(term65471, term65471.getClass(), "filterFullSync", 1329279958);
        setIntField(term65471, term65471.getClass(), "filterReMaster", 469543205);
        setIntField(term65471, term65471.getClass(), "filterMaxFever", -12516056);
        setIntField(term65471, term65471.getClass(), "finalSelectId", 1697090986);
        setIntField(term65471, term65471.getClass(), "finalSelectCategory", -1830375526);
        term65689 = new Integer(936265526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65689;
        callMethod(klass, "setSoudEffect", argTypes, term65471, args);
    }

};


