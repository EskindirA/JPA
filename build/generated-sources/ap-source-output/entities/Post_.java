package entities;

import entities.Comment;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-29T15:36:38")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile ListAttribute<Post, Comment> comments;
    public static volatile SingularAttribute<Post, Long> id;
    public static volatile SingularAttribute<Post, String> title;

}