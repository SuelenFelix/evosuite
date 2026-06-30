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

public class UserData_getCardCategorySetting_15162709825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32493;

    public UserData_getCardCategorySetting_15162709825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32497 = new Long(682356318767179819L);
        term32493 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term32495 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term32511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32526 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term32493, term32493.getClass(), "id", 8761438573959719489L);
        setLongField(term32495, term32495.getClass(), "id", -6772311116874630960L);
        setField(term32495, term32495.getClass(), "extId", term32497);
        setField(term32495, term32495.getClass(), "luid", "vAxcpvjEEa");
        setIntField(term32512, term32512.getClass(), "year", 2018);
        setShortField(term32512, term32512.getClass(), "month", (short) 9);
        setShortField(term32512, term32512.getClass(), "day", (short) 3);
        setField(term32511, term32511.getClass(), "date", term32512);
        setByteField(term32516, term32516.getClass(), "hour", (byte) 16);
        setByteField(term32516, term32516.getClass(), "minute", (byte) 48);
        setByteField(term32516, term32516.getClass(), "second", (byte) 45);
        setIntField(term32516, term32516.getClass(), "nano", 919694917);
        setField(term32511, term32511.getClass(), "time", term32516);
        setField(term32495, term32495.getClass(), "registerTime", term32511);
        setIntField(term32522, term32522.getClass(), "year", 2021);
        setShortField(term32522, term32522.getClass(), "month", (short) 8);
        setShortField(term32522, term32522.getClass(), "day", (short) 23);
        setField(term32521, term32521.getClass(), "date", term32522);
        setByteField(term32526, term32526.getClass(), "hour", (byte) 15);
        setByteField(term32526, term32526.getClass(), "minute", (byte) 43);
        setByteField(term32526, term32526.getClass(), "second", (byte) 10);
        setIntField(term32526, term32526.getClass(), "nano", 893504165);
        setField(term32521, term32521.getClass(), "time", term32526);
        setField(term32495, term32495.getClass(), "accessTime", term32521);
        setField(term32493, term32493.getClass(), "card", term32495);
        setField(term32493, term32493.getClass(), "userName", "FCkOgIBqXE");
        setIntField(term32493, term32493.getClass(), "level", -1568339070);
        setIntField(term32493, term32493.getClass(), "reincarnationNum", -1427059961);
        setLongField(term32493, term32493.getClass(), "exp", 6971596090562280868L);
        setLongField(term32493, term32493.getClass(), "point", 7340409588443647231L);
        setLongField(term32493, term32493.getClass(), "totalPoint", 8307567070673352896L);
        setIntField(term32493, term32493.getClass(), "playCount", 1120685189);
        setIntField(term32493, term32493.getClass(), "jewelCount", 654585209);
        setIntField(term32493, term32493.getClass(), "totalJewelCount", -1661685401);
        setIntField(term32493, term32493.getClass(), "medalCount", 1427434947);
        setIntField(term32493, term32493.getClass(), "playerRating", 2130990985);
        setIntField(term32493, term32493.getClass(), "highestRating", 523197189);
        setIntField(term32493, term32493.getClass(), "battlePoint", 658684460);
        setIntField(term32493, term32493.getClass(), "bestBattlePoint", 2073367039);
        setIntField(term32493, term32493.getClass(), "overDamageBattlePoint", -365877126);
        setBooleanField(term32493, term32493.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term32493, term32493.getClass(), "nameplateId", 251018856);
        setIntField(term32493, term32493.getClass(), "trophyId", -1965331640);
        setIntField(term32493, term32493.getClass(), "cardId", -514392629);
        setIntField(term32493, term32493.getClass(), "characterId", -166633123);
        setIntField(term32493, term32493.getClass(), "characterVoiceNo", 373110517);
        setIntField(term32493, term32493.getClass(), "tabSetting", -1632703926);
        setIntField(term32493, term32493.getClass(), "tabSortSetting", -1031499401);
        setIntField(term32493, term32493.getClass(), "cardCategorySetting", 280202002);
        setIntField(term32493, term32493.getClass(), "cardSortSetting", -1074402599);
        setIntField(term32493, term32493.getClass(), "rivalScoreCategorySetting", -1867539151);
        setIntField(term32493, term32493.getClass(), "playedTutorialBit", -816430246);
        setIntField(term32493, term32493.getClass(), "firstTutorialCancelNum", 1754193865);
        setLongField(term32493, term32493.getClass(), "sumTechHighScore", 7685476896447838804L);
        setLongField(term32493, term32493.getClass(), "sumTechBasicHighScore", -7583612555465533678L);
        setLongField(term32493, term32493.getClass(), "sumTechAdvancedHighScore", -1040140369921518682L);
        setLongField(term32493, term32493.getClass(), "sumTechExpertHighScore", 4591729712990322550L);
        setLongField(term32493, term32493.getClass(), "sumTechMasterHighScore", -1013072826351726812L);
        setLongField(term32493, term32493.getClass(), "sumTechLunaticHighScore", 4992284695861622180L);
        setLongField(term32493, term32493.getClass(), "sumBattleHighScore", -6376003179103732362L);
        setLongField(term32493, term32493.getClass(), "sumBattleBasicHighScore", -2050936198165389315L);
        setLongField(term32493, term32493.getClass(), "sumBattleAdvancedHighScore", -8751837616810275039L);
        setLongField(term32493, term32493.getClass(), "sumBattleExpertHighScore", -8676733724224510585L);
        setLongField(term32493, term32493.getClass(), "sumBattleMasterHighScore", 1318139313166175279L);
        setLongField(term32493, term32493.getClass(), "sumBattleLunaticHighScore", 1712520441197520950L);
        setField(term32493, term32493.getClass(), "eventWatchedDate", "kadRHthQRD");
        setField(term32493, term32493.getClass(), "cmEventWatchedDate", "cGbJSRSpNn");
        setField(term32493, term32493.getClass(), "firstGameId", "MzXzaqaiHW");
        setField(term32493, term32493.getClass(), "firstRomVersion", "jWOWtrhVkA");
        setField(term32493, term32493.getClass(), "firstDataVersion", "IyOhWYyaDV");
        setField(term32493, term32493.getClass(), "firstPlayDate", "omWrkCSFzy");
        setField(term32493, term32493.getClass(), "lastGameId", "VFYvUTgYFB");
        setField(term32493, term32493.getClass(), "lastRomVersion", "BrWqhEIUUj");
        setField(term32493, term32493.getClass(), "lastDataVersion", "WfUmxdiHcU");
        setField(term32493, term32493.getClass(), "compatibleCmVersion", "BRrftvRvmF");
        setField(term32493, term32493.getClass(), "lastPlayDate", "fvoyRbZTsm");
        setIntField(term32493, term32493.getClass(), "lastPlaceId", 25277058);
        setField(term32493, term32493.getClass(), "lastPlaceName", "iOCnOQXWTl");
        setIntField(term32493, term32493.getClass(), "lastRegionId", -949634053);
        setField(term32493, term32493.getClass(), "lastRegionName", "ARnOWpgtAg");
        setIntField(term32493, term32493.getClass(), "lastAllNetId", 1495471055);
        setField(term32493, term32493.getClass(), "lastClientId", "MRrYxZoJBW");
        setIntField(term32493, term32493.getClass(), "lastUsedDeckId", -583415628);
        setIntField(term32493, term32493.getClass(), "lastPlayMusicLevel", -1488660931);
        setIntField(term32493, term32493.getClass(), "lastEmoneyBrand", 1899095931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardCategorySetting", argTypes, term32493, args);
    }

};


