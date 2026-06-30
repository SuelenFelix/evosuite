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

public class UserTrainingRoom_getId_11149743481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13358;

    public UserTrainingRoom_getId_11149743481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13364 = new Long(-5892135042702373494L);
        term13358 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term13360 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term13362 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term13378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13379 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13383 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13393 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term13358, term13358.getClass(), "id", -6983938899150831997L);
        setLongField(term13360, term13360.getClass(), "id", -2720964670491002091L);
        setLongField(term13362, term13362.getClass(), "id", -723697646775816649L);
        setField(term13362, term13362.getClass(), "extId", term13364);
        setField(term13362, term13362.getClass(), "luid", "GeddnXjHGy");
        setIntField(term13379, term13379.getClass(), "year", 2016);
        setShortField(term13379, term13379.getClass(), "month", (short) 10);
        setShortField(term13379, term13379.getClass(), "day", (short) 20);
        setField(term13378, term13378.getClass(), "date", term13379);
        setByteField(term13383, term13383.getClass(), "hour", (byte) 18);
        setByteField(term13383, term13383.getClass(), "minute", (byte) 39);
        setByteField(term13383, term13383.getClass(), "second", (byte) 1);
        setIntField(term13383, term13383.getClass(), "nano", 196253988);
        setField(term13378, term13378.getClass(), "time", term13383);
        setField(term13362, term13362.getClass(), "registerTime", term13378);
        setIntField(term13389, term13389.getClass(), "year", 2019);
        setShortField(term13389, term13389.getClass(), "month", (short) 1);
        setShortField(term13389, term13389.getClass(), "day", (short) 6);
        setField(term13388, term13388.getClass(), "date", term13389);
        setByteField(term13393, term13393.getClass(), "hour", (byte) 18);
        setByteField(term13393, term13393.getClass(), "minute", (byte) 8);
        setByteField(term13393, term13393.getClass(), "second", (byte) 46);
        setIntField(term13393, term13393.getClass(), "nano", 934136445);
        setField(term13388, term13388.getClass(), "time", term13393);
        setField(term13362, term13362.getClass(), "accessTime", term13388);
        setField(term13360, term13360.getClass(), "card", term13362);
        setField(term13360, term13360.getClass(), "userName", "vLTbaoAxBm");
        setIntField(term13360, term13360.getClass(), "level", -1542979444);
        setIntField(term13360, term13360.getClass(), "reincarnationNum", -1130401612);
        setLongField(term13360, term13360.getClass(), "exp", -5671086125367688052L);
        setLongField(term13360, term13360.getClass(), "point", 7875739215674729968L);
        setLongField(term13360, term13360.getClass(), "totalPoint", -8605430501912680279L);
        setIntField(term13360, term13360.getClass(), "playCount", -316771104);
        setIntField(term13360, term13360.getClass(), "jewelCount", -1374527319);
        setIntField(term13360, term13360.getClass(), "totalJewelCount", -1735276919);
        setIntField(term13360, term13360.getClass(), "medalCount", -712023865);
        setIntField(term13360, term13360.getClass(), "playerRating", 613256157);
        setIntField(term13360, term13360.getClass(), "highestRating", 454242689);
        setIntField(term13360, term13360.getClass(), "battlePoint", 1798354517);
        setIntField(term13360, term13360.getClass(), "bestBattlePoint", -1495693617);
        setIntField(term13360, term13360.getClass(), "overDamageBattlePoint", -890538258);
        setBooleanField(term13360, term13360.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term13360, term13360.getClass(), "nameplateId", -1085899912);
        setIntField(term13360, term13360.getClass(), "trophyId", -1458980236);
        setIntField(term13360, term13360.getClass(), "cardId", 890505372);
        setIntField(term13360, term13360.getClass(), "characterId", 2044137055);
        setIntField(term13360, term13360.getClass(), "characterVoiceNo", -1452324619);
        setIntField(term13360, term13360.getClass(), "tabSetting", -1121709274);
        setIntField(term13360, term13360.getClass(), "tabSortSetting", -532304223);
        setIntField(term13360, term13360.getClass(), "cardCategorySetting", 666218293);
        setIntField(term13360, term13360.getClass(), "cardSortSetting", 1737876343);
        setIntField(term13360, term13360.getClass(), "rivalScoreCategorySetting", -897937940);
        setIntField(term13360, term13360.getClass(), "playedTutorialBit", 1523261232);
        setIntField(term13360, term13360.getClass(), "firstTutorialCancelNum", -428988337);
        setLongField(term13360, term13360.getClass(), "sumTechHighScore", 2985226914509512766L);
        setLongField(term13360, term13360.getClass(), "sumTechBasicHighScore", 4041117732464806744L);
        setLongField(term13360, term13360.getClass(), "sumTechAdvancedHighScore", 7199459243454109261L);
        setLongField(term13360, term13360.getClass(), "sumTechExpertHighScore", -1009485425289165749L);
        setLongField(term13360, term13360.getClass(), "sumTechMasterHighScore", -5044181804110715069L);
        setLongField(term13360, term13360.getClass(), "sumTechLunaticHighScore", -2413135395771470086L);
        setLongField(term13360, term13360.getClass(), "sumBattleHighScore", -823085399570394644L);
        setLongField(term13360, term13360.getClass(), "sumBattleBasicHighScore", -894705411488729365L);
        setLongField(term13360, term13360.getClass(), "sumBattleAdvancedHighScore", -7514437039500876647L);
        setLongField(term13360, term13360.getClass(), "sumBattleExpertHighScore", 204473662283899955L);
        setLongField(term13360, term13360.getClass(), "sumBattleMasterHighScore", -4029227951294167228L);
        setLongField(term13360, term13360.getClass(), "sumBattleLunaticHighScore", 5160033404788124731L);
        setField(term13360, term13360.getClass(), "eventWatchedDate", "BXTjEyEZxD");
        setField(term13360, term13360.getClass(), "cmEventWatchedDate", "oKhVzOKUFW");
        setField(term13360, term13360.getClass(), "firstGameId", "mNHyqmOAFy");
        setField(term13360, term13360.getClass(), "firstRomVersion", "UxgSdhxPCH");
        setField(term13360, term13360.getClass(), "firstDataVersion", "DAujxZPHJC");
        setField(term13360, term13360.getClass(), "firstPlayDate", "IlBhdrCvHq");
        setField(term13360, term13360.getClass(), "lastGameId", "OirVUQhauU");
        setField(term13360, term13360.getClass(), "lastRomVersion", "GLbyDfbNZI");
        setField(term13360, term13360.getClass(), "lastDataVersion", "oNLcCYDAsO");
        setField(term13360, term13360.getClass(), "compatibleCmVersion", "CNqMxLvtcJ");
        setField(term13360, term13360.getClass(), "lastPlayDate", "ktbqerIaKW");
        setIntField(term13360, term13360.getClass(), "lastPlaceId", 48047085);
        setField(term13360, term13360.getClass(), "lastPlaceName", "VoghngXfsK");
        setIntField(term13360, term13360.getClass(), "lastRegionId", 1902784843);
        setField(term13360, term13360.getClass(), "lastRegionName", "GbahCBMvct");
        setIntField(term13360, term13360.getClass(), "lastAllNetId", 2021136615);
        setField(term13360, term13360.getClass(), "lastClientId", "iiHBhsNFgk");
        setIntField(term13360, term13360.getClass(), "lastUsedDeckId", 1778570695);
        setIntField(term13360, term13360.getClass(), "lastPlayMusicLevel", -1142164411);
        setIntField(term13360, term13360.getClass(), "lastEmoneyBrand", -1619435313);
        setField(term13358, term13358.getClass(), "user", term13360);
        setField(term13358, term13358.getClass(), "authKey", "HknsTajwxJ");
        setIntField(term13358, term13358.getClass(), "roomId", 1013801066);
        setIntField(term13358, term13358.getClass(), "cardId", 1512541853);
        setField(term13358, term13358.getClass(), "valueDate", "XtiurrVYKw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13358, args);
    }

};


