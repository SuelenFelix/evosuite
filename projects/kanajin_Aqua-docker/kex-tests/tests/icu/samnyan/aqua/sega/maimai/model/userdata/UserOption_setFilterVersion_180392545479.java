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

public class UserOption_setFilterVersion_180392545479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75391;
     Object term75609;

    public UserOption_setFilterVersion_180392545479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75397 = new Long(-4714000263923324167L);
        term75391 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term75393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term75395 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75426 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75391, term75391.getClass(), "id", 8453730687540121475L);
        setLongField(term75393, term75393.getClass(), "id", 8505184530074334434L);
        setLongField(term75395, term75395.getClass(), "id", -1610129689783641208L);
        setField(term75395, term75395.getClass(), "extId", term75397);
        setField(term75395, term75395.getClass(), "luid", "MZzoPKpFlh");
        setIntField(term75412, term75412.getClass(), "year", 2016);
        setShortField(term75412, term75412.getClass(), "month", (short) 5);
        setShortField(term75412, term75412.getClass(), "day", (short) 15);
        setField(term75411, term75411.getClass(), "date", term75412);
        setByteField(term75416, term75416.getClass(), "hour", (byte) 13);
        setByteField(term75416, term75416.getClass(), "minute", (byte) 7);
        setByteField(term75416, term75416.getClass(), "second", (byte) 29);
        setIntField(term75416, term75416.getClass(), "nano", 36973761);
        setField(term75411, term75411.getClass(), "time", term75416);
        setField(term75395, term75395.getClass(), "registerTime", term75411);
        setIntField(term75422, term75422.getClass(), "year", 2028);
        setShortField(term75422, term75422.getClass(), "month", (short) 11);
        setShortField(term75422, term75422.getClass(), "day", (short) 8);
        setField(term75421, term75421.getClass(), "date", term75422);
        setByteField(term75426, term75426.getClass(), "hour", (byte) 11);
        setByteField(term75426, term75426.getClass(), "minute", (byte) 41);
        setByteField(term75426, term75426.getClass(), "second", (byte) 26);
        setIntField(term75426, term75426.getClass(), "nano", 234822620);
        setField(term75421, term75421.getClass(), "time", term75426);
        setField(term75395, term75395.getClass(), "accessTime", term75421);
        setField(term75393, term75393.getClass(), "card", term75395);
        setIntField(term75393, term75393.getClass(), "lastDataVersion", -1865380686);
        setField(term75393, term75393.getClass(), "userName", "skVZETaBKX");
        setIntField(term75393, term75393.getClass(), "point", 894081623);
        setIntField(term75393, term75393.getClass(), "totalPoint", 1547448267);
        setIntField(term75393, term75393.getClass(), "iconId", -1620492868);
        setIntField(term75393, term75393.getClass(), "nameplateId", -1467327455);
        setIntField(term75393, term75393.getClass(), "frameId", 735265706);
        setIntField(term75393, term75393.getClass(), "trophyId", -1577402961);
        setIntField(term75393, term75393.getClass(), "playCount", 833268325);
        setIntField(term75393, term75393.getClass(), "playVsCount", 125421383);
        setIntField(term75393, term75393.getClass(), "playSyncCount", -858858442);
        setIntField(term75393, term75393.getClass(), "winCount", -773751127);
        setIntField(term75393, term75393.getClass(), "helpCount", -1557249454);
        setIntField(term75393, term75393.getClass(), "comboCount", 1328672666);
        setIntField(term75393, term75393.getClass(), "feverCount", -650874151);
        setIntField(term75393, term75393.getClass(), "totalHiScore", -1597812214);
        setIntField(term75393, term75393.getClass(), "totalEasyHighScore", -681358996);
        setIntField(term75393, term75393.getClass(), "totalBasicHighScore", -608099699);
        setIntField(term75393, term75393.getClass(), "totalAdvancedHighScore", -821064726);
        setIntField(term75393, term75393.getClass(), "totalExpertHighScore", 921170353);
        setIntField(term75393, term75393.getClass(), "totalMasterHighScore", 244054341);
        setIntField(term75393, term75393.getClass(), "totalReMasterHighScore", 983881216);
        setIntField(term75393, term75393.getClass(), "totalHighSync", 388159136);
        setIntField(term75393, term75393.getClass(), "totalEasySync", -1116011104);
        setIntField(term75393, term75393.getClass(), "totalBasicSync", 1309658897);
        setIntField(term75393, term75393.getClass(), "totalAdvancedSync", -342067208);
        setIntField(term75393, term75393.getClass(), "totalExpertSync", 389436595);
        setIntField(term75393, term75393.getClass(), "totalMasterSync", 614489290);
        setIntField(term75393, term75393.getClass(), "totalReMasterSync", 496383477);
        setIntField(term75393, term75393.getClass(), "playerRating", -928184942);
        setIntField(term75393, term75393.getClass(), "highestRating", 1982715971);
        setIntField(term75393, term75393.getClass(), "rankAuthTailId", 475160369);
        setField(term75393, term75393.getClass(), "eventWatchedDate", "jcJNIBACPb");
        setField(term75393, term75393.getClass(), "webLimitDate", "mPQmjoknqi");
        setIntField(term75393, term75393.getClass(), "challengeTrackPhase", -626323068);
        setIntField(term75393, term75393.getClass(), "firstPlayBits", -1588421324);
        setField(term75393, term75393.getClass(), "lastPlayDate", "gLgvePQRQT");
        setIntField(term75393, term75393.getClass(), "lastPlaceId", -1720779783);
        setField(term75393, term75393.getClass(), "lastPlaceName", "SCmsfHIEPK");
        setIntField(term75393, term75393.getClass(), "lastRegionId", 250416432);
        setField(term75393, term75393.getClass(), "lastRegionName", "dFOuezLNWb");
        setField(term75393, term75393.getClass(), "lastClientId", "PUWJnLuyiR");
        setField(term75393, term75393.getClass(), "lastCountryCode", "ADhJCRgHaS");
        setIntField(term75393, term75393.getClass(), "eventPoint", -2134709115);
        setIntField(term75393, term75393.getClass(), "totalLv", 989626374);
        setIntField(term75393, term75393.getClass(), "lastLoginBonusDay", 837548396);
        setIntField(term75393, term75393.getClass(), "lastSurvivalBonusDay", 1201217557);
        setIntField(term75393, term75393.getClass(), "loginBonusLv", -1534275590);
        setField(term75391, term75391.getClass(), "user", term75393);
        setIntField(term75391, term75391.getClass(), "soudEffect", -1983695200);
        setIntField(term75391, term75391.getClass(), "mirrorMode", -191168059);
        setIntField(term75391, term75391.getClass(), "guideSpeed", -1510989838);
        setIntField(term75391, term75391.getClass(), "bgInfo", 1406928477);
        setIntField(term75391, term75391.getClass(), "brightness", 118476036);
        setIntField(term75391, term75391.getClass(), "isStarRot", -1669858139);
        setIntField(term75391, term75391.getClass(), "breakSe", -1133804876);
        setIntField(term75391, term75391.getClass(), "slideSe", -548122836);
        setIntField(term75391, term75391.getClass(), "hardJudge", 1004952014);
        setIntField(term75391, term75391.getClass(), "isTagJump", 2108215621);
        setIntField(term75391, term75391.getClass(), "breakSeVol", -1245829004);
        setIntField(term75391, term75391.getClass(), "slideSeVol", 1554466472);
        setIntField(term75391, term75391.getClass(), "isUpperDisp", 16073898);
        setIntField(term75391, term75391.getClass(), "trackSkip", 272276958);
        setIntField(term75391, term75391.getClass(), "optionMode", 794347789);
        setIntField(term75391, term75391.getClass(), "simpleOptionParam", 131728856);
        setIntField(term75391, term75391.getClass(), "adjustTiming", 1924005893);
        setIntField(term75391, term75391.getClass(), "dispTiming", 1601208652);
        setIntField(term75391, term75391.getClass(), "timingPos", -2108741906);
        setIntField(term75391, term75391.getClass(), "ansVol", -336183596);
        setIntField(term75391, term75391.getClass(), "noteVol", -356308474);
        setIntField(term75391, term75391.getClass(), "dmgVol", -1895638291);
        setIntField(term75391, term75391.getClass(), "appealFlame", -253945040);
        setIntField(term75391, term75391.getClass(), "isFeverDisp", 1207589183);
        setIntField(term75391, term75391.getClass(), "dispJudge", 1974683839);
        setIntField(term75391, term75391.getClass(), "judgePos", 607659215);
        setIntField(term75391, term75391.getClass(), "ratingGuard", 1797770986);
        setIntField(term75391, term75391.getClass(), "selectChara", -1609542892);
        setIntField(term75391, term75391.getClass(), "sortType", -1580821089);
        setIntField(term75391, term75391.getClass(), "filterGenre", 1403964425);
        setIntField(term75391, term75391.getClass(), "filterLevel", 986232260);
        setIntField(term75391, term75391.getClass(), "filterRank", -45389402);
        setIntField(term75391, term75391.getClass(), "filterVersion", 1348045867);
        setIntField(term75391, term75391.getClass(), "filterRec", -1069438103);
        setIntField(term75391, term75391.getClass(), "filterFullCombo", -680190518);
        setIntField(term75391, term75391.getClass(), "filterAllPerfect", 1940442849);
        setIntField(term75391, term75391.getClass(), "filterDifficulty", 2041917421);
        setIntField(term75391, term75391.getClass(), "filterFullSync", 1105661007);
        setIntField(term75391, term75391.getClass(), "filterReMaster", 2028890242);
        setIntField(term75391, term75391.getClass(), "filterMaxFever", 252702421);
        setIntField(term75391, term75391.getClass(), "finalSelectId", -497992276);
        setIntField(term75391, term75391.getClass(), "finalSelectCategory", -16494120);
        term75609 = new Integer(143933759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75609;
        callMethod(klass, "setFilterVersion", argTypes, term75391, args);
    }

};


