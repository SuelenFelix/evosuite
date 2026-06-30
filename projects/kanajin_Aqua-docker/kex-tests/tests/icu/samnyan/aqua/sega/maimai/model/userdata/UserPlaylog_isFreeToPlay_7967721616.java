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

public class UserPlaylog_isFreeToPlay_7967721616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119943;

    public UserPlaylog_isFreeToPlay_7967721616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term119949 = new Long(-5534222035915952617L);
        term119943 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term119945 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term119947 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term119963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119968 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119978 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term119943, term119943.getClass(), "id", -7583612555465533678L);
        setLongField(term119945, term119945.getClass(), "id", -1040140369921518682L);
        setLongField(term119947, term119947.getClass(), "id", 4591729712990322550L);
        setField(term119947, term119947.getClass(), "extId", term119949);
        setField(term119947, term119947.getClass(), "luid", "cKBnwzMCia");
        setIntField(term119964, term119964.getClass(), "year", 2023);
        setShortField(term119964, term119964.getClass(), "month", (short) 12);
        setShortField(term119964, term119964.getClass(), "day", (short) 5);
        setField(term119963, term119963.getClass(), "date", term119964);
        setByteField(term119968, term119968.getClass(), "hour", (byte) 19);
        setByteField(term119968, term119968.getClass(), "minute", (byte) 19);
        setByteField(term119968, term119968.getClass(), "second", (byte) 47);
        setIntField(term119968, term119968.getClass(), "nano", 871420313);
        setField(term119963, term119963.getClass(), "time", term119968);
        setField(term119947, term119947.getClass(), "registerTime", term119963);
        setIntField(term119974, term119974.getClass(), "year", 2029);
        setShortField(term119974, term119974.getClass(), "month", (short) 1);
        setShortField(term119974, term119974.getClass(), "day", (short) 20);
        setField(term119973, term119973.getClass(), "date", term119974);
        setByteField(term119978, term119978.getClass(), "hour", (byte) 0);
        setByteField(term119978, term119978.getClass(), "minute", (byte) 45);
        setByteField(term119978, term119978.getClass(), "second", (byte) 30);
        setIntField(term119978, term119978.getClass(), "nano", 207682029);
        setField(term119973, term119973.getClass(), "time", term119978);
        setField(term119947, term119947.getClass(), "accessTime", term119973);
        setField(term119945, term119945.getClass(), "card", term119947);
        setIntField(term119945, term119945.getClass(), "lastDataVersion", 1162627136);
        setField(term119945, term119945.getClass(), "userName", "QWmZpWASOK");
        setIntField(term119945, term119945.getClass(), "point", -1275316800);
        setIntField(term119945, term119945.getClass(), "totalPoint", 151380700);
        setIntField(term119945, term119945.getClass(), "iconId", 1777983178);
        setIntField(term119945, term119945.getClass(), "nameplateId", 823553858);
        setIntField(term119945, term119945.getClass(), "frameId", -1875267671);
        setIntField(term119945, term119945.getClass(), "trophyId", 1210180896);
        setIntField(term119945, term119945.getClass(), "playCount", -856709958);
        setIntField(term119945, term119945.getClass(), "playVsCount", 1421075755);
        setIntField(term119945, term119945.getClass(), "playSyncCount", 583296992);
        setIntField(term119945, term119945.getClass(), "winCount", 303697112);
        setIntField(term119945, term119945.getClass(), "helpCount", 555770564);
        setIntField(term119945, term119945.getClass(), "comboCount", 715239982);
        setIntField(term119945, term119945.getClass(), "feverCount", 615055377);
        setIntField(term119945, term119945.getClass(), "totalHiScore", -1316216263);
        setIntField(term119945, term119945.getClass(), "totalEasyHighScore", 1082693506);
        setIntField(term119945, term119945.getClass(), "totalBasicHighScore", 1054381018);
        setIntField(term119945, term119945.getClass(), "totalAdvancedHighScore", -220010763);
        setIntField(term119945, term119945.getClass(), "totalExpertHighScore", 1856047628);
        setIntField(term119945, term119945.getClass(), "totalMasterHighScore", -2140050714);
        setIntField(term119945, term119945.getClass(), "totalReMasterHighScore", 1643490260);
        setIntField(term119945, term119945.getClass(), "totalHighSync", 160723704);
        setIntField(term119945, term119945.getClass(), "totalEasySync", 890205565);
        setIntField(term119945, term119945.getClass(), "totalBasicSync", -1174535298);
        setIntField(term119945, term119945.getClass(), "totalAdvancedSync", -625809978);
        setIntField(term119945, term119945.getClass(), "totalExpertSync", -724335844);
        setIntField(term119945, term119945.getClass(), "totalMasterSync", 1576614706);
        setIntField(term119945, term119945.getClass(), "totalReMasterSync", -1847432199);
        setIntField(term119945, term119945.getClass(), "playerRating", 1319848087);
        setIntField(term119945, term119945.getClass(), "highestRating", 556059164);
        setIntField(term119945, term119945.getClass(), "rankAuthTailId", -685986401);
        setField(term119945, term119945.getClass(), "eventWatchedDate", "ZNLWGsxniS");
        setField(term119945, term119945.getClass(), "webLimitDate", "JARLxkvqNB");
        setIntField(term119945, term119945.getClass(), "challengeTrackPhase", -379269911);
        setIntField(term119945, term119945.getClass(), "firstPlayBits", 846636764);
        setField(term119945, term119945.getClass(), "lastPlayDate", "tNcVErsFVe");
        setIntField(term119945, term119945.getClass(), "lastPlaceId", -88201260);
        setField(term119945, term119945.getClass(), "lastPlaceName", "DnCwTIIzcH");
        setIntField(term119945, term119945.getClass(), "lastRegionId", -292257128);
        setField(term119945, term119945.getClass(), "lastRegionName", "ULOSEQkLaZ");
        setField(term119945, term119945.getClass(), "lastClientId", "frsRnTwGAg");
        setField(term119945, term119945.getClass(), "lastCountryCode", "mLdICgTzLU");
        setIntField(term119945, term119945.getClass(), "eventPoint", -577634614);
        setIntField(term119945, term119945.getClass(), "totalLv", -1041538419);
        setIntField(term119945, term119945.getClass(), "lastLoginBonusDay", -112544545);
        setIntField(term119945, term119945.getClass(), "lastSurvivalBonusDay", -1426710489);
        setIntField(term119945, term119945.getClass(), "loginBonusLv", 815446082);
        setField(term119943, term119943.getClass(), "user", term119945);
        setIntField(term119943, term119943.getClass(), "orderId", 856438779);
        setLongField(term119943, term119943.getClass(), "sortNumber", -1013072826351726812L);
        setIntField(term119943, term119943.getClass(), "placeId", 1148281986);
        setField(term119943, term119943.getClass(), "placeName", "MgDkHuQnRs");
        setField(term119943, term119943.getClass(), "country", "iEeRhESASl");
        setIntField(term119943, term119943.getClass(), "regionId", -1538825569);
        setField(term119943, term119943.getClass(), "playDate", "eywpqasaKj");
        setField(term119943, term119943.getClass(), "userPlayDate", "QnaLMKXAzJ");
        setIntField(term119943, term119943.getClass(), "musicId", 1826544810);
        setIntField(term119943, term119943.getClass(), "level", -1542241279);
        setIntField(term119943, term119943.getClass(), "gameMode", -1509334840);
        setIntField(term119943, term119943.getClass(), "rivalNum", -129880080);
        setIntField(term119943, term119943.getClass(), "track", 1166061260);
        setIntField(term119943, term119943.getClass(), "eventId", 1047181690);
        setBooleanField(term119943, term119943.getClass(), "isFreeToPlay", false);
        setIntField(term119943, term119943.getClass(), "playerRating", -1074428691);
        setLongField(term119943, term119943.getClass(), "playedUserId1", 4992284695861622180L);
        setField(term119943, term119943.getClass(), "playedUserName1", "QrHmFoeUoY");
        setIntField(term119943, term119943.getClass(), "playedMusicLevel1", -185766851);
        setLongField(term119943, term119943.getClass(), "playedUserId2", -6376003179103732362L);
        setField(term119943, term119943.getClass(), "playedUserName2", "BIysFVoAAl");
        setIntField(term119943, term119943.getClass(), "playedMusicLevel2", 1974594542);
        setLongField(term119943, term119943.getClass(), "playedUserId3", -2050936198165389315L);
        setField(term119943, term119943.getClass(), "playedUserName3", "TAqcGSOgIz");
        setIntField(term119943, term119943.getClass(), "playedMusicLevel3", -260638222);
        setIntField(term119943, term119943.getClass(), "achievement", -1756194305);
        setIntField(term119943, term119943.getClass(), "score", 83370923);
        setIntField(term119943, term119943.getClass(), "tapScore", -1299639537);
        setIntField(term119943, term119943.getClass(), "holdScore", -1373829729);
        setIntField(term119943, term119943.getClass(), "slideScore", -1556465214);
        setIntField(term119943, term119943.getClass(), "breakScore", -222495364);
        setIntField(term119943, term119943.getClass(), "syncRate", -1152557968);
        setIntField(term119943, term119943.getClass(), "vsWin", 1194030737);
        setBooleanField(term119943, term119943.getClass(), "isAllPerfect", false);
        setIntField(term119943, term119943.getClass(), "fullCombo", 353795028);
        setIntField(term119943, term119943.getClass(), "maxFever", -1230943141);
        setIntField(term119943, term119943.getClass(), "maxCombo", -2046024363);
        setIntField(term119943, term119943.getClass(), "tapPerfect", -226788568);
        setIntField(term119943, term119943.getClass(), "tapGreat", 832622865);
        setIntField(term119943, term119943.getClass(), "tapGood", 1290031096);
        setIntField(term119943, term119943.getClass(), "tapBad", 1244845068);
        setIntField(term119943, term119943.getClass(), "holdPerfect", -1073577017);
        setIntField(term119943, term119943.getClass(), "holdGreat", -26693320);
        setIntField(term119943, term119943.getClass(), "holdGood", -483886121);
        setIntField(term119943, term119943.getClass(), "holdBad", 1561622574);
        setIntField(term119943, term119943.getClass(), "slidePerfect", 1113888710);
        setIntField(term119943, term119943.getClass(), "slideGreat", -698024242);
        setIntField(term119943, term119943.getClass(), "slideGood", -2008426651);
        setIntField(term119943, term119943.getClass(), "slideBad", -1796035804);
        setIntField(term119943, term119943.getClass(), "breakPerfect", 623019437);
        setIntField(term119943, term119943.getClass(), "breakGreat", 1658668354);
        setIntField(term119943, term119943.getClass(), "breakGood", 917621580);
        setIntField(term119943, term119943.getClass(), "breakBad", 446002412);
        setBooleanField(term119943, term119943.getClass(), "isTrackSkip", false);
        setBooleanField(term119943, term119943.getClass(), "isHighScore", false);
        setBooleanField(term119943, term119943.getClass(), "isChallengeTrack", true);
        setIntField(term119943, term119943.getClass(), "challengeLife", -1099013474);
        setIntField(term119943, term119943.getClass(), "challengeRemain", 455488849);
        setIntField(term119943, term119943.getClass(), "isAllPerfectPlus", -209063929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFreeToPlay", argTypes, term119943, args);
    }

};


