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

public class UserGeneralData_getUser_14801794182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294682;

    public UserGeneralData_getUser_14801794182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term294688 = new Long(-723697646775816649L);
        term294682 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term294684 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term294686 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term294702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term294712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294717 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term294682, term294682.getClass(), "id", 6725388730256212913L);
        setLongField(term294684, term294684.getClass(), "id", 1994335402268175601L);
        setLongField(term294686, term294686.getClass(), "id", 3726689887447160693L);
        setField(term294686, term294686.getClass(), "extId", term294688);
        setField(term294686, term294686.getClass(), "luid", "bpCsiZxavU");
        setIntField(term294703, term294703.getClass(), "year", 2010);
        setShortField(term294703, term294703.getClass(), "month", (short) 4);
        setShortField(term294703, term294703.getClass(), "day", (short) 27);
        setField(term294702, term294702.getClass(), "date", term294703);
        setByteField(term294707, term294707.getClass(), "hour", (byte) 7);
        setByteField(term294707, term294707.getClass(), "minute", (byte) 46);
        setByteField(term294707, term294707.getClass(), "second", (byte) 12);
        setIntField(term294707, term294707.getClass(), "nano", 423349196);
        setField(term294702, term294702.getClass(), "time", term294707);
        setField(term294686, term294686.getClass(), "registerTime", term294702);
        setIntField(term294713, term294713.getClass(), "year", 2013);
        setShortField(term294713, term294713.getClass(), "month", (short) 4);
        setShortField(term294713, term294713.getClass(), "day", (short) 25);
        setField(term294712, term294712.getClass(), "date", term294713);
        setByteField(term294717, term294717.getClass(), "hour", (byte) 8);
        setByteField(term294717, term294717.getClass(), "minute", (byte) 54);
        setByteField(term294717, term294717.getClass(), "second", (byte) 36);
        setIntField(term294717, term294717.getClass(), "nano", 74426342);
        setField(term294712, term294712.getClass(), "time", term294717);
        setField(term294686, term294686.getClass(), "accessTime", term294712);
        setField(term294684, term294684.getClass(), "card", term294686);
        setField(term294684, term294684.getClass(), "userName", "GkQIPePZVq");
        setIntField(term294684, term294684.getClass(), "level", 1259656699);
        setIntField(term294684, term294684.getClass(), "reincarnationNum", -759058640);
        setLongField(term294684, term294684.getClass(), "exp", -6025207361180025216L);
        setLongField(term294684, term294684.getClass(), "point", 994775940187195831L);
        setLongField(term294684, term294684.getClass(), "totalPoint", -1058183343450957443L);
        setIntField(term294684, term294684.getClass(), "playCount", -783182633);
        setIntField(term294684, term294684.getClass(), "jewelCount", -1856665425);
        setIntField(term294684, term294684.getClass(), "totalJewelCount", -1153683909);
        setIntField(term294684, term294684.getClass(), "medalCount", -264250668);
        setIntField(term294684, term294684.getClass(), "playerRating", -532534050);
        setIntField(term294684, term294684.getClass(), "highestRating", -1683059678);
        setIntField(term294684, term294684.getClass(), "battlePoint", -1860569030);
        setIntField(term294684, term294684.getClass(), "bestBattlePoint", 14617348);
        setIntField(term294684, term294684.getClass(), "overDamageBattlePoint", -900613464);
        setBooleanField(term294684, term294684.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term294684, term294684.getClass(), "nameplateId", -786176511);
        setIntField(term294684, term294684.getClass(), "trophyId", 530888631);
        setIntField(term294684, term294684.getClass(), "cardId", 1412339114);
        setIntField(term294684, term294684.getClass(), "characterId", -42518734);
        setIntField(term294684, term294684.getClass(), "characterVoiceNo", -1407031176);
        setIntField(term294684, term294684.getClass(), "tabSetting", 1431569265);
        setIntField(term294684, term294684.getClass(), "tabSortSetting", 542764580);
        setIntField(term294684, term294684.getClass(), "cardCategorySetting", 1882226152);
        setIntField(term294684, term294684.getClass(), "cardSortSetting", -750940342);
        setIntField(term294684, term294684.getClass(), "rivalScoreCategorySetting", 1784843025);
        setIntField(term294684, term294684.getClass(), "playedTutorialBit", 734003031);
        setIntField(term294684, term294684.getClass(), "firstTutorialCancelNum", 877764390);
        setLongField(term294684, term294684.getClass(), "sumTechHighScore", -4563243017607970407L);
        setLongField(term294684, term294684.getClass(), "sumTechBasicHighScore", -8498783503531468337L);
        setLongField(term294684, term294684.getClass(), "sumTechAdvancedHighScore", -3073862778475939760L);
        setLongField(term294684, term294684.getClass(), "sumTechExpertHighScore", 8014802640590655532L);
        setLongField(term294684, term294684.getClass(), "sumTechMasterHighScore", 4346311007857286699L);
        setLongField(term294684, term294684.getClass(), "sumTechLunaticHighScore", 8888432200436209852L);
        setLongField(term294684, term294684.getClass(), "sumBattleHighScore", -6613985639532213291L);
        setLongField(term294684, term294684.getClass(), "sumBattleBasicHighScore", -5072056614831867908L);
        setLongField(term294684, term294684.getClass(), "sumBattleAdvancedHighScore", -5435770705402215466L);
        setLongField(term294684, term294684.getClass(), "sumBattleExpertHighScore", -7049285402358930971L);
        setLongField(term294684, term294684.getClass(), "sumBattleMasterHighScore", -2388868716901988257L);
        setLongField(term294684, term294684.getClass(), "sumBattleLunaticHighScore", -2195897699190485172L);
        setField(term294684, term294684.getClass(), "eventWatchedDate", "sNCvwCZLFy");
        setField(term294684, term294684.getClass(), "cmEventWatchedDate", "ntVwFBVYrW");
        setField(term294684, term294684.getClass(), "firstGameId", "HlALosrXEr");
        setField(term294684, term294684.getClass(), "firstRomVersion", "qOjvdcWKrI");
        setField(term294684, term294684.getClass(), "firstDataVersion", "XBGzXdRVOP");
        setField(term294684, term294684.getClass(), "firstPlayDate", "vdgGisWgKr");
        setField(term294684, term294684.getClass(), "lastGameId", "zARCfPQBXQ");
        setField(term294684, term294684.getClass(), "lastRomVersion", "jCvumyMZwu");
        setField(term294684, term294684.getClass(), "lastDataVersion", "pUOexalUMM");
        setField(term294684, term294684.getClass(), "compatibleCmVersion", "IKkHVBybPv");
        setField(term294684, term294684.getClass(), "lastPlayDate", "uDfBwiLidX");
        setIntField(term294684, term294684.getClass(), "lastPlaceId", 1766341128);
        setField(term294684, term294684.getClass(), "lastPlaceName", "LkaxztUhKP");
        setIntField(term294684, term294684.getClass(), "lastRegionId", -225437881);
        setField(term294684, term294684.getClass(), "lastRegionName", "JAiMiiwIyd");
        setIntField(term294684, term294684.getClass(), "lastAllNetId", 31298314);
        setField(term294684, term294684.getClass(), "lastClientId", "HZEoZFSfys");
        setIntField(term294684, term294684.getClass(), "lastUsedDeckId", -1323804933);
        setIntField(term294684, term294684.getClass(), "lastPlayMusicLevel", -1191029377);
        setIntField(term294684, term294684.getClass(), "lastEmoneyBrand", -884938702);
        setField(term294682, term294682.getClass(), "user", term294684);
        setField(term294682, term294682.getClass(), "propertyKey", "usGpZUqeig");
        setField(term294682, term294682.getClass(), "propertyValue", "zshYTmGpAb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term294682, args);
    }

};


