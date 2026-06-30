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

public class UserOption_getAdjustTiming_160124488319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56581;

    public UserOption_getAdjustTiming_160124488319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56587 = new Long(-1505191021111100819L);
        term56581 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term56583 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term56585 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56616 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56581, term56581.getClass(), "id", -4905558793519537969L);
        setLongField(term56583, term56583.getClass(), "id", 4354242424632479389L);
        setLongField(term56585, term56585.getClass(), "id", -4146453776626172590L);
        setField(term56585, term56585.getClass(), "extId", term56587);
        setField(term56585, term56585.getClass(), "luid", "xdYuLllgpn");
        setIntField(term56602, term56602.getClass(), "year", 2013);
        setShortField(term56602, term56602.getClass(), "month", (short) 7);
        setShortField(term56602, term56602.getClass(), "day", (short) 2);
        setField(term56601, term56601.getClass(), "date", term56602);
        setByteField(term56606, term56606.getClass(), "hour", (byte) 12);
        setByteField(term56606, term56606.getClass(), "minute", (byte) 16);
        setByteField(term56606, term56606.getClass(), "second", (byte) 13);
        setIntField(term56606, term56606.getClass(), "nano", 479538808);
        setField(term56601, term56601.getClass(), "time", term56606);
        setField(term56585, term56585.getClass(), "registerTime", term56601);
        setIntField(term56612, term56612.getClass(), "year", 2012);
        setShortField(term56612, term56612.getClass(), "month", (short) 10);
        setShortField(term56612, term56612.getClass(), "day", (short) 26);
        setField(term56611, term56611.getClass(), "date", term56612);
        setByteField(term56616, term56616.getClass(), "hour", (byte) 13);
        setByteField(term56616, term56616.getClass(), "minute", (byte) 50);
        setByteField(term56616, term56616.getClass(), "second", (byte) 34);
        setIntField(term56616, term56616.getClass(), "nano", 738625041);
        setField(term56611, term56611.getClass(), "time", term56616);
        setField(term56585, term56585.getClass(), "accessTime", term56611);
        setField(term56583, term56583.getClass(), "card", term56585);
        setIntField(term56583, term56583.getClass(), "lastDataVersion", 395080281);
        setField(term56583, term56583.getClass(), "userName", "ayonlqalLA");
        setIntField(term56583, term56583.getClass(), "point", -135265001);
        setIntField(term56583, term56583.getClass(), "totalPoint", -1280813670);
        setIntField(term56583, term56583.getClass(), "iconId", 1056389612);
        setIntField(term56583, term56583.getClass(), "nameplateId", 1126163407);
        setIntField(term56583, term56583.getClass(), "frameId", -851263541);
        setIntField(term56583, term56583.getClass(), "trophyId", 1001758052);
        setIntField(term56583, term56583.getClass(), "playCount", -1481470185);
        setIntField(term56583, term56583.getClass(), "playVsCount", -1112833662);
        setIntField(term56583, term56583.getClass(), "playSyncCount", -944322051);
        setIntField(term56583, term56583.getClass(), "winCount", 986554477);
        setIntField(term56583, term56583.getClass(), "helpCount", 1420310686);
        setIntField(term56583, term56583.getClass(), "comboCount", -1255448879);
        setIntField(term56583, term56583.getClass(), "feverCount", -332881327);
        setIntField(term56583, term56583.getClass(), "totalHiScore", -314472912);
        setIntField(term56583, term56583.getClass(), "totalEasyHighScore", -2084560012);
        setIntField(term56583, term56583.getClass(), "totalBasicHighScore", 910881174);
        setIntField(term56583, term56583.getClass(), "totalAdvancedHighScore", -1917095576);
        setIntField(term56583, term56583.getClass(), "totalExpertHighScore", 1449306932);
        setIntField(term56583, term56583.getClass(), "totalMasterHighScore", 56212143);
        setIntField(term56583, term56583.getClass(), "totalReMasterHighScore", 618002074);
        setIntField(term56583, term56583.getClass(), "totalHighSync", -1239775423);
        setIntField(term56583, term56583.getClass(), "totalEasySync", -885203807);
        setIntField(term56583, term56583.getClass(), "totalBasicSync", -644989552);
        setIntField(term56583, term56583.getClass(), "totalAdvancedSync", -806442678);
        setIntField(term56583, term56583.getClass(), "totalExpertSync", 1753926364);
        setIntField(term56583, term56583.getClass(), "totalMasterSync", 1317026070);
        setIntField(term56583, term56583.getClass(), "totalReMasterSync", -1573654080);
        setIntField(term56583, term56583.getClass(), "playerRating", 658719402);
        setIntField(term56583, term56583.getClass(), "highestRating", -89063392);
        setIntField(term56583, term56583.getClass(), "rankAuthTailId", -1511535943);
        setField(term56583, term56583.getClass(), "eventWatchedDate", "fzzIOVxKdF");
        setField(term56583, term56583.getClass(), "webLimitDate", "cdvmxZaBEK");
        setIntField(term56583, term56583.getClass(), "challengeTrackPhase", 1013691868);
        setIntField(term56583, term56583.getClass(), "firstPlayBits", 1537733513);
        setField(term56583, term56583.getClass(), "lastPlayDate", "QHYZiyDyPC");
        setIntField(term56583, term56583.getClass(), "lastPlaceId", -1931737090);
        setField(term56583, term56583.getClass(), "lastPlaceName", "kcHMyiheuH");
        setIntField(term56583, term56583.getClass(), "lastRegionId", -1599656306);
        setField(term56583, term56583.getClass(), "lastRegionName", "DGMBBNDEYs");
        setField(term56583, term56583.getClass(), "lastClientId", "vpuKZSMmKQ");
        setField(term56583, term56583.getClass(), "lastCountryCode", "IXQQwaXITf");
        setIntField(term56583, term56583.getClass(), "eventPoint", 1695987763);
        setIntField(term56583, term56583.getClass(), "totalLv", -635843083);
        setIntField(term56583, term56583.getClass(), "lastLoginBonusDay", 1458601685);
        setIntField(term56583, term56583.getClass(), "lastSurvivalBonusDay", 1144708364);
        setIntField(term56583, term56583.getClass(), "loginBonusLv", 757749198);
        setField(term56581, term56581.getClass(), "user", term56583);
        setIntField(term56581, term56581.getClass(), "soudEffect", 394416625);
        setIntField(term56581, term56581.getClass(), "mirrorMode", -385524457);
        setIntField(term56581, term56581.getClass(), "guideSpeed", 1453058029);
        setIntField(term56581, term56581.getClass(), "bgInfo", 632579504);
        setIntField(term56581, term56581.getClass(), "brightness", -2066050715);
        setIntField(term56581, term56581.getClass(), "isStarRot", 1838644781);
        setIntField(term56581, term56581.getClass(), "breakSe", -342802107);
        setIntField(term56581, term56581.getClass(), "slideSe", 1875014750);
        setIntField(term56581, term56581.getClass(), "hardJudge", 1774722901);
        setIntField(term56581, term56581.getClass(), "isTagJump", 1496592792);
        setIntField(term56581, term56581.getClass(), "breakSeVol", 1944444886);
        setIntField(term56581, term56581.getClass(), "slideSeVol", 813872033);
        setIntField(term56581, term56581.getClass(), "isUpperDisp", -289587627);
        setIntField(term56581, term56581.getClass(), "trackSkip", 249117272);
        setIntField(term56581, term56581.getClass(), "optionMode", 569136290);
        setIntField(term56581, term56581.getClass(), "simpleOptionParam", -769809783);
        setIntField(term56581, term56581.getClass(), "adjustTiming", -1572273604);
        setIntField(term56581, term56581.getClass(), "dispTiming", -884285296);
        setIntField(term56581, term56581.getClass(), "timingPos", -332552768);
        setIntField(term56581, term56581.getClass(), "ansVol", -734809675);
        setIntField(term56581, term56581.getClass(), "noteVol", -2032445161);
        setIntField(term56581, term56581.getClass(), "dmgVol", 2055666026);
        setIntField(term56581, term56581.getClass(), "appealFlame", -961904013);
        setIntField(term56581, term56581.getClass(), "isFeverDisp", 467298258);
        setIntField(term56581, term56581.getClass(), "dispJudge", -1307824288);
        setIntField(term56581, term56581.getClass(), "judgePos", -343537352);
        setIntField(term56581, term56581.getClass(), "ratingGuard", -504159112);
        setIntField(term56581, term56581.getClass(), "selectChara", -693581216);
        setIntField(term56581, term56581.getClass(), "sortType", -1414257808);
        setIntField(term56581, term56581.getClass(), "filterGenre", -2048269349);
        setIntField(term56581, term56581.getClass(), "filterLevel", 2127262366);
        setIntField(term56581, term56581.getClass(), "filterRank", 1192955580);
        setIntField(term56581, term56581.getClass(), "filterVersion", -1390904271);
        setIntField(term56581, term56581.getClass(), "filterRec", 894136168);
        setIntField(term56581, term56581.getClass(), "filterFullCombo", -1571407716);
        setIntField(term56581, term56581.getClass(), "filterAllPerfect", -1634609318);
        setIntField(term56581, term56581.getClass(), "filterDifficulty", 911431447);
        setIntField(term56581, term56581.getClass(), "filterFullSync", -1798345464);
        setIntField(term56581, term56581.getClass(), "filterReMaster", 991660062);
        setIntField(term56581, term56581.getClass(), "filterMaxFever", 1387364689);
        setIntField(term56581, term56581.getClass(), "finalSelectId", -180600496);
        setIntField(term56581, term56581.getClass(), "finalSelectCategory", -1916507105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAdjustTiming", argTypes, term56581, args);
    }

};


