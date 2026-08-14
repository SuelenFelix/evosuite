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

public class UserPlaylog_setTapBad_1238685131104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161549;
     Object term161861;

    public UserPlaylog_setTapBad_1238685131104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161555 = new Long(370847120687610747L);
        term161549 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term161551 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term161553 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161584 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161549, term161549.getClass(), "id", -8340412977479666356L);
        setLongField(term161551, term161551.getClass(), "id", 5072151233307900881L);
        setLongField(term161553, term161553.getClass(), "id", 2250556415549346949L);
        setField(term161553, term161553.getClass(), "extId", term161555);
        setField(term161553, term161553.getClass(), "luid", "iMEaCLgkkA");
        setIntField(term161570, term161570.getClass(), "year", 2015);
        setShortField(term161570, term161570.getClass(), "month", (short) 4);
        setShortField(term161570, term161570.getClass(), "day", (short) 27);
        setField(term161569, term161569.getClass(), "date", term161570);
        setByteField(term161574, term161574.getClass(), "hour", (byte) 14);
        setByteField(term161574, term161574.getClass(), "minute", (byte) 33);
        setByteField(term161574, term161574.getClass(), "second", (byte) 56);
        setIntField(term161574, term161574.getClass(), "nano", 249469563);
        setField(term161569, term161569.getClass(), "time", term161574);
        setField(term161553, term161553.getClass(), "registerTime", term161569);
        setIntField(term161580, term161580.getClass(), "year", 2014);
        setShortField(term161580, term161580.getClass(), "month", (short) 2);
        setShortField(term161580, term161580.getClass(), "day", (short) 18);
        setField(term161579, term161579.getClass(), "date", term161580);
        setByteField(term161584, term161584.getClass(), "hour", (byte) 10);
        setByteField(term161584, term161584.getClass(), "minute", (byte) 32);
        setByteField(term161584, term161584.getClass(), "second", (byte) 37);
        setIntField(term161584, term161584.getClass(), "nano", 707409108);
        setField(term161579, term161579.getClass(), "time", term161584);
        setField(term161553, term161553.getClass(), "accessTime", term161579);
        setField(term161551, term161551.getClass(), "card", term161553);
        setIntField(term161551, term161551.getClass(), "lastDataVersion", -633984004);
        setField(term161551, term161551.getClass(), "userName", "GTYlwBwnyr");
        setIntField(term161551, term161551.getClass(), "point", -1388691591);
        setIntField(term161551, term161551.getClass(), "totalPoint", 168317245);
        setIntField(term161551, term161551.getClass(), "iconId", 1169454988);
        setIntField(term161551, term161551.getClass(), "nameplateId", -747235603);
        setIntField(term161551, term161551.getClass(), "frameId", -1774121185);
        setIntField(term161551, term161551.getClass(), "trophyId", -894230396);
        setIntField(term161551, term161551.getClass(), "playCount", -359623397);
        setIntField(term161551, term161551.getClass(), "playVsCount", 611864033);
        setIntField(term161551, term161551.getClass(), "playSyncCount", 2061449507);
        setIntField(term161551, term161551.getClass(), "winCount", -1699485880);
        setIntField(term161551, term161551.getClass(), "helpCount", 1172494185);
        setIntField(term161551, term161551.getClass(), "comboCount", -1032887859);
        setIntField(term161551, term161551.getClass(), "feverCount", 1197476939);
        setIntField(term161551, term161551.getClass(), "totalHiScore", 1485127104);
        setIntField(term161551, term161551.getClass(), "totalEasyHighScore", 401581748);
        setIntField(term161551, term161551.getClass(), "totalBasicHighScore", -1919586337);
        setIntField(term161551, term161551.getClass(), "totalAdvancedHighScore", 783167069);
        setIntField(term161551, term161551.getClass(), "totalExpertHighScore", 32270159);
        setIntField(term161551, term161551.getClass(), "totalMasterHighScore", 1494506314);
        setIntField(term161551, term161551.getClass(), "totalReMasterHighScore", 1458333105);
        setIntField(term161551, term161551.getClass(), "totalHighSync", -764977587);
        setIntField(term161551, term161551.getClass(), "totalEasySync", -1241558062);
        setIntField(term161551, term161551.getClass(), "totalBasicSync", -1929951667);
        setIntField(term161551, term161551.getClass(), "totalAdvancedSync", -2143169348);
        setIntField(term161551, term161551.getClass(), "totalExpertSync", 1533523101);
        setIntField(term161551, term161551.getClass(), "totalMasterSync", 1484317241);
        setIntField(term161551, term161551.getClass(), "totalReMasterSync", -1180106058);
        setIntField(term161551, term161551.getClass(), "playerRating", 1272449290);
        setIntField(term161551, term161551.getClass(), "highestRating", 1428030976);
        setIntField(term161551, term161551.getClass(), "rankAuthTailId", -327796648);
        setField(term161551, term161551.getClass(), "eventWatchedDate", "EWesRocaYe");
        setField(term161551, term161551.getClass(), "webLimitDate", "LXbvqrOwML");
        setIntField(term161551, term161551.getClass(), "challengeTrackPhase", -157592933);
        setIntField(term161551, term161551.getClass(), "firstPlayBits", 2029868847);
        setField(term161551, term161551.getClass(), "lastPlayDate", "oJtyLMFIaY");
        setIntField(term161551, term161551.getClass(), "lastPlaceId", -1091482559);
        setField(term161551, term161551.getClass(), "lastPlaceName", "OvGOlSMJSa");
        setIntField(term161551, term161551.getClass(), "lastRegionId", -2096020481);
        setField(term161551, term161551.getClass(), "lastRegionName", "bxfVqYYRGF");
        setField(term161551, term161551.getClass(), "lastClientId", "wFXqDDYRYm");
        setField(term161551, term161551.getClass(), "lastCountryCode", "kzyZeMslFg");
        setIntField(term161551, term161551.getClass(), "eventPoint", 718408884);
        setIntField(term161551, term161551.getClass(), "totalLv", -1577724551);
        setIntField(term161551, term161551.getClass(), "lastLoginBonusDay", -652658333);
        setIntField(term161551, term161551.getClass(), "lastSurvivalBonusDay", -453396153);
        setIntField(term161551, term161551.getClass(), "loginBonusLv", 83287579);
        setField(term161549, term161549.getClass(), "user", term161551);
        setIntField(term161549, term161549.getClass(), "orderId", 892007526);
        setLongField(term161549, term161549.getClass(), "sortNumber", -4674840583005034118L);
        setIntField(term161549, term161549.getClass(), "placeId", 600463624);
        setField(term161549, term161549.getClass(), "placeName", "SjqDahcFQi");
        setField(term161549, term161549.getClass(), "country", "DVOSJnQsiN");
        setIntField(term161549, term161549.getClass(), "regionId", 1584341550);
        setField(term161549, term161549.getClass(), "playDate", "ktWbLulnVh");
        setField(term161549, term161549.getClass(), "userPlayDate", "iUWVVoBCUJ");
        setIntField(term161549, term161549.getClass(), "musicId", 859890771);
        setIntField(term161549, term161549.getClass(), "level", -891835818);
        setIntField(term161549, term161549.getClass(), "gameMode", -357014506);
        setIntField(term161549, term161549.getClass(), "rivalNum", -1877748890);
        setIntField(term161549, term161549.getClass(), "track", 1621975946);
        setIntField(term161549, term161549.getClass(), "eventId", -392223103);
        setBooleanField(term161549, term161549.getClass(), "isFreeToPlay", false);
        setIntField(term161549, term161549.getClass(), "playerRating", -2114475369);
        setLongField(term161549, term161549.getClass(), "playedUserId1", 3952299423271006072L);
        setField(term161549, term161549.getClass(), "playedUserName1", "CdhhQSeUxx");
        setIntField(term161549, term161549.getClass(), "playedMusicLevel1", 909761129);
        setLongField(term161549, term161549.getClass(), "playedUserId2", 6681879584837155391L);
        setField(term161549, term161549.getClass(), "playedUserName2", "ibLGcUvUaQ");
        setIntField(term161549, term161549.getClass(), "playedMusicLevel2", 18292002);
        setLongField(term161549, term161549.getClass(), "playedUserId3", 5457987117152229930L);
        setField(term161549, term161549.getClass(), "playedUserName3", "NFQfoAnLge");
        setIntField(term161549, term161549.getClass(), "playedMusicLevel3", 417808170);
        setIntField(term161549, term161549.getClass(), "achievement", 644921312);
        setIntField(term161549, term161549.getClass(), "score", 684210384);
        setIntField(term161549, term161549.getClass(), "tapScore", -1030878611);
        setIntField(term161549, term161549.getClass(), "holdScore", 598675220);
        setIntField(term161549, term161549.getClass(), "slideScore", -1045981963);
        setIntField(term161549, term161549.getClass(), "breakScore", -1461190427);
        setIntField(term161549, term161549.getClass(), "syncRate", -668368968);
        setIntField(term161549, term161549.getClass(), "vsWin", 1965913653);
        setBooleanField(term161549, term161549.getClass(), "isAllPerfect", true);
        setIntField(term161549, term161549.getClass(), "fullCombo", -1060483797);
        setIntField(term161549, term161549.getClass(), "maxFever", 2089690998);
        setIntField(term161549, term161549.getClass(), "maxCombo", -844432502);
        setIntField(term161549, term161549.getClass(), "tapPerfect", -1962249815);
        setIntField(term161549, term161549.getClass(), "tapGreat", -938436337);
        setIntField(term161549, term161549.getClass(), "tapGood", -2081415444);
        setIntField(term161549, term161549.getClass(), "tapBad", 1005069869);
        setIntField(term161549, term161549.getClass(), "holdPerfect", 113344233);
        setIntField(term161549, term161549.getClass(), "holdGreat", 2008077190);
        setIntField(term161549, term161549.getClass(), "holdGood", -549548133);
        setIntField(term161549, term161549.getClass(), "holdBad", 1616299373);
        setIntField(term161549, term161549.getClass(), "slidePerfect", -1578467780);
        setIntField(term161549, term161549.getClass(), "slideGreat", 1162648885);
        setIntField(term161549, term161549.getClass(), "slideGood", 1961017690);
        setIntField(term161549, term161549.getClass(), "slideBad", 511551647);
        setIntField(term161549, term161549.getClass(), "breakPerfect", 1258932332);
        setIntField(term161549, term161549.getClass(), "breakGreat", -839265758);
        setIntField(term161549, term161549.getClass(), "breakGood", -1758426538);
        setIntField(term161549, term161549.getClass(), "breakBad", 1824116965);
        setBooleanField(term161549, term161549.getClass(), "isTrackSkip", false);
        setBooleanField(term161549, term161549.getClass(), "isHighScore", false);
        setBooleanField(term161549, term161549.getClass(), "isChallengeTrack", false);
        setIntField(term161549, term161549.getClass(), "challengeLife", -1369478211);
        setIntField(term161549, term161549.getClass(), "challengeRemain", 271758747);
        setIntField(term161549, term161549.getClass(), "isAllPerfectPlus", -1522018525);
        term161861 = new Integer(1056397743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term161861;
        callMethod(klass, "setTapBad", argTypes, term161549, args);
    }

};


