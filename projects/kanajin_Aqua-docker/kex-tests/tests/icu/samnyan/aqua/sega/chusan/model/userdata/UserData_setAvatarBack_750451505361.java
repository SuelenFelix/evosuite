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

public class UserData_setAvatarBack_750451505361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289439;
     Object term289516;

    public UserData_setAvatarBack_750451505361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289439 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289439, term289439.getClass(), "id", 0L);
        setField(term289439, term289439.getClass(), "card", null);
        setField(term289439, term289439.getClass(), "userName", null);
        setIntField(term289439, term289439.getClass(), "level", 0);
        setIntField(term289439, term289439.getClass(), "reincarnationNum", 0);
        setField(term289439, term289439.getClass(), "exp", null);
        setLongField(term289439, term289439.getClass(), "point", 0L);
        setLongField(term289439, term289439.getClass(), "totalPoint", 0L);
        setIntField(term289439, term289439.getClass(), "playCount", 0);
        setIntField(term289439, term289439.getClass(), "multiPlayCount", 0);
        setIntField(term289439, term289439.getClass(), "playerRating", 0);
        setIntField(term289439, term289439.getClass(), "highestRating", 0);
        setIntField(term289439, term289439.getClass(), "nameplateId", 0);
        setIntField(term289439, term289439.getClass(), "frameId", 0);
        setIntField(term289439, term289439.getClass(), "characterId", 0);
        setIntField(term289439, term289439.getClass(), "trophyId", 0);
        setIntField(term289439, term289439.getClass(), "playedTutorialBit", 0);
        setIntField(term289439, term289439.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289439, term289439.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289439, term289439.getClass(), "totalMapNum", 0);
        setLongField(term289439, term289439.getClass(), "totalHiScore", 0L);
        setLongField(term289439, term289439.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289439, term289439.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289439, term289439.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289439, term289439.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289439, term289439.getClass(), "totalUltimaHighScore", 0L);
        setField(term289439, term289439.getClass(), "eventWatchedDate", null);
        setIntField(term289439, term289439.getClass(), "friendCount", 0);
        setField(term289439, term289439.getClass(), "firstGameId", null);
        setField(term289439, term289439.getClass(), "firstRomVersion", null);
        setField(term289439, term289439.getClass(), "firstDataVersion", null);
        setField(term289439, term289439.getClass(), "firstPlayDate", null);
        setField(term289439, term289439.getClass(), "lastGameId", null);
        setField(term289439, term289439.getClass(), "lastRomVersion", null);
        setField(term289439, term289439.getClass(), "lastDataVersion", null);
        setField(term289439, term289439.getClass(), "lastLoginDate", null);
        setField(term289439, term289439.getClass(), "lastPlayDate", null);
        setIntField(term289439, term289439.getClass(), "lastPlaceId", 0);
        setField(term289439, term289439.getClass(), "lastPlaceName", null);
        setField(term289439, term289439.getClass(), "lastRegionId", null);
        setField(term289439, term289439.getClass(), "lastRegionName", null);
        setField(term289439, term289439.getClass(), "lastAllNetId", null);
        setField(term289439, term289439.getClass(), "lastClientId", null);
        setField(term289439, term289439.getClass(), "lastCountryCode", null);
        setField(term289439, term289439.getClass(), "userNameEx", null);
        setField(term289439, term289439.getClass(), "compatibleCmVersion", null);
        setIntField(term289439, term289439.getClass(), "medal", 0);
        setIntField(term289439, term289439.getClass(), "mapIconId", 0);
        setIntField(term289439, term289439.getClass(), "voiceId", 0);
        setIntField(term289439, term289439.getClass(), "avatarWear", 0);
        setIntField(term289439, term289439.getClass(), "avatarHead", 0);
        setIntField(term289439, term289439.getClass(), "avatarFace", 0);
        setIntField(term289439, term289439.getClass(), "avatarSkin", 0);
        setIntField(term289439, term289439.getClass(), "avatarItem", 0);
        setIntField(term289439, term289439.getClass(), "avatarFront", 0);
        setIntField(term289439, term289439.getClass(), "avatarBack", 0);
        setIntField(term289439, term289439.getClass(), "classEmblemBase", 0);
        setIntField(term289439, term289439.getClass(), "classEmblemMedal", 0);
        setIntField(term289439, term289439.getClass(), "stockedGridCount", 0);
        setIntField(term289439, term289439.getClass(), "exMapLoopCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattlePlayCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattleWinCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattleLoseCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289439, term289439.getClass(), "charaIllustId", 0);
        setIntField(term289439, term289439.getClass(), "skillId", 0);
        setIntField(term289439, term289439.getClass(), "overPowerPoint", 0);
        setIntField(term289439, term289439.getClass(), "overPowerRate", 0);
        setIntField(term289439, term289439.getClass(), "overPowerLowerRank", 0);
        setIntField(term289439, term289439.getClass(), "avatarPoint", 0);
        setIntField(term289439, term289439.getClass(), "battleRankId", 0);
        setIntField(term289439, term289439.getClass(), "battleRankPoint", 0);
        setIntField(term289439, term289439.getClass(), "eliteRankPoint", 0);
        setIntField(term289439, term289439.getClass(), "netBattle1stCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattle2ndCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattle3rdCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattle4thCount", 0);
        setIntField(term289439, term289439.getClass(), "netBattleCorrection", 0);
        setIntField(term289439, term289439.getClass(), "netBattleErrCnt", 0);
        setIntField(term289439, term289439.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289439, term289439.getClass(), "battleRewardStatus", 0);
        setIntField(term289439, term289439.getClass(), "battleRewardIndex", 0);
        setIntField(term289439, term289439.getClass(), "battleRewardCount", 0);
        setIntField(term289439, term289439.getClass(), "ext1", 0);
        setIntField(term289439, term289439.getClass(), "ext2", 0);
        setIntField(term289439, term289439.getClass(), "ext3", 0);
        setIntField(term289439, term289439.getClass(), "ext4", 0);
        setIntField(term289439, term289439.getClass(), "ext5", 0);
        setIntField(term289439, term289439.getClass(), "ext6", 0);
        setIntField(term289439, term289439.getClass(), "ext7", 0);
        setIntField(term289439, term289439.getClass(), "ext8", 0);
        setIntField(term289439, term289439.getClass(), "ext9", 0);
        setIntField(term289439, term289439.getClass(), "ext10", 0);
        setField(term289439, term289439.getClass(), "extStr1", null);
        setField(term289439, term289439.getClass(), "extStr2", null);
        setLongField(term289439, term289439.getClass(), "extLong1", 0L);
        setLongField(term289439, term289439.getClass(), "extLong2", 0L);
        setField(term289439, term289439.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289439, term289439.getClass(), "isNetBattleHost", false);
        setIntField(term289439, term289439.getClass(), "netBattleEndState", 0);
        term289516 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289516;
        callMethod(klass, "setAvatarBack", argTypes, term289439, args);
    }

};


