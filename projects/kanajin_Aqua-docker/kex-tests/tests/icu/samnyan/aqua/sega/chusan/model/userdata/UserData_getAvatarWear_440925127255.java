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

public class UserData_getAvatarWear_440925127255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281209;

    public UserData_getAvatarWear_440925127255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281209 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term281209, term281209.getClass(), "id", 0L);
        setField(term281209, term281209.getClass(), "card", null);
        setField(term281209, term281209.getClass(), "userName", null);
        setIntField(term281209, term281209.getClass(), "level", 0);
        setIntField(term281209, term281209.getClass(), "reincarnationNum", 0);
        setField(term281209, term281209.getClass(), "exp", null);
        setLongField(term281209, term281209.getClass(), "point", 0L);
        setLongField(term281209, term281209.getClass(), "totalPoint", 0L);
        setIntField(term281209, term281209.getClass(), "playCount", 0);
        setIntField(term281209, term281209.getClass(), "multiPlayCount", 0);
        setIntField(term281209, term281209.getClass(), "playerRating", 0);
        setIntField(term281209, term281209.getClass(), "highestRating", 0);
        setIntField(term281209, term281209.getClass(), "nameplateId", 0);
        setIntField(term281209, term281209.getClass(), "frameId", 0);
        setIntField(term281209, term281209.getClass(), "characterId", 0);
        setIntField(term281209, term281209.getClass(), "trophyId", 0);
        setIntField(term281209, term281209.getClass(), "playedTutorialBit", 0);
        setIntField(term281209, term281209.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term281209, term281209.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term281209, term281209.getClass(), "totalMapNum", 0);
        setLongField(term281209, term281209.getClass(), "totalHiScore", 0L);
        setLongField(term281209, term281209.getClass(), "totalBasicHighScore", 0L);
        setLongField(term281209, term281209.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term281209, term281209.getClass(), "totalExpertHighScore", 0L);
        setLongField(term281209, term281209.getClass(), "totalMasterHighScore", 0L);
        setLongField(term281209, term281209.getClass(), "totalUltimaHighScore", 0L);
        setField(term281209, term281209.getClass(), "eventWatchedDate", null);
        setIntField(term281209, term281209.getClass(), "friendCount", 0);
        setField(term281209, term281209.getClass(), "firstGameId", null);
        setField(term281209, term281209.getClass(), "firstRomVersion", null);
        setField(term281209, term281209.getClass(), "firstDataVersion", null);
        setField(term281209, term281209.getClass(), "firstPlayDate", null);
        setField(term281209, term281209.getClass(), "lastGameId", null);
        setField(term281209, term281209.getClass(), "lastRomVersion", null);
        setField(term281209, term281209.getClass(), "lastDataVersion", null);
        setField(term281209, term281209.getClass(), "lastLoginDate", null);
        setField(term281209, term281209.getClass(), "lastPlayDate", null);
        setIntField(term281209, term281209.getClass(), "lastPlaceId", 0);
        setField(term281209, term281209.getClass(), "lastPlaceName", null);
        setField(term281209, term281209.getClass(), "lastRegionId", null);
        setField(term281209, term281209.getClass(), "lastRegionName", null);
        setField(term281209, term281209.getClass(), "lastAllNetId", null);
        setField(term281209, term281209.getClass(), "lastClientId", null);
        setField(term281209, term281209.getClass(), "lastCountryCode", null);
        setField(term281209, term281209.getClass(), "userNameEx", null);
        setField(term281209, term281209.getClass(), "compatibleCmVersion", null);
        setIntField(term281209, term281209.getClass(), "medal", 0);
        setIntField(term281209, term281209.getClass(), "mapIconId", 0);
        setIntField(term281209, term281209.getClass(), "voiceId", 0);
        setIntField(term281209, term281209.getClass(), "avatarWear", 0);
        setIntField(term281209, term281209.getClass(), "avatarHead", 0);
        setIntField(term281209, term281209.getClass(), "avatarFace", 0);
        setIntField(term281209, term281209.getClass(), "avatarSkin", 0);
        setIntField(term281209, term281209.getClass(), "avatarItem", 0);
        setIntField(term281209, term281209.getClass(), "avatarFront", 0);
        setIntField(term281209, term281209.getClass(), "avatarBack", 0);
        setIntField(term281209, term281209.getClass(), "classEmblemBase", 0);
        setIntField(term281209, term281209.getClass(), "classEmblemMedal", 0);
        setIntField(term281209, term281209.getClass(), "stockedGridCount", 0);
        setIntField(term281209, term281209.getClass(), "exMapLoopCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattlePlayCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattleWinCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattleLoseCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term281209, term281209.getClass(), "charaIllustId", 0);
        setIntField(term281209, term281209.getClass(), "skillId", 0);
        setIntField(term281209, term281209.getClass(), "overPowerPoint", 0);
        setIntField(term281209, term281209.getClass(), "overPowerRate", 0);
        setIntField(term281209, term281209.getClass(), "overPowerLowerRank", 0);
        setIntField(term281209, term281209.getClass(), "avatarPoint", 0);
        setIntField(term281209, term281209.getClass(), "battleRankId", 0);
        setIntField(term281209, term281209.getClass(), "battleRankPoint", 0);
        setIntField(term281209, term281209.getClass(), "eliteRankPoint", 0);
        setIntField(term281209, term281209.getClass(), "netBattle1stCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattle2ndCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattle3rdCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattle4thCount", 0);
        setIntField(term281209, term281209.getClass(), "netBattleCorrection", 0);
        setIntField(term281209, term281209.getClass(), "netBattleErrCnt", 0);
        setIntField(term281209, term281209.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term281209, term281209.getClass(), "battleRewardStatus", 0);
        setIntField(term281209, term281209.getClass(), "battleRewardIndex", 0);
        setIntField(term281209, term281209.getClass(), "battleRewardCount", 0);
        setIntField(term281209, term281209.getClass(), "ext1", 0);
        setIntField(term281209, term281209.getClass(), "ext2", 0);
        setIntField(term281209, term281209.getClass(), "ext3", 0);
        setIntField(term281209, term281209.getClass(), "ext4", 0);
        setIntField(term281209, term281209.getClass(), "ext5", 0);
        setIntField(term281209, term281209.getClass(), "ext6", 0);
        setIntField(term281209, term281209.getClass(), "ext7", 0);
        setIntField(term281209, term281209.getClass(), "ext8", 0);
        setIntField(term281209, term281209.getClass(), "ext9", 0);
        setIntField(term281209, term281209.getClass(), "ext10", 0);
        setField(term281209, term281209.getClass(), "extStr1", null);
        setField(term281209, term281209.getClass(), "extStr2", null);
        setLongField(term281209, term281209.getClass(), "extLong1", 0L);
        setLongField(term281209, term281209.getClass(), "extLong2", 0L);
        setField(term281209, term281209.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term281209, term281209.getClass(), "isNetBattleHost", false);
        setIntField(term281209, term281209.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarWear", argTypes, term281209, args);
    }

};


