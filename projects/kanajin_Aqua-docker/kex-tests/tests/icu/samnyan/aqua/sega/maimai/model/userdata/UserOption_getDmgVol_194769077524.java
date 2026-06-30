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

public class UserOption_getDmgVol_194769077524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58121;

    public UserOption_getDmgVol_194769077524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58127 = new Long(-7310273014364148916L);
        term58121 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term58123 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term58125 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58146 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58156 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58121, term58121.getClass(), "id", 1350676497718116574L);
        setLongField(term58123, term58123.getClass(), "id", -4477377284889705897L);
        setLongField(term58125, term58125.getClass(), "id", 6323132402520425961L);
        setField(term58125, term58125.getClass(), "extId", term58127);
        setField(term58125, term58125.getClass(), "luid", "mQsaqUltLU");
        setIntField(term58142, term58142.getClass(), "year", 2015);
        setShortField(term58142, term58142.getClass(), "month", (short) 1);
        setShortField(term58142, term58142.getClass(), "day", (short) 23);
        setField(term58141, term58141.getClass(), "date", term58142);
        setByteField(term58146, term58146.getClass(), "hour", (byte) 0);
        setByteField(term58146, term58146.getClass(), "minute", (byte) 5);
        setByteField(term58146, term58146.getClass(), "second", (byte) 21);
        setIntField(term58146, term58146.getClass(), "nano", 402778195);
        setField(term58141, term58141.getClass(), "time", term58146);
        setField(term58125, term58125.getClass(), "registerTime", term58141);
        setIntField(term58152, term58152.getClass(), "year", 2022);
        setShortField(term58152, term58152.getClass(), "month", (short) 4);
        setShortField(term58152, term58152.getClass(), "day", (short) 2);
        setField(term58151, term58151.getClass(), "date", term58152);
        setByteField(term58156, term58156.getClass(), "hour", (byte) 21);
        setByteField(term58156, term58156.getClass(), "minute", (byte) 1);
        setByteField(term58156, term58156.getClass(), "second", (byte) 56);
        setIntField(term58156, term58156.getClass(), "nano", 418299217);
        setField(term58151, term58151.getClass(), "time", term58156);
        setField(term58125, term58125.getClass(), "accessTime", term58151);
        setField(term58123, term58123.getClass(), "card", term58125);
        setIntField(term58123, term58123.getClass(), "lastDataVersion", 1056847308);
        setField(term58123, term58123.getClass(), "userName", "jwENwZiGlR");
        setIntField(term58123, term58123.getClass(), "point", 1211085720);
        setIntField(term58123, term58123.getClass(), "totalPoint", 1797871047);
        setIntField(term58123, term58123.getClass(), "iconId", -1831206748);
        setIntField(term58123, term58123.getClass(), "nameplateId", -63988972);
        setIntField(term58123, term58123.getClass(), "frameId", 140289373);
        setIntField(term58123, term58123.getClass(), "trophyId", -890287718);
        setIntField(term58123, term58123.getClass(), "playCount", 562977586);
        setIntField(term58123, term58123.getClass(), "playVsCount", 877526186);
        setIntField(term58123, term58123.getClass(), "playSyncCount", 1336834066);
        setIntField(term58123, term58123.getClass(), "winCount", -723140798);
        setIntField(term58123, term58123.getClass(), "helpCount", 2071132204);
        setIntField(term58123, term58123.getClass(), "comboCount", 1174579517);
        setIntField(term58123, term58123.getClass(), "feverCount", 2068319897);
        setIntField(term58123, term58123.getClass(), "totalHiScore", 112739257);
        setIntField(term58123, term58123.getClass(), "totalEasyHighScore", 1199908250);
        setIntField(term58123, term58123.getClass(), "totalBasicHighScore", 1616884797);
        setIntField(term58123, term58123.getClass(), "totalAdvancedHighScore", 2030586700);
        setIntField(term58123, term58123.getClass(), "totalExpertHighScore", -340603553);
        setIntField(term58123, term58123.getClass(), "totalMasterHighScore", 225498620);
        setIntField(term58123, term58123.getClass(), "totalReMasterHighScore", -1390906119);
        setIntField(term58123, term58123.getClass(), "totalHighSync", 36971401);
        setIntField(term58123, term58123.getClass(), "totalEasySync", 1516544818);
        setIntField(term58123, term58123.getClass(), "totalBasicSync", 194365806);
        setIntField(term58123, term58123.getClass(), "totalAdvancedSync", 953836264);
        setIntField(term58123, term58123.getClass(), "totalExpertSync", 1420814192);
        setIntField(term58123, term58123.getClass(), "totalMasterSync", -382860485);
        setIntField(term58123, term58123.getClass(), "totalReMasterSync", 634627334);
        setIntField(term58123, term58123.getClass(), "playerRating", 1164370758);
        setIntField(term58123, term58123.getClass(), "highestRating", 857653739);
        setIntField(term58123, term58123.getClass(), "rankAuthTailId", -1000522677);
        setField(term58123, term58123.getClass(), "eventWatchedDate", "rfFHGPcfpz");
        setField(term58123, term58123.getClass(), "webLimitDate", "fViQeyMrrL");
        setIntField(term58123, term58123.getClass(), "challengeTrackPhase", -17458048);
        setIntField(term58123, term58123.getClass(), "firstPlayBits", 1912855522);
        setField(term58123, term58123.getClass(), "lastPlayDate", "zzeaToyLmI");
        setIntField(term58123, term58123.getClass(), "lastPlaceId", 1949021422);
        setField(term58123, term58123.getClass(), "lastPlaceName", "sKYWhmRMLx");
        setIntField(term58123, term58123.getClass(), "lastRegionId", -912838937);
        setField(term58123, term58123.getClass(), "lastRegionName", "SOJpgWUZCf");
        setField(term58123, term58123.getClass(), "lastClientId", "jgywFOzBDw");
        setField(term58123, term58123.getClass(), "lastCountryCode", "yKIXLtCWYi");
        setIntField(term58123, term58123.getClass(), "eventPoint", 16552477);
        setIntField(term58123, term58123.getClass(), "totalLv", -102621386);
        setIntField(term58123, term58123.getClass(), "lastLoginBonusDay", -1817209345);
        setIntField(term58123, term58123.getClass(), "lastSurvivalBonusDay", -1215141504);
        setIntField(term58123, term58123.getClass(), "loginBonusLv", -485437241);
        setField(term58121, term58121.getClass(), "user", term58123);
        setIntField(term58121, term58121.getClass(), "soudEffect", -1166670409);
        setIntField(term58121, term58121.getClass(), "mirrorMode", 832294648);
        setIntField(term58121, term58121.getClass(), "guideSpeed", -840215577);
        setIntField(term58121, term58121.getClass(), "bgInfo", -53296007);
        setIntField(term58121, term58121.getClass(), "brightness", -424687506);
        setIntField(term58121, term58121.getClass(), "isStarRot", -624302325);
        setIntField(term58121, term58121.getClass(), "breakSe", -1974788609);
        setIntField(term58121, term58121.getClass(), "slideSe", -262908707);
        setIntField(term58121, term58121.getClass(), "hardJudge", 885420232);
        setIntField(term58121, term58121.getClass(), "isTagJump", -884205561);
        setIntField(term58121, term58121.getClass(), "breakSeVol", 1568826803);
        setIntField(term58121, term58121.getClass(), "slideSeVol", 1283114550);
        setIntField(term58121, term58121.getClass(), "isUpperDisp", -64917079);
        setIntField(term58121, term58121.getClass(), "trackSkip", 14382041);
        setIntField(term58121, term58121.getClass(), "optionMode", -2016163798);
        setIntField(term58121, term58121.getClass(), "simpleOptionParam", 1260602495);
        setIntField(term58121, term58121.getClass(), "adjustTiming", 2098871750);
        setIntField(term58121, term58121.getClass(), "dispTiming", 583294548);
        setIntField(term58121, term58121.getClass(), "timingPos", -2034642375);
        setIntField(term58121, term58121.getClass(), "ansVol", -1486717740);
        setIntField(term58121, term58121.getClass(), "noteVol", 1578135347);
        setIntField(term58121, term58121.getClass(), "dmgVol", -1283825868);
        setIntField(term58121, term58121.getClass(), "appealFlame", 322372633);
        setIntField(term58121, term58121.getClass(), "isFeverDisp", 1255794961);
        setIntField(term58121, term58121.getClass(), "dispJudge", 232805435);
        setIntField(term58121, term58121.getClass(), "judgePos", 721981536);
        setIntField(term58121, term58121.getClass(), "ratingGuard", 91610201);
        setIntField(term58121, term58121.getClass(), "selectChara", -1281117768);
        setIntField(term58121, term58121.getClass(), "sortType", 208991599);
        setIntField(term58121, term58121.getClass(), "filterGenre", 19147886);
        setIntField(term58121, term58121.getClass(), "filterLevel", 610934293);
        setIntField(term58121, term58121.getClass(), "filterRank", 285231640);
        setIntField(term58121, term58121.getClass(), "filterVersion", 1143728385);
        setIntField(term58121, term58121.getClass(), "filterRec", 368771436);
        setIntField(term58121, term58121.getClass(), "filterFullCombo", 92522088);
        setIntField(term58121, term58121.getClass(), "filterAllPerfect", 704588458);
        setIntField(term58121, term58121.getClass(), "filterDifficulty", 1666352978);
        setIntField(term58121, term58121.getClass(), "filterFullSync", 439339997);
        setIntField(term58121, term58121.getClass(), "filterReMaster", 1821861150);
        setIntField(term58121, term58121.getClass(), "filterMaxFever", -787591747);
        setIntField(term58121, term58121.getClass(), "finalSelectId", 426333384);
        setIntField(term58121, term58121.getClass(), "finalSelectCategory", -1659716094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDmgVol", argTypes, term58121, args);
    }

};


