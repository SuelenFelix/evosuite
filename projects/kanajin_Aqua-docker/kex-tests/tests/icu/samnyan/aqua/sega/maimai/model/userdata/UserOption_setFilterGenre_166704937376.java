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

public class UserOption_setFilterGenre_166704937376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74461;
     Object term74679;

    public UserOption_setFilterGenre_166704937376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74467 = new Long(5806367330808555223L);
        term74461 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term74463 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term74465 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74496 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term74461, term74461.getClass(), "id", 9173715346996433126L);
        setLongField(term74463, term74463.getClass(), "id", -3243599172737171562L);
        setLongField(term74465, term74465.getClass(), "id", 3221586604131689186L);
        setField(term74465, term74465.getClass(), "extId", term74467);
        setField(term74465, term74465.getClass(), "luid", "QSvdWzkkPx");
        setIntField(term74482, term74482.getClass(), "year", 2016);
        setShortField(term74482, term74482.getClass(), "month", (short) 5);
        setShortField(term74482, term74482.getClass(), "day", (short) 9);
        setField(term74481, term74481.getClass(), "date", term74482);
        setByteField(term74486, term74486.getClass(), "hour", (byte) 22);
        setByteField(term74486, term74486.getClass(), "minute", (byte) 50);
        setByteField(term74486, term74486.getClass(), "second", (byte) 14);
        setIntField(term74486, term74486.getClass(), "nano", 185148211);
        setField(term74481, term74481.getClass(), "time", term74486);
        setField(term74465, term74465.getClass(), "registerTime", term74481);
        setIntField(term74492, term74492.getClass(), "year", 2014);
        setShortField(term74492, term74492.getClass(), "month", (short) 3);
        setShortField(term74492, term74492.getClass(), "day", (short) 7);
        setField(term74491, term74491.getClass(), "date", term74492);
        setByteField(term74496, term74496.getClass(), "hour", (byte) 2);
        setByteField(term74496, term74496.getClass(), "minute", (byte) 57);
        setByteField(term74496, term74496.getClass(), "second", (byte) 26);
        setIntField(term74496, term74496.getClass(), "nano", 493613741);
        setField(term74491, term74491.getClass(), "time", term74496);
        setField(term74465, term74465.getClass(), "accessTime", term74491);
        setField(term74463, term74463.getClass(), "card", term74465);
        setIntField(term74463, term74463.getClass(), "lastDataVersion", 1442831165);
        setField(term74463, term74463.getClass(), "userName", "vStdEtWvae");
        setIntField(term74463, term74463.getClass(), "point", -1549367103);
        setIntField(term74463, term74463.getClass(), "totalPoint", 1063843595);
        setIntField(term74463, term74463.getClass(), "iconId", -326125660);
        setIntField(term74463, term74463.getClass(), "nameplateId", 229716246);
        setIntField(term74463, term74463.getClass(), "frameId", 881998687);
        setIntField(term74463, term74463.getClass(), "trophyId", 1432793095);
        setIntField(term74463, term74463.getClass(), "playCount", -652330768);
        setIntField(term74463, term74463.getClass(), "playVsCount", 1092473461);
        setIntField(term74463, term74463.getClass(), "playSyncCount", 1102181288);
        setIntField(term74463, term74463.getClass(), "winCount", 1763750177);
        setIntField(term74463, term74463.getClass(), "helpCount", -1006572538);
        setIntField(term74463, term74463.getClass(), "comboCount", -1176631465);
        setIntField(term74463, term74463.getClass(), "feverCount", -1839207123);
        setIntField(term74463, term74463.getClass(), "totalHiScore", -1103760001);
        setIntField(term74463, term74463.getClass(), "totalEasyHighScore", 329870869);
        setIntField(term74463, term74463.getClass(), "totalBasicHighScore", 380359269);
        setIntField(term74463, term74463.getClass(), "totalAdvancedHighScore", 899745442);
        setIntField(term74463, term74463.getClass(), "totalExpertHighScore", -1602381366);
        setIntField(term74463, term74463.getClass(), "totalMasterHighScore", 874358340);
        setIntField(term74463, term74463.getClass(), "totalReMasterHighScore", -1402074319);
        setIntField(term74463, term74463.getClass(), "totalHighSync", 2082998484);
        setIntField(term74463, term74463.getClass(), "totalEasySync", -904181232);
        setIntField(term74463, term74463.getClass(), "totalBasicSync", 1855285186);
        setIntField(term74463, term74463.getClass(), "totalAdvancedSync", -1234937664);
        setIntField(term74463, term74463.getClass(), "totalExpertSync", 1741809881);
        setIntField(term74463, term74463.getClass(), "totalMasterSync", -1630393878);
        setIntField(term74463, term74463.getClass(), "totalReMasterSync", -511205093);
        setIntField(term74463, term74463.getClass(), "playerRating", 1169805384);
        setIntField(term74463, term74463.getClass(), "highestRating", -1134069368);
        setIntField(term74463, term74463.getClass(), "rankAuthTailId", -2099537183);
        setField(term74463, term74463.getClass(), "eventWatchedDate", "iApJWgnQkP");
        setField(term74463, term74463.getClass(), "webLimitDate", "kHKzzYJxiP");
        setIntField(term74463, term74463.getClass(), "challengeTrackPhase", 210414797);
        setIntField(term74463, term74463.getClass(), "firstPlayBits", -119784391);
        setField(term74463, term74463.getClass(), "lastPlayDate", "INFnBrMIka");
        setIntField(term74463, term74463.getClass(), "lastPlaceId", 1766080555);
        setField(term74463, term74463.getClass(), "lastPlaceName", "EwmpEgdvZs");
        setIntField(term74463, term74463.getClass(), "lastRegionId", -403077875);
        setField(term74463, term74463.getClass(), "lastRegionName", "vRjHouXWLC");
        setField(term74463, term74463.getClass(), "lastClientId", "XghDInkWEe");
        setField(term74463, term74463.getClass(), "lastCountryCode", "zPDuGbsYGT");
        setIntField(term74463, term74463.getClass(), "eventPoint", -40855781);
        setIntField(term74463, term74463.getClass(), "totalLv", -1672327295);
        setIntField(term74463, term74463.getClass(), "lastLoginBonusDay", -1320591245);
        setIntField(term74463, term74463.getClass(), "lastSurvivalBonusDay", -1395522049);
        setIntField(term74463, term74463.getClass(), "loginBonusLv", 1010920736);
        setField(term74461, term74461.getClass(), "user", term74463);
        setIntField(term74461, term74461.getClass(), "soudEffect", -1045739252);
        setIntField(term74461, term74461.getClass(), "mirrorMode", -243346516);
        setIntField(term74461, term74461.getClass(), "guideSpeed", -2095273504);
        setIntField(term74461, term74461.getClass(), "bgInfo", -775755482);
        setIntField(term74461, term74461.getClass(), "brightness", 700894090);
        setIntField(term74461, term74461.getClass(), "isStarRot", 1312055089);
        setIntField(term74461, term74461.getClass(), "breakSe", 252154585);
        setIntField(term74461, term74461.getClass(), "slideSe", -1872883656);
        setIntField(term74461, term74461.getClass(), "hardJudge", -1369707148);
        setIntField(term74461, term74461.getClass(), "isTagJump", -1248395743);
        setIntField(term74461, term74461.getClass(), "breakSeVol", -943902027);
        setIntField(term74461, term74461.getClass(), "slideSeVol", 745051381);
        setIntField(term74461, term74461.getClass(), "isUpperDisp", 2140325199);
        setIntField(term74461, term74461.getClass(), "trackSkip", 1422307922);
        setIntField(term74461, term74461.getClass(), "optionMode", -1537639739);
        setIntField(term74461, term74461.getClass(), "simpleOptionParam", 132191142);
        setIntField(term74461, term74461.getClass(), "adjustTiming", -302778830);
        setIntField(term74461, term74461.getClass(), "dispTiming", -859574139);
        setIntField(term74461, term74461.getClass(), "timingPos", -869816828);
        setIntField(term74461, term74461.getClass(), "ansVol", 1368030099);
        setIntField(term74461, term74461.getClass(), "noteVol", 992346246);
        setIntField(term74461, term74461.getClass(), "dmgVol", -1773462565);
        setIntField(term74461, term74461.getClass(), "appealFlame", -1292893830);
        setIntField(term74461, term74461.getClass(), "isFeverDisp", 1749301650);
        setIntField(term74461, term74461.getClass(), "dispJudge", -1255646451);
        setIntField(term74461, term74461.getClass(), "judgePos", 975684744);
        setIntField(term74461, term74461.getClass(), "ratingGuard", -995141916);
        setIntField(term74461, term74461.getClass(), "selectChara", 1226962912);
        setIntField(term74461, term74461.getClass(), "sortType", -1674012635);
        setIntField(term74461, term74461.getClass(), "filterGenre", 1710267845);
        setIntField(term74461, term74461.getClass(), "filterLevel", 1837620628);
        setIntField(term74461, term74461.getClass(), "filterRank", 866060083);
        setIntField(term74461, term74461.getClass(), "filterVersion", 1938692940);
        setIntField(term74461, term74461.getClass(), "filterRec", -1095213301);
        setIntField(term74461, term74461.getClass(), "filterFullCombo", 1834341782);
        setIntField(term74461, term74461.getClass(), "filterAllPerfect", 7783695);
        setIntField(term74461, term74461.getClass(), "filterDifficulty", -1797446938);
        setIntField(term74461, term74461.getClass(), "filterFullSync", 1666122877);
        setIntField(term74461, term74461.getClass(), "filterReMaster", -263180012);
        setIntField(term74461, term74461.getClass(), "filterMaxFever", -697527464);
        setIntField(term74461, term74461.getClass(), "finalSelectId", 1717185086);
        setIntField(term74461, term74461.getClass(), "finalSelectCategory", -915266907);
        term74679 = new Integer(1774186491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74679;
        callMethod(klass, "setFilterGenre", argTypes, term74461, args);
    }

};


