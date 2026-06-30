package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class UserEventMusic_setTechNewRecord_148716842020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378563;
     Object term378847;

    public UserEventMusic_setTechNewRecord_148716842020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term378569 = new Long(3128610259359668233L);
        term378563 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term378565 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term378567 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term378583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term378584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term378588 = newInstance(Class.forName("java.time.LocalTime"));
        Object term378593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term378594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term378598 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term378563, term378563.getClass(), "id", 2026317964392995043L);
        setLongField(term378565, term378565.getClass(), "id", 858523291108418381L);
        setLongField(term378567, term378567.getClass(), "id", 5975556138550634769L);
        setField(term378567, term378567.getClass(), "extId", term378569);
        setField(term378567, term378567.getClass(), "luid", "DcPLzEXYrK");
        setIntField(term378584, term378584.getClass(), "year", 2029);
        setShortField(term378584, term378584.getClass(), "month", (short) 6);
        setShortField(term378584, term378584.getClass(), "day", (short) 11);
        setField(term378583, term378583.getClass(), "date", term378584);
        setByteField(term378588, term378588.getClass(), "hour", (byte) 22);
        setByteField(term378588, term378588.getClass(), "minute", (byte) 38);
        setByteField(term378588, term378588.getClass(), "second", (byte) 13);
        setIntField(term378588, term378588.getClass(), "nano", 101141847);
        setField(term378583, term378583.getClass(), "time", term378588);
        setField(term378567, term378567.getClass(), "registerTime", term378583);
        setIntField(term378594, term378594.getClass(), "year", 2017);
        setShortField(term378594, term378594.getClass(), "month", (short) 10);
        setShortField(term378594, term378594.getClass(), "day", (short) 14);
        setField(term378593, term378593.getClass(), "date", term378594);
        setByteField(term378598, term378598.getClass(), "hour", (byte) 18);
        setByteField(term378598, term378598.getClass(), "minute", (byte) 58);
        setByteField(term378598, term378598.getClass(), "second", (byte) 22);
        setIntField(term378598, term378598.getClass(), "nano", 778898330);
        setField(term378593, term378593.getClass(), "time", term378598);
        setField(term378567, term378567.getClass(), "accessTime", term378593);
        setField(term378565, term378565.getClass(), "card", term378567);
        setField(term378565, term378565.getClass(), "userName", "PqFWgRqqGK");
        setIntField(term378565, term378565.getClass(), "level", 800565822);
        setIntField(term378565, term378565.getClass(), "reincarnationNum", 731707735);
        setLongField(term378565, term378565.getClass(), "exp", -3910633717055441222L);
        setLongField(term378565, term378565.getClass(), "point", 259929300541589690L);
        setLongField(term378565, term378565.getClass(), "totalPoint", -6301412485678445741L);
        setIntField(term378565, term378565.getClass(), "playCount", -503364496);
        setIntField(term378565, term378565.getClass(), "jewelCount", -1346047153);
        setIntField(term378565, term378565.getClass(), "totalJewelCount", -1416192380);
        setIntField(term378565, term378565.getClass(), "medalCount", 70873332);
        setIntField(term378565, term378565.getClass(), "playerRating", 248312673);
        setIntField(term378565, term378565.getClass(), "highestRating", -594743265);
        setIntField(term378565, term378565.getClass(), "battlePoint", 172651130);
        setIntField(term378565, term378565.getClass(), "bestBattlePoint", -955992433);
        setIntField(term378565, term378565.getClass(), "overDamageBattlePoint", -1082497899);
        setBooleanField(term378565, term378565.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term378565, term378565.getClass(), "nameplateId", -2130409456);
        setIntField(term378565, term378565.getClass(), "trophyId", -1545576134);
        setIntField(term378565, term378565.getClass(), "cardId", -1652169782);
        setIntField(term378565, term378565.getClass(), "characterId", -1461891877);
        setIntField(term378565, term378565.getClass(), "characterVoiceNo", -143580747);
        setIntField(term378565, term378565.getClass(), "tabSetting", -779798491);
        setIntField(term378565, term378565.getClass(), "tabSortSetting", 1262306445);
        setIntField(term378565, term378565.getClass(), "cardCategorySetting", -645057754);
        setIntField(term378565, term378565.getClass(), "cardSortSetting", -1619238473);
        setIntField(term378565, term378565.getClass(), "rivalScoreCategorySetting", 821185320);
        setIntField(term378565, term378565.getClass(), "playedTutorialBit", -315789323);
        setIntField(term378565, term378565.getClass(), "firstTutorialCancelNum", 211699824);
        setLongField(term378565, term378565.getClass(), "sumTechHighScore", -5948238139351226561L);
        setLongField(term378565, term378565.getClass(), "sumTechBasicHighScore", 2397685638733894535L);
        setLongField(term378565, term378565.getClass(), "sumTechAdvancedHighScore", -2146635739759943902L);
        setLongField(term378565, term378565.getClass(), "sumTechExpertHighScore", -3197499330869098156L);
        setLongField(term378565, term378565.getClass(), "sumTechMasterHighScore", -9196310872382317076L);
        setLongField(term378565, term378565.getClass(), "sumTechLunaticHighScore", 4400559548380639944L);
        setLongField(term378565, term378565.getClass(), "sumBattleHighScore", 8465596014004823632L);
        setLongField(term378565, term378565.getClass(), "sumBattleBasicHighScore", 8880959804533254852L);
        setLongField(term378565, term378565.getClass(), "sumBattleAdvancedHighScore", 6959731145246150800L);
        setLongField(term378565, term378565.getClass(), "sumBattleExpertHighScore", -7673373038554959357L);
        setLongField(term378565, term378565.getClass(), "sumBattleMasterHighScore", 2093059387784621343L);
        setLongField(term378565, term378565.getClass(), "sumBattleLunaticHighScore", 8388264505615567962L);
        setField(term378565, term378565.getClass(), "eventWatchedDate", "iUiqROQvua");
        setField(term378565, term378565.getClass(), "cmEventWatchedDate", "tNxgmRhIcN");
        setField(term378565, term378565.getClass(), "firstGameId", "BovbePKRjG");
        setField(term378565, term378565.getClass(), "firstRomVersion", "tzYzntrZvY");
        setField(term378565, term378565.getClass(), "firstDataVersion", "ALpGpsJyIc");
        setField(term378565, term378565.getClass(), "firstPlayDate", "xGFzxRHdJV");
        setField(term378565, term378565.getClass(), "lastGameId", "WrWVfVhVRp");
        setField(term378565, term378565.getClass(), "lastRomVersion", "hzlOcutDCG");
        setField(term378565, term378565.getClass(), "lastDataVersion", "ZwCSqLBiYc");
        setField(term378565, term378565.getClass(), "compatibleCmVersion", "JRQlLonBxC");
        setField(term378565, term378565.getClass(), "lastPlayDate", "DtcbgxVotW");
        setIntField(term378565, term378565.getClass(), "lastPlaceId", -1276580123);
        setField(term378565, term378565.getClass(), "lastPlaceName", "XgtkWJhDrr");
        setIntField(term378565, term378565.getClass(), "lastRegionId", 620685633);
        setField(term378565, term378565.getClass(), "lastRegionName", "aoJqAZOUJz");
        setIntField(term378565, term378565.getClass(), "lastAllNetId", 1210612876);
        setField(term378565, term378565.getClass(), "lastClientId", "WsATyGNPZU");
        setIntField(term378565, term378565.getClass(), "lastUsedDeckId", -1789437478);
        setIntField(term378565, term378565.getClass(), "lastPlayMusicLevel", -1882791026);
        setIntField(term378565, term378565.getClass(), "lastEmoneyBrand", -1137306303);
        setField(term378563, term378563.getClass(), "user", term378565);
        setIntField(term378563, term378563.getClass(), "eventId", -952122437);
        setIntField(term378563, term378563.getClass(), "type", -447594217);
        setIntField(term378563, term378563.getClass(), "musicId", 1131249682);
        setIntField(term378563, term378563.getClass(), "level", 1846052563);
        setIntField(term378563, term378563.getClass(), "techScoreMax", 1588062332);
        setIntField(term378563, term378563.getClass(), "platinumScoreMax", 1267234571);
        setField(term378563, term378563.getClass(), "techRecordDate", "DANmFlRIuU");
        setBooleanField(term378563, term378563.getClass(), "isTechNewRecord", false);
        term378847 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term378847;
        callMethod(klass, "setTechNewRecord", argTypes, term378563, args);
    }

};


