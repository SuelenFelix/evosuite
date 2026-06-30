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
import java.lang.Integer;

public class UserData_setTabSortSetting_80357158786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58408;
     Object term58671;

    public UserData_setTabSortSetting_80357158786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58412 = new Long(-1616722610139554082L);
        term58408 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term58410 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58431 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58441 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58408, term58408.getClass(), "id", -8545746620266373186L);
        setLongField(term58410, term58410.getClass(), "id", 2105501884913088990L);
        setField(term58410, term58410.getClass(), "extId", term58412);
        setField(term58410, term58410.getClass(), "luid", "bacruLIvDW");
        setIntField(term58427, term58427.getClass(), "year", 2022);
        setShortField(term58427, term58427.getClass(), "month", (short) 8);
        setShortField(term58427, term58427.getClass(), "day", (short) 16);
        setField(term58426, term58426.getClass(), "date", term58427);
        setByteField(term58431, term58431.getClass(), "hour", (byte) 4);
        setByteField(term58431, term58431.getClass(), "minute", (byte) 38);
        setByteField(term58431, term58431.getClass(), "second", (byte) 51);
        setIntField(term58431, term58431.getClass(), "nano", 348952212);
        setField(term58426, term58426.getClass(), "time", term58431);
        setField(term58410, term58410.getClass(), "registerTime", term58426);
        setIntField(term58437, term58437.getClass(), "year", 2016);
        setShortField(term58437, term58437.getClass(), "month", (short) 7);
        setShortField(term58437, term58437.getClass(), "day", (short) 21);
        setField(term58436, term58436.getClass(), "date", term58437);
        setByteField(term58441, term58441.getClass(), "hour", (byte) 22);
        setByteField(term58441, term58441.getClass(), "minute", (byte) 2);
        setByteField(term58441, term58441.getClass(), "second", (byte) 21);
        setIntField(term58441, term58441.getClass(), "nano", 729266668);
        setField(term58436, term58436.getClass(), "time", term58441);
        setField(term58410, term58410.getClass(), "accessTime", term58436);
        setField(term58408, term58408.getClass(), "card", term58410);
        setField(term58408, term58408.getClass(), "userName", "ydbVEuslYx");
        setIntField(term58408, term58408.getClass(), "level", -1370999464);
        setIntField(term58408, term58408.getClass(), "reincarnationNum", -409231949);
        setLongField(term58408, term58408.getClass(), "exp", -8124278437144435231L);
        setLongField(term58408, term58408.getClass(), "point", 7732659324628481307L);
        setLongField(term58408, term58408.getClass(), "totalPoint", -3474044978480774340L);
        setIntField(term58408, term58408.getClass(), "playCount", -666074929);
        setIntField(term58408, term58408.getClass(), "jewelCount", 1263172764);
        setIntField(term58408, term58408.getClass(), "totalJewelCount", 294155442);
        setIntField(term58408, term58408.getClass(), "medalCount", -790860079);
        setIntField(term58408, term58408.getClass(), "playerRating", 52653332);
        setIntField(term58408, term58408.getClass(), "highestRating", 605369567);
        setIntField(term58408, term58408.getClass(), "battlePoint", 662969700);
        setIntField(term58408, term58408.getClass(), "bestBattlePoint", -907171757);
        setIntField(term58408, term58408.getClass(), "overDamageBattlePoint", 1041315057);
        setBooleanField(term58408, term58408.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term58408, term58408.getClass(), "nameplateId", 5602462);
        setIntField(term58408, term58408.getClass(), "trophyId", 1573768776);
        setIntField(term58408, term58408.getClass(), "cardId", 1525686645);
        setIntField(term58408, term58408.getClass(), "characterId", -538376054);
        setIntField(term58408, term58408.getClass(), "characterVoiceNo", -159290084);
        setIntField(term58408, term58408.getClass(), "tabSetting", -1181936403);
        setIntField(term58408, term58408.getClass(), "tabSortSetting", 597843779);
        setIntField(term58408, term58408.getClass(), "cardCategorySetting", -920715260);
        setIntField(term58408, term58408.getClass(), "cardSortSetting", -111304359);
        setIntField(term58408, term58408.getClass(), "rivalScoreCategorySetting", -1359946362);
        setIntField(term58408, term58408.getClass(), "playedTutorialBit", 882866050);
        setIntField(term58408, term58408.getClass(), "firstTutorialCancelNum", -979923296);
        setLongField(term58408, term58408.getClass(), "sumTechHighScore", 775312077947534347L);
        setLongField(term58408, term58408.getClass(), "sumTechBasicHighScore", -2297509313118713445L);
        setLongField(term58408, term58408.getClass(), "sumTechAdvancedHighScore", 3418764832141465118L);
        setLongField(term58408, term58408.getClass(), "sumTechExpertHighScore", -5892867592432507702L);
        setLongField(term58408, term58408.getClass(), "sumTechMasterHighScore", -7416289304165255328L);
        setLongField(term58408, term58408.getClass(), "sumTechLunaticHighScore", 5413420475317965403L);
        setLongField(term58408, term58408.getClass(), "sumBattleHighScore", -3283999366140639273L);
        setLongField(term58408, term58408.getClass(), "sumBattleBasicHighScore", 2068458621990556070L);
        setLongField(term58408, term58408.getClass(), "sumBattleAdvancedHighScore", -3300207888965272273L);
        setLongField(term58408, term58408.getClass(), "sumBattleExpertHighScore", -79769691928375280L);
        setLongField(term58408, term58408.getClass(), "sumBattleMasterHighScore", -1725922435876771176L);
        setLongField(term58408, term58408.getClass(), "sumBattleLunaticHighScore", 3612026645709034896L);
        setField(term58408, term58408.getClass(), "eventWatchedDate", "DKWEhukBpG");
        setField(term58408, term58408.getClass(), "cmEventWatchedDate", "YaowqyqxBH");
        setField(term58408, term58408.getClass(), "firstGameId", "dbxhsKyZWZ");
        setField(term58408, term58408.getClass(), "firstRomVersion", "oXxafKyyrx");
        setField(term58408, term58408.getClass(), "firstDataVersion", "TapDFGQNLY");
        setField(term58408, term58408.getClass(), "firstPlayDate", "vgHeAegSfV");
        setField(term58408, term58408.getClass(), "lastGameId", "qShfKMgKGs");
        setField(term58408, term58408.getClass(), "lastRomVersion", "bLCaDnEUyS");
        setField(term58408, term58408.getClass(), "lastDataVersion", "yfHcOCDrGy");
        setField(term58408, term58408.getClass(), "compatibleCmVersion", "juKqILstcn");
        setField(term58408, term58408.getClass(), "lastPlayDate", "QSCQJRyiPa");
        setIntField(term58408, term58408.getClass(), "lastPlaceId", 1294282133);
        setField(term58408, term58408.getClass(), "lastPlaceName", "jPPOVoAOLQ");
        setIntField(term58408, term58408.getClass(), "lastRegionId", -1857786332);
        setField(term58408, term58408.getClass(), "lastRegionName", "kZKzEkUFFI");
        setIntField(term58408, term58408.getClass(), "lastAllNetId", 1307491791);
        setField(term58408, term58408.getClass(), "lastClientId", "dnYvoLZjCf");
        setIntField(term58408, term58408.getClass(), "lastUsedDeckId", 445813516);
        setIntField(term58408, term58408.getClass(), "lastPlayMusicLevel", 180030231);
        setIntField(term58408, term58408.getClass(), "lastEmoneyBrand", 645685543);
        term58671 = new Integer(-704733432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58671;
        callMethod(klass, "setTabSortSetting", argTypes, term58408, args);
    }

};


