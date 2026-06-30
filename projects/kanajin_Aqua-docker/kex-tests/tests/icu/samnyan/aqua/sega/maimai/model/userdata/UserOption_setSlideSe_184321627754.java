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

public class UserOption_setSlideSe_184321627754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67641;
     Object term67859;

    public UserOption_setSlideSe_184321627754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67647 = new Long(-8019730974733786399L);
        term67641 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term67643 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term67645 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67676 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67641, term67641.getClass(), "id", -8957441653116712448L);
        setLongField(term67643, term67643.getClass(), "id", -5761087225966065493L);
        setLongField(term67645, term67645.getClass(), "id", 493557348274366095L);
        setField(term67645, term67645.getClass(), "extId", term67647);
        setField(term67645, term67645.getClass(), "luid", "fbshyuUfqy");
        setIntField(term67662, term67662.getClass(), "year", 2018);
        setShortField(term67662, term67662.getClass(), "month", (short) 9);
        setShortField(term67662, term67662.getClass(), "day", (short) 10);
        setField(term67661, term67661.getClass(), "date", term67662);
        setByteField(term67666, term67666.getClass(), "hour", (byte) 11);
        setByteField(term67666, term67666.getClass(), "minute", (byte) 50);
        setByteField(term67666, term67666.getClass(), "second", (byte) 3);
        setIntField(term67666, term67666.getClass(), "nano", 33779151);
        setField(term67661, term67661.getClass(), "time", term67666);
        setField(term67645, term67645.getClass(), "registerTime", term67661);
        setIntField(term67672, term67672.getClass(), "year", 2022);
        setShortField(term67672, term67672.getClass(), "month", (short) 6);
        setShortField(term67672, term67672.getClass(), "day", (short) 29);
        setField(term67671, term67671.getClass(), "date", term67672);
        setByteField(term67676, term67676.getClass(), "hour", (byte) 1);
        setByteField(term67676, term67676.getClass(), "minute", (byte) 29);
        setByteField(term67676, term67676.getClass(), "second", (byte) 33);
        setIntField(term67676, term67676.getClass(), "nano", 714362758);
        setField(term67671, term67671.getClass(), "time", term67676);
        setField(term67645, term67645.getClass(), "accessTime", term67671);
        setField(term67643, term67643.getClass(), "card", term67645);
        setIntField(term67643, term67643.getClass(), "lastDataVersion", 35296030);
        setField(term67643, term67643.getClass(), "userName", "eupNcihLEw");
        setIntField(term67643, term67643.getClass(), "point", -147453115);
        setIntField(term67643, term67643.getClass(), "totalPoint", 2047983381);
        setIntField(term67643, term67643.getClass(), "iconId", 1385190120);
        setIntField(term67643, term67643.getClass(), "nameplateId", -2000859986);
        setIntField(term67643, term67643.getClass(), "frameId", 1200458018);
        setIntField(term67643, term67643.getClass(), "trophyId", 600261391);
        setIntField(term67643, term67643.getClass(), "playCount", -2059332972);
        setIntField(term67643, term67643.getClass(), "playVsCount", 1640135788);
        setIntField(term67643, term67643.getClass(), "playSyncCount", -1798099248);
        setIntField(term67643, term67643.getClass(), "winCount", -751016254);
        setIntField(term67643, term67643.getClass(), "helpCount", -675885759);
        setIntField(term67643, term67643.getClass(), "comboCount", 210273358);
        setIntField(term67643, term67643.getClass(), "feverCount", 1549469301);
        setIntField(term67643, term67643.getClass(), "totalHiScore", -1013418612);
        setIntField(term67643, term67643.getClass(), "totalEasyHighScore", -2032230010);
        setIntField(term67643, term67643.getClass(), "totalBasicHighScore", 1371041033);
        setIntField(term67643, term67643.getClass(), "totalAdvancedHighScore", 1425278647);
        setIntField(term67643, term67643.getClass(), "totalExpertHighScore", 1987874128);
        setIntField(term67643, term67643.getClass(), "totalMasterHighScore", -1044006018);
        setIntField(term67643, term67643.getClass(), "totalReMasterHighScore", 1682172851);
        setIntField(term67643, term67643.getClass(), "totalHighSync", 525455763);
        setIntField(term67643, term67643.getClass(), "totalEasySync", -1779673407);
        setIntField(term67643, term67643.getClass(), "totalBasicSync", -974331461);
        setIntField(term67643, term67643.getClass(), "totalAdvancedSync", -1970561622);
        setIntField(term67643, term67643.getClass(), "totalExpertSync", -1823273876);
        setIntField(term67643, term67643.getClass(), "totalMasterSync", -1730970144);
        setIntField(term67643, term67643.getClass(), "totalReMasterSync", 1746099578);
        setIntField(term67643, term67643.getClass(), "playerRating", -783114572);
        setIntField(term67643, term67643.getClass(), "highestRating", 1808573799);
        setIntField(term67643, term67643.getClass(), "rankAuthTailId", 1246473923);
        setField(term67643, term67643.getClass(), "eventWatchedDate", "iFFcolxwcm");
        setField(term67643, term67643.getClass(), "webLimitDate", "bAsZBSqnyM");
        setIntField(term67643, term67643.getClass(), "challengeTrackPhase", -1966362089);
        setIntField(term67643, term67643.getClass(), "firstPlayBits", -590160537);
        setField(term67643, term67643.getClass(), "lastPlayDate", "urrmpQzmTU");
        setIntField(term67643, term67643.getClass(), "lastPlaceId", 338926069);
        setField(term67643, term67643.getClass(), "lastPlaceName", "GWoZyTTlNx");
        setIntField(term67643, term67643.getClass(), "lastRegionId", 1270815383);
        setField(term67643, term67643.getClass(), "lastRegionName", "ntUYcalSmz");
        setField(term67643, term67643.getClass(), "lastClientId", "lnZXLpyQoO");
        setField(term67643, term67643.getClass(), "lastCountryCode", "lOIEIGbwPj");
        setIntField(term67643, term67643.getClass(), "eventPoint", -1570777149);
        setIntField(term67643, term67643.getClass(), "totalLv", 1402458571);
        setIntField(term67643, term67643.getClass(), "lastLoginBonusDay", 1057231536);
        setIntField(term67643, term67643.getClass(), "lastSurvivalBonusDay", 1094699239);
        setIntField(term67643, term67643.getClass(), "loginBonusLv", -340660877);
        setField(term67641, term67641.getClass(), "user", term67643);
        setIntField(term67641, term67641.getClass(), "soudEffect", -1057260995);
        setIntField(term67641, term67641.getClass(), "mirrorMode", 2052974699);
        setIntField(term67641, term67641.getClass(), "guideSpeed", -1104398051);
        setIntField(term67641, term67641.getClass(), "bgInfo", 1965135387);
        setIntField(term67641, term67641.getClass(), "brightness", 1954267797);
        setIntField(term67641, term67641.getClass(), "isStarRot", 1329325699);
        setIntField(term67641, term67641.getClass(), "breakSe", 851318857);
        setIntField(term67641, term67641.getClass(), "slideSe", 72185115);
        setIntField(term67641, term67641.getClass(), "hardJudge", 2111617419);
        setIntField(term67641, term67641.getClass(), "isTagJump", 1210867323);
        setIntField(term67641, term67641.getClass(), "breakSeVol", 27791137);
        setIntField(term67641, term67641.getClass(), "slideSeVol", 1963687417);
        setIntField(term67641, term67641.getClass(), "isUpperDisp", -965855146);
        setIntField(term67641, term67641.getClass(), "trackSkip", 197583048);
        setIntField(term67641, term67641.getClass(), "optionMode", -1011618744);
        setIntField(term67641, term67641.getClass(), "simpleOptionParam", -1939207343);
        setIntField(term67641, term67641.getClass(), "adjustTiming", -1542332267);
        setIntField(term67641, term67641.getClass(), "dispTiming", 511979240);
        setIntField(term67641, term67641.getClass(), "timingPos", 1453502162);
        setIntField(term67641, term67641.getClass(), "ansVol", -1053363959);
        setIntField(term67641, term67641.getClass(), "noteVol", 1963496562);
        setIntField(term67641, term67641.getClass(), "dmgVol", -866469192);
        setIntField(term67641, term67641.getClass(), "appealFlame", 681850120);
        setIntField(term67641, term67641.getClass(), "isFeverDisp", -106365496);
        setIntField(term67641, term67641.getClass(), "dispJudge", -1705194235);
        setIntField(term67641, term67641.getClass(), "judgePos", -1378662649);
        setIntField(term67641, term67641.getClass(), "ratingGuard", -892038297);
        setIntField(term67641, term67641.getClass(), "selectChara", 916168616);
        setIntField(term67641, term67641.getClass(), "sortType", -466521355);
        setIntField(term67641, term67641.getClass(), "filterGenre", -1955693211);
        setIntField(term67641, term67641.getClass(), "filterLevel", -7776274);
        setIntField(term67641, term67641.getClass(), "filterRank", 261333033);
        setIntField(term67641, term67641.getClass(), "filterVersion", 2106793317);
        setIntField(term67641, term67641.getClass(), "filterRec", 1986891073);
        setIntField(term67641, term67641.getClass(), "filterFullCombo", -2061943399);
        setIntField(term67641, term67641.getClass(), "filterAllPerfect", 1790913385);
        setIntField(term67641, term67641.getClass(), "filterDifficulty", 115596044);
        setIntField(term67641, term67641.getClass(), "filterFullSync", -2070075342);
        setIntField(term67641, term67641.getClass(), "filterReMaster", -546499544);
        setIntField(term67641, term67641.getClass(), "filterMaxFever", 546477713);
        setIntField(term67641, term67641.getClass(), "finalSelectId", -1529353819);
        setIntField(term67641, term67641.getClass(), "finalSelectCategory", 115568532);
        term67859 = new Integer(1917902884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term67859;
        callMethod(klass, "setSlideSe", argTypes, term67641, args);
    }

};


