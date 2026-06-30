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

public class UserData_setAvatarItem_968463965359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289281;
     Object term289358;

    public UserData_setAvatarItem_968463965359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289281 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289281, term289281.getClass(), "id", 0L);
        setField(term289281, term289281.getClass(), "card", null);
        setField(term289281, term289281.getClass(), "userName", null);
        setIntField(term289281, term289281.getClass(), "level", 0);
        setIntField(term289281, term289281.getClass(), "reincarnationNum", 0);
        setField(term289281, term289281.getClass(), "exp", null);
        setLongField(term289281, term289281.getClass(), "point", 0L);
        setLongField(term289281, term289281.getClass(), "totalPoint", 0L);
        setIntField(term289281, term289281.getClass(), "playCount", 0);
        setIntField(term289281, term289281.getClass(), "multiPlayCount", 0);
        setIntField(term289281, term289281.getClass(), "playerRating", 0);
        setIntField(term289281, term289281.getClass(), "highestRating", 0);
        setIntField(term289281, term289281.getClass(), "nameplateId", 0);
        setIntField(term289281, term289281.getClass(), "frameId", 0);
        setIntField(term289281, term289281.getClass(), "characterId", 0);
        setIntField(term289281, term289281.getClass(), "trophyId", 0);
        setIntField(term289281, term289281.getClass(), "playedTutorialBit", 0);
        setIntField(term289281, term289281.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289281, term289281.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289281, term289281.getClass(), "totalMapNum", 0);
        setLongField(term289281, term289281.getClass(), "totalHiScore", 0L);
        setLongField(term289281, term289281.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289281, term289281.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289281, term289281.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289281, term289281.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289281, term289281.getClass(), "totalUltimaHighScore", 0L);
        setField(term289281, term289281.getClass(), "eventWatchedDate", null);
        setIntField(term289281, term289281.getClass(), "friendCount", 0);
        setField(term289281, term289281.getClass(), "firstGameId", null);
        setField(term289281, term289281.getClass(), "firstRomVersion", null);
        setField(term289281, term289281.getClass(), "firstDataVersion", null);
        setField(term289281, term289281.getClass(), "firstPlayDate", null);
        setField(term289281, term289281.getClass(), "lastGameId", null);
        setField(term289281, term289281.getClass(), "lastRomVersion", null);
        setField(term289281, term289281.getClass(), "lastDataVersion", null);
        setField(term289281, term289281.getClass(), "lastLoginDate", null);
        setField(term289281, term289281.getClass(), "lastPlayDate", null);
        setIntField(term289281, term289281.getClass(), "lastPlaceId", 0);
        setField(term289281, term289281.getClass(), "lastPlaceName", null);
        setField(term289281, term289281.getClass(), "lastRegionId", null);
        setField(term289281, term289281.getClass(), "lastRegionName", null);
        setField(term289281, term289281.getClass(), "lastAllNetId", null);
        setField(term289281, term289281.getClass(), "lastClientId", null);
        setField(term289281, term289281.getClass(), "lastCountryCode", null);
        setField(term289281, term289281.getClass(), "userNameEx", null);
        setField(term289281, term289281.getClass(), "compatibleCmVersion", null);
        setIntField(term289281, term289281.getClass(), "medal", 0);
        setIntField(term289281, term289281.getClass(), "mapIconId", 0);
        setIntField(term289281, term289281.getClass(), "voiceId", 0);
        setIntField(term289281, term289281.getClass(), "avatarWear", 0);
        setIntField(term289281, term289281.getClass(), "avatarHead", 0);
        setIntField(term289281, term289281.getClass(), "avatarFace", 0);
        setIntField(term289281, term289281.getClass(), "avatarSkin", 0);
        setIntField(term289281, term289281.getClass(), "avatarItem", 0);
        setIntField(term289281, term289281.getClass(), "avatarFront", 0);
        setIntField(term289281, term289281.getClass(), "avatarBack", 0);
        setIntField(term289281, term289281.getClass(), "classEmblemBase", 0);
        setIntField(term289281, term289281.getClass(), "classEmblemMedal", 0);
        setIntField(term289281, term289281.getClass(), "stockedGridCount", 0);
        setIntField(term289281, term289281.getClass(), "exMapLoopCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattlePlayCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattleWinCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattleLoseCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289281, term289281.getClass(), "charaIllustId", 0);
        setIntField(term289281, term289281.getClass(), "skillId", 0);
        setIntField(term289281, term289281.getClass(), "overPowerPoint", 0);
        setIntField(term289281, term289281.getClass(), "overPowerRate", 0);
        setIntField(term289281, term289281.getClass(), "overPowerLowerRank", 0);
        setIntField(term289281, term289281.getClass(), "avatarPoint", 0);
        setIntField(term289281, term289281.getClass(), "battleRankId", 0);
        setIntField(term289281, term289281.getClass(), "battleRankPoint", 0);
        setIntField(term289281, term289281.getClass(), "eliteRankPoint", 0);
        setIntField(term289281, term289281.getClass(), "netBattle1stCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattle2ndCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattle3rdCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattle4thCount", 0);
        setIntField(term289281, term289281.getClass(), "netBattleCorrection", 0);
        setIntField(term289281, term289281.getClass(), "netBattleErrCnt", 0);
        setIntField(term289281, term289281.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289281, term289281.getClass(), "battleRewardStatus", 0);
        setIntField(term289281, term289281.getClass(), "battleRewardIndex", 0);
        setIntField(term289281, term289281.getClass(), "battleRewardCount", 0);
        setIntField(term289281, term289281.getClass(), "ext1", 0);
        setIntField(term289281, term289281.getClass(), "ext2", 0);
        setIntField(term289281, term289281.getClass(), "ext3", 0);
        setIntField(term289281, term289281.getClass(), "ext4", 0);
        setIntField(term289281, term289281.getClass(), "ext5", 0);
        setIntField(term289281, term289281.getClass(), "ext6", 0);
        setIntField(term289281, term289281.getClass(), "ext7", 0);
        setIntField(term289281, term289281.getClass(), "ext8", 0);
        setIntField(term289281, term289281.getClass(), "ext9", 0);
        setIntField(term289281, term289281.getClass(), "ext10", 0);
        setField(term289281, term289281.getClass(), "extStr1", null);
        setField(term289281, term289281.getClass(), "extStr2", null);
        setLongField(term289281, term289281.getClass(), "extLong1", 0L);
        setLongField(term289281, term289281.getClass(), "extLong2", 0L);
        setField(term289281, term289281.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289281, term289281.getClass(), "isNetBattleHost", false);
        setIntField(term289281, term289281.getClass(), "netBattleEndState", 0);
        term289358 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289358;
        callMethod(klass, "setAvatarItem", argTypes, term289281, args);
    }

};


