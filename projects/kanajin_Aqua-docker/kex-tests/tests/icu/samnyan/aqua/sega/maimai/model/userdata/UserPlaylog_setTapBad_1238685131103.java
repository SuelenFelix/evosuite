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

public class UserPlaylog_setTapBad_1238685131103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161493;
     Object term161805;

    public UserPlaylog_setTapBad_1238685131103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161499 = new Long(370847120687610747L);
        term161493 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term161495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term161497 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161518 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161528 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161493, term161493.getClass(), "id", -8340412977479666356L);
        setLongField(term161495, term161495.getClass(), "id", 5072151233307900881L);
        setLongField(term161497, term161497.getClass(), "id", 2250556415549346949L);
        setField(term161497, term161497.getClass(), "extId", term161499);
        setField(term161497, term161497.getClass(), "luid", "iMEaCLgkkA");
        setIntField(term161514, term161514.getClass(), "year", 2015);
        setShortField(term161514, term161514.getClass(), "month", (short) 4);
        setShortField(term161514, term161514.getClass(), "day", (short) 27);
        setField(term161513, term161513.getClass(), "date", term161514);
        setByteField(term161518, term161518.getClass(), "hour", (byte) 14);
        setByteField(term161518, term161518.getClass(), "minute", (byte) 33);
        setByteField(term161518, term161518.getClass(), "second", (byte) 56);
        setIntField(term161518, term161518.getClass(), "nano", 249469563);
        setField(term161513, term161513.getClass(), "time", term161518);
        setField(term161497, term161497.getClass(), "registerTime", term161513);
        setIntField(term161524, term161524.getClass(), "year", 2014);
        setShortField(term161524, term161524.getClass(), "month", (short) 2);
        setShortField(term161524, term161524.getClass(), "day", (short) 18);
        setField(term161523, term161523.getClass(), "date", term161524);
        setByteField(term161528, term161528.getClass(), "hour", (byte) 10);
        setByteField(term161528, term161528.getClass(), "minute", (byte) 32);
        setByteField(term161528, term161528.getClass(), "second", (byte) 37);
        setIntField(term161528, term161528.getClass(), "nano", 707409108);
        setField(term161523, term161523.getClass(), "time", term161528);
        setField(term161497, term161497.getClass(), "accessTime", term161523);
        setField(term161495, term161495.getClass(), "card", term161497);
        setIntField(term161495, term161495.getClass(), "lastDataVersion", -633984004);
        setField(term161495, term161495.getClass(), "userName", "GTYlwBwnyr");
        setIntField(term161495, term161495.getClass(), "point", -1388691591);
        setIntField(term161495, term161495.getClass(), "totalPoint", 168317245);
        setIntField(term161495, term161495.getClass(), "iconId", 1169454988);
        setIntField(term161495, term161495.getClass(), "nameplateId", -747235603);
        setIntField(term161495, term161495.getClass(), "frameId", -1774121185);
        setIntField(term161495, term161495.getClass(), "trophyId", -894230396);
        setIntField(term161495, term161495.getClass(), "playCount", -359623397);
        setIntField(term161495, term161495.getClass(), "playVsCount", 611864033);
        setIntField(term161495, term161495.getClass(), "playSyncCount", 2061449507);
        setIntField(term161495, term161495.getClass(), "winCount", -1699485880);
        setIntField(term161495, term161495.getClass(), "helpCount", 1172494185);
        setIntField(term161495, term161495.getClass(), "comboCount", -1032887859);
        setIntField(term161495, term161495.getClass(), "feverCount", 1197476939);
        setIntField(term161495, term161495.getClass(), "totalHiScore", 1485127104);
        setIntField(term161495, term161495.getClass(), "totalEasyHighScore", 401581748);
        setIntField(term161495, term161495.getClass(), "totalBasicHighScore", -1919586337);
        setIntField(term161495, term161495.getClass(), "totalAdvancedHighScore", 783167069);
        setIntField(term161495, term161495.getClass(), "totalExpertHighScore", 32270159);
        setIntField(term161495, term161495.getClass(), "totalMasterHighScore", 1494506314);
        setIntField(term161495, term161495.getClass(), "totalReMasterHighScore", 1458333105);
        setIntField(term161495, term161495.getClass(), "totalHighSync", -764977587);
        setIntField(term161495, term161495.getClass(), "totalEasySync", -1241558062);
        setIntField(term161495, term161495.getClass(), "totalBasicSync", -1929951667);
        setIntField(term161495, term161495.getClass(), "totalAdvancedSync", -2143169348);
        setIntField(term161495, term161495.getClass(), "totalExpertSync", 1533523101);
        setIntField(term161495, term161495.getClass(), "totalMasterSync", 1484317241);
        setIntField(term161495, term161495.getClass(), "totalReMasterSync", -1180106058);
        setIntField(term161495, term161495.getClass(), "playerRating", 1272449290);
        setIntField(term161495, term161495.getClass(), "highestRating", 1428030976);
        setIntField(term161495, term161495.getClass(), "rankAuthTailId", -327796648);
        setField(term161495, term161495.getClass(), "eventWatchedDate", "EWesRocaYe");
        setField(term161495, term161495.getClass(), "webLimitDate", "LXbvqrOwML");
        setIntField(term161495, term161495.getClass(), "challengeTrackPhase", -157592933);
        setIntField(term161495, term161495.getClass(), "firstPlayBits", 2029868847);
        setField(term161495, term161495.getClass(), "lastPlayDate", "oJtyLMFIaY");
        setIntField(term161495, term161495.getClass(), "lastPlaceId", -1091482559);
        setField(term161495, term161495.getClass(), "lastPlaceName", "OvGOlSMJSa");
        setIntField(term161495, term161495.getClass(), "lastRegionId", -2096020481);
        setField(term161495, term161495.getClass(), "lastRegionName", "bxfVqYYRGF");
        setField(term161495, term161495.getClass(), "lastClientId", "wFXqDDYRYm");
        setField(term161495, term161495.getClass(), "lastCountryCode", "kzyZeMslFg");
        setIntField(term161495, term161495.getClass(), "eventPoint", 718408884);
        setIntField(term161495, term161495.getClass(), "totalLv", -1577724551);
        setIntField(term161495, term161495.getClass(), "lastLoginBonusDay", -652658333);
        setIntField(term161495, term161495.getClass(), "lastSurvivalBonusDay", -453396153);
        setIntField(term161495, term161495.getClass(), "loginBonusLv", 83287579);
        setField(term161493, term161493.getClass(), "user", term161495);
        setIntField(term161493, term161493.getClass(), "orderId", 892007526);
        setLongField(term161493, term161493.getClass(), "sortNumber", -4674840583005034118L);
        setIntField(term161493, term161493.getClass(), "placeId", 600463624);
        setField(term161493, term161493.getClass(), "placeName", "SjqDahcFQi");
        setField(term161493, term161493.getClass(), "country", "DVOSJnQsiN");
        setIntField(term161493, term161493.getClass(), "regionId", 1584341550);
        setField(term161493, term161493.getClass(), "playDate", "ktWbLulnVh");
        setField(term161493, term161493.getClass(), "userPlayDate", "iUWVVoBCUJ");
        setIntField(term161493, term161493.getClass(), "musicId", 859890771);
        setIntField(term161493, term161493.getClass(), "level", -891835818);
        setIntField(term161493, term161493.getClass(), "gameMode", -357014506);
        setIntField(term161493, term161493.getClass(), "rivalNum", -1877748890);
        setIntField(term161493, term161493.getClass(), "track", 1621975946);
        setIntField(term161493, term161493.getClass(), "eventId", -392223103);
        setBooleanField(term161493, term161493.getClass(), "isFreeToPlay", false);
        setIntField(term161493, term161493.getClass(), "playerRating", -2114475369);
        setLongField(term161493, term161493.getClass(), "playedUserId1", 3952299423271006072L);
        setField(term161493, term161493.getClass(), "playedUserName1", "CdhhQSeUxx");
        setIntField(term161493, term161493.getClass(), "playedMusicLevel1", 909761129);
        setLongField(term161493, term161493.getClass(), "playedUserId2", 6681879584837155391L);
        setField(term161493, term161493.getClass(), "playedUserName2", "ibLGcUvUaQ");
        setIntField(term161493, term161493.getClass(), "playedMusicLevel2", 18292002);
        setLongField(term161493, term161493.getClass(), "playedUserId3", 5457987117152229930L);
        setField(term161493, term161493.getClass(), "playedUserName3", "NFQfoAnLge");
        setIntField(term161493, term161493.getClass(), "playedMusicLevel3", 417808170);
        setIntField(term161493, term161493.getClass(), "achievement", 644921312);
        setIntField(term161493, term161493.getClass(), "score", 684210384);
        setIntField(term161493, term161493.getClass(), "tapScore", -1030878611);
        setIntField(term161493, term161493.getClass(), "holdScore", 598675220);
        setIntField(term161493, term161493.getClass(), "slideScore", -1045981963);
        setIntField(term161493, term161493.getClass(), "breakScore", -1461190427);
        setIntField(term161493, term161493.getClass(), "syncRate", -668368968);
        setIntField(term161493, term161493.getClass(), "vsWin", 1965913653);
        setBooleanField(term161493, term161493.getClass(), "isAllPerfect", true);
        setIntField(term161493, term161493.getClass(), "fullCombo", -1060483797);
        setIntField(term161493, term161493.getClass(), "maxFever", 2089690998);
        setIntField(term161493, term161493.getClass(), "maxCombo", -844432502);
        setIntField(term161493, term161493.getClass(), "tapPerfect", -1962249815);
        setIntField(term161493, term161493.getClass(), "tapGreat", -938436337);
        setIntField(term161493, term161493.getClass(), "tapGood", -2081415444);
        setIntField(term161493, term161493.getClass(), "tapBad", 1005069869);
        setIntField(term161493, term161493.getClass(), "holdPerfect", 113344233);
        setIntField(term161493, term161493.getClass(), "holdGreat", 2008077190);
        setIntField(term161493, term161493.getClass(), "holdGood", -549548133);
        setIntField(term161493, term161493.getClass(), "holdBad", 1616299373);
        setIntField(term161493, term161493.getClass(), "slidePerfect", -1578467780);
        setIntField(term161493, term161493.getClass(), "slideGreat", 1162648885);
        setIntField(term161493, term161493.getClass(), "slideGood", 1961017690);
        setIntField(term161493, term161493.getClass(), "slideBad", 511551647);
        setIntField(term161493, term161493.getClass(), "breakPerfect", 1258932332);
        setIntField(term161493, term161493.getClass(), "breakGreat", -839265758);
        setIntField(term161493, term161493.getClass(), "breakGood", -1758426538);
        setIntField(term161493, term161493.getClass(), "breakBad", 1824116965);
        setBooleanField(term161493, term161493.getClass(), "isTrackSkip", false);
        setBooleanField(term161493, term161493.getClass(), "isHighScore", false);
        setBooleanField(term161493, term161493.getClass(), "isChallengeTrack", false);
        setIntField(term161493, term161493.getClass(), "challengeLife", -1369478211);
        setIntField(term161493, term161493.getClass(), "challengeRemain", 271758747);
        setIntField(term161493, term161493.getClass(), "isAllPerfectPlus", -1522018525);
        term161805 = new Integer(1056397743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term161805;
        callMethod(klass, "setTapBad", argTypes, term161493, args);
    }

};


