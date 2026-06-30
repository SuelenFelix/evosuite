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

public class UserData_getSumBattleMasterHighScore_178627150340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38838;

    public UserData_getSumBattleMasterHighScore_178627150340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38842 = new Long(846579494941632714L);
        term38838 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term38840 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38871 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38838, term38838.getClass(), "id", 316148538598902256L);
        setLongField(term38840, term38840.getClass(), "id", -3355803345734534021L);
        setField(term38840, term38840.getClass(), "extId", term38842);
        setField(term38840, term38840.getClass(), "luid", "uYnmxkwLfB");
        setIntField(term38857, term38857.getClass(), "year", 2019);
        setShortField(term38857, term38857.getClass(), "month", (short) 7);
        setShortField(term38857, term38857.getClass(), "day", (short) 4);
        setField(term38856, term38856.getClass(), "date", term38857);
        setByteField(term38861, term38861.getClass(), "hour", (byte) 19);
        setByteField(term38861, term38861.getClass(), "minute", (byte) 20);
        setByteField(term38861, term38861.getClass(), "second", (byte) 59);
        setIntField(term38861, term38861.getClass(), "nano", 246784352);
        setField(term38856, term38856.getClass(), "time", term38861);
        setField(term38840, term38840.getClass(), "registerTime", term38856);
        setIntField(term38867, term38867.getClass(), "year", 2023);
        setShortField(term38867, term38867.getClass(), "month", (short) 7);
        setShortField(term38867, term38867.getClass(), "day", (short) 1);
        setField(term38866, term38866.getClass(), "date", term38867);
        setByteField(term38871, term38871.getClass(), "hour", (byte) 4);
        setByteField(term38871, term38871.getClass(), "minute", (byte) 33);
        setByteField(term38871, term38871.getClass(), "second", (byte) 9);
        setIntField(term38871, term38871.getClass(), "nano", 94365310);
        setField(term38866, term38866.getClass(), "time", term38871);
        setField(term38840, term38840.getClass(), "accessTime", term38866);
        setField(term38838, term38838.getClass(), "card", term38840);
        setField(term38838, term38838.getClass(), "userName", "RVZTQxYOUO");
        setIntField(term38838, term38838.getClass(), "level", -557662858);
        setIntField(term38838, term38838.getClass(), "reincarnationNum", -477520795);
        setLongField(term38838, term38838.getClass(), "exp", 5579342693904906403L);
        setLongField(term38838, term38838.getClass(), "point", -8838530728518114289L);
        setLongField(term38838, term38838.getClass(), "totalPoint", 8907204162812035128L);
        setIntField(term38838, term38838.getClass(), "playCount", -480468995);
        setIntField(term38838, term38838.getClass(), "jewelCount", -2037695985);
        setIntField(term38838, term38838.getClass(), "totalJewelCount", -2044768479);
        setIntField(term38838, term38838.getClass(), "medalCount", -2020209498);
        setIntField(term38838, term38838.getClass(), "playerRating", 754066823);
        setIntField(term38838, term38838.getClass(), "highestRating", 306903225);
        setIntField(term38838, term38838.getClass(), "battlePoint", -1245754321);
        setIntField(term38838, term38838.getClass(), "bestBattlePoint", 398727237);
        setIntField(term38838, term38838.getClass(), "overDamageBattlePoint", -1741920202);
        setBooleanField(term38838, term38838.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term38838, term38838.getClass(), "nameplateId", 1639977614);
        setIntField(term38838, term38838.getClass(), "trophyId", -27270642);
        setIntField(term38838, term38838.getClass(), "cardId", -1419515823);
        setIntField(term38838, term38838.getClass(), "characterId", 1749999469);
        setIntField(term38838, term38838.getClass(), "characterVoiceNo", -1508018812);
        setIntField(term38838, term38838.getClass(), "tabSetting", -679973960);
        setIntField(term38838, term38838.getClass(), "tabSortSetting", -85442762);
        setIntField(term38838, term38838.getClass(), "cardCategorySetting", 295245507);
        setIntField(term38838, term38838.getClass(), "cardSortSetting", -1782801582);
        setIntField(term38838, term38838.getClass(), "rivalScoreCategorySetting", -112814060);
        setIntField(term38838, term38838.getClass(), "playedTutorialBit", -1111447214);
        setIntField(term38838, term38838.getClass(), "firstTutorialCancelNum", 1463964937);
        setLongField(term38838, term38838.getClass(), "sumTechHighScore", -2749182704506228402L);
        setLongField(term38838, term38838.getClass(), "sumTechBasicHighScore", 6600785663926369589L);
        setLongField(term38838, term38838.getClass(), "sumTechAdvancedHighScore", -3301041159581643562L);
        setLongField(term38838, term38838.getClass(), "sumTechExpertHighScore", -1639557341378935663L);
        setLongField(term38838, term38838.getClass(), "sumTechMasterHighScore", 192472706552396960L);
        setLongField(term38838, term38838.getClass(), "sumTechLunaticHighScore", -3992275333926350693L);
        setLongField(term38838, term38838.getClass(), "sumBattleHighScore", -1639226758680988280L);
        setLongField(term38838, term38838.getClass(), "sumBattleBasicHighScore", 7775145417632389147L);
        setLongField(term38838, term38838.getClass(), "sumBattleAdvancedHighScore", -3955029913626345204L);
        setLongField(term38838, term38838.getClass(), "sumBattleExpertHighScore", -3095078124589583434L);
        setLongField(term38838, term38838.getClass(), "sumBattleMasterHighScore", -6245769757887186092L);
        setLongField(term38838, term38838.getClass(), "sumBattleLunaticHighScore", -180231083568368234L);
        setField(term38838, term38838.getClass(), "eventWatchedDate", "tydPpKxAbv");
        setField(term38838, term38838.getClass(), "cmEventWatchedDate", "CJxQpJUfLJ");
        setField(term38838, term38838.getClass(), "firstGameId", "NUUjAyqOva");
        setField(term38838, term38838.getClass(), "firstRomVersion", "EoAMIIUdDX");
        setField(term38838, term38838.getClass(), "firstDataVersion", "OATNwRncsv");
        setField(term38838, term38838.getClass(), "firstPlayDate", "rACmzcmIPm");
        setField(term38838, term38838.getClass(), "lastGameId", "OCtePrLDhe");
        setField(term38838, term38838.getClass(), "lastRomVersion", "yqEphNxUPZ");
        setField(term38838, term38838.getClass(), "lastDataVersion", "mJJxTuZuKO");
        setField(term38838, term38838.getClass(), "compatibleCmVersion", "anSZCikKpS");
        setField(term38838, term38838.getClass(), "lastPlayDate", "zvMQGbTtsV");
        setIntField(term38838, term38838.getClass(), "lastPlaceId", -1207878110);
        setField(term38838, term38838.getClass(), "lastPlaceName", "DyUuIDzZPG");
        setIntField(term38838, term38838.getClass(), "lastRegionId", -284421477);
        setField(term38838, term38838.getClass(), "lastRegionName", "EGQLusEtRN");
        setIntField(term38838, term38838.getClass(), "lastAllNetId", 55419591);
        setField(term38838, term38838.getClass(), "lastClientId", "GwGUMPdvZq");
        setIntField(term38838, term38838.getClass(), "lastUsedDeckId", 1020931980);
        setIntField(term38838, term38838.getClass(), "lastPlayMusicLevel", -1435032444);
        setIntField(term38838, term38838.getClass(), "lastEmoneyBrand", -420769218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleMasterHighScore", argTypes, term38838, args);
    }

};


