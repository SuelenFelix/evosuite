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

public class UserTechEvent_getTotalPlatinumScore_6805119745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353378;

    public UserTechEvent_getTotalPlatinumScore_6805119745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term353384 = new Long(4903104596895674146L);
        term353378 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term353380 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term353382 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term353398 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term353399 = newInstance(Class.forName("java.time.LocalDate"));
        Object term353403 = newInstance(Class.forName("java.time.LocalTime"));
        Object term353408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term353409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term353413 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term353378, term353378.getClass(), "id", 8218888864152370899L);
        setLongField(term353380, term353380.getClass(), "id", 5038856578678636057L);
        setLongField(term353382, term353382.getClass(), "id", 9005402080525184672L);
        setField(term353382, term353382.getClass(), "extId", term353384);
        setField(term353382, term353382.getClass(), "luid", "hKVLoNSGLi");
        setIntField(term353399, term353399.getClass(), "year", 2022);
        setShortField(term353399, term353399.getClass(), "month", (short) 5);
        setShortField(term353399, term353399.getClass(), "day", (short) 21);
        setField(term353398, term353398.getClass(), "date", term353399);
        setByteField(term353403, term353403.getClass(), "hour", (byte) 21);
        setByteField(term353403, term353403.getClass(), "minute", (byte) 29);
        setByteField(term353403, term353403.getClass(), "second", (byte) 7);
        setIntField(term353403, term353403.getClass(), "nano", 444139028);
        setField(term353398, term353398.getClass(), "time", term353403);
        setField(term353382, term353382.getClass(), "registerTime", term353398);
        setIntField(term353409, term353409.getClass(), "year", 2010);
        setShortField(term353409, term353409.getClass(), "month", (short) 9);
        setShortField(term353409, term353409.getClass(), "day", (short) 20);
        setField(term353408, term353408.getClass(), "date", term353409);
        setByteField(term353413, term353413.getClass(), "hour", (byte) 1);
        setByteField(term353413, term353413.getClass(), "minute", (byte) 20);
        setByteField(term353413, term353413.getClass(), "second", (byte) 39);
        setIntField(term353413, term353413.getClass(), "nano", 127513393);
        setField(term353408, term353408.getClass(), "time", term353413);
        setField(term353382, term353382.getClass(), "accessTime", term353408);
        setField(term353380, term353380.getClass(), "card", term353382);
        setField(term353380, term353380.getClass(), "userName", "bIACTaOQxx");
        setIntField(term353380, term353380.getClass(), "level", 1725214486);
        setIntField(term353380, term353380.getClass(), "reincarnationNum", -1110580563);
        setLongField(term353380, term353380.getClass(), "exp", 8122331048840763453L);
        setLongField(term353380, term353380.getClass(), "point", 7512703996954118244L);
        setLongField(term353380, term353380.getClass(), "totalPoint", 1468257883650158022L);
        setIntField(term353380, term353380.getClass(), "playCount", -1842428356);
        setIntField(term353380, term353380.getClass(), "jewelCount", 1406620137);
        setIntField(term353380, term353380.getClass(), "totalJewelCount", 936694998);
        setIntField(term353380, term353380.getClass(), "medalCount", -421663526);
        setIntField(term353380, term353380.getClass(), "playerRating", -407039111);
        setIntField(term353380, term353380.getClass(), "highestRating", 1776791756);
        setIntField(term353380, term353380.getClass(), "battlePoint", -1195508953);
        setIntField(term353380, term353380.getClass(), "bestBattlePoint", 512042962);
        setIntField(term353380, term353380.getClass(), "overDamageBattlePoint", 1525819402);
        setBooleanField(term353380, term353380.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term353380, term353380.getClass(), "nameplateId", -541988136);
        setIntField(term353380, term353380.getClass(), "trophyId", 818394896);
        setIntField(term353380, term353380.getClass(), "cardId", -1182098560);
        setIntField(term353380, term353380.getClass(), "characterId", 529650646);
        setIntField(term353380, term353380.getClass(), "characterVoiceNo", 1813971731);
        setIntField(term353380, term353380.getClass(), "tabSetting", 700640894);
        setIntField(term353380, term353380.getClass(), "tabSortSetting", 572668176);
        setIntField(term353380, term353380.getClass(), "cardCategorySetting", -1002226339);
        setIntField(term353380, term353380.getClass(), "cardSortSetting", 1490553632);
        setIntField(term353380, term353380.getClass(), "rivalScoreCategorySetting", 179885232);
        setIntField(term353380, term353380.getClass(), "playedTutorialBit", -393205381);
        setIntField(term353380, term353380.getClass(), "firstTutorialCancelNum", -920498508);
        setLongField(term353380, term353380.getClass(), "sumTechHighScore", 6395524352640534597L);
        setLongField(term353380, term353380.getClass(), "sumTechBasicHighScore", -5544415553125165021L);
        setLongField(term353380, term353380.getClass(), "sumTechAdvancedHighScore", 7786312583644050829L);
        setLongField(term353380, term353380.getClass(), "sumTechExpertHighScore", -8901764032933330444L);
        setLongField(term353380, term353380.getClass(), "sumTechMasterHighScore", -676425515106613550L);
        setLongField(term353380, term353380.getClass(), "sumTechLunaticHighScore", -2515083745710595635L);
        setLongField(term353380, term353380.getClass(), "sumBattleHighScore", -6407047619594951594L);
        setLongField(term353380, term353380.getClass(), "sumBattleBasicHighScore", -2978485070670635719L);
        setLongField(term353380, term353380.getClass(), "sumBattleAdvancedHighScore", -7818606381110350672L);
        setLongField(term353380, term353380.getClass(), "sumBattleExpertHighScore", 865813380371765248L);
        setLongField(term353380, term353380.getClass(), "sumBattleMasterHighScore", 4990160237138419627L);
        setLongField(term353380, term353380.getClass(), "sumBattleLunaticHighScore", 5394041914887369644L);
        setField(term353380, term353380.getClass(), "eventWatchedDate", "SmOFzpvhhC");
        setField(term353380, term353380.getClass(), "cmEventWatchedDate", "kFHNsOTsNo");
        setField(term353380, term353380.getClass(), "firstGameId", "aynGleZfWW");
        setField(term353380, term353380.getClass(), "firstRomVersion", "PVJFcWIVNc");
        setField(term353380, term353380.getClass(), "firstDataVersion", "JXnWzMmhng");
        setField(term353380, term353380.getClass(), "firstPlayDate", "qhGGHYIgWp");
        setField(term353380, term353380.getClass(), "lastGameId", "YnnTbDiVrz");
        setField(term353380, term353380.getClass(), "lastRomVersion", "hWJzTNzfsv");
        setField(term353380, term353380.getClass(), "lastDataVersion", "cxGSZswKic");
        setField(term353380, term353380.getClass(), "compatibleCmVersion", "NziRgSNjol");
        setField(term353380, term353380.getClass(), "lastPlayDate", "QpfuWTAwJa");
        setIntField(term353380, term353380.getClass(), "lastPlaceId", 1037247993);
        setField(term353380, term353380.getClass(), "lastPlaceName", "lkkGfTpPFh");
        setIntField(term353380, term353380.getClass(), "lastRegionId", 961726677);
        setField(term353380, term353380.getClass(), "lastRegionName", "DZIrmuXSPC");
        setIntField(term353380, term353380.getClass(), "lastAllNetId", -979766939);
        setField(term353380, term353380.getClass(), "lastClientId", "ZHXCAgUiVB");
        setIntField(term353380, term353380.getClass(), "lastUsedDeckId", 797732558);
        setIntField(term353380, term353380.getClass(), "lastPlayMusicLevel", -324959782);
        setIntField(term353380, term353380.getClass(), "lastEmoneyBrand", 1569651442);
        setField(term353378, term353378.getClass(), "user", term353380);
        setIntField(term353378, term353378.getClass(), "eventId", 1959099942);
        setIntField(term353378, term353378.getClass(), "totalTechScore", 1932069628);
        setIntField(term353378, term353378.getClass(), "totalPlatinumScore", 1649311104);
        setField(term353378, term353378.getClass(), "techRecordDate", "vNyUAsurdH");
        setBooleanField(term353378, term353378.getClass(), "isRankingRewarded", true);
        setBooleanField(term353378, term353378.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPlatinumScore", argTypes, term353378, args);
    }

};


