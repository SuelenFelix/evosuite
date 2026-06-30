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

public class ExternalUserData_getFirstRomVersion_76889022442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112782;

    public ExternalUserData_getFirstRomVersion_76889022442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112782 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term112782, term112782.getClass(), "accessCode", "wwkadJpuic");
        setField(term112782, term112782.getClass(), "userName", "RnjGlKiEKe");
        setIntField(term112782, term112782.getClass(), "level", 1876269751);
        setIntField(term112782, term112782.getClass(), "reincarnationNum", -1137796299);
        setLongField(term112782, term112782.getClass(), "exp", 6333121401704736899L);
        setLongField(term112782, term112782.getClass(), "point", 193183519240064509L);
        setLongField(term112782, term112782.getClass(), "totalPoint", -3521302381002188796L);
        setIntField(term112782, term112782.getClass(), "playCount", -39137062);
        setIntField(term112782, term112782.getClass(), "jewelCount", -884098478);
        setIntField(term112782, term112782.getClass(), "totalJewelCount", 337200306);
        setIntField(term112782, term112782.getClass(), "medalCount", -74171862);
        setIntField(term112782, term112782.getClass(), "playerRating", 1656771613);
        setIntField(term112782, term112782.getClass(), "highestRating", -239814019);
        setIntField(term112782, term112782.getClass(), "battlePoint", -2090725409);
        setIntField(term112782, term112782.getClass(), "bestBattlePoint", -587504377);
        setIntField(term112782, term112782.getClass(), "overDamageBattlePoint", 1508015274);
        setIntField(term112782, term112782.getClass(), "nameplateId", -545432118);
        setIntField(term112782, term112782.getClass(), "trophyId", 1516200407);
        setIntField(term112782, term112782.getClass(), "cardId", -1835220700);
        setIntField(term112782, term112782.getClass(), "characterId", 1581478662);
        setIntField(term112782, term112782.getClass(), "tabSetting", 631536038);
        setIntField(term112782, term112782.getClass(), "tabSortSetting", 945719811);
        setIntField(term112782, term112782.getClass(), "cardCategorySetting", -1350984952);
        setIntField(term112782, term112782.getClass(), "cardSortSetting", 1142188192);
        setIntField(term112782, term112782.getClass(), "rivalScoreCategorySetting", -147643205);
        setIntField(term112782, term112782.getClass(), "playedTutorialBit", 1081648738);
        setIntField(term112782, term112782.getClass(), "firstTutorialCancelNum", 1075733975);
        setLongField(term112782, term112782.getClass(), "sumTechHighScore", 8806099566144028503L);
        setLongField(term112782, term112782.getClass(), "sumTechBasicHighScore", 8801542229673977841L);
        setLongField(term112782, term112782.getClass(), "sumTechAdvancedHighScore", -559935473251034829L);
        setLongField(term112782, term112782.getClass(), "sumTechExpertHighScore", 4215971209256795531L);
        setLongField(term112782, term112782.getClass(), "sumTechMasterHighScore", -2720662516023225508L);
        setLongField(term112782, term112782.getClass(), "sumTechLunaticHighScore", 6875381188527633650L);
        setLongField(term112782, term112782.getClass(), "sumBattleHighScore", 4693628667129828286L);
        setLongField(term112782, term112782.getClass(), "sumBattleBasicHighScore", -5868502002860539084L);
        setLongField(term112782, term112782.getClass(), "sumBattleAdvancedHighScore", 7207360941494127108L);
        setLongField(term112782, term112782.getClass(), "sumBattleExpertHighScore", -5144130457931959162L);
        setLongField(term112782, term112782.getClass(), "sumBattleMasterHighScore", -1169804476297780862L);
        setLongField(term112782, term112782.getClass(), "sumBattleLunaticHighScore", 331808579972926160L);
        setField(term112782, term112782.getClass(), "eventWatchedDate", "xjVhCIhcBm");
        setField(term112782, term112782.getClass(), "cmEventWatchedDate", "BxroOgatuO");
        setField(term112782, term112782.getClass(), "firstGameId", "eWKIGtUcoB");
        setField(term112782, term112782.getClass(), "firstRomVersion", "oDkXgADUAW");
        setField(term112782, term112782.getClass(), "firstDataVersion", "NlYHsvXJQZ");
        setField(term112782, term112782.getClass(), "firstPlayDate", "nGZUSsQuLY");
        setField(term112782, term112782.getClass(), "lastGameId", "anLHCUFjuH");
        setField(term112782, term112782.getClass(), "lastRomVersion", "FTuIZuZFIT");
        setField(term112782, term112782.getClass(), "lastDataVersion", "JglHJPwpBz");
        setField(term112782, term112782.getClass(), "compatibleCmVersion", "sGHbNxVnNc");
        setField(term112782, term112782.getClass(), "lastPlayDate", "MbONkNeFdv");
        setIntField(term112782, term112782.getClass(), "lastPlaceId", -1731718091);
        setField(term112782, term112782.getClass(), "lastPlaceName", "kWfAjuVTpf");
        setIntField(term112782, term112782.getClass(), "lastRegionId", 1165985156);
        setField(term112782, term112782.getClass(), "lastRegionName", "dReyIwfRYk");
        setIntField(term112782, term112782.getClass(), "lastAllNetId", 590581896);
        setField(term112782, term112782.getClass(), "lastClientId", "yQciMqLhqv");
        setIntField(term112782, term112782.getClass(), "lastUsedDeckId", 1892236809);
        setIntField(term112782, term112782.getClass(), "lastPlayMusicLevel", -1865019275);
        setIntField(term112782, term112782.getClass(), "lastEmoneyBrand", -90999261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term112782, args);
    }

};


