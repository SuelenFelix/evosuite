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

public class UserPlaylog_setFullCombo_100608267497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3985015;
     Object term3985327;

    public UserPlaylog_setFullCombo_100608267497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3985021 = new Long(2712697079953235002L);
        term3985015 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3985017 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3985019 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3985035 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3985036 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3985040 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3985045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3985046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3985050 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3985015, term3985015.getClass(), "id", 3892936138084910365L);
        setLongField(term3985017, term3985017.getClass(), "id", 2876302144049942220L);
        setLongField(term3985019, term3985019.getClass(), "id", -8635838462862510662L);
        setField(term3985019, term3985019.getClass(), "extId", term3985021);
        setField(term3985019, term3985019.getClass(), "luid", "jSDIsiUEBh");
        setIntField(term3985036, term3985036.getClass(), "year", 2017);
        setShortField(term3985036, term3985036.getClass(), "month", (short) 9);
        setShortField(term3985036, term3985036.getClass(), "day", (short) 1);
        setField(term3985035, term3985035.getClass(), "date", term3985036);
        setByteField(term3985040, term3985040.getClass(), "hour", (byte) 8);
        setByteField(term3985040, term3985040.getClass(), "minute", (byte) 47);
        setByteField(term3985040, term3985040.getClass(), "second", (byte) 31);
        setIntField(term3985040, term3985040.getClass(), "nano", 827873055);
        setField(term3985035, term3985035.getClass(), "time", term3985040);
        setField(term3985019, term3985019.getClass(), "registerTime", term3985035);
        setIntField(term3985046, term3985046.getClass(), "year", 2027);
        setShortField(term3985046, term3985046.getClass(), "month", (short) 9);
        setShortField(term3985046, term3985046.getClass(), "day", (short) 8);
        setField(term3985045, term3985045.getClass(), "date", term3985046);
        setByteField(term3985050, term3985050.getClass(), "hour", (byte) 10);
        setByteField(term3985050, term3985050.getClass(), "minute", (byte) 46);
        setByteField(term3985050, term3985050.getClass(), "second", (byte) 39);
        setIntField(term3985050, term3985050.getClass(), "nano", 295473332);
        setField(term3985045, term3985045.getClass(), "time", term3985050);
        setField(term3985019, term3985019.getClass(), "accessTime", term3985045);
        setField(term3985017, term3985017.getClass(), "card", term3985019);
        setIntField(term3985017, term3985017.getClass(), "lastDataVersion", 2108992084);
        setField(term3985017, term3985017.getClass(), "userName", "MqUsXeFMxw");
        setIntField(term3985017, term3985017.getClass(), "point", 1149939577);
        setIntField(term3985017, term3985017.getClass(), "totalPoint", 1645051487);
        setIntField(term3985017, term3985017.getClass(), "iconId", 145704681);
        setIntField(term3985017, term3985017.getClass(), "nameplateId", 496057866);
        setIntField(term3985017, term3985017.getClass(), "frameId", 579698119);
        setIntField(term3985017, term3985017.getClass(), "trophyId", -307054652);
        setIntField(term3985017, term3985017.getClass(), "playCount", -521532067);
        setIntField(term3985017, term3985017.getClass(), "playVsCount", -1700227391);
        setIntField(term3985017, term3985017.getClass(), "playSyncCount", -662709333);
        setIntField(term3985017, term3985017.getClass(), "winCount", -522302046);
        setIntField(term3985017, term3985017.getClass(), "helpCount", 1019913438);
        setIntField(term3985017, term3985017.getClass(), "comboCount", -432352810);
        setIntField(term3985017, term3985017.getClass(), "feverCount", -1331604664);
        setIntField(term3985017, term3985017.getClass(), "totalHiScore", 253843075);
        setIntField(term3985017, term3985017.getClass(), "totalEasyHighScore", -651190029);
        setIntField(term3985017, term3985017.getClass(), "totalBasicHighScore", -1332279556);
        setIntField(term3985017, term3985017.getClass(), "totalAdvancedHighScore", 860173891);
        setIntField(term3985017, term3985017.getClass(), "totalExpertHighScore", -512682998);
        setIntField(term3985017, term3985017.getClass(), "totalMasterHighScore", -1409848512);
        setIntField(term3985017, term3985017.getClass(), "totalReMasterHighScore", 755567764);
        setIntField(term3985017, term3985017.getClass(), "totalHighSync", 115518853);
        setIntField(term3985017, term3985017.getClass(), "totalEasySync", -1411923605);
        setIntField(term3985017, term3985017.getClass(), "totalBasicSync", 615801572);
        setIntField(term3985017, term3985017.getClass(), "totalAdvancedSync", 451849537);
        setIntField(term3985017, term3985017.getClass(), "totalExpertSync", -1733328577);
        setIntField(term3985017, term3985017.getClass(), "totalMasterSync", 1656706332);
        setIntField(term3985017, term3985017.getClass(), "totalReMasterSync", 830017059);
        setIntField(term3985017, term3985017.getClass(), "playerRating", 1081221819);
        setIntField(term3985017, term3985017.getClass(), "highestRating", -70197970);
        setIntField(term3985017, term3985017.getClass(), "rankAuthTailId", 1505372620);
        setField(term3985017, term3985017.getClass(), "eventWatchedDate", "FbmoBrKqcX");
        setField(term3985017, term3985017.getClass(), "webLimitDate", "hoCRLYvusF");
        setIntField(term3985017, term3985017.getClass(), "challengeTrackPhase", 453198405);
        setIntField(term3985017, term3985017.getClass(), "firstPlayBits", 1827727844);
        setField(term3985017, term3985017.getClass(), "lastPlayDate", "sNcbQfBHCt");
        setIntField(term3985017, term3985017.getClass(), "lastPlaceId", 740136223);
        setField(term3985017, term3985017.getClass(), "lastPlaceName", "KpfhxFwaxt");
        setIntField(term3985017, term3985017.getClass(), "lastRegionId", -612842860);
        setField(term3985017, term3985017.getClass(), "lastRegionName", "zhqxzEtARD");
        setField(term3985017, term3985017.getClass(), "lastClientId", "TjRsrtuFxl");
        setField(term3985017, term3985017.getClass(), "lastCountryCode", "rsLxzBGIYU");
        setIntField(term3985017, term3985017.getClass(), "eventPoint", -23632451);
        setIntField(term3985017, term3985017.getClass(), "totalLv", -1980546024);
        setIntField(term3985017, term3985017.getClass(), "lastLoginBonusDay", -1222529611);
        setIntField(term3985017, term3985017.getClass(), "lastSurvivalBonusDay", 1507532395);
        setIntField(term3985017, term3985017.getClass(), "loginBonusLv", 1565208716);
        setField(term3985015, term3985015.getClass(), "user", term3985017);
        setIntField(term3985015, term3985015.getClass(), "orderId", -620103224);
        setLongField(term3985015, term3985015.getClass(), "sortNumber", -1324387243445019593L);
        setIntField(term3985015, term3985015.getClass(), "placeId", -490001046);
        setField(term3985015, term3985015.getClass(), "placeName", "NidTSxdVRA");
        setField(term3985015, term3985015.getClass(), "country", "sEsodolnFl");
        setIntField(term3985015, term3985015.getClass(), "regionId", 1358909151);
        setField(term3985015, term3985015.getClass(), "playDate", "LoUiTqlxul");
        setField(term3985015, term3985015.getClass(), "userPlayDate", "BKFTNBysdp");
        setIntField(term3985015, term3985015.getClass(), "musicId", -359559449);
        setIntField(term3985015, term3985015.getClass(), "level", -1003670967);
        setIntField(term3985015, term3985015.getClass(), "gameMode", 690256339);
        setIntField(term3985015, term3985015.getClass(), "rivalNum", 1477854722);
        setIntField(term3985015, term3985015.getClass(), "track", 1557105175);
        setIntField(term3985015, term3985015.getClass(), "eventId", -862948119);
        setBooleanField(term3985015, term3985015.getClass(), "isFreeToPlay", true);
        setIntField(term3985015, term3985015.getClass(), "playerRating", 1006683431);
        setLongField(term3985015, term3985015.getClass(), "playedUserId1", -8561221598219279683L);
        setField(term3985015, term3985015.getClass(), "playedUserName1", "vwvrsKQBZy");
        setIntField(term3985015, term3985015.getClass(), "playedMusicLevel1", 165875617);
        setLongField(term3985015, term3985015.getClass(), "playedUserId2", -4482565374775916222L);
        setField(term3985015, term3985015.getClass(), "playedUserName2", "tOmBAuMNqc");
        setIntField(term3985015, term3985015.getClass(), "playedMusicLevel2", -1931715680);
        setLongField(term3985015, term3985015.getClass(), "playedUserId3", -1734222437321042854L);
        setField(term3985015, term3985015.getClass(), "playedUserName3", "FsXQnuGklD");
        setIntField(term3985015, term3985015.getClass(), "playedMusicLevel3", -158521533);
        setIntField(term3985015, term3985015.getClass(), "achievement", 1858293761);
        setIntField(term3985015, term3985015.getClass(), "score", -1403524676);
        setIntField(term3985015, term3985015.getClass(), "tapScore", 449646245);
        setIntField(term3985015, term3985015.getClass(), "holdScore", 1569070292);
        setIntField(term3985015, term3985015.getClass(), "slideScore", 397575012);
        setIntField(term3985015, term3985015.getClass(), "breakScore", -1106776015);
        setIntField(term3985015, term3985015.getClass(), "syncRate", 697193354);
        setIntField(term3985015, term3985015.getClass(), "vsWin", -1648620595);
        setBooleanField(term3985015, term3985015.getClass(), "isAllPerfect", false);
        setIntField(term3985015, term3985015.getClass(), "fullCombo", 835987200);
        setIntField(term3985015, term3985015.getClass(), "maxFever", -1201975367);
        setIntField(term3985015, term3985015.getClass(), "maxCombo", -2049611302);
        setIntField(term3985015, term3985015.getClass(), "tapPerfect", 825490218);
        setIntField(term3985015, term3985015.getClass(), "tapGreat", -1000327245);
        setIntField(term3985015, term3985015.getClass(), "tapGood", -2116078568);
        setIntField(term3985015, term3985015.getClass(), "tapBad", -769964949);
        setIntField(term3985015, term3985015.getClass(), "holdPerfect", 1431174659);
        setIntField(term3985015, term3985015.getClass(), "holdGreat", -1716772271);
        setIntField(term3985015, term3985015.getClass(), "holdGood", -873863792);
        setIntField(term3985015, term3985015.getClass(), "holdBad", -1763488832);
        setIntField(term3985015, term3985015.getClass(), "slidePerfect", 2008797217);
        setIntField(term3985015, term3985015.getClass(), "slideGreat", -448239960);
        setIntField(term3985015, term3985015.getClass(), "slideGood", 761186710);
        setIntField(term3985015, term3985015.getClass(), "slideBad", 2126602926);
        setIntField(term3985015, term3985015.getClass(), "breakPerfect", -1402198061);
        setIntField(term3985015, term3985015.getClass(), "breakGreat", 740746942);
        setIntField(term3985015, term3985015.getClass(), "breakGood", 1894070984);
        setIntField(term3985015, term3985015.getClass(), "breakBad", -1767304895);
        setBooleanField(term3985015, term3985015.getClass(), "isTrackSkip", false);
        setBooleanField(term3985015, term3985015.getClass(), "isHighScore", true);
        setBooleanField(term3985015, term3985015.getClass(), "isChallengeTrack", true);
        setIntField(term3985015, term3985015.getClass(), "challengeLife", 1912131842);
        setIntField(term3985015, term3985015.getClass(), "challengeRemain", 574645852);
        setIntField(term3985015, term3985015.getClass(), "isAllPerfectPlus", -1432327139);
        term3985327 = new Integer(1330248159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3985327;
        callMethod(klass, "setFullCombo", argTypes, term3985015, args);
    }

};


