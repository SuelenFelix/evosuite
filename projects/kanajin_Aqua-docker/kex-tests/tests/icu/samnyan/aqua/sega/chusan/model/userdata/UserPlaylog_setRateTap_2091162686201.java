package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserPlaylog_setRateTap_2091162686201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462326;
     Object term462374;

    public UserPlaylog_setRateTap_2091162686201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462326 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term462326, term462326.getClass(), "id", 0L);
        setField(term462326, term462326.getClass(), "user", null);
        setField(term462326, term462326.getClass(), "romVersion", null);
        setIntField(term462326, term462326.getClass(), "orderId", 0);
        setIntField(term462326, term462326.getClass(), "sortNumber", 0);
        setIntField(term462326, term462326.getClass(), "placeId", 0);
        setField(term462326, term462326.getClass(), "playDate", null);
        setField(term462326, term462326.getClass(), "userPlayDate", null);
        setIntField(term462326, term462326.getClass(), "musicId", 0);
        setIntField(term462326, term462326.getClass(), "level", 0);
        setIntField(term462326, term462326.getClass(), "customId", 0);
        setIntField(term462326, term462326.getClass(), "playedUserId1", 0);
        setIntField(term462326, term462326.getClass(), "playedUserId2", 0);
        setIntField(term462326, term462326.getClass(), "playedUserId3", 0);
        setField(term462326, term462326.getClass(), "playedUserName1", null);
        setField(term462326, term462326.getClass(), "playedUserName2", null);
        setField(term462326, term462326.getClass(), "playedUserName3", null);
        setIntField(term462326, term462326.getClass(), "playedMusicLevel1", 0);
        setIntField(term462326, term462326.getClass(), "playedMusicLevel2", 0);
        setIntField(term462326, term462326.getClass(), "playedMusicLevel3", 0);
        setIntField(term462326, term462326.getClass(), "playedCustom1", 0);
        setIntField(term462326, term462326.getClass(), "playedCustom2", 0);
        setIntField(term462326, term462326.getClass(), "playedCustom3", 0);
        setIntField(term462326, term462326.getClass(), "track", 0);
        setIntField(term462326, term462326.getClass(), "score", 0);
        setIntField(term462326, term462326.getClass(), "rank", 0);
        setIntField(term462326, term462326.getClass(), "maxCombo", 0);
        setIntField(term462326, term462326.getClass(), "maxChain", 0);
        setIntField(term462326, term462326.getClass(), "rateTap", 0);
        setIntField(term462326, term462326.getClass(), "rateHold", 0);
        setIntField(term462326, term462326.getClass(), "rateSlide", 0);
        setIntField(term462326, term462326.getClass(), "rateAir", 0);
        setIntField(term462326, term462326.getClass(), "rateFlick", 0);
        setIntField(term462326, term462326.getClass(), "judgeGuilty", 0);
        setIntField(term462326, term462326.getClass(), "judgeAttack", 0);
        setIntField(term462326, term462326.getClass(), "judgeJustice", 0);
        setIntField(term462326, term462326.getClass(), "judgeCritical", 0);
        setIntField(term462326, term462326.getClass(), "judgeHeaven", 0);
        setIntField(term462326, term462326.getClass(), "eventId", 0);
        setIntField(term462326, term462326.getClass(), "playerRating", 0);
        setBooleanField(term462326, term462326.getClass(), "isNewRecord", false);
        setBooleanField(term462326, term462326.getClass(), "isFullCombo", false);
        setIntField(term462326, term462326.getClass(), "fullChainKind", 0);
        setBooleanField(term462326, term462326.getClass(), "isAllJustice", false);
        setBooleanField(term462326, term462326.getClass(), "isContinue", false);
        setBooleanField(term462326, term462326.getClass(), "isFreeToPlay", false);
        setIntField(term462326, term462326.getClass(), "characterId", 0);
        setIntField(term462326, term462326.getClass(), "charaIllustId", 0);
        setIntField(term462326, term462326.getClass(), "skillId", 0);
        setIntField(term462326, term462326.getClass(), "playKind", 0);
        setBooleanField(term462326, term462326.getClass(), "isClear", false);
        setIntField(term462326, term462326.getClass(), "skillLevel", 0);
        setIntField(term462326, term462326.getClass(), "skillEffect", 0);
        setField(term462326, term462326.getClass(), "placeName", null);
        setIntField(term462326, term462326.getClass(), "commonId", 0);
        term462374 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term462374;
        callMethod(klass, "setRateTap", argTypes, term462326, args);
    }

};


