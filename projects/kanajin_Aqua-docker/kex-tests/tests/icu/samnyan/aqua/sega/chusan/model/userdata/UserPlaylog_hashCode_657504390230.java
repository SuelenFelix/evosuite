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

public class UserPlaylog_hashCode_657504390230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463770;

    public UserPlaylog_hashCode_657504390230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463770 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term463770, term463770.getClass(), "id", 0L);
        setField(term463770, term463770.getClass(), "user", null);
        setField(term463770, term463770.getClass(), "romVersion", null);
        setIntField(term463770, term463770.getClass(), "orderId", 0);
        setIntField(term463770, term463770.getClass(), "sortNumber", 0);
        setIntField(term463770, term463770.getClass(), "placeId", 0);
        setField(term463770, term463770.getClass(), "playDate", null);
        setField(term463770, term463770.getClass(), "userPlayDate", null);
        setIntField(term463770, term463770.getClass(), "musicId", 0);
        setIntField(term463770, term463770.getClass(), "level", 0);
        setIntField(term463770, term463770.getClass(), "customId", 0);
        setIntField(term463770, term463770.getClass(), "playedUserId1", 0);
        setIntField(term463770, term463770.getClass(), "playedUserId2", 0);
        setIntField(term463770, term463770.getClass(), "playedUserId3", 0);
        setField(term463770, term463770.getClass(), "playedUserName1", null);
        setField(term463770, term463770.getClass(), "playedUserName2", null);
        setField(term463770, term463770.getClass(), "playedUserName3", null);
        setIntField(term463770, term463770.getClass(), "playedMusicLevel1", 0);
        setIntField(term463770, term463770.getClass(), "playedMusicLevel2", 0);
        setIntField(term463770, term463770.getClass(), "playedMusicLevel3", 0);
        setIntField(term463770, term463770.getClass(), "playedCustom1", 0);
        setIntField(term463770, term463770.getClass(), "playedCustom2", 0);
        setIntField(term463770, term463770.getClass(), "playedCustom3", 0);
        setIntField(term463770, term463770.getClass(), "track", 0);
        setIntField(term463770, term463770.getClass(), "score", 0);
        setIntField(term463770, term463770.getClass(), "rank", 0);
        setIntField(term463770, term463770.getClass(), "maxCombo", 0);
        setIntField(term463770, term463770.getClass(), "maxChain", 0);
        setIntField(term463770, term463770.getClass(), "rateTap", 0);
        setIntField(term463770, term463770.getClass(), "rateHold", 0);
        setIntField(term463770, term463770.getClass(), "rateSlide", 0);
        setIntField(term463770, term463770.getClass(), "rateAir", 0);
        setIntField(term463770, term463770.getClass(), "rateFlick", 0);
        setIntField(term463770, term463770.getClass(), "judgeGuilty", 0);
        setIntField(term463770, term463770.getClass(), "judgeAttack", 0);
        setIntField(term463770, term463770.getClass(), "judgeJustice", 0);
        setIntField(term463770, term463770.getClass(), "judgeCritical", 0);
        setIntField(term463770, term463770.getClass(), "judgeHeaven", 0);
        setIntField(term463770, term463770.getClass(), "eventId", 0);
        setIntField(term463770, term463770.getClass(), "playerRating", 0);
        setBooleanField(term463770, term463770.getClass(), "isNewRecord", false);
        setBooleanField(term463770, term463770.getClass(), "isFullCombo", false);
        setIntField(term463770, term463770.getClass(), "fullChainKind", 0);
        setBooleanField(term463770, term463770.getClass(), "isAllJustice", false);
        setBooleanField(term463770, term463770.getClass(), "isContinue", false);
        setBooleanField(term463770, term463770.getClass(), "isFreeToPlay", false);
        setIntField(term463770, term463770.getClass(), "characterId", 0);
        setIntField(term463770, term463770.getClass(), "charaIllustId", 0);
        setIntField(term463770, term463770.getClass(), "skillId", 0);
        setIntField(term463770, term463770.getClass(), "playKind", 0);
        setBooleanField(term463770, term463770.getClass(), "isClear", false);
        setIntField(term463770, term463770.getClass(), "skillLevel", 0);
        setIntField(term463770, term463770.getClass(), "skillEffect", 0);
        setField(term463770, term463770.getClass(), "placeName", null);
        setIntField(term463770, term463770.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term463770, args);
    }

};


