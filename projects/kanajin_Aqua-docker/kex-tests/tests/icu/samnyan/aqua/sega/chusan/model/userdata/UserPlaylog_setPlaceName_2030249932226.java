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

public class UserPlaylog_setPlaceName_2030249932226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463576;

    public UserPlaylog_setPlaceName_2030249932226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463576 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term463576, term463576.getClass(), "id", 0L);
        setField(term463576, term463576.getClass(), "user", null);
        setField(term463576, term463576.getClass(), "romVersion", null);
        setIntField(term463576, term463576.getClass(), "orderId", 0);
        setIntField(term463576, term463576.getClass(), "sortNumber", 0);
        setIntField(term463576, term463576.getClass(), "placeId", 0);
        setField(term463576, term463576.getClass(), "playDate", null);
        setField(term463576, term463576.getClass(), "userPlayDate", null);
        setIntField(term463576, term463576.getClass(), "musicId", 0);
        setIntField(term463576, term463576.getClass(), "level", 0);
        setIntField(term463576, term463576.getClass(), "customId", 0);
        setIntField(term463576, term463576.getClass(), "playedUserId1", 0);
        setIntField(term463576, term463576.getClass(), "playedUserId2", 0);
        setIntField(term463576, term463576.getClass(), "playedUserId3", 0);
        setField(term463576, term463576.getClass(), "playedUserName1", null);
        setField(term463576, term463576.getClass(), "playedUserName2", null);
        setField(term463576, term463576.getClass(), "playedUserName3", null);
        setIntField(term463576, term463576.getClass(), "playedMusicLevel1", 0);
        setIntField(term463576, term463576.getClass(), "playedMusicLevel2", 0);
        setIntField(term463576, term463576.getClass(), "playedMusicLevel3", 0);
        setIntField(term463576, term463576.getClass(), "playedCustom1", 0);
        setIntField(term463576, term463576.getClass(), "playedCustom2", 0);
        setIntField(term463576, term463576.getClass(), "playedCustom3", 0);
        setIntField(term463576, term463576.getClass(), "track", 0);
        setIntField(term463576, term463576.getClass(), "score", 0);
        setIntField(term463576, term463576.getClass(), "rank", 0);
        setIntField(term463576, term463576.getClass(), "maxCombo", 0);
        setIntField(term463576, term463576.getClass(), "maxChain", 0);
        setIntField(term463576, term463576.getClass(), "rateTap", 0);
        setIntField(term463576, term463576.getClass(), "rateHold", 0);
        setIntField(term463576, term463576.getClass(), "rateSlide", 0);
        setIntField(term463576, term463576.getClass(), "rateAir", 0);
        setIntField(term463576, term463576.getClass(), "rateFlick", 0);
        setIntField(term463576, term463576.getClass(), "judgeGuilty", 0);
        setIntField(term463576, term463576.getClass(), "judgeAttack", 0);
        setIntField(term463576, term463576.getClass(), "judgeJustice", 0);
        setIntField(term463576, term463576.getClass(), "judgeCritical", 0);
        setIntField(term463576, term463576.getClass(), "judgeHeaven", 0);
        setIntField(term463576, term463576.getClass(), "eventId", 0);
        setIntField(term463576, term463576.getClass(), "playerRating", 0);
        setBooleanField(term463576, term463576.getClass(), "isNewRecord", false);
        setBooleanField(term463576, term463576.getClass(), "isFullCombo", false);
        setIntField(term463576, term463576.getClass(), "fullChainKind", 0);
        setBooleanField(term463576, term463576.getClass(), "isAllJustice", false);
        setBooleanField(term463576, term463576.getClass(), "isContinue", false);
        setBooleanField(term463576, term463576.getClass(), "isFreeToPlay", false);
        setIntField(term463576, term463576.getClass(), "characterId", 0);
        setIntField(term463576, term463576.getClass(), "charaIllustId", 0);
        setIntField(term463576, term463576.getClass(), "skillId", 0);
        setIntField(term463576, term463576.getClass(), "playKind", 0);
        setBooleanField(term463576, term463576.getClass(), "isClear", false);
        setIntField(term463576, term463576.getClass(), "skillLevel", 0);
        setIntField(term463576, term463576.getClass(), "skillEffect", 0);
        setField(term463576, term463576.getClass(), "placeName", null);
        setIntField(term463576, term463576.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlaceName", argTypes, term463576, args);
    }

};


