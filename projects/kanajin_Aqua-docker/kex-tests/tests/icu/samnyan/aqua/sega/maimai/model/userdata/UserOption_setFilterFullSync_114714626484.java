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

public class UserOption_setFilterFullSync_114714626484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76941;
     Object term77159;

    public UserOption_setFilterFullSync_114714626484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76947 = new Long(4069264186851023313L);
        term76941 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term76943 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term76945 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76966 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76976 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76941, term76941.getClass(), "id", -6657309314982735134L);
        setLongField(term76943, term76943.getClass(), "id", -685001356309682920L);
        setLongField(term76945, term76945.getClass(), "id", -3189918180129674609L);
        setField(term76945, term76945.getClass(), "extId", term76947);
        setField(term76945, term76945.getClass(), "luid", "iualVLfDmL");
        setIntField(term76962, term76962.getClass(), "year", 2012);
        setShortField(term76962, term76962.getClass(), "month", (short) 12);
        setShortField(term76962, term76962.getClass(), "day", (short) 5);
        setField(term76961, term76961.getClass(), "date", term76962);
        setByteField(term76966, term76966.getClass(), "hour", (byte) 23);
        setByteField(term76966, term76966.getClass(), "minute", (byte) 26);
        setByteField(term76966, term76966.getClass(), "second", (byte) 26);
        setIntField(term76966, term76966.getClass(), "nano", 226998623);
        setField(term76961, term76961.getClass(), "time", term76966);
        setField(term76945, term76945.getClass(), "registerTime", term76961);
        setIntField(term76972, term76972.getClass(), "year", 2020);
        setShortField(term76972, term76972.getClass(), "month", (short) 4);
        setShortField(term76972, term76972.getClass(), "day", (short) 20);
        setField(term76971, term76971.getClass(), "date", term76972);
        setByteField(term76976, term76976.getClass(), "hour", (byte) 6);
        setByteField(term76976, term76976.getClass(), "minute", (byte) 10);
        setByteField(term76976, term76976.getClass(), "second", (byte) 52);
        setIntField(term76976, term76976.getClass(), "nano", 872227966);
        setField(term76971, term76971.getClass(), "time", term76976);
        setField(term76945, term76945.getClass(), "accessTime", term76971);
        setField(term76943, term76943.getClass(), "card", term76945);
        setIntField(term76943, term76943.getClass(), "lastDataVersion", -705500663);
        setField(term76943, term76943.getClass(), "userName", "bhEFtkUvDw");
        setIntField(term76943, term76943.getClass(), "point", 1955702887);
        setIntField(term76943, term76943.getClass(), "totalPoint", -473885637);
        setIntField(term76943, term76943.getClass(), "iconId", 1889562581);
        setIntField(term76943, term76943.getClass(), "nameplateId", 812974265);
        setIntField(term76943, term76943.getClass(), "frameId", 1042200452);
        setIntField(term76943, term76943.getClass(), "trophyId", -1721345121);
        setIntField(term76943, term76943.getClass(), "playCount", -639524770);
        setIntField(term76943, term76943.getClass(), "playVsCount", -799953558);
        setIntField(term76943, term76943.getClass(), "playSyncCount", -500432727);
        setIntField(term76943, term76943.getClass(), "winCount", -2047392780);
        setIntField(term76943, term76943.getClass(), "helpCount", -1637799701);
        setIntField(term76943, term76943.getClass(), "comboCount", 1698600430);
        setIntField(term76943, term76943.getClass(), "feverCount", -1431010224);
        setIntField(term76943, term76943.getClass(), "totalHiScore", -1025991695);
        setIntField(term76943, term76943.getClass(), "totalEasyHighScore", -1660783456);
        setIntField(term76943, term76943.getClass(), "totalBasicHighScore", -1695731044);
        setIntField(term76943, term76943.getClass(), "totalAdvancedHighScore", -255451892);
        setIntField(term76943, term76943.getClass(), "totalExpertHighScore", -1224111256);
        setIntField(term76943, term76943.getClass(), "totalMasterHighScore", -1826524081);
        setIntField(term76943, term76943.getClass(), "totalReMasterHighScore", -676295156);
        setIntField(term76943, term76943.getClass(), "totalHighSync", -200393215);
        setIntField(term76943, term76943.getClass(), "totalEasySync", 2082267818);
        setIntField(term76943, term76943.getClass(), "totalBasicSync", 4015114);
        setIntField(term76943, term76943.getClass(), "totalAdvancedSync", 2035858719);
        setIntField(term76943, term76943.getClass(), "totalExpertSync", 231711893);
        setIntField(term76943, term76943.getClass(), "totalMasterSync", 946699304);
        setIntField(term76943, term76943.getClass(), "totalReMasterSync", -651225608);
        setIntField(term76943, term76943.getClass(), "playerRating", -838905023);
        setIntField(term76943, term76943.getClass(), "highestRating", 1997861223);
        setIntField(term76943, term76943.getClass(), "rankAuthTailId", -1861970851);
        setField(term76943, term76943.getClass(), "eventWatchedDate", "ZmbknwMIBa");
        setField(term76943, term76943.getClass(), "webLimitDate", "UiRmBTpDTp");
        setIntField(term76943, term76943.getClass(), "challengeTrackPhase", -1201375636);
        setIntField(term76943, term76943.getClass(), "firstPlayBits", 275797745);
        setField(term76943, term76943.getClass(), "lastPlayDate", "zQtuUgUIjK");
        setIntField(term76943, term76943.getClass(), "lastPlaceId", -289448833);
        setField(term76943, term76943.getClass(), "lastPlaceName", "VBeGRjPsPN");
        setIntField(term76943, term76943.getClass(), "lastRegionId", -877446165);
        setField(term76943, term76943.getClass(), "lastRegionName", "pZrAdSHQIs");
        setField(term76943, term76943.getClass(), "lastClientId", "XTOiucaEva");
        setField(term76943, term76943.getClass(), "lastCountryCode", "JMekRNxFMU");
        setIntField(term76943, term76943.getClass(), "eventPoint", -1334756045);
        setIntField(term76943, term76943.getClass(), "totalLv", -2138080639);
        setIntField(term76943, term76943.getClass(), "lastLoginBonusDay", 1515190471);
        setIntField(term76943, term76943.getClass(), "lastSurvivalBonusDay", -565295100);
        setIntField(term76943, term76943.getClass(), "loginBonusLv", -155271123);
        setField(term76941, term76941.getClass(), "user", term76943);
        setIntField(term76941, term76941.getClass(), "soudEffect", 1876008218);
        setIntField(term76941, term76941.getClass(), "mirrorMode", -1489159494);
        setIntField(term76941, term76941.getClass(), "guideSpeed", 2098095371);
        setIntField(term76941, term76941.getClass(), "bgInfo", -1167910114);
        setIntField(term76941, term76941.getClass(), "brightness", 887019523);
        setIntField(term76941, term76941.getClass(), "isStarRot", 1368241755);
        setIntField(term76941, term76941.getClass(), "breakSe", 638332794);
        setIntField(term76941, term76941.getClass(), "slideSe", 813998278);
        setIntField(term76941, term76941.getClass(), "hardJudge", 1609669666);
        setIntField(term76941, term76941.getClass(), "isTagJump", -762558361);
        setIntField(term76941, term76941.getClass(), "breakSeVol", 887781125);
        setIntField(term76941, term76941.getClass(), "slideSeVol", 156944686);
        setIntField(term76941, term76941.getClass(), "isUpperDisp", -271866942);
        setIntField(term76941, term76941.getClass(), "trackSkip", 385425101);
        setIntField(term76941, term76941.getClass(), "optionMode", -1505816576);
        setIntField(term76941, term76941.getClass(), "simpleOptionParam", -1877003964);
        setIntField(term76941, term76941.getClass(), "adjustTiming", 1700904086);
        setIntField(term76941, term76941.getClass(), "dispTiming", -362916771);
        setIntField(term76941, term76941.getClass(), "timingPos", 1886181117);
        setIntField(term76941, term76941.getClass(), "ansVol", -229212246);
        setIntField(term76941, term76941.getClass(), "noteVol", 1726721533);
        setIntField(term76941, term76941.getClass(), "dmgVol", -328854592);
        setIntField(term76941, term76941.getClass(), "appealFlame", 765971129);
        setIntField(term76941, term76941.getClass(), "isFeverDisp", -385727798);
        setIntField(term76941, term76941.getClass(), "dispJudge", -1441415289);
        setIntField(term76941, term76941.getClass(), "judgePos", 1081832872);
        setIntField(term76941, term76941.getClass(), "ratingGuard", 1527144504);
        setIntField(term76941, term76941.getClass(), "selectChara", -305521619);
        setIntField(term76941, term76941.getClass(), "sortType", 1558553527);
        setIntField(term76941, term76941.getClass(), "filterGenre", 1188990535);
        setIntField(term76941, term76941.getClass(), "filterLevel", 689009965);
        setIntField(term76941, term76941.getClass(), "filterRank", -2009346803);
        setIntField(term76941, term76941.getClass(), "filterVersion", -2051224822);
        setIntField(term76941, term76941.getClass(), "filterRec", -1813553660);
        setIntField(term76941, term76941.getClass(), "filterFullCombo", -445217633);
        setIntField(term76941, term76941.getClass(), "filterAllPerfect", 690419752);
        setIntField(term76941, term76941.getClass(), "filterDifficulty", 1627284280);
        setIntField(term76941, term76941.getClass(), "filterFullSync", 1035639148);
        setIntField(term76941, term76941.getClass(), "filterReMaster", 1771438538);
        setIntField(term76941, term76941.getClass(), "filterMaxFever", -1525502762);
        setIntField(term76941, term76941.getClass(), "finalSelectId", -1367374151);
        setIntField(term76941, term76941.getClass(), "finalSelectCategory", -445744026);
        term77159 = new Integer(-522060478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term77159;
        callMethod(klass, "setFilterFullSync", argTypes, term76941, args);
    }

};


