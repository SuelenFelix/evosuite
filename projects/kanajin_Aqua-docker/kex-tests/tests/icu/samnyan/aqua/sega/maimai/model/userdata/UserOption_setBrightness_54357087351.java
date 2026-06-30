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

public class UserOption_setBrightness_54357087351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66711;
     Object term66929;

    public UserOption_setBrightness_54357087351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66717 = new Long(3238645206498300107L);
        term66711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term66713 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term66715 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66746 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66711, term66711.getClass(), "id", -7514437039500876647L);
        setLongField(term66713, term66713.getClass(), "id", 204473662283899955L);
        setLongField(term66715, term66715.getClass(), "id", -4029227951294167228L);
        setField(term66715, term66715.getClass(), "extId", term66717);
        setField(term66715, term66715.getClass(), "luid", "pmpprxfFwy");
        setIntField(term66732, term66732.getClass(), "year", 2014);
        setShortField(term66732, term66732.getClass(), "month", (short) 5);
        setShortField(term66732, term66732.getClass(), "day", (short) 5);
        setField(term66731, term66731.getClass(), "date", term66732);
        setByteField(term66736, term66736.getClass(), "hour", (byte) 17);
        setByteField(term66736, term66736.getClass(), "minute", (byte) 28);
        setByteField(term66736, term66736.getClass(), "second", (byte) 52);
        setIntField(term66736, term66736.getClass(), "nano", 741253436);
        setField(term66731, term66731.getClass(), "time", term66736);
        setField(term66715, term66715.getClass(), "registerTime", term66731);
        setIntField(term66742, term66742.getClass(), "year", 2015);
        setShortField(term66742, term66742.getClass(), "month", (short) 3);
        setShortField(term66742, term66742.getClass(), "day", (short) 23);
        setField(term66741, term66741.getClass(), "date", term66742);
        setByteField(term66746, term66746.getClass(), "hour", (byte) 7);
        setByteField(term66746, term66746.getClass(), "minute", (byte) 27);
        setByteField(term66746, term66746.getClass(), "second", (byte) 38);
        setIntField(term66746, term66746.getClass(), "nano", 467385263);
        setField(term66741, term66741.getClass(), "time", term66746);
        setField(term66715, term66715.getClass(), "accessTime", term66741);
        setField(term66713, term66713.getClass(), "card", term66715);
        setIntField(term66713, term66713.getClass(), "lastDataVersion", -1083218160);
        setField(term66713, term66713.getClass(), "userName", "AQbnQoJwOO");
        setIntField(term66713, term66713.getClass(), "point", -524261809);
        setIntField(term66713, term66713.getClass(), "totalPoint", 947308944);
        setIntField(term66713, term66713.getClass(), "iconId", 82825939);
        setIntField(term66713, term66713.getClass(), "nameplateId", 695200763);
        setIntField(term66713, term66713.getClass(), "frameId", -2118312702);
        setIntField(term66713, term66713.getClass(), "trophyId", -15464500);
        setIntField(term66713, term66713.getClass(), "playCount", -1951940945);
        setIntField(term66713, term66713.getClass(), "playVsCount", 1618129338);
        setIntField(term66713, term66713.getClass(), "playSyncCount", -421041491);
        setIntField(term66713, term66713.getClass(), "winCount", 1531630551);
        setIntField(term66713, term66713.getClass(), "helpCount", -1293247427);
        setIntField(term66713, term66713.getClass(), "comboCount", -2110112489);
        setIntField(term66713, term66713.getClass(), "feverCount", 911599446);
        setIntField(term66713, term66713.getClass(), "totalHiScore", -307818529);
        setIntField(term66713, term66713.getClass(), "totalEasyHighScore", 700090526);
        setIntField(term66713, term66713.getClass(), "totalBasicHighScore", 8095828);
        setIntField(term66713, term66713.getClass(), "totalAdvancedHighScore", 491999819);
        setIntField(term66713, term66713.getClass(), "totalExpertHighScore", 594900088);
        setIntField(term66713, term66713.getClass(), "totalMasterHighScore", 1012824901);
        setIntField(term66713, term66713.getClass(), "totalReMasterHighScore", 953916253);
        setIntField(term66713, term66713.getClass(), "totalHighSync", -972613566);
        setIntField(term66713, term66713.getClass(), "totalEasySync", 423167476);
        setIntField(term66713, term66713.getClass(), "totalBasicSync", -918637899);
        setIntField(term66713, term66713.getClass(), "totalAdvancedSync", -47058112);
        setIntField(term66713, term66713.getClass(), "totalExpertSync", 2073925569);
        setIntField(term66713, term66713.getClass(), "totalMasterSync", 1903299320);
        setIntField(term66713, term66713.getClass(), "totalReMasterSync", 496281999);
        setIntField(term66713, term66713.getClass(), "playerRating", -129667876);
        setIntField(term66713, term66713.getClass(), "highestRating", -1081751617);
        setIntField(term66713, term66713.getClass(), "rankAuthTailId", -1698342837);
        setField(term66713, term66713.getClass(), "eventWatchedDate", "NnicBPzNzw");
        setField(term66713, term66713.getClass(), "webLimitDate", "WADNPbexnT");
        setIntField(term66713, term66713.getClass(), "challengeTrackPhase", -508110901);
        setIntField(term66713, term66713.getClass(), "firstPlayBits", 2086708952);
        setField(term66713, term66713.getClass(), "lastPlayDate", "rMbsSfMKvX");
        setIntField(term66713, term66713.getClass(), "lastPlaceId", 1938826379);
        setField(term66713, term66713.getClass(), "lastPlaceName", "oCsqRJXMBc");
        setIntField(term66713, term66713.getClass(), "lastRegionId", -1574173199);
        setField(term66713, term66713.getClass(), "lastRegionName", "npPxKNoqdS");
        setField(term66713, term66713.getClass(), "lastClientId", "tGgCtmAQPu");
        setField(term66713, term66713.getClass(), "lastCountryCode", "HokisXXNMR");
        setIntField(term66713, term66713.getClass(), "eventPoint", -1165441979);
        setIntField(term66713, term66713.getClass(), "totalLv", -1921642793);
        setIntField(term66713, term66713.getClass(), "lastLoginBonusDay", -753596691);
        setIntField(term66713, term66713.getClass(), "lastSurvivalBonusDay", 1203822968);
        setIntField(term66713, term66713.getClass(), "loginBonusLv", -149149061);
        setField(term66711, term66711.getClass(), "user", term66713);
        setIntField(term66711, term66711.getClass(), "soudEffect", 1599802857);
        setIntField(term66711, term66711.getClass(), "mirrorMode", -284767862);
        setIntField(term66711, term66711.getClass(), "guideSpeed", 1346515345);
        setIntField(term66711, term66711.getClass(), "bgInfo", 2132293781);
        setIntField(term66711, term66711.getClass(), "brightness", 1025837124);
        setIntField(term66711, term66711.getClass(), "isStarRot", -1875484532);
        setIntField(term66711, term66711.getClass(), "breakSe", 2142478049);
        setIntField(term66711, term66711.getClass(), "slideSe", 2085104036);
        setIntField(term66711, term66711.getClass(), "hardJudge", 136979507);
        setIntField(term66711, term66711.getClass(), "isTagJump", -27834494);
        setIntField(term66711, term66711.getClass(), "breakSeVol", -470460903);
        setIntField(term66711, term66711.getClass(), "slideSeVol", -1476214738);
        setIntField(term66711, term66711.getClass(), "isUpperDisp", -1898771379);
        setIntField(term66711, term66711.getClass(), "trackSkip", -1950750332);
        setIntField(term66711, term66711.getClass(), "optionMode", 98744131);
        setIntField(term66711, term66711.getClass(), "simpleOptionParam", 1076913386);
        setIntField(term66711, term66711.getClass(), "adjustTiming", -1266016022);
        setIntField(term66711, term66711.getClass(), "dispTiming", -1417549926);
        setIntField(term66711, term66711.getClass(), "timingPos", -1109645729);
        setIntField(term66711, term66711.getClass(), "ansVol", -137499193);
        setIntField(term66711, term66711.getClass(), "noteVol", 1206373587);
        setIntField(term66711, term66711.getClass(), "dmgVol", 613409117);
        setIntField(term66711, term66711.getClass(), "appealFlame", 449106222);
        setIntField(term66711, term66711.getClass(), "isFeverDisp", -2010754765);
        setIntField(term66711, term66711.getClass(), "dispJudge", -368905928);
        setIntField(term66711, term66711.getClass(), "judgePos", -324230177);
        setIntField(term66711, term66711.getClass(), "ratingGuard", 1907785292);
        setIntField(term66711, term66711.getClass(), "selectChara", 719178137);
        setIntField(term66711, term66711.getClass(), "sortType", 1019714790);
        setIntField(term66711, term66711.getClass(), "filterGenre", -939662649);
        setIntField(term66711, term66711.getClass(), "filterLevel", 104511876);
        setIntField(term66711, term66711.getClass(), "filterRank", 1301097770);
        setIntField(term66711, term66711.getClass(), "filterVersion", -844791112);
        setIntField(term66711, term66711.getClass(), "filterRec", -1096097856);
        setIntField(term66711, term66711.getClass(), "filterFullCombo", 402256223);
        setIntField(term66711, term66711.getClass(), "filterAllPerfect", 1448377823);
        setIntField(term66711, term66711.getClass(), "filterDifficulty", -1324686514);
        setIntField(term66711, term66711.getClass(), "filterFullSync", 1209639956);
        setIntField(term66711, term66711.getClass(), "filterReMaster", -1463395842);
        setIntField(term66711, term66711.getClass(), "filterMaxFever", -1313344065);
        setIntField(term66711, term66711.getClass(), "finalSelectId", 1228398077);
        setIntField(term66711, term66711.getClass(), "finalSelectCategory", 110342291);
        term66929 = new Integer(905029929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66929;
        callMethod(klass, "setBrightness", argTypes, term66711, args);
    }

};


