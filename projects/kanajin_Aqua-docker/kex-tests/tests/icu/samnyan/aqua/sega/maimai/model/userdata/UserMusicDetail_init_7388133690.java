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

public class UserMusicDetail_init_7388133690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179929;

    public UserMusicDetail_init_7388133690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term179933 = new Long(6269054578518955349L);
        term179929 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term179931 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term179947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179962 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term179929, term179929.getClass(), "id", 2629509803227198743L);
        setLongField(term179931, term179931.getClass(), "id", -8008739907583786665L);
        setField(term179931, term179931.getClass(), "extId", term179933);
        setField(term179931, term179931.getClass(), "luid", "lZNePPEWLC");
        setIntField(term179948, term179948.getClass(), "year", 2017);
        setShortField(term179948, term179948.getClass(), "month", (short) 11);
        setShortField(term179948, term179948.getClass(), "day", (short) 12);
        setField(term179947, term179947.getClass(), "date", term179948);
        setByteField(term179952, term179952.getClass(), "hour", (byte) 19);
        setByteField(term179952, term179952.getClass(), "minute", (byte) 40);
        setByteField(term179952, term179952.getClass(), "second", (byte) 41);
        setIntField(term179952, term179952.getClass(), "nano", 761400982);
        setField(term179947, term179947.getClass(), "time", term179952);
        setField(term179931, term179931.getClass(), "registerTime", term179947);
        setIntField(term179958, term179958.getClass(), "year", 2023);
        setShortField(term179958, term179958.getClass(), "month", (short) 11);
        setShortField(term179958, term179958.getClass(), "day", (short) 8);
        setField(term179957, term179957.getClass(), "date", term179958);
        setByteField(term179962, term179962.getClass(), "hour", (byte) 3);
        setByteField(term179962, term179962.getClass(), "minute", (byte) 26);
        setByteField(term179962, term179962.getClass(), "second", (byte) 27);
        setIntField(term179962, term179962.getClass(), "nano", 261817318);
        setField(term179957, term179957.getClass(), "time", term179962);
        setField(term179931, term179931.getClass(), "accessTime", term179957);
        setField(term179929, term179929.getClass(), "card", term179931);
        setIntField(term179929, term179929.getClass(), "lastDataVersion", 1887903859);
        setField(term179929, term179929.getClass(), "userName", "XyvyWBkpUr");
        setIntField(term179929, term179929.getClass(), "point", -1702430458);
        setIntField(term179929, term179929.getClass(), "totalPoint", 1128113590);
        setIntField(term179929, term179929.getClass(), "iconId", -1044834555);
        setIntField(term179929, term179929.getClass(), "nameplateId", -1554913778);
        setIntField(term179929, term179929.getClass(), "frameId", -1946117481);
        setIntField(term179929, term179929.getClass(), "trophyId", 522720000);
        setIntField(term179929, term179929.getClass(), "playCount", -1643147824);
        setIntField(term179929, term179929.getClass(), "playVsCount", -1375609313);
        setIntField(term179929, term179929.getClass(), "playSyncCount", -952677092);
        setIntField(term179929, term179929.getClass(), "winCount", -1099005330);
        setIntField(term179929, term179929.getClass(), "helpCount", 827777548);
        setIntField(term179929, term179929.getClass(), "comboCount", -907505121);
        setIntField(term179929, term179929.getClass(), "feverCount", -1356442537);
        setIntField(term179929, term179929.getClass(), "totalHiScore", -847995610);
        setIntField(term179929, term179929.getClass(), "totalEasyHighScore", -425664784);
        setIntField(term179929, term179929.getClass(), "totalBasicHighScore", 849439865);
        setIntField(term179929, term179929.getClass(), "totalAdvancedHighScore", 375631205);
        setIntField(term179929, term179929.getClass(), "totalExpertHighScore", 1577887474);
        setIntField(term179929, term179929.getClass(), "totalMasterHighScore", -1022687781);
        setIntField(term179929, term179929.getClass(), "totalReMasterHighScore", 1426559032);
        setIntField(term179929, term179929.getClass(), "totalHighSync", 260611687);
        setIntField(term179929, term179929.getClass(), "totalEasySync", 953810704);
        setIntField(term179929, term179929.getClass(), "totalBasicSync", 599646359);
        setIntField(term179929, term179929.getClass(), "totalAdvancedSync", -410716158);
        setIntField(term179929, term179929.getClass(), "totalExpertSync", 2107710563);
        setIntField(term179929, term179929.getClass(), "totalMasterSync", 405428805);
        setIntField(term179929, term179929.getClass(), "totalReMasterSync", -619138079);
        setIntField(term179929, term179929.getClass(), "playerRating", -1581248444);
        setIntField(term179929, term179929.getClass(), "highestRating", -2121192595);
        setIntField(term179929, term179929.getClass(), "rankAuthTailId", 700451384);
        setField(term179929, term179929.getClass(), "eventWatchedDate", "AuUQylJqWv");
        setField(term179929, term179929.getClass(), "webLimitDate", "gyZHokNAZb");
        setIntField(term179929, term179929.getClass(), "challengeTrackPhase", 1653036585);
        setIntField(term179929, term179929.getClass(), "firstPlayBits", -2008268626);
        setField(term179929, term179929.getClass(), "lastPlayDate", "BDiGllEiZb");
        setIntField(term179929, term179929.getClass(), "lastPlaceId", -1632789247);
        setField(term179929, term179929.getClass(), "lastPlaceName", "EmYykcYSYU");
        setIntField(term179929, term179929.getClass(), "lastRegionId", 454616572);
        setField(term179929, term179929.getClass(), "lastRegionName", "tmkiHdXIso");
        setField(term179929, term179929.getClass(), "lastClientId", "iivsdaIdLe");
        setField(term179929, term179929.getClass(), "lastCountryCode", "yNZErAgZDk");
        setIntField(term179929, term179929.getClass(), "eventPoint", -1978126699);
        setIntField(term179929, term179929.getClass(), "totalLv", 39131361);
        setIntField(term179929, term179929.getClass(), "lastLoginBonusDay", 213373107);
        setIntField(term179929, term179929.getClass(), "lastSurvivalBonusDay", -1923090);
        setIntField(term179929, term179929.getClass(), "loginBonusLv", 2076483659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term179929;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


