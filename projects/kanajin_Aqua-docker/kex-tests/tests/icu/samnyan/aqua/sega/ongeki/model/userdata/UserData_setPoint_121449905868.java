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

public class UserData_setPoint_121449905868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50758;
     Object term51021;

    public UserData_setPoint_121449905868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50762 = new Long(-5386201758403679145L);
        term50758 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term50760 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50781 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50791 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50758, term50758.getClass(), "id", -5297448090819479208L);
        setLongField(term50760, term50760.getClass(), "id", -2018377284090852639L);
        setField(term50760, term50760.getClass(), "extId", term50762);
        setField(term50760, term50760.getClass(), "luid", "RQvXfSweVs");
        setIntField(term50777, term50777.getClass(), "year", 2023);
        setShortField(term50777, term50777.getClass(), "month", (short) 8);
        setShortField(term50777, term50777.getClass(), "day", (short) 8);
        setField(term50776, term50776.getClass(), "date", term50777);
        setByteField(term50781, term50781.getClass(), "hour", (byte) 20);
        setByteField(term50781, term50781.getClass(), "minute", (byte) 17);
        setByteField(term50781, term50781.getClass(), "second", (byte) 40);
        setIntField(term50781, term50781.getClass(), "nano", 834219024);
        setField(term50776, term50776.getClass(), "time", term50781);
        setField(term50760, term50760.getClass(), "registerTime", term50776);
        setIntField(term50787, term50787.getClass(), "year", 2012);
        setShortField(term50787, term50787.getClass(), "month", (short) 2);
        setShortField(term50787, term50787.getClass(), "day", (short) 12);
        setField(term50786, term50786.getClass(), "date", term50787);
        setByteField(term50791, term50791.getClass(), "hour", (byte) 16);
        setByteField(term50791, term50791.getClass(), "minute", (byte) 39);
        setByteField(term50791, term50791.getClass(), "second", (byte) 57);
        setIntField(term50791, term50791.getClass(), "nano", 651756700);
        setField(term50786, term50786.getClass(), "time", term50791);
        setField(term50760, term50760.getClass(), "accessTime", term50786);
        setField(term50758, term50758.getClass(), "card", term50760);
        setField(term50758, term50758.getClass(), "userName", "jGxArBjtep");
        setIntField(term50758, term50758.getClass(), "level", 1580094069);
        setIntField(term50758, term50758.getClass(), "reincarnationNum", -890066143);
        setLongField(term50758, term50758.getClass(), "exp", -5415594352357248437L);
        setLongField(term50758, term50758.getClass(), "point", -9020854345282284171L);
        setLongField(term50758, term50758.getClass(), "totalPoint", -31489852380702002L);
        setIntField(term50758, term50758.getClass(), "playCount", 1782477754);
        setIntField(term50758, term50758.getClass(), "jewelCount", 1979972143);
        setIntField(term50758, term50758.getClass(), "totalJewelCount", -1445141749);
        setIntField(term50758, term50758.getClass(), "medalCount", 231866725);
        setIntField(term50758, term50758.getClass(), "playerRating", 264142674);
        setIntField(term50758, term50758.getClass(), "highestRating", 318938584);
        setIntField(term50758, term50758.getClass(), "battlePoint", 804113142);
        setIntField(term50758, term50758.getClass(), "bestBattlePoint", 1426555916);
        setIntField(term50758, term50758.getClass(), "overDamageBattlePoint", 96582503);
        setBooleanField(term50758, term50758.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term50758, term50758.getClass(), "nameplateId", -2078044123);
        setIntField(term50758, term50758.getClass(), "trophyId", -888123997);
        setIntField(term50758, term50758.getClass(), "cardId", 1348905505);
        setIntField(term50758, term50758.getClass(), "characterId", 670473947);
        setIntField(term50758, term50758.getClass(), "characterVoiceNo", 24416797);
        setIntField(term50758, term50758.getClass(), "tabSetting", 1333624993);
        setIntField(term50758, term50758.getClass(), "tabSortSetting", -1351263253);
        setIntField(term50758, term50758.getClass(), "cardCategorySetting", -2032135607);
        setIntField(term50758, term50758.getClass(), "cardSortSetting", -1160239470);
        setIntField(term50758, term50758.getClass(), "rivalScoreCategorySetting", 601515362);
        setIntField(term50758, term50758.getClass(), "playedTutorialBit", 361169760);
        setIntField(term50758, term50758.getClass(), "firstTutorialCancelNum", 1796450668);
        setLongField(term50758, term50758.getClass(), "sumTechHighScore", -1329952027265266740L);
        setLongField(term50758, term50758.getClass(), "sumTechBasicHighScore", 1567925232344622144L);
        setLongField(term50758, term50758.getClass(), "sumTechAdvancedHighScore", -5505212927676546906L);
        setLongField(term50758, term50758.getClass(), "sumTechExpertHighScore", -2309176226516464162L);
        setLongField(term50758, term50758.getClass(), "sumTechMasterHighScore", -1164828048757086472L);
        setLongField(term50758, term50758.getClass(), "sumTechLunaticHighScore", -2008405844948549125L);
        setLongField(term50758, term50758.getClass(), "sumBattleHighScore", 3744169870072117962L);
        setLongField(term50758, term50758.getClass(), "sumBattleBasicHighScore", -3929129052663118960L);
        setLongField(term50758, term50758.getClass(), "sumBattleAdvancedHighScore", -8701651184835718046L);
        setLongField(term50758, term50758.getClass(), "sumBattleExpertHighScore", -4884840909566332937L);
        setLongField(term50758, term50758.getClass(), "sumBattleMasterHighScore", -169133604410652254L);
        setLongField(term50758, term50758.getClass(), "sumBattleLunaticHighScore", -3017833790131447565L);
        setField(term50758, term50758.getClass(), "eventWatchedDate", "dUXsPNSUez");
        setField(term50758, term50758.getClass(), "cmEventWatchedDate", "PxGDfPOAFS");
        setField(term50758, term50758.getClass(), "firstGameId", "dZVxzYEeZe");
        setField(term50758, term50758.getClass(), "firstRomVersion", "TnCQRmzwPf");
        setField(term50758, term50758.getClass(), "firstDataVersion", "ZGnUKGTWCn");
        setField(term50758, term50758.getClass(), "firstPlayDate", "cHRLXsgRzr");
        setField(term50758, term50758.getClass(), "lastGameId", "QpqQKmCtoC");
        setField(term50758, term50758.getClass(), "lastRomVersion", "AYRvbRJxWI");
        setField(term50758, term50758.getClass(), "lastDataVersion", "MGNiaVqEDc");
        setField(term50758, term50758.getClass(), "compatibleCmVersion", "qeVNCFrTbT");
        setField(term50758, term50758.getClass(), "lastPlayDate", "sreEtRBWQl");
        setIntField(term50758, term50758.getClass(), "lastPlaceId", -1052517959);
        setField(term50758, term50758.getClass(), "lastPlaceName", "UKQejaeJWY");
        setIntField(term50758, term50758.getClass(), "lastRegionId", -646227135);
        setField(term50758, term50758.getClass(), "lastRegionName", "lNbVasLAKL");
        setIntField(term50758, term50758.getClass(), "lastAllNetId", 445886422);
        setField(term50758, term50758.getClass(), "lastClientId", "wKeyHBCSLZ");
        setIntField(term50758, term50758.getClass(), "lastUsedDeckId", -52982078);
        setIntField(term50758, term50758.getClass(), "lastPlayMusicLevel", -1176310275);
        setIntField(term50758, term50758.getClass(), "lastEmoneyBrand", -992072250);
        term51021 = new Long(-4035098953611869778L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term51021;
        callMethod(klass, "setPoint", argTypes, term50758, args);
    }

};


