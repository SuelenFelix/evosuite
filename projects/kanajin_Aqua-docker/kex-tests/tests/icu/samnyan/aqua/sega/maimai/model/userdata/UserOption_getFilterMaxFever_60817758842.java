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

public class UserOption_getFilterMaxFever_60817758842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63665;

    public UserOption_getFilterMaxFever_60817758842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63671 = new Long(2145420811068634601L);
        term63665 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term63667 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term63669 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63690 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63700 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63665, term63665.getClass(), "id", 3951346165629352117L);
        setLongField(term63667, term63667.getClass(), "id", -4187265590402169996L);
        setLongField(term63669, term63669.getClass(), "id", -8033044954947064558L);
        setField(term63669, term63669.getClass(), "extId", term63671);
        setField(term63669, term63669.getClass(), "luid", "cHRLXsgRzr");
        setIntField(term63686, term63686.getClass(), "year", 2019);
        setShortField(term63686, term63686.getClass(), "month", (short) 2);
        setShortField(term63686, term63686.getClass(), "day", (short) 19);
        setField(term63685, term63685.getClass(), "date", term63686);
        setByteField(term63690, term63690.getClass(), "hour", (byte) 9);
        setByteField(term63690, term63690.getClass(), "minute", (byte) 3);
        setByteField(term63690, term63690.getClass(), "second", (byte) 19);
        setIntField(term63690, term63690.getClass(), "nano", 646336873);
        setField(term63685, term63685.getClass(), "time", term63690);
        setField(term63669, term63669.getClass(), "registerTime", term63685);
        setIntField(term63696, term63696.getClass(), "year", 2017);
        setShortField(term63696, term63696.getClass(), "month", (short) 2);
        setShortField(term63696, term63696.getClass(), "day", (short) 10);
        setField(term63695, term63695.getClass(), "date", term63696);
        setByteField(term63700, term63700.getClass(), "hour", (byte) 13);
        setByteField(term63700, term63700.getClass(), "minute", (byte) 52);
        setByteField(term63700, term63700.getClass(), "second", (byte) 4);
        setIntField(term63700, term63700.getClass(), "nano", 660576536);
        setField(term63695, term63695.getClass(), "time", term63700);
        setField(term63669, term63669.getClass(), "accessTime", term63695);
        setField(term63667, term63667.getClass(), "card", term63669);
        setIntField(term63667, term63667.getClass(), "lastDataVersion", -924571065);
        setField(term63667, term63667.getClass(), "userName", "QpqQKmCtoC");
        setIntField(term63667, term63667.getClass(), "point", -358133258);
        setIntField(term63667, term63667.getClass(), "totalPoint", 994709385);
        setIntField(term63667, term63667.getClass(), "iconId", 1153732002);
        setIntField(term63667, term63667.getClass(), "nameplateId", 1936443833);
        setIntField(term63667, term63667.getClass(), "frameId", -531943903);
        setIntField(term63667, term63667.getClass(), "trophyId", 1225651816);
        setIntField(term63667, term63667.getClass(), "playCount", -1615061649);
        setIntField(term63667, term63667.getClass(), "playVsCount", -251883790);
        setIntField(term63667, term63667.getClass(), "playSyncCount", 1712922352);
        setIntField(term63667, term63667.getClass(), "winCount", -430074689);
        setIntField(term63667, term63667.getClass(), "helpCount", -163272182);
        setIntField(term63667, term63667.getClass(), "comboCount", -1054836913);
        setIntField(term63667, term63667.getClass(), "feverCount", -1229412292);
        setIntField(term63667, term63667.getClass(), "totalHiScore", -145290566);
        setIntField(term63667, term63667.getClass(), "totalEasyHighScore", -484230704);
        setIntField(term63667, term63667.getClass(), "totalBasicHighScore", -840960310);
        setIntField(term63667, term63667.getClass(), "totalAdvancedHighScore", 2113830045);
        setIntField(term63667, term63667.getClass(), "totalExpertHighScore", 957422050);
        setIntField(term63667, term63667.getClass(), "totalMasterHighScore", -443514250);
        setIntField(term63667, term63667.getClass(), "totalReMasterHighScore", 1623408712);
        setIntField(term63667, term63667.getClass(), "totalHighSync", -689716944);
        setIntField(term63667, term63667.getClass(), "totalEasySync", -76212338);
        setIntField(term63667, term63667.getClass(), "totalBasicSync", 1841912944);
        setIntField(term63667, term63667.getClass(), "totalAdvancedSync", 1546600239);
        setIntField(term63667, term63667.getClass(), "totalExpertSync", -1396225638);
        setIntField(term63667, term63667.getClass(), "totalMasterSync", -241102183);
        setIntField(term63667, term63667.getClass(), "totalReMasterSync", -1633122154);
        setIntField(term63667, term63667.getClass(), "playerRating", 1017124411);
        setIntField(term63667, term63667.getClass(), "highestRating", -1833430963);
        setIntField(term63667, term63667.getClass(), "rankAuthTailId", -1688592299);
        setField(term63667, term63667.getClass(), "eventWatchedDate", "AYRvbRJxWI");
        setField(term63667, term63667.getClass(), "webLimitDate", "MGNiaVqEDc");
        setIntField(term63667, term63667.getClass(), "challengeTrackPhase", 1835314181);
        setIntField(term63667, term63667.getClass(), "firstPlayBits", 990656402);
        setField(term63667, term63667.getClass(), "lastPlayDate", "qeVNCFrTbT");
        setIntField(term63667, term63667.getClass(), "lastPlaceId", -105353462);
        setField(term63667, term63667.getClass(), "lastPlaceName", "sreEtRBWQl");
        setIntField(term63667, term63667.getClass(), "lastRegionId", 1445070014);
        setField(term63667, term63667.getClass(), "lastRegionName", "UKQejaeJWY");
        setField(term63667, term63667.getClass(), "lastClientId", "lNbVasLAKL");
        setField(term63667, term63667.getClass(), "lastCountryCode", "wKeyHBCSLZ");
        setIntField(term63667, term63667.getClass(), "eventPoint", -2066241981);
        setIntField(term63667, term63667.getClass(), "totalLv", -891786731);
        setIntField(term63667, term63667.getClass(), "lastLoginBonusDay", -807543898);
        setIntField(term63667, term63667.getClass(), "lastSurvivalBonusDay", -1643992590);
        setIntField(term63667, term63667.getClass(), "loginBonusLv", 1617077670);
        setField(term63665, term63665.getClass(), "user", term63667);
        setIntField(term63665, term63665.getClass(), "soudEffect", 2071351288);
        setIntField(term63665, term63665.getClass(), "mirrorMode", 1713974544);
        setIntField(term63665, term63665.getClass(), "guideSpeed", 1347754720);
        setIntField(term63665, term63665.getClass(), "bgInfo", -1244357131);
        setIntField(term63665, term63665.getClass(), "brightness", -1253293420);
        setIntField(term63665, term63665.getClass(), "isStarRot", -1372607343);
        setIntField(term63665, term63665.getClass(), "breakSe", -1259276992);
        setIntField(term63665, term63665.getClass(), "slideSe", -1544616625);
        setIntField(term63665, term63665.getClass(), "hardJudge", -1541499013);
        setIntField(term63665, term63665.getClass(), "isTagJump", -1553107114);
        setIntField(term63665, term63665.getClass(), "breakSeVol", -1215527230);
        setIntField(term63665, term63665.getClass(), "slideSeVol", 2122251083);
        setIntField(term63665, term63665.getClass(), "isUpperDisp", 69182156);
        setIntField(term63665, term63665.getClass(), "trackSkip", -90311637);
        setIntField(term63665, term63665.getClass(), "optionMode", -1830483575);
        setIntField(term63665, term63665.getClass(), "simpleOptionParam", 666844768);
        setIntField(term63665, term63665.getClass(), "adjustTiming", 592251593);
        setIntField(term63665, term63665.getClass(), "dispTiming", -201367159);
        setIntField(term63665, term63665.getClass(), "timingPos", 1825158106);
        setIntField(term63665, term63665.getClass(), "ansVol", 52007815);
        setIntField(term63665, term63665.getClass(), "noteVol", -1005174618);
        setIntField(term63665, term63665.getClass(), "dmgVol", -1473069102);
        setIntField(term63665, term63665.getClass(), "appealFlame", 748392208);
        setIntField(term63665, term63665.getClass(), "isFeverDisp", -442203106);
        setIntField(term63665, term63665.getClass(), "dispJudge", 1102131875);
        setIntField(term63665, term63665.getClass(), "judgePos", 448371674);
        setIntField(term63665, term63665.getClass(), "ratingGuard", -2004923949);
        setIntField(term63665, term63665.getClass(), "selectChara", 1462015503);
        setIntField(term63665, term63665.getClass(), "sortType", 1329564508);
        setIntField(term63665, term63665.getClass(), "filterGenre", 1294433705);
        setIntField(term63665, term63665.getClass(), "filterLevel", -1348634231);
        setIntField(term63665, term63665.getClass(), "filterRank", -1188666831);
        setIntField(term63665, term63665.getClass(), "filterVersion", 1782059615);
        setIntField(term63665, term63665.getClass(), "filterRec", 53804926);
        setIntField(term63665, term63665.getClass(), "filterFullCombo", -1667170549);
        setIntField(term63665, term63665.getClass(), "filterAllPerfect", -482792210);
        setIntField(term63665, term63665.getClass(), "filterDifficulty", -206765569);
        setIntField(term63665, term63665.getClass(), "filterFullSync", -1371614953);
        setIntField(term63665, term63665.getClass(), "filterReMaster", 1919582876);
        setIntField(term63665, term63665.getClass(), "filterMaxFever", -1180179163);
        setIntField(term63665, term63665.getClass(), "finalSelectId", 1145136743);
        setIntField(term63665, term63665.getClass(), "finalSelectCategory", 1587227439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterMaxFever", argTypes, term63665, args);
    }

};


