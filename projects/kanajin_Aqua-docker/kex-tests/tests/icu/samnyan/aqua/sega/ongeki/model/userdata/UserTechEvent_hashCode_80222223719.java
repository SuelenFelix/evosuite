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

public class UserTechEvent_hashCode_80222223719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360165;

    public UserTechEvent_hashCode_80222223719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term360171 = new Long(-2922851649897789783L);
        term360165 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term360167 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term360169 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term360185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term360186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360190 = newInstance(Class.forName("java.time.LocalTime"));
        Object term360195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term360196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360200 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term360165, term360165.getClass(), "id", 3613957212006990898L);
        setLongField(term360167, term360167.getClass(), "id", -1980026892450869478L);
        setLongField(term360169, term360169.getClass(), "id", 6922595753156164137L);
        setField(term360169, term360169.getClass(), "extId", term360171);
        setField(term360169, term360169.getClass(), "luid", "isJhQiZPwS");
        setIntField(term360186, term360186.getClass(), "year", 2015);
        setShortField(term360186, term360186.getClass(), "month", (short) 4);
        setShortField(term360186, term360186.getClass(), "day", (short) 2);
        setField(term360185, term360185.getClass(), "date", term360186);
        setByteField(term360190, term360190.getClass(), "hour", (byte) 16);
        setByteField(term360190, term360190.getClass(), "minute", (byte) 58);
        setByteField(term360190, term360190.getClass(), "second", (byte) 7);
        setIntField(term360190, term360190.getClass(), "nano", 424910939);
        setField(term360185, term360185.getClass(), "time", term360190);
        setField(term360169, term360169.getClass(), "registerTime", term360185);
        setIntField(term360196, term360196.getClass(), "year", 2024);
        setShortField(term360196, term360196.getClass(), "month", (short) 3);
        setShortField(term360196, term360196.getClass(), "day", (short) 31);
        setField(term360195, term360195.getClass(), "date", term360196);
        setByteField(term360200, term360200.getClass(), "hour", (byte) 23);
        setByteField(term360200, term360200.getClass(), "minute", (byte) 34);
        setByteField(term360200, term360200.getClass(), "second", (byte) 35);
        setIntField(term360200, term360200.getClass(), "nano", 66833920);
        setField(term360195, term360195.getClass(), "time", term360200);
        setField(term360169, term360169.getClass(), "accessTime", term360195);
        setField(term360167, term360167.getClass(), "card", term360169);
        setField(term360167, term360167.getClass(), "userName", "rxQZmnPwiA");
        setIntField(term360167, term360167.getClass(), "level", -1802956118);
        setIntField(term360167, term360167.getClass(), "reincarnationNum", -605999750);
        setLongField(term360167, term360167.getClass(), "exp", 7599773781014379887L);
        setLongField(term360167, term360167.getClass(), "point", -2835048282681282423L);
        setLongField(term360167, term360167.getClass(), "totalPoint", -1651781700566151897L);
        setIntField(term360167, term360167.getClass(), "playCount", 1334827253);
        setIntField(term360167, term360167.getClass(), "jewelCount", 60188100);
        setIntField(term360167, term360167.getClass(), "totalJewelCount", -1432858828);
        setIntField(term360167, term360167.getClass(), "medalCount", -928670239);
        setIntField(term360167, term360167.getClass(), "playerRating", 1380297081);
        setIntField(term360167, term360167.getClass(), "highestRating", -984273184);
        setIntField(term360167, term360167.getClass(), "battlePoint", 2134659484);
        setIntField(term360167, term360167.getClass(), "bestBattlePoint", 1687743392);
        setIntField(term360167, term360167.getClass(), "overDamageBattlePoint", -2101402577);
        setBooleanField(term360167, term360167.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term360167, term360167.getClass(), "nameplateId", -2103105205);
        setIntField(term360167, term360167.getClass(), "trophyId", -792024123);
        setIntField(term360167, term360167.getClass(), "cardId", 1310604586);
        setIntField(term360167, term360167.getClass(), "characterId", 120421390);
        setIntField(term360167, term360167.getClass(), "characterVoiceNo", -420931327);
        setIntField(term360167, term360167.getClass(), "tabSetting", -619679652);
        setIntField(term360167, term360167.getClass(), "tabSortSetting", 1260602512);
        setIntField(term360167, term360167.getClass(), "cardCategorySetting", -1482318461);
        setIntField(term360167, term360167.getClass(), "cardSortSetting", 717433338);
        setIntField(term360167, term360167.getClass(), "rivalScoreCategorySetting", 1847086396);
        setIntField(term360167, term360167.getClass(), "playedTutorialBit", 56579091);
        setIntField(term360167, term360167.getClass(), "firstTutorialCancelNum", 401140080);
        setLongField(term360167, term360167.getClass(), "sumTechHighScore", -2695004776725606568L);
        setLongField(term360167, term360167.getClass(), "sumTechBasicHighScore", -6184759890076822536L);
        setLongField(term360167, term360167.getClass(), "sumTechAdvancedHighScore", -1416617038058975238L);
        setLongField(term360167, term360167.getClass(), "sumTechExpertHighScore", -7126441617628438686L);
        setLongField(term360167, term360167.getClass(), "sumTechMasterHighScore", 553364805680908574L);
        setLongField(term360167, term360167.getClass(), "sumTechLunaticHighScore", -4364962069311636170L);
        setLongField(term360167, term360167.getClass(), "sumBattleHighScore", -3183109917440912165L);
        setLongField(term360167, term360167.getClass(), "sumBattleBasicHighScore", 2248040476664383579L);
        setLongField(term360167, term360167.getClass(), "sumBattleAdvancedHighScore", -737222182296734443L);
        setLongField(term360167, term360167.getClass(), "sumBattleExpertHighScore", -4729991330958492209L);
        setLongField(term360167, term360167.getClass(), "sumBattleMasterHighScore", -716090018399200731L);
        setLongField(term360167, term360167.getClass(), "sumBattleLunaticHighScore", 6563138748451495404L);
        setField(term360167, term360167.getClass(), "eventWatchedDate", "oaBpgZaMUy");
        setField(term360167, term360167.getClass(), "cmEventWatchedDate", "eRECUgAWlm");
        setField(term360167, term360167.getClass(), "firstGameId", "eTRnvTlFzn");
        setField(term360167, term360167.getClass(), "firstRomVersion", "OOAaugvNfd");
        setField(term360167, term360167.getClass(), "firstDataVersion", "nxFXXlyaWX");
        setField(term360167, term360167.getClass(), "firstPlayDate", "hxCWGcCoyc");
        setField(term360167, term360167.getClass(), "lastGameId", "ZzKpZSfYMN");
        setField(term360167, term360167.getClass(), "lastRomVersion", "tQXxgPReVH");
        setField(term360167, term360167.getClass(), "lastDataVersion", "LsOoKBiOVs");
        setField(term360167, term360167.getClass(), "compatibleCmVersion", "MTBfWtPPhe");
        setField(term360167, term360167.getClass(), "lastPlayDate", "xGMlZqPOTB");
        setIntField(term360167, term360167.getClass(), "lastPlaceId", -1237178139);
        setField(term360167, term360167.getClass(), "lastPlaceName", "nAOmberuac");
        setIntField(term360167, term360167.getClass(), "lastRegionId", -95590382);
        setField(term360167, term360167.getClass(), "lastRegionName", "WwEWKSmjkw");
        setIntField(term360167, term360167.getClass(), "lastAllNetId", 479635449);
        setField(term360167, term360167.getClass(), "lastClientId", "rJsAlhwtho");
        setIntField(term360167, term360167.getClass(), "lastUsedDeckId", 1540365430);
        setIntField(term360167, term360167.getClass(), "lastPlayMusicLevel", 417141528);
        setIntField(term360167, term360167.getClass(), "lastEmoneyBrand", 1994187076);
        setField(term360165, term360165.getClass(), "user", term360167);
        setIntField(term360165, term360165.getClass(), "eventId", 1340602787);
        setIntField(term360165, term360165.getClass(), "totalTechScore", 2045175415);
        setIntField(term360165, term360165.getClass(), "totalPlatinumScore", 92484033);
        setField(term360165, term360165.getClass(), "techRecordDate", "ViPPMTBQpx");
        setBooleanField(term360165, term360165.getClass(), "isRankingRewarded", false);
        setBooleanField(term360165, term360165.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term360165, args);
    }

};


