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

public class UserEventPoint_getEventId_4944706553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382825;

    public UserEventPoint_getEventId_4944706553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term382831 = new Long(-8510452367371037137L);
        term382825 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term382827 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term382829 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term382845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term382846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term382850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term382855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term382856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term382860 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term382825, term382825.getClass(), "id", 7525423876392885495L);
        setLongField(term382827, term382827.getClass(), "id", -4153878175675658758L);
        setLongField(term382829, term382829.getClass(), "id", 8892701708651062510L);
        setField(term382829, term382829.getClass(), "extId", term382831);
        setField(term382829, term382829.getClass(), "luid", "drzSvBrUAP");
        setIntField(term382846, term382846.getClass(), "year", 2018);
        setShortField(term382846, term382846.getClass(), "month", (short) 12);
        setShortField(term382846, term382846.getClass(), "day", (short) 2);
        setField(term382845, term382845.getClass(), "date", term382846);
        setByteField(term382850, term382850.getClass(), "hour", (byte) 16);
        setByteField(term382850, term382850.getClass(), "minute", (byte) 52);
        setByteField(term382850, term382850.getClass(), "second", (byte) 26);
        setIntField(term382850, term382850.getClass(), "nano", 494856202);
        setField(term382845, term382845.getClass(), "time", term382850);
        setField(term382829, term382829.getClass(), "registerTime", term382845);
        setIntField(term382856, term382856.getClass(), "year", 2013);
        setShortField(term382856, term382856.getClass(), "month", (short) 12);
        setShortField(term382856, term382856.getClass(), "day", (short) 12);
        setField(term382855, term382855.getClass(), "date", term382856);
        setByteField(term382860, term382860.getClass(), "hour", (byte) 2);
        setByteField(term382860, term382860.getClass(), "minute", (byte) 36);
        setByteField(term382860, term382860.getClass(), "second", (byte) 4);
        setIntField(term382860, term382860.getClass(), "nano", 161587429);
        setField(term382855, term382855.getClass(), "time", term382860);
        setField(term382829, term382829.getClass(), "accessTime", term382855);
        setField(term382827, term382827.getClass(), "card", term382829);
        setField(term382827, term382827.getClass(), "userName", "rUfNYgGhzR");
        setIntField(term382827, term382827.getClass(), "level", -920048986);
        setIntField(term382827, term382827.getClass(), "reincarnationNum", 1381627788);
        setLongField(term382827, term382827.getClass(), "exp", 7780035491217896440L);
        setLongField(term382827, term382827.getClass(), "point", -7860842171614346499L);
        setLongField(term382827, term382827.getClass(), "totalPoint", 6645209609088837731L);
        setIntField(term382827, term382827.getClass(), "playCount", 1281861612);
        setIntField(term382827, term382827.getClass(), "jewelCount", -1870022888);
        setIntField(term382827, term382827.getClass(), "totalJewelCount", -1777499083);
        setIntField(term382827, term382827.getClass(), "medalCount", -1246585113);
        setIntField(term382827, term382827.getClass(), "playerRating", -65821346);
        setIntField(term382827, term382827.getClass(), "highestRating", -486852069);
        setIntField(term382827, term382827.getClass(), "battlePoint", -804675495);
        setIntField(term382827, term382827.getClass(), "bestBattlePoint", -1414339018);
        setIntField(term382827, term382827.getClass(), "overDamageBattlePoint", 628831983);
        setBooleanField(term382827, term382827.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term382827, term382827.getClass(), "nameplateId", -429884762);
        setIntField(term382827, term382827.getClass(), "trophyId", 1728474317);
        setIntField(term382827, term382827.getClass(), "cardId", 1743555097);
        setIntField(term382827, term382827.getClass(), "characterId", 2024320291);
        setIntField(term382827, term382827.getClass(), "characterVoiceNo", -679505588);
        setIntField(term382827, term382827.getClass(), "tabSetting", -400060568);
        setIntField(term382827, term382827.getClass(), "tabSortSetting", 701690660);
        setIntField(term382827, term382827.getClass(), "cardCategorySetting", 166002939);
        setIntField(term382827, term382827.getClass(), "cardSortSetting", -604133294);
        setIntField(term382827, term382827.getClass(), "rivalScoreCategorySetting", 428917429);
        setIntField(term382827, term382827.getClass(), "playedTutorialBit", -1855940382);
        setIntField(term382827, term382827.getClass(), "firstTutorialCancelNum", -1295477586);
        setLongField(term382827, term382827.getClass(), "sumTechHighScore", 8089064930716882323L);
        setLongField(term382827, term382827.getClass(), "sumTechBasicHighScore", 4826588583234540629L);
        setLongField(term382827, term382827.getClass(), "sumTechAdvancedHighScore", -986504658683176332L);
        setLongField(term382827, term382827.getClass(), "sumTechExpertHighScore", -1730729730002855081L);
        setLongField(term382827, term382827.getClass(), "sumTechMasterHighScore", -3398188896873911436L);
        setLongField(term382827, term382827.getClass(), "sumTechLunaticHighScore", 3182692823711657918L);
        setLongField(term382827, term382827.getClass(), "sumBattleHighScore", -6998200422320290942L);
        setLongField(term382827, term382827.getClass(), "sumBattleBasicHighScore", -4732351898164573871L);
        setLongField(term382827, term382827.getClass(), "sumBattleAdvancedHighScore", 9192157290915663848L);
        setLongField(term382827, term382827.getClass(), "sumBattleExpertHighScore", 6868902545609761327L);
        setLongField(term382827, term382827.getClass(), "sumBattleMasterHighScore", 1423942833638183376L);
        setLongField(term382827, term382827.getClass(), "sumBattleLunaticHighScore", 8347037421216767471L);
        setField(term382827, term382827.getClass(), "eventWatchedDate", "GWWhCXnuCR");
        setField(term382827, term382827.getClass(), "cmEventWatchedDate", "CuTniAczcR");
        setField(term382827, term382827.getClass(), "firstGameId", "bNZMGlazCK");
        setField(term382827, term382827.getClass(), "firstRomVersion", "VmfeBbmqid");
        setField(term382827, term382827.getClass(), "firstDataVersion", "YGsbiCgNOo");
        setField(term382827, term382827.getClass(), "firstPlayDate", "nICHSjwVRu");
        setField(term382827, term382827.getClass(), "lastGameId", "yYfInvzmUP");
        setField(term382827, term382827.getClass(), "lastRomVersion", "jJWWehgFww");
        setField(term382827, term382827.getClass(), "lastDataVersion", "NFSzHMuxPO");
        setField(term382827, term382827.getClass(), "compatibleCmVersion", "aNHktxCpsN");
        setField(term382827, term382827.getClass(), "lastPlayDate", "DusrLoEeMO");
        setIntField(term382827, term382827.getClass(), "lastPlaceId", 563265614);
        setField(term382827, term382827.getClass(), "lastPlaceName", "atxqekEqim");
        setIntField(term382827, term382827.getClass(), "lastRegionId", 1162602435);
        setField(term382827, term382827.getClass(), "lastRegionName", "gzaEQAoTjJ");
        setIntField(term382827, term382827.getClass(), "lastAllNetId", 2122387739);
        setField(term382827, term382827.getClass(), "lastClientId", "oJyUPBIVeY");
        setIntField(term382827, term382827.getClass(), "lastUsedDeckId", -2033529959);
        setIntField(term382827, term382827.getClass(), "lastPlayMusicLevel", 782408459);
        setIntField(term382827, term382827.getClass(), "lastEmoneyBrand", 798875960);
        setField(term382825, term382825.getClass(), "user", term382827);
        setIntField(term382825, term382825.getClass(), "eventId", 2121682778);
        setLongField(term382825, term382825.getClass(), "point", -3922507473522519031L);
        setBooleanField(term382825, term382825.getClass(), "isRankingRewarded", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term382825, args);
    }

};


