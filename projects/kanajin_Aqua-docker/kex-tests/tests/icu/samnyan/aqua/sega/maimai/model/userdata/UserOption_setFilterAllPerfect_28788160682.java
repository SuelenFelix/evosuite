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

public class UserOption_setFilterAllPerfect_28788160682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76321;
     Object term76539;

    public UserOption_setFilterAllPerfect_28788160682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76327 = new Long(6248239231585852341L);
        term76321 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term76323 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term76325 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76346 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76356 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76321, term76321.getClass(), "id", 5638814204437933939L);
        setLongField(term76323, term76323.getClass(), "id", -5717327658642389548L);
        setLongField(term76325, term76325.getClass(), "id", 8495724482241106293L);
        setField(term76325, term76325.getClass(), "extId", term76327);
        setField(term76325, term76325.getClass(), "luid", "ixeIpUaVug");
        setIntField(term76342, term76342.getClass(), "year", 2020);
        setShortField(term76342, term76342.getClass(), "month", (short) 3);
        setShortField(term76342, term76342.getClass(), "day", (short) 11);
        setField(term76341, term76341.getClass(), "date", term76342);
        setByteField(term76346, term76346.getClass(), "hour", (byte) 3);
        setByteField(term76346, term76346.getClass(), "minute", (byte) 24);
        setByteField(term76346, term76346.getClass(), "second", (byte) 7);
        setIntField(term76346, term76346.getClass(), "nano", 685767594);
        setField(term76341, term76341.getClass(), "time", term76346);
        setField(term76325, term76325.getClass(), "registerTime", term76341);
        setIntField(term76352, term76352.getClass(), "year", 2014);
        setShortField(term76352, term76352.getClass(), "month", (short) 9);
        setShortField(term76352, term76352.getClass(), "day", (short) 30);
        setField(term76351, term76351.getClass(), "date", term76352);
        setByteField(term76356, term76356.getClass(), "hour", (byte) 6);
        setByteField(term76356, term76356.getClass(), "minute", (byte) 5);
        setByteField(term76356, term76356.getClass(), "second", (byte) 42);
        setIntField(term76356, term76356.getClass(), "nano", 798954614);
        setField(term76351, term76351.getClass(), "time", term76356);
        setField(term76325, term76325.getClass(), "accessTime", term76351);
        setField(term76323, term76323.getClass(), "card", term76325);
        setIntField(term76323, term76323.getClass(), "lastDataVersion", -665756018);
        setField(term76323, term76323.getClass(), "userName", "TELyWFMBJv");
        setIntField(term76323, term76323.getClass(), "point", -917715223);
        setIntField(term76323, term76323.getClass(), "totalPoint", -1308205647);
        setIntField(term76323, term76323.getClass(), "iconId", -293681660);
        setIntField(term76323, term76323.getClass(), "nameplateId", 2040935639);
        setIntField(term76323, term76323.getClass(), "frameId", 1434805834);
        setIntField(term76323, term76323.getClass(), "trophyId", 1559405645);
        setIntField(term76323, term76323.getClass(), "playCount", -2142714269);
        setIntField(term76323, term76323.getClass(), "playVsCount", -1679293747);
        setIntField(term76323, term76323.getClass(), "playSyncCount", -177429775);
        setIntField(term76323, term76323.getClass(), "winCount", 1499469166);
        setIntField(term76323, term76323.getClass(), "helpCount", 1077671885);
        setIntField(term76323, term76323.getClass(), "comboCount", -1257764971);
        setIntField(term76323, term76323.getClass(), "feverCount", 916858785);
        setIntField(term76323, term76323.getClass(), "totalHiScore", -334590639);
        setIntField(term76323, term76323.getClass(), "totalEasyHighScore", -1198749630);
        setIntField(term76323, term76323.getClass(), "totalBasicHighScore", 677610694);
        setIntField(term76323, term76323.getClass(), "totalAdvancedHighScore", 1557679938);
        setIntField(term76323, term76323.getClass(), "totalExpertHighScore", 855334801);
        setIntField(term76323, term76323.getClass(), "totalMasterHighScore", 1952602505);
        setIntField(term76323, term76323.getClass(), "totalReMasterHighScore", 2043628366);
        setIntField(term76323, term76323.getClass(), "totalHighSync", 408680952);
        setIntField(term76323, term76323.getClass(), "totalEasySync", -1373697880);
        setIntField(term76323, term76323.getClass(), "totalBasicSync", -1010160027);
        setIntField(term76323, term76323.getClass(), "totalAdvancedSync", 768914070);
        setIntField(term76323, term76323.getClass(), "totalExpertSync", -747888783);
        setIntField(term76323, term76323.getClass(), "totalMasterSync", -1751780426);
        setIntField(term76323, term76323.getClass(), "totalReMasterSync", 795866886);
        setIntField(term76323, term76323.getClass(), "playerRating", -2086380060);
        setIntField(term76323, term76323.getClass(), "highestRating", -1408519554);
        setIntField(term76323, term76323.getClass(), "rankAuthTailId", -110536575);
        setField(term76323, term76323.getClass(), "eventWatchedDate", "bIqbgRdzpB");
        setField(term76323, term76323.getClass(), "webLimitDate", "FIUbHJmAEj");
        setIntField(term76323, term76323.getClass(), "challengeTrackPhase", 1514991810);
        setIntField(term76323, term76323.getClass(), "firstPlayBits", 1319465985);
        setField(term76323, term76323.getClass(), "lastPlayDate", "mJrFDaDdyY");
        setIntField(term76323, term76323.getClass(), "lastPlaceId", 1160620517);
        setField(term76323, term76323.getClass(), "lastPlaceName", "HqyBQNuLnz");
        setIntField(term76323, term76323.getClass(), "lastRegionId", -1359383108);
        setField(term76323, term76323.getClass(), "lastRegionName", "xWkZKbrvmX");
        setField(term76323, term76323.getClass(), "lastClientId", "PTEWoxLNqQ");
        setField(term76323, term76323.getClass(), "lastCountryCode", "XiAUBffMZP");
        setIntField(term76323, term76323.getClass(), "eventPoint", -1158968060);
        setIntField(term76323, term76323.getClass(), "totalLv", 1523461403);
        setIntField(term76323, term76323.getClass(), "lastLoginBonusDay", -1777057164);
        setIntField(term76323, term76323.getClass(), "lastSurvivalBonusDay", -2007323764);
        setIntField(term76323, term76323.getClass(), "loginBonusLv", 965628804);
        setField(term76321, term76321.getClass(), "user", term76323);
        setIntField(term76321, term76321.getClass(), "soudEffect", 1381817068);
        setIntField(term76321, term76321.getClass(), "mirrorMode", -1332097447);
        setIntField(term76321, term76321.getClass(), "guideSpeed", 453720647);
        setIntField(term76321, term76321.getClass(), "bgInfo", 732312504);
        setIntField(term76321, term76321.getClass(), "brightness", -883503334);
        setIntField(term76321, term76321.getClass(), "isStarRot", -1620662863);
        setIntField(term76321, term76321.getClass(), "breakSe", -176182914);
        setIntField(term76321, term76321.getClass(), "slideSe", -623380087);
        setIntField(term76321, term76321.getClass(), "hardJudge", 1503970273);
        setIntField(term76321, term76321.getClass(), "isTagJump", 1362955358);
        setIntField(term76321, term76321.getClass(), "breakSeVol", -1235215555);
        setIntField(term76321, term76321.getClass(), "slideSeVol", 1033361738);
        setIntField(term76321, term76321.getClass(), "isUpperDisp", -2047169809);
        setIntField(term76321, term76321.getClass(), "trackSkip", 1874665757);
        setIntField(term76321, term76321.getClass(), "optionMode", 1160843153);
        setIntField(term76321, term76321.getClass(), "simpleOptionParam", 1818052325);
        setIntField(term76321, term76321.getClass(), "adjustTiming", -1003288946);
        setIntField(term76321, term76321.getClass(), "dispTiming", -1148180010);
        setIntField(term76321, term76321.getClass(), "timingPos", 751197258);
        setIntField(term76321, term76321.getClass(), "ansVol", -807367593);
        setIntField(term76321, term76321.getClass(), "noteVol", -1012649720);
        setIntField(term76321, term76321.getClass(), "dmgVol", 1728827702);
        setIntField(term76321, term76321.getClass(), "appealFlame", -125346559);
        setIntField(term76321, term76321.getClass(), "isFeverDisp", -705244323);
        setIntField(term76321, term76321.getClass(), "dispJudge", 729298502);
        setIntField(term76321, term76321.getClass(), "judgePos", 273885563);
        setIntField(term76321, term76321.getClass(), "ratingGuard", -797466788);
        setIntField(term76321, term76321.getClass(), "selectChara", -222783889);
        setIntField(term76321, term76321.getClass(), "sortType", 1517691834);
        setIntField(term76321, term76321.getClass(), "filterGenre", -1509652338);
        setIntField(term76321, term76321.getClass(), "filterLevel", 1164414864);
        setIntField(term76321, term76321.getClass(), "filterRank", -840323859);
        setIntField(term76321, term76321.getClass(), "filterVersion", -1892289922);
        setIntField(term76321, term76321.getClass(), "filterRec", 987795798);
        setIntField(term76321, term76321.getClass(), "filterFullCombo", -219879129);
        setIntField(term76321, term76321.getClass(), "filterAllPerfect", 676947608);
        setIntField(term76321, term76321.getClass(), "filterDifficulty", -777621571);
        setIntField(term76321, term76321.getClass(), "filterFullSync", -1228407222);
        setIntField(term76321, term76321.getClass(), "filterReMaster", -138743806);
        setIntField(term76321, term76321.getClass(), "filterMaxFever", 1701079619);
        setIntField(term76321, term76321.getClass(), "finalSelectId", -1822505135);
        setIntField(term76321, term76321.getClass(), "finalSelectCategory", 1664287048);
        term76539 = new Integer(877573537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term76539;
        callMethod(klass, "setFilterAllPerfect", argTypes, term76321, args);
    }

};


