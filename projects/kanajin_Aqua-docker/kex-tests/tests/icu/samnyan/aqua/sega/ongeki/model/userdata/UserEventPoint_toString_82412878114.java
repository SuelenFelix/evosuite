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

public class UserEventPoint_toString_82412878114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387966;

    public UserEventPoint_toString_82412878114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term387972 = new Long(6604328992663797314L);
        term387966 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term387968 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term387970 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term387986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term387991 = newInstance(Class.forName("java.time.LocalTime"));
        Object term387996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388001 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term387966, term387966.getClass(), "id", -6067082001796959158L);
        setLongField(term387968, term387968.getClass(), "id", -7276424232547626134L);
        setLongField(term387970, term387970.getClass(), "id", 676364876075086038L);
        setField(term387970, term387970.getClass(), "extId", term387972);
        setField(term387970, term387970.getClass(), "luid", "ihoAwSuVzH");
        setIntField(term387987, term387987.getClass(), "year", 2019);
        setShortField(term387987, term387987.getClass(), "month", (short) 1);
        setShortField(term387987, term387987.getClass(), "day", (short) 20);
        setField(term387986, term387986.getClass(), "date", term387987);
        setByteField(term387991, term387991.getClass(), "hour", (byte) 17);
        setByteField(term387991, term387991.getClass(), "minute", (byte) 34);
        setByteField(term387991, term387991.getClass(), "second", (byte) 21);
        setIntField(term387991, term387991.getClass(), "nano", 550399941);
        setField(term387986, term387986.getClass(), "time", term387991);
        setField(term387970, term387970.getClass(), "registerTime", term387986);
        setIntField(term387997, term387997.getClass(), "year", 2011);
        setShortField(term387997, term387997.getClass(), "month", (short) 1);
        setShortField(term387997, term387997.getClass(), "day", (short) 25);
        setField(term387996, term387996.getClass(), "date", term387997);
        setByteField(term388001, term388001.getClass(), "hour", (byte) 7);
        setByteField(term388001, term388001.getClass(), "minute", (byte) 52);
        setByteField(term388001, term388001.getClass(), "second", (byte) 12);
        setIntField(term388001, term388001.getClass(), "nano", 203730838);
        setField(term387996, term387996.getClass(), "time", term388001);
        setField(term387970, term387970.getClass(), "accessTime", term387996);
        setField(term387968, term387968.getClass(), "card", term387970);
        setField(term387968, term387968.getClass(), "userName", "SlEMOrWMqu");
        setIntField(term387968, term387968.getClass(), "level", -1399482265);
        setIntField(term387968, term387968.getClass(), "reincarnationNum", 1397465539);
        setLongField(term387968, term387968.getClass(), "exp", -1157097621859579574L);
        setLongField(term387968, term387968.getClass(), "point", 6939356680689700932L);
        setLongField(term387968, term387968.getClass(), "totalPoint", 5922211542960125432L);
        setIntField(term387968, term387968.getClass(), "playCount", -1855916801);
        setIntField(term387968, term387968.getClass(), "jewelCount", 949897561);
        setIntField(term387968, term387968.getClass(), "totalJewelCount", 538023207);
        setIntField(term387968, term387968.getClass(), "medalCount", 1152865337);
        setIntField(term387968, term387968.getClass(), "playerRating", 141523148);
        setIntField(term387968, term387968.getClass(), "highestRating", -1270260957);
        setIntField(term387968, term387968.getClass(), "battlePoint", 1831764859);
        setIntField(term387968, term387968.getClass(), "bestBattlePoint", 1530094597);
        setIntField(term387968, term387968.getClass(), "overDamageBattlePoint", -139538372);
        setBooleanField(term387968, term387968.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term387968, term387968.getClass(), "nameplateId", -1274894318);
        setIntField(term387968, term387968.getClass(), "trophyId", 187784395);
        setIntField(term387968, term387968.getClass(), "cardId", -117079751);
        setIntField(term387968, term387968.getClass(), "characterId", -686894445);
        setIntField(term387968, term387968.getClass(), "characterVoiceNo", 1892785074);
        setIntField(term387968, term387968.getClass(), "tabSetting", 1574277346);
        setIntField(term387968, term387968.getClass(), "tabSortSetting", -803619709);
        setIntField(term387968, term387968.getClass(), "cardCategorySetting", 1387125533);
        setIntField(term387968, term387968.getClass(), "cardSortSetting", 1717132325);
        setIntField(term387968, term387968.getClass(), "rivalScoreCategorySetting", -1664418040);
        setIntField(term387968, term387968.getClass(), "playedTutorialBit", -1763865422);
        setIntField(term387968, term387968.getClass(), "firstTutorialCancelNum", -1598113184);
        setLongField(term387968, term387968.getClass(), "sumTechHighScore", 4553373108835517989L);
        setLongField(term387968, term387968.getClass(), "sumTechBasicHighScore", 9161962548316107236L);
        setLongField(term387968, term387968.getClass(), "sumTechAdvancedHighScore", 7141442525499950819L);
        setLongField(term387968, term387968.getClass(), "sumTechExpertHighScore", 6121838523698651314L);
        setLongField(term387968, term387968.getClass(), "sumTechMasterHighScore", -30134950497823483L);
        setLongField(term387968, term387968.getClass(), "sumTechLunaticHighScore", -1812489713295652324L);
        setLongField(term387968, term387968.getClass(), "sumBattleHighScore", 8168089975347125937L);
        setLongField(term387968, term387968.getClass(), "sumBattleBasicHighScore", -5954720892613714665L);
        setLongField(term387968, term387968.getClass(), "sumBattleAdvancedHighScore", 4404692870238990194L);
        setLongField(term387968, term387968.getClass(), "sumBattleExpertHighScore", -1578812986255146700L);
        setLongField(term387968, term387968.getClass(), "sumBattleMasterHighScore", -1233372303307752901L);
        setLongField(term387968, term387968.getClass(), "sumBattleLunaticHighScore", 7550637104318339657L);
        setField(term387968, term387968.getClass(), "eventWatchedDate", "dICwGxmbed");
        setField(term387968, term387968.getClass(), "cmEventWatchedDate", "ThdDsgJwxp");
        setField(term387968, term387968.getClass(), "firstGameId", "EWQVfrBNvH");
        setField(term387968, term387968.getClass(), "firstRomVersion", "QYKsbdDOhX");
        setField(term387968, term387968.getClass(), "firstDataVersion", "cePAqRyhPW");
        setField(term387968, term387968.getClass(), "firstPlayDate", "qQjOxlALbn");
        setField(term387968, term387968.getClass(), "lastGameId", "RjLLZgoOGt");
        setField(term387968, term387968.getClass(), "lastRomVersion", "GUJGYdipCF");
        setField(term387968, term387968.getClass(), "lastDataVersion", "FbDRmpukis");
        setField(term387968, term387968.getClass(), "compatibleCmVersion", "fZTNyFgzzZ");
        setField(term387968, term387968.getClass(), "lastPlayDate", "OOkGaEspzw");
        setIntField(term387968, term387968.getClass(), "lastPlaceId", -261802681);
        setField(term387968, term387968.getClass(), "lastPlaceName", "MrYwFptZDK");
        setIntField(term387968, term387968.getClass(), "lastRegionId", 233958480);
        setField(term387968, term387968.getClass(), "lastRegionName", "uBVmxblEsT");
        setIntField(term387968, term387968.getClass(), "lastAllNetId", -1601755015);
        setField(term387968, term387968.getClass(), "lastClientId", "FQUZchWNwW");
        setIntField(term387968, term387968.getClass(), "lastUsedDeckId", 725616272);
        setIntField(term387968, term387968.getClass(), "lastPlayMusicLevel", 53350929);
        setIntField(term387968, term387968.getClass(), "lastEmoneyBrand", -2043704531);
        setField(term387966, term387966.getClass(), "user", term387968);
        setIntField(term387966, term387966.getClass(), "eventId", -36554639);
        setLongField(term387966, term387966.getClass(), "point", -8326148311543709780L);
        setBooleanField(term387966, term387966.getClass(), "isRankingRewarded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term387966, args);
    }

};


