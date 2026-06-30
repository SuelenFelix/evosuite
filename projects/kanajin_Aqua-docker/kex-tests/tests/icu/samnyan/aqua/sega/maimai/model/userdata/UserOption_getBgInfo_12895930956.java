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

public class UserOption_getBgInfo_12895930956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52577;

    public UserOption_getBgInfo_12895930956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52583 = new Long(5465527210299101732L);
        term52577 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term52579 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term52581 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52602 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52612 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52577, term52577.getClass(), "id", -3565554762799701668L);
        setLongField(term52579, term52579.getClass(), "id", -6837989212848250735L);
        setLongField(term52581, term52581.getClass(), "id", -4231979631084175364L);
        setField(term52581, term52581.getClass(), "extId", term52583);
        setField(term52581, term52581.getClass(), "luid", "SEldZGJyvX");
        setIntField(term52598, term52598.getClass(), "year", 2017);
        setShortField(term52598, term52598.getClass(), "month", (short) 11);
        setShortField(term52598, term52598.getClass(), "day", (short) 19);
        setField(term52597, term52597.getClass(), "date", term52598);
        setByteField(term52602, term52602.getClass(), "hour", (byte) 2);
        setByteField(term52602, term52602.getClass(), "minute", (byte) 52);
        setByteField(term52602, term52602.getClass(), "second", (byte) 15);
        setIntField(term52602, term52602.getClass(), "nano", 625778933);
        setField(term52597, term52597.getClass(), "time", term52602);
        setField(term52581, term52581.getClass(), "registerTime", term52597);
        setIntField(term52608, term52608.getClass(), "year", 2015);
        setShortField(term52608, term52608.getClass(), "month", (short) 10);
        setShortField(term52608, term52608.getClass(), "day", (short) 3);
        setField(term52607, term52607.getClass(), "date", term52608);
        setByteField(term52612, term52612.getClass(), "hour", (byte) 10);
        setByteField(term52612, term52612.getClass(), "minute", (byte) 45);
        setByteField(term52612, term52612.getClass(), "second", (byte) 18);
        setIntField(term52612, term52612.getClass(), "nano", 333457081);
        setField(term52607, term52607.getClass(), "time", term52612);
        setField(term52581, term52581.getClass(), "accessTime", term52607);
        setField(term52579, term52579.getClass(), "card", term52581);
        setIntField(term52579, term52579.getClass(), "lastDataVersion", 1898123858);
        setField(term52579, term52579.getClass(), "userName", "vyvpqcHTQN");
        setIntField(term52579, term52579.getClass(), "point", 161447730);
        setIntField(term52579, term52579.getClass(), "totalPoint", -1595547996);
        setIntField(term52579, term52579.getClass(), "iconId", -997740019);
        setIntField(term52579, term52579.getClass(), "nameplateId", -257284782);
        setIntField(term52579, term52579.getClass(), "frameId", -1864133072);
        setIntField(term52579, term52579.getClass(), "trophyId", 1425952082);
        setIntField(term52579, term52579.getClass(), "playCount", 23263320);
        setIntField(term52579, term52579.getClass(), "playVsCount", -920008974);
        setIntField(term52579, term52579.getClass(), "playSyncCount", 988815004);
        setIntField(term52579, term52579.getClass(), "winCount", 2114316862);
        setIntField(term52579, term52579.getClass(), "helpCount", 2030575861);
        setIntField(term52579, term52579.getClass(), "comboCount", -320011647);
        setIntField(term52579, term52579.getClass(), "feverCount", 1489536288);
        setIntField(term52579, term52579.getClass(), "totalHiScore", -1536885597);
        setIntField(term52579, term52579.getClass(), "totalEasyHighScore", -1906904065);
        setIntField(term52579, term52579.getClass(), "totalBasicHighScore", -1325607039);
        setIntField(term52579, term52579.getClass(), "totalAdvancedHighScore", 43806434);
        setIntField(term52579, term52579.getClass(), "totalExpertHighScore", 1869537390);
        setIntField(term52579, term52579.getClass(), "totalMasterHighScore", -912321180);
        setIntField(term52579, term52579.getClass(), "totalReMasterHighScore", 332710777);
        setIntField(term52579, term52579.getClass(), "totalHighSync", 1307238592);
        setIntField(term52579, term52579.getClass(), "totalEasySync", 1917900339);
        setIntField(term52579, term52579.getClass(), "totalBasicSync", -166475832);
        setIntField(term52579, term52579.getClass(), "totalAdvancedSync", -1426746104);
        setIntField(term52579, term52579.getClass(), "totalExpertSync", 1293555421);
        setIntField(term52579, term52579.getClass(), "totalMasterSync", -1861656988);
        setIntField(term52579, term52579.getClass(), "totalReMasterSync", -2030143064);
        setIntField(term52579, term52579.getClass(), "playerRating", 2036980797);
        setIntField(term52579, term52579.getClass(), "highestRating", -935931812);
        setIntField(term52579, term52579.getClass(), "rankAuthTailId", 1486721984);
        setField(term52579, term52579.getClass(), "eventWatchedDate", "QQcpNMSHvA");
        setField(term52579, term52579.getClass(), "webLimitDate", "FLLklaMZvg");
        setIntField(term52579, term52579.getClass(), "challengeTrackPhase", 279609538);
        setIntField(term52579, term52579.getClass(), "firstPlayBits", -1364161498);
        setField(term52579, term52579.getClass(), "lastPlayDate", "jRDZpkFkoD");
        setIntField(term52579, term52579.getClass(), "lastPlaceId", -1602874517);
        setField(term52579, term52579.getClass(), "lastPlaceName", "wwSknqIBIO");
        setIntField(term52579, term52579.getClass(), "lastRegionId", 522533128);
        setField(term52579, term52579.getClass(), "lastRegionName", "zQPAxUFaeX");
        setField(term52579, term52579.getClass(), "lastClientId", "cKNHUkrYfK");
        setField(term52579, term52579.getClass(), "lastCountryCode", "crMeWqJOCQ");
        setIntField(term52579, term52579.getClass(), "eventPoint", 2076616628);
        setIntField(term52579, term52579.getClass(), "totalLv", -138960474);
        setIntField(term52579, term52579.getClass(), "lastLoginBonusDay", 541109635);
        setIntField(term52579, term52579.getClass(), "lastSurvivalBonusDay", -1533186568);
        setIntField(term52579, term52579.getClass(), "loginBonusLv", 916419043);
        setField(term52577, term52577.getClass(), "user", term52579);
        setIntField(term52577, term52577.getClass(), "soudEffect", 467264395);
        setIntField(term52577, term52577.getClass(), "mirrorMode", 943715309);
        setIntField(term52577, term52577.getClass(), "guideSpeed", 2013085557);
        setIntField(term52577, term52577.getClass(), "bgInfo", -1067501154);
        setIntField(term52577, term52577.getClass(), "brightness", -479195168);
        setIntField(term52577, term52577.getClass(), "isStarRot", -1151891321);
        setIntField(term52577, term52577.getClass(), "breakSe", 1141278466);
        setIntField(term52577, term52577.getClass(), "slideSe", -1649439614);
        setIntField(term52577, term52577.getClass(), "hardJudge", 498535038);
        setIntField(term52577, term52577.getClass(), "isTagJump", -135256376);
        setIntField(term52577, term52577.getClass(), "breakSeVol", -1073689224);
        setIntField(term52577, term52577.getClass(), "slideSeVol", -706123233);
        setIntField(term52577, term52577.getClass(), "isUpperDisp", 1037164777);
        setIntField(term52577, term52577.getClass(), "trackSkip", -1061962496);
        setIntField(term52577, term52577.getClass(), "optionMode", -1456265994);
        setIntField(term52577, term52577.getClass(), "simpleOptionParam", 716720347);
        setIntField(term52577, term52577.getClass(), "adjustTiming", -1144539304);
        setIntField(term52577, term52577.getClass(), "dispTiming", -1038395932);
        setIntField(term52577, term52577.getClass(), "timingPos", 1842163221);
        setIntField(term52577, term52577.getClass(), "ansVol", 468583702);
        setIntField(term52577, term52577.getClass(), "noteVol", -875891947);
        setIntField(term52577, term52577.getClass(), "dmgVol", 1496553034);
        setIntField(term52577, term52577.getClass(), "appealFlame", 272546912);
        setIntField(term52577, term52577.getClass(), "isFeverDisp", -1534845297);
        setIntField(term52577, term52577.getClass(), "dispJudge", 1159214599);
        setIntField(term52577, term52577.getClass(), "judgePos", 2063913776);
        setIntField(term52577, term52577.getClass(), "ratingGuard", -167719421);
        setIntField(term52577, term52577.getClass(), "selectChara", 1185474565);
        setIntField(term52577, term52577.getClass(), "sortType", -1081016436);
        setIntField(term52577, term52577.getClass(), "filterGenre", 1465385986);
        setIntField(term52577, term52577.getClass(), "filterLevel", 1976158913);
        setIntField(term52577, term52577.getClass(), "filterRank", 696093985);
        setIntField(term52577, term52577.getClass(), "filterVersion", 488572556);
        setIntField(term52577, term52577.getClass(), "filterRec", 2103579931);
        setIntField(term52577, term52577.getClass(), "filterFullCombo", -363708885);
        setIntField(term52577, term52577.getClass(), "filterAllPerfect", -1777069422);
        setIntField(term52577, term52577.getClass(), "filterDifficulty", 1328193739);
        setIntField(term52577, term52577.getClass(), "filterFullSync", 1769168524);
        setIntField(term52577, term52577.getClass(), "filterReMaster", 527335694);
        setIntField(term52577, term52577.getClass(), "filterMaxFever", 1217049721);
        setIntField(term52577, term52577.getClass(), "finalSelectId", 843041661);
        setIntField(term52577, term52577.getClass(), "finalSelectCategory", -1872674019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBgInfo", argTypes, term52577, args);
    }

};


