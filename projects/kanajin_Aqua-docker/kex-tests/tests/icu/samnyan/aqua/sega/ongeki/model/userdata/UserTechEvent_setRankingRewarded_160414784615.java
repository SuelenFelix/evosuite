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

public class UserTechEvent_setRankingRewarded_160414784615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358351;
     Object term358633;

    public UserTechEvent_setRankingRewarded_160414784615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term358357 = new Long(-6900715686580158779L);
        term358351 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term358353 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term358355 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term358371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term358372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term358376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term358381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term358382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term358386 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term358351, term358351.getClass(), "id", 8954118868747609004L);
        setLongField(term358353, term358353.getClass(), "id", -228887951162169711L);
        setLongField(term358355, term358355.getClass(), "id", -5489806787802827165L);
        setField(term358355, term358355.getClass(), "extId", term358357);
        setField(term358355, term358355.getClass(), "luid", "FZHsIqVKBj");
        setIntField(term358372, term358372.getClass(), "year", 2020);
        setShortField(term358372, term358372.getClass(), "month", (short) 3);
        setShortField(term358372, term358372.getClass(), "day", (short) 23);
        setField(term358371, term358371.getClass(), "date", term358372);
        setByteField(term358376, term358376.getClass(), "hour", (byte) 7);
        setByteField(term358376, term358376.getClass(), "minute", (byte) 1);
        setByteField(term358376, term358376.getClass(), "second", (byte) 48);
        setIntField(term358376, term358376.getClass(), "nano", 823771548);
        setField(term358371, term358371.getClass(), "time", term358376);
        setField(term358355, term358355.getClass(), "registerTime", term358371);
        setIntField(term358382, term358382.getClass(), "year", 2020);
        setShortField(term358382, term358382.getClass(), "month", (short) 7);
        setShortField(term358382, term358382.getClass(), "day", (short) 2);
        setField(term358381, term358381.getClass(), "date", term358382);
        setByteField(term358386, term358386.getClass(), "hour", (byte) 22);
        setByteField(term358386, term358386.getClass(), "minute", (byte) 29);
        setByteField(term358386, term358386.getClass(), "second", (byte) 2);
        setIntField(term358386, term358386.getClass(), "nano", 739683212);
        setField(term358381, term358381.getClass(), "time", term358386);
        setField(term358355, term358355.getClass(), "accessTime", term358381);
        setField(term358353, term358353.getClass(), "card", term358355);
        setField(term358353, term358353.getClass(), "userName", "uEcWOYQHDJ");
        setIntField(term358353, term358353.getClass(), "level", 1601161029);
        setIntField(term358353, term358353.getClass(), "reincarnationNum", -979288521);
        setLongField(term358353, term358353.getClass(), "exp", -8545931218923404830L);
        setLongField(term358353, term358353.getClass(), "point", 3879517128117902832L);
        setLongField(term358353, term358353.getClass(), "totalPoint", 3985441786236722033L);
        setIntField(term358353, term358353.getClass(), "playCount", 2118698901);
        setIntField(term358353, term358353.getClass(), "jewelCount", 1451177637);
        setIntField(term358353, term358353.getClass(), "totalJewelCount", 693354899);
        setIntField(term358353, term358353.getClass(), "medalCount", 540093406);
        setIntField(term358353, term358353.getClass(), "playerRating", -2037967574);
        setIntField(term358353, term358353.getClass(), "highestRating", 1991370032);
        setIntField(term358353, term358353.getClass(), "battlePoint", 1065006855);
        setIntField(term358353, term358353.getClass(), "bestBattlePoint", -1612389552);
        setIntField(term358353, term358353.getClass(), "overDamageBattlePoint", -404639164);
        setBooleanField(term358353, term358353.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term358353, term358353.getClass(), "nameplateId", -38326633);
        setIntField(term358353, term358353.getClass(), "trophyId", -978512262);
        setIntField(term358353, term358353.getClass(), "cardId", 204370070);
        setIntField(term358353, term358353.getClass(), "characterId", 508044179);
        setIntField(term358353, term358353.getClass(), "characterVoiceNo", -66719186);
        setIntField(term358353, term358353.getClass(), "tabSetting", -1762089197);
        setIntField(term358353, term358353.getClass(), "tabSortSetting", -1974719272);
        setIntField(term358353, term358353.getClass(), "cardCategorySetting", -681178437);
        setIntField(term358353, term358353.getClass(), "cardSortSetting", 1910232262);
        setIntField(term358353, term358353.getClass(), "rivalScoreCategorySetting", -431187291);
        setIntField(term358353, term358353.getClass(), "playedTutorialBit", -462263566);
        setIntField(term358353, term358353.getClass(), "firstTutorialCancelNum", 551459159);
        setLongField(term358353, term358353.getClass(), "sumTechHighScore", -8204340783013853521L);
        setLongField(term358353, term358353.getClass(), "sumTechBasicHighScore", -6157574702755023199L);
        setLongField(term358353, term358353.getClass(), "sumTechAdvancedHighScore", 2642716618440293580L);
        setLongField(term358353, term358353.getClass(), "sumTechExpertHighScore", -6789406947808175470L);
        setLongField(term358353, term358353.getClass(), "sumTechMasterHighScore", 7646828276832481068L);
        setLongField(term358353, term358353.getClass(), "sumTechLunaticHighScore", -7840943074661439067L);
        setLongField(term358353, term358353.getClass(), "sumBattleHighScore", -1615415299189097331L);
        setLongField(term358353, term358353.getClass(), "sumBattleBasicHighScore", -7532597891593392834L);
        setLongField(term358353, term358353.getClass(), "sumBattleAdvancedHighScore", -2893988952933929237L);
        setLongField(term358353, term358353.getClass(), "sumBattleExpertHighScore", 4732653846258473420L);
        setLongField(term358353, term358353.getClass(), "sumBattleMasterHighScore", -4177376818532595419L);
        setLongField(term358353, term358353.getClass(), "sumBattleLunaticHighScore", 6980606208619663110L);
        setField(term358353, term358353.getClass(), "eventWatchedDate", "wmpvGyoRHy");
        setField(term358353, term358353.getClass(), "cmEventWatchedDate", "lcEzrAMFIo");
        setField(term358353, term358353.getClass(), "firstGameId", "eTHvFSMOne");
        setField(term358353, term358353.getClass(), "firstRomVersion", "OSwHhiOiRi");
        setField(term358353, term358353.getClass(), "firstDataVersion", "XxvCBrbilh");
        setField(term358353, term358353.getClass(), "firstPlayDate", "qlulDmRUur");
        setField(term358353, term358353.getClass(), "lastGameId", "oXZXQzvlAT");
        setField(term358353, term358353.getClass(), "lastRomVersion", "pvvXnXuqRP");
        setField(term358353, term358353.getClass(), "lastDataVersion", "EOgYehuTXg");
        setField(term358353, term358353.getClass(), "compatibleCmVersion", "RDxCjQXqWx");
        setField(term358353, term358353.getClass(), "lastPlayDate", "ozyiACCcJv");
        setIntField(term358353, term358353.getClass(), "lastPlaceId", -409808538);
        setField(term358353, term358353.getClass(), "lastPlaceName", "MNENqxGuis");
        setIntField(term358353, term358353.getClass(), "lastRegionId", 2027545173);
        setField(term358353, term358353.getClass(), "lastRegionName", "ASlbbpQkpp");
        setIntField(term358353, term358353.getClass(), "lastAllNetId", 806017344);
        setField(term358353, term358353.getClass(), "lastClientId", "nFFfTVJlwk");
        setIntField(term358353, term358353.getClass(), "lastUsedDeckId", 714977344);
        setIntField(term358353, term358353.getClass(), "lastPlayMusicLevel", -688742086);
        setIntField(term358353, term358353.getClass(), "lastEmoneyBrand", 236038528);
        setField(term358351, term358351.getClass(), "user", term358353);
        setIntField(term358351, term358351.getClass(), "eventId", -1180193604);
        setIntField(term358351, term358351.getClass(), "totalTechScore", 1149579022);
        setIntField(term358351, term358351.getClass(), "totalPlatinumScore", 689712843);
        setField(term358351, term358351.getClass(), "techRecordDate", "PJASBgYOKJ");
        setBooleanField(term358351, term358351.getClass(), "isRankingRewarded", false);
        setBooleanField(term358351, term358351.getClass(), "isTotalTechNewRecord", false);
        term358633 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term358633;
        callMethod(klass, "setRankingRewarded", argTypes, term358351, args);
    }

};


