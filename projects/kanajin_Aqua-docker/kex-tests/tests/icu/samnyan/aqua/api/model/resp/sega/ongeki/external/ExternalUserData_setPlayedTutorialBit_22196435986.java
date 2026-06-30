package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExternalUserData_setPlayedTutorialBit_22196435986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3198370;
     Object term3198606;

    public ExternalUserData_setPlayedTutorialBit_22196435986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3198370 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3198370, term3198370.getClass(), "accessCode", "OWRDvpaLFr");
        setField(term3198370, term3198370.getClass(), "userName", "DCFfuocqqr");
        setIntField(term3198370, term3198370.getClass(), "level", -148499641);
        setIntField(term3198370, term3198370.getClass(), "reincarnationNum", 863516333);
        setLongField(term3198370, term3198370.getClass(), "exp", 864848033417640338L);
        setLongField(term3198370, term3198370.getClass(), "point", -6418846715082330653L);
        setLongField(term3198370, term3198370.getClass(), "totalPoint", -2120364914305571329L);
        setIntField(term3198370, term3198370.getClass(), "playCount", -652278639);
        setIntField(term3198370, term3198370.getClass(), "jewelCount", -742085064);
        setIntField(term3198370, term3198370.getClass(), "totalJewelCount", -1346660943);
        setIntField(term3198370, term3198370.getClass(), "medalCount", 1025255856);
        setIntField(term3198370, term3198370.getClass(), "playerRating", 824285393);
        setIntField(term3198370, term3198370.getClass(), "highestRating", 1351783215);
        setIntField(term3198370, term3198370.getClass(), "battlePoint", 1663846672);
        setIntField(term3198370, term3198370.getClass(), "bestBattlePoint", -2084460848);
        setIntField(term3198370, term3198370.getClass(), "overDamageBattlePoint", 1771446463);
        setIntField(term3198370, term3198370.getClass(), "nameplateId", 942259116);
        setIntField(term3198370, term3198370.getClass(), "trophyId", 1954273283);
        setIntField(term3198370, term3198370.getClass(), "cardId", 956975873);
        setIntField(term3198370, term3198370.getClass(), "characterId", 224748507);
        setIntField(term3198370, term3198370.getClass(), "tabSetting", 1554289454);
        setIntField(term3198370, term3198370.getClass(), "tabSortSetting", 447255451);
        setIntField(term3198370, term3198370.getClass(), "cardCategorySetting", 1257938346);
        setIntField(term3198370, term3198370.getClass(), "cardSortSetting", 1377745758);
        setIntField(term3198370, term3198370.getClass(), "rivalScoreCategorySetting", 1028659750);
        setIntField(term3198370, term3198370.getClass(), "playedTutorialBit", 1053541370);
        setIntField(term3198370, term3198370.getClass(), "firstTutorialCancelNum", -1889550731);
        setLongField(term3198370, term3198370.getClass(), "sumTechHighScore", -2198668247828506114L);
        setLongField(term3198370, term3198370.getClass(), "sumTechBasicHighScore", 775094499653948433L);
        setLongField(term3198370, term3198370.getClass(), "sumTechAdvancedHighScore", -3420467567639155746L);
        setLongField(term3198370, term3198370.getClass(), "sumTechExpertHighScore", 1541407587516172723L);
        setLongField(term3198370, term3198370.getClass(), "sumTechMasterHighScore", 7740110216404982705L);
        setLongField(term3198370, term3198370.getClass(), "sumTechLunaticHighScore", -7416215158511839380L);
        setLongField(term3198370, term3198370.getClass(), "sumBattleHighScore", -3564275170373358442L);
        setLongField(term3198370, term3198370.getClass(), "sumBattleBasicHighScore", -2692933921649589857L);
        setLongField(term3198370, term3198370.getClass(), "sumBattleAdvancedHighScore", 5259335700669858178L);
        setLongField(term3198370, term3198370.getClass(), "sumBattleExpertHighScore", 6787014090934778382L);
        setLongField(term3198370, term3198370.getClass(), "sumBattleMasterHighScore", 4316790030506286183L);
        setLongField(term3198370, term3198370.getClass(), "sumBattleLunaticHighScore", 7616487099318005151L);
        setField(term3198370, term3198370.getClass(), "eventWatchedDate", "IbkvZQqvhq");
        setField(term3198370, term3198370.getClass(), "cmEventWatchedDate", "DZRreckHye");
        setField(term3198370, term3198370.getClass(), "firstGameId", "VDnspQHeel");
        setField(term3198370, term3198370.getClass(), "firstRomVersion", "MLQsNSLmQx");
        setField(term3198370, term3198370.getClass(), "firstDataVersion", "ePwvHoVVTx");
        setField(term3198370, term3198370.getClass(), "firstPlayDate", "GWRfVLnGuy");
        setField(term3198370, term3198370.getClass(), "lastGameId", "exRjknNxLi");
        setField(term3198370, term3198370.getClass(), "lastRomVersion", "EXszxilMKL");
        setField(term3198370, term3198370.getClass(), "lastDataVersion", "ICCvCkCMpN");
        setField(term3198370, term3198370.getClass(), "compatibleCmVersion", "dIvaqAnIjq");
        setField(term3198370, term3198370.getClass(), "lastPlayDate", "JEgoyqZkOY");
        setIntField(term3198370, term3198370.getClass(), "lastPlaceId", 64982395);
        setField(term3198370, term3198370.getClass(), "lastPlaceName", "AmvTXRLdyG");
        setIntField(term3198370, term3198370.getClass(), "lastRegionId", 195721710);
        setField(term3198370, term3198370.getClass(), "lastRegionName", "KZKAVxfRLe");
        setIntField(term3198370, term3198370.getClass(), "lastAllNetId", 1381752630);
        setField(term3198370, term3198370.getClass(), "lastClientId", "zOeVsUeDrL");
        setIntField(term3198370, term3198370.getClass(), "lastUsedDeckId", -847143834);
        setIntField(term3198370, term3198370.getClass(), "lastPlayMusicLevel", -501171993);
        setIntField(term3198370, term3198370.getClass(), "lastEmoneyBrand", 1394762745);
        term3198606 = new Integer(-2027894142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3198606;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term3198370, args);
    }

};


