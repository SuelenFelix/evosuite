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

public class UserEventPoint_hashCode_31336909113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387538;

    public UserEventPoint_hashCode_31336909113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term387544 = new Long(6371581018571997173L);
        term387538 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term387540 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term387542 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term387558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term387563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term387568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term387573 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term387538, term387538.getClass(), "id", 248360190364016864L);
        setLongField(term387540, term387540.getClass(), "id", 8102651909119310877L);
        setLongField(term387542, term387542.getClass(), "id", 6213173221640143925L);
        setField(term387542, term387542.getClass(), "extId", term387544);
        setField(term387542, term387542.getClass(), "luid", "gsfGqZlsrS");
        setIntField(term387559, term387559.getClass(), "year", 2021);
        setShortField(term387559, term387559.getClass(), "month", (short) 8);
        setShortField(term387559, term387559.getClass(), "day", (short) 28);
        setField(term387558, term387558.getClass(), "date", term387559);
        setByteField(term387563, term387563.getClass(), "hour", (byte) 19);
        setByteField(term387563, term387563.getClass(), "minute", (byte) 31);
        setByteField(term387563, term387563.getClass(), "second", (byte) 45);
        setIntField(term387563, term387563.getClass(), "nano", 554908400);
        setField(term387558, term387558.getClass(), "time", term387563);
        setField(term387542, term387542.getClass(), "registerTime", term387558);
        setIntField(term387569, term387569.getClass(), "year", 2010);
        setShortField(term387569, term387569.getClass(), "month", (short) 5);
        setShortField(term387569, term387569.getClass(), "day", (short) 22);
        setField(term387568, term387568.getClass(), "date", term387569);
        setByteField(term387573, term387573.getClass(), "hour", (byte) 6);
        setByteField(term387573, term387573.getClass(), "minute", (byte) 58);
        setByteField(term387573, term387573.getClass(), "second", (byte) 31);
        setIntField(term387573, term387573.getClass(), "nano", 536009331);
        setField(term387568, term387568.getClass(), "time", term387573);
        setField(term387542, term387542.getClass(), "accessTime", term387568);
        setField(term387540, term387540.getClass(), "card", term387542);
        setField(term387540, term387540.getClass(), "userName", "qAAauxEMaN");
        setIntField(term387540, term387540.getClass(), "level", 2027209565);
        setIntField(term387540, term387540.getClass(), "reincarnationNum", 356931097);
        setLongField(term387540, term387540.getClass(), "exp", 5663698543261770932L);
        setLongField(term387540, term387540.getClass(), "point", 478888035933365893L);
        setLongField(term387540, term387540.getClass(), "totalPoint", -8925555072109475587L);
        setIntField(term387540, term387540.getClass(), "playCount", 1331144011);
        setIntField(term387540, term387540.getClass(), "jewelCount", -1173519624);
        setIntField(term387540, term387540.getClass(), "totalJewelCount", 1634458419);
        setIntField(term387540, term387540.getClass(), "medalCount", -876704169);
        setIntField(term387540, term387540.getClass(), "playerRating", -1318457853);
        setIntField(term387540, term387540.getClass(), "highestRating", -1026416240);
        setIntField(term387540, term387540.getClass(), "battlePoint", -2656844);
        setIntField(term387540, term387540.getClass(), "bestBattlePoint", -196892642);
        setIntField(term387540, term387540.getClass(), "overDamageBattlePoint", -476105346);
        setBooleanField(term387540, term387540.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term387540, term387540.getClass(), "nameplateId", -2116881593);
        setIntField(term387540, term387540.getClass(), "trophyId", 119183163);
        setIntField(term387540, term387540.getClass(), "cardId", -841939624);
        setIntField(term387540, term387540.getClass(), "characterId", -1533852275);
        setIntField(term387540, term387540.getClass(), "characterVoiceNo", 485212506);
        setIntField(term387540, term387540.getClass(), "tabSetting", 656196486);
        setIntField(term387540, term387540.getClass(), "tabSortSetting", -875427227);
        setIntField(term387540, term387540.getClass(), "cardCategorySetting", -1186188835);
        setIntField(term387540, term387540.getClass(), "cardSortSetting", -1386613245);
        setIntField(term387540, term387540.getClass(), "rivalScoreCategorySetting", 1253590260);
        setIntField(term387540, term387540.getClass(), "playedTutorialBit", -1843452098);
        setIntField(term387540, term387540.getClass(), "firstTutorialCancelNum", 861770822);
        setLongField(term387540, term387540.getClass(), "sumTechHighScore", -4470794459247950264L);
        setLongField(term387540, term387540.getClass(), "sumTechBasicHighScore", -8280310075550208862L);
        setLongField(term387540, term387540.getClass(), "sumTechAdvancedHighScore", -7594178677356718083L);
        setLongField(term387540, term387540.getClass(), "sumTechExpertHighScore", -7774006969876012029L);
        setLongField(term387540, term387540.getClass(), "sumTechMasterHighScore", -3509912899260173163L);
        setLongField(term387540, term387540.getClass(), "sumTechLunaticHighScore", -8665294345952705735L);
        setLongField(term387540, term387540.getClass(), "sumBattleHighScore", -6059439152499144175L);
        setLongField(term387540, term387540.getClass(), "sumBattleBasicHighScore", 6706764154006944087L);
        setLongField(term387540, term387540.getClass(), "sumBattleAdvancedHighScore", -4104739036530855319L);
        setLongField(term387540, term387540.getClass(), "sumBattleExpertHighScore", 64022944879483890L);
        setLongField(term387540, term387540.getClass(), "sumBattleMasterHighScore", -456112775603940176L);
        setLongField(term387540, term387540.getClass(), "sumBattleLunaticHighScore", -5308888597154027805L);
        setField(term387540, term387540.getClass(), "eventWatchedDate", "ZTlUaPKMpl");
        setField(term387540, term387540.getClass(), "cmEventWatchedDate", "fNwrLKbCYi");
        setField(term387540, term387540.getClass(), "firstGameId", "MxzsjbBsNS");
        setField(term387540, term387540.getClass(), "firstRomVersion", "idpTcFiSDC");
        setField(term387540, term387540.getClass(), "firstDataVersion", "RpMMONRMVu");
        setField(term387540, term387540.getClass(), "firstPlayDate", "cywJgbAMtX");
        setField(term387540, term387540.getClass(), "lastGameId", "iNOiHMiHXm");
        setField(term387540, term387540.getClass(), "lastRomVersion", "AMAsRBjiRh");
        setField(term387540, term387540.getClass(), "lastDataVersion", "kFNCXYEueG");
        setField(term387540, term387540.getClass(), "compatibleCmVersion", "PiHZjnIanl");
        setField(term387540, term387540.getClass(), "lastPlayDate", "mBEkWGWvhK");
        setIntField(term387540, term387540.getClass(), "lastPlaceId", 979420229);
        setField(term387540, term387540.getClass(), "lastPlaceName", "TLUkTIKLfk");
        setIntField(term387540, term387540.getClass(), "lastRegionId", 1812542191);
        setField(term387540, term387540.getClass(), "lastRegionName", "SpnEoCUZfb");
        setIntField(term387540, term387540.getClass(), "lastAllNetId", -446705956);
        setField(term387540, term387540.getClass(), "lastClientId", "rMdSodYuOv");
        setIntField(term387540, term387540.getClass(), "lastUsedDeckId", -1760380315);
        setIntField(term387540, term387540.getClass(), "lastPlayMusicLevel", 983664617);
        setIntField(term387540, term387540.getClass(), "lastEmoneyBrand", 151120806);
        setField(term387538, term387538.getClass(), "user", term387540);
        setIntField(term387538, term387538.getClass(), "eventId", -41287462);
        setLongField(term387538, term387538.getClass(), "point", -8704743028134415244L);
        setBooleanField(term387538, term387538.getClass(), "isRankingRewarded", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term387538, args);
    }

};


